package com.treat.treatinder.service;

import com.treat.treatinder.domain.entities.Actions;
import com.treat.treatinder.dto.treatinder.DogDto;
import com.treat.treatinder.dto.treatinder.FilterDto;
import com.treat.treatinder.dto.treatinder.request.RateRequest;

import java.util.List;
import java.util.Map;

public interface ITreatinder {

    List<DogDto> getDogsByFilter(long userId, FilterDto filter) throws ServiceException;

    List<String> getBreeds(Long userId) throws ServiceException;

    Map<String, String> getOrganizationsByLocation(Long userId, String location) throws ServiceException;

    void rateDog(long userId, RateRequest request) throws ServiceException;

    long register(String userName, int passwordHash) throws ServiceException;
}
