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

import com.petfinder.client.model.Organization;
import com.petfinder.client.model.OrganizationResponse;
import com.petfinder.client.model.OrganizationsResponse;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.*;


/**
 * API tests for OrganizationApi
 */
@Ignore
public class OrganizationApiTest {

    private static OrganizationApi api;

    @BeforeClass
    public static void setupAuth() {
        Properties props = new Properties();
        InputStream is = ClassLoader.getSystemResourceAsStream("test.properties");
        try{
            props.load(is);
        } catch (IOException ioe) {
            throw new RuntimeException("Can't load test.properties");
        }
        api = new OrganizationApi(props.getProperty("api_key"), props.getProperty("secret"));
    }
    /**
     * Get Organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void organizationsListTest() throws Exception {
        String name = null;
        String location = null;
        Integer distance = null;
        String country = null;
        String state = null;
        String query = null;
        String sort = null;
        Integer limit = null;
        Integer page = null;
        OrganizationsResponse response = api.organizationsList(name, location, distance, country, state, query, sort, limit, page);

        response.getOrganizations().stream().map(Organization::getName).forEach(System.out::println);
        assertFalse(response.getOrganizations().isEmpty());
    }
    /**
     * Get Organization
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void organizationsShowTest() throws Exception {
        String id = "NJ333";
        OrganizationResponse response = api.organizationsShow(id);

        System.out.println(response);
        assertNotNull(response.getOrganization());
    }
}