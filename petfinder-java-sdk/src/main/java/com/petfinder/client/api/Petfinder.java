package com.petfinder.client.api;

import com.petfinder.client.ApiClient;

public class Petfinder {
    public AnimalApi animal;
    public OrganizationApi organization;

    public Petfinder() {
        animal = new AnimalApi();
        organization = new OrganizationApi();
    }

    public Petfinder(ApiClient apiClient) {
        animal = new AnimalApi(apiClient);
        organization = new OrganizationApi(apiClient);
    }

    public Petfinder(String accessToken) {
        animal = new AnimalApi(accessToken);
        organization = new OrganizationApi(accessToken);
    }

    public Petfinder(String apiKey, String secret) {
        animal = new AnimalApi(apiKey, secret);
        organization = new OrganizationApi(apiKey, secret);
    }
}
