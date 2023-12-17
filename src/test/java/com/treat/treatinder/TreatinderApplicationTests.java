package com.treat.treatinder;

import com.petfinder.client.ApiClient;
import com.petfinder.client.ApiException;
import com.petfinder.client.Configuration;
import com.petfinder.client.api.AnimalApi;
import com.petfinder.client.api.Petfinder;
import com.petfinder.client.auth.OAuth;
import com.petfinder.client.model.AnimalBreedsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TreatinderApplicationTests {

    @Value("${source.petfinder.apiKey}")
    private String apiKey;
    @Value("${source.petfinder.secret}")
    private String secret;

    @Test
    void contextLoads() {
        Petfinder api = new Petfinder(apiKey, secret);
        String type = "dog"; // String | Animal type
        try {
            AnimalBreedsResponse result = api.animal.animalTypeBreedsList(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnimalApi#animalTypeBreedsList");
            e.printStackTrace();
        }
    }

}
