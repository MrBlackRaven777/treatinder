package com.treat.treatinder.controllers;


import com.treat.treatinder.dto.treatinder.DogDto;
import com.treat.treatinder.dto.treatinder.FilterDto;
import com.treat.treatinder.dto.treatinder.request.RateRequest;
import com.treat.treatinder.dto.treatinder.request.RegisterRequest;
import com.treat.treatinder.dto.treatinder.response.*;
import com.treat.treatinder.service.ITreatinder;
import com.treat.treatinder.service.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@Slf4j
public class TreatinderController {
//    POST: /api/v1/register
//    GET: /api/v1/dogs?orgName=&gender=&breed=&location=&batchSize=
//    POST: /api/v1/rate
//    GET: /api/v1/organizations
//    GET: /api/v1/breeds

    @Autowired
    ITreatinder service;

    private static final String defaultBatchSize = "4";

    @PostMapping("/api/v1/register")
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        try {
            response.setUserId(service.register(request.getName(), request.getPasswordHash()));
            response.setStatusCode(200);
        } catch (ServiceException se) {
            log.error(se.getMessage());
            response.setUserId(-1L);
            response.setStatusCode(se.getStatusCode());
            response.setErrorMessage(se.getMessage());
        }
        return response;
    }

    @GetMapping("/api/v1/dogs")
    public DogsResponse getDogs(@RequestParam(value = "orgName", required = false) String orgName,
                                @RequestParam(value = "gender", required = false) String gender,
                                @RequestParam(value = "breed", required = false) String breed,
                                @RequestParam(value = "location", required = false) String location,
                                @RequestParam(value = "batchSize", required = false, defaultValue = defaultBatchSize) Integer batchSize,
                                @RequestHeader(name = "X-user-id") Long userId) {
        DogsResponse response = new DogsResponse();
        try {
            FilterDto filter = new FilterDto(orgName, gender, breed, location, batchSize);
            response.setDogs(service.getDogsByFilter(userId, filter));
            response.setStatusCode(200);
        } catch (ServiceException se) {
            log.error(se.getMessage());
            response.setDogs(new ArrayList<>());
            response.setStatusCode(se.getStatusCode());
            response.setErrorMessage(se.getMessage());
        }
        return response;
    }

    @GetMapping("/api/v1/breeds")
    public BreedsResponse getBreeds(@RequestHeader(name = "X-user-id") Long userId) {
        BreedsResponse response = new BreedsResponse();
        try {
            response.setBreeds(service.getBreeds(userId));
            response.setStatusCode(200);
        } catch (ServiceException se) {
            log.error(se.getMessage());
            response.setBreeds(new ArrayList<>());
            response.setStatusCode(se.getStatusCode());
            response.setErrorMessage(se.getMessage());
        }
        return response;
    }

    @GetMapping("/api/v1/organizations")
    public OrgsResponse getOrganizations(@RequestParam(value = "location") String location,
                                         @RequestHeader(name = "X-user-id") Long userId) {
        OrgsResponse response = new OrgsResponse();
        try {
            response.setOrganizations(service.getOrganizationsByLocation(userId, location));//TODO
            response.setStatusCode(200);
        } catch (ServiceException se) {
            log.error(se.getMessage());
            response.setOrganizations(new HashMap<>());
            response.setStatusCode(se.getStatusCode());
            response.setErrorMessage(se.getMessage());
        }
        return response;
    }

    @PostMapping("/api/v1/rate")
    public RateResponse rateDog(@RequestBody RateRequest request, @RequestHeader(name = "X-user-id") Long userId) {
        RateResponse response = new RateResponse();
        try {
            service.rateDog(userId, request);
            response.setStatusCode(200);
        } catch (ServiceException se) {
            log.error(se.getMessage());
            response.setStatusCode(se.getStatusCode());
            response.setErrorMessage(se.getMessage());
        }
        return response;
    }
}
