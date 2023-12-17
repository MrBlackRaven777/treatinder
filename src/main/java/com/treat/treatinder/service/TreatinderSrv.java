package com.treat.treatinder.service;

import com.petfinder.client.ApiException;
import com.treat.treatinder.api.petfinder.PFWrapper;
import com.treat.treatinder.domain.entities.Activity;
import com.treat.treatinder.domain.entities.Dog;
import com.treat.treatinder.domain.entities.User;
import com.treat.treatinder.domain.repo.DogsRepo;
import com.treat.treatinder.domain.repo.UserActivitiesRepo;
import com.treat.treatinder.domain.repo.UsersRepo;
import com.treat.treatinder.dto.treatinder.DogDto;
import com.treat.treatinder.dto.treatinder.FilterDto;
import com.treat.treatinder.dto.treatinder.UserApiState;
import com.treat.treatinder.dto.treatinder.request.RateRequest;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
public class TreatinderSrv implements ITreatinder {

    @Value("${app.service.prefetchThreshold:5}")
    private int prefetchThreshold;

    @Autowired
    private DogsRepo dogsRepo;

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private UserActivitiesRepo userActivitiesRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PFWrapper petApi;

    private static final Map<Long, Set<Long>> watchedDogs = new ConcurrentHashMap<>();
    private static final Map<Long, BlockingQueue<DogDto>> usersQueues = new ConcurrentHashMap<>();
    private static final Map<Long, UserApiState> usersCurrentState = new ConcurrentHashMap<>();


    @PostConstruct
    private void fillWatchedDogs() {
        watchedDogs.putAll(userActivitiesRepo.getAllRatedDogs());
    }

    @Override
    public List<DogDto> getDogsByFilter(long userId, FilterDto filter) {
        List<DogDto> dogs = new ArrayList<>();

        checkUser(userId);

        try {
            updateCurrentState(userId, filter);
            BlockingQueue<DogDto> queue = getUserQueue(userId);

            queue.drainTo(dogs, filter.getBatchSize());
            if (queue.size() < prefetchThreshold) {
                fetchDataToUserQueue(userId);
            }
        } catch (ApiException apie) {
            throw new ServiceException(apie.getMessage() + "\n" + apie.getResponseBody(), apie.getCode());
        } catch (Exception e) {
            throw new ServiceException(e.getMessage(), 500);
        }
        return dogs;
    }

    private void updateCurrentState(long userId, FilterDto filter) throws ApiException {
        if (!usersCurrentState.containsKey(userId) ||
                !usersCurrentState.get(userId).getFilter().equals(filter)) {
            usersCurrentState.put(userId, new UserApiState(filter, new AtomicInteger(0), petApi.getPaginationLimit()));
            createNewQueue(userId);
        }
    }

    private BlockingQueue<DogDto> getUserQueue(long userId) throws ApiException {
        if (!usersQueues.containsKey(userId)) {
            createNewQueue(userId);
        }
        return usersQueues.get(userId);
    }

    private synchronized void createNewQueue(long userId) throws ApiException {
        int paginationLimit = petApi.getPaginationLimit();
        BlockingQueue<DogDto> queue = new LinkedBlockingQueue<>(paginationLimit * 2);
        usersQueues.put(userId, queue);
        fetchDataToUserQueue(userId);
    }

    private void fetchDataToUserQueue(long userId) throws ApiException {
        FilterDto filter = usersCurrentState.get(userId).getFilter();
        AtomicInteger page = usersCurrentState.get(userId).getPage();
        BlockingQueue<DogDto> queue = getUserQueue(userId);
        watchedDogs.putIfAbsent(userId, new HashSet<>());

        List<DogDto> dogs = petApi.getDogsByFilter(filter, page.incrementAndGet());
        dogs.stream()
                .filter(dog -> dog.getPhoto() != null)
                .filter(dog -> !watchedDogs.get(userId).contains(dog.getId()))
                .peek(dog -> dog.setId(saveDogToDB(dog)))
                .forEach(queue::add);
    }

    private long saveDogToDB(DogDto dog) {
        //TODO send to queue and may be some cache
        if(dogsRepo.existsBySourceId(dog.getSourceId()))
            return dogsRepo.findBySourceId(dog.getSourceId()).getId();

        return dogsRepo.save(mapper.map(dog, Dog.class)).getId();
    }

    @Override
    public List<String> getBreeds(Long userId) throws ServiceException {
        checkUser(userId);
        List<String> breeds;
        try {
            breeds = petApi.getDogsBreeds();
        } catch (ApiException apie) {
            throw new ServiceException(apie.getMessage() + "\n" + apie.getResponseBody(), apie.getCode());
        } catch (Exception e) {
            throw new ServiceException(e.getMessage(), 500);
        }
        return breeds;
    }

    @Override
    public Map<String, String> getOrganizationsByLocation(Long userId, String location) throws ServiceException {
        checkUser(userId);
        if(location.isBlank()) throw new ServiceException("Must provide location", 400);
        Map<String, String> organizationsInfo = new HashMap<>();
        try{
            organizationsInfo = petApi.getOrganizations(location);
        } catch (ApiException apie) {
            throw new ServiceException(apie.getMessage() + "\n" + apie.getResponseBody(), apie.getCode());
        } catch (Exception e) {
            throw new ServiceException(e.getMessage(), 500);
        }
        return organizationsInfo;
    }

    @Transactional
    @Override
    public void rateDog(long userId, RateRequest request) throws ServiceException {
        if(userActivitiesRepo.existsById(request.getUuid()) ||//idempotency check
            userActivitiesRepo.existsByUserIdAndDogId(userId, request.getDogId())) //may be on user side by generating uuid's from userId + dogId seed
            throw new ServiceException("This dog has rated already", 409);

        User user = usersRepo.findById(userId).orElseThrow(() -> new ServiceException("User " + userId + " not found", 401));
        Dog dog = dogsRepo.findById(request.getDogId()).orElseThrow(() -> new ServiceException("Dog " + request.getDogId() + " not found", 404));
        Activity activity = new Activity(request.getUuid(), user, dog, request.getAction());
        userActivitiesRepo.save(activity);
//        watchedDogs.putIfAbsent(userId, new HashSet<>());
//        watchedDogs.get(userId).add(dog.getId());
    }

    @Override
    public long register(String userName, int passwordHash) throws ServiceException {
        try {
           return usersRepo.save(new User(userName, passwordHash)).getId();
        } catch (Exception e) {
            throw new ServiceException("Register error: " + e.getMessage(), 500);
        }
    }

    private void checkUser(long userId) {
        if(!usersRepo.existsById(userId)) throw new ServiceException("User " + userId + " not found", 404);
    }
}
