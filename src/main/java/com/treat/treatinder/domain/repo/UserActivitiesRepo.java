package com.treat.treatinder.domain.repo;

import com.treat.treatinder.domain.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;
import java.util.stream.Collectors;

public interface UserActivitiesRepo extends JpaRepository<Activity, UUID> {

    @Query("select dog from Activity where user=:uid")
    List<Long> getRatedDogs(@Param("uid") Long userId);

    default Map<Long, Set<Long>> getAllRatedDogs() {
        return findAll().stream().collect(
                Collectors.groupingBy(act -> act.getUser().getId(), Collectors.mapping(act -> act.getDog().getId(), Collectors.toSet())));
    }

    boolean existsByUserIdAndDogId(long userId, long dogId);

//    List<Long> getDogIdByUserId(Long userId);
}
