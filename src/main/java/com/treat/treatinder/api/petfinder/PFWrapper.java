package com.treat.treatinder.api.petfinder;

import com.petfinder.client.ApiException;
import com.petfinder.client.api.Petfinder;
import com.petfinder.client.model.Animal;
import com.petfinder.client.model.AnimalBreed;
import com.petfinder.client.model.AnimalsResponse;
import com.treat.treatinder.configurations.MapperConfiguration;
import com.treat.treatinder.domain.entities.Sources;
import com.treat.treatinder.dto.treatinder.DogDto;
import com.treat.treatinder.dto.treatinder.FilterDto;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class PFWrapper {

    @Getter
    @Value("${source.petfinder.pagination-limit:100}")
    private int paginationLimit;

    private static final ModelMapper mapper = new MapperConfiguration().getMapper();

    private final Petfinder api;

    public PFWrapper(String apiKey, String secret) {
        api = new Petfinder(apiKey, secret);
    }

    public List<DogDto> getDogsByFilter(FilterDto filter, int page) throws ApiException {
        log.debug("Search dogs by filter:");
        log.debug(filter.toString());
        log.debug("page: " + page);
        AnimalsResponse response = api.animal.animalsList(filter.getType(),
                filter.getBreed(),
                null,
                filter.getGender(),
                null,
                null,
                null,
                filter.getOrgName(),
                null,
                filter.getLocation(),
                null,
                null,
                null,
                paginationLimit,
                page);
        return response.getAnimals().stream()
                .map(animal -> mapper.map(animal, DogDto.class))
                .toList();
//        } catch (ApiException apie) {
//            log.error(apie.getMessage());
//            log.error(apie.getResponseBody());
//            return new ArrayList<>();
//        }
    }

    public List<String> getDogsBreeds() throws ApiException {
        return api.animal.animalTypeBreedsList("dog").getBreeds().stream().map(AnimalBreed::getName).toList();
    }

    public Map<String, String> getOrganizations(String location) throws ApiException {
        return api.organization.organizationsList(
                null,
                location,
                100,
                null,
                null,
                null,
                null,
                100,
                1).getOrganizations().stream()
                .collect(Collectors.toMap(organization -> organization.getId(), organization -> organization.getName()));
    }
}
