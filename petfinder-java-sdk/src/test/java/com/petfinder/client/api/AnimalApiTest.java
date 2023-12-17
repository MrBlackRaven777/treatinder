/*
 * Petfinder API
 * The Petfinder API allows you to access the Petfinder database of hundreds of thousands of pets ready for adoption and over ten thousand animal welfare organizations. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@petfinder.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.petfinder.client.api;

import com.petfinder.client.auth.OAuth;
import com.petfinder.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.*;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;


/**
 * API tests for AnimalApi
 */
//@Ignore
public class AnimalApiTest {

    private static AnimalApi api;

    @BeforeClass
    public static void setupAuth() {
        Properties props = new Properties();
        InputStream is = ClassLoader.getSystemResourceAsStream("test.properties");
        try{
            props.load(is);
        } catch (IOException ioe) {
            throw new RuntimeException("Can't load test.properties");
        }
        api = new AnimalApi(props.getProperty("api_key"), props.getProperty("secret"));
    }

    /**
     * Get Animal Breeds
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void animalTypeBreedsListTest() throws Exception {
        String type = "dog";
        AnimalBreedsResponse response = api.animalTypeBreedsList(type);

        assertFalse(response.getBreeds().isEmpty());
        assertTrue(response.getBreeds().contains(new AnimalBreed().name("Pug")));
    }
    /**
     * Get Animal Types
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void animalTypesListTest() throws Exception {
        AnimalTypesResponse response = api.animalTypesList();

        // TODO: test validations
    }
    /**
     * Get Animal Type
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void animalTypesShowTest() throws Exception {
        String type = null;
        AnimalTypeResponse response = api.animalTypesShow(type);

        // TODO: test validations
    }
    /**
     * Get Animals
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void animalsListTest() throws Exception {
        String type = null;
        List<String> breed = null;
        List<String> size = null;
        List<String> gender = null;
        List<String> age = null;
        List<String> color = null;
        List<String> coat = null;
        List<String> organization = null;
        String name = null;
        String location = null;
        Integer distance = null;
        String status = null;
        String sort = null;
        Integer limit = null;
        Integer page = null;
        AnimalsResponse response = api.animalsList(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page);


        // TODO: test validations
    }
    /**
     * Get Animal
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void animalsShowTest() throws Exception {
        Integer id = null;
        AnimalResponse response = api.animalsShow(id);

        // TODO: test validations
    }
}
