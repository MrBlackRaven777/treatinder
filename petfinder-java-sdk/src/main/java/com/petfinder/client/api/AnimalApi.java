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
import com.petfinder.client.ApiCallback;
import com.petfinder.client.ApiClient;
import com.petfinder.client.ApiException;
import com.petfinder.client.ApiResponse;
import com.petfinder.client.Configuration;
import com.petfinder.client.Pair;
import com.petfinder.client.ProgressRequestBody;
import com.petfinder.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalApi {
    private ApiClient apiClient;

    public AnimalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnimalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public AnimalApi(String accessToken) {
        this();
        OAuth oauth = (OAuth) apiClient.getAuthentication("oauth2");
        oauth.setAccessToken(accessToken);
    }

    public AnimalApi(String apiKey, String secret) {
        this();
        OAuth oauth = (OAuth) apiClient.getAuthentication("oauth2");
        oauth.setApiKey(apiKey);
        oauth.setSecret(secret);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for animalTypeBreedsList
     * @param type Animal type (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call animalTypeBreedsListCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/types/{type}/breeds"
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call animalTypeBreedsListValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling animalTypeBreedsList(Async)");
        }
        
        com.squareup.okhttp.Call call = animalTypeBreedsListCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Animal Breeds
     * 
     * @param type Animal type (required)
     * @return AnimalBreedsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnimalBreedsResponse animalTypeBreedsList(String type) throws ApiException {
        ApiResponse<AnimalBreedsResponse> resp = animalTypeBreedsListWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * Get Animal Breeds
     * 
     * @param type Animal type (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnimalBreedsResponse> animalTypeBreedsListWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = animalTypeBreedsListValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<AnimalBreedsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Animal Breeds (asynchronously)
     * 
     * @param type Animal type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call animalTypeBreedsListAsync(String type, final ApiCallback<AnimalBreedsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = animalTypeBreedsListValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnimalBreedsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for animalTypesList
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call animalTypesListCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call animalTypesListValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = animalTypesListCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Animal Types
     * 
     * @return AnimalTypesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnimalTypesResponse animalTypesList() throws ApiException {
        ApiResponse<AnimalTypesResponse> resp = animalTypesListWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Animal Types
     * 
     * @return ApiResponse&lt;AnimalTypesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnimalTypesResponse> animalTypesListWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = animalTypesListValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AnimalTypesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Animal Types (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call animalTypesListAsync(final ApiCallback<AnimalTypesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = animalTypesListValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnimalTypesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for animalTypesShow
     * @param type Animal type (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call animalTypesShowCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/types/{type}"
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call animalTypesShowValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling animalTypesShow(Async)");
        }
        
        com.squareup.okhttp.Call call = animalTypesShowCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Animal Type
     * 
     * @param type Animal type (required)
     * @return AnimalTypeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnimalTypeResponse animalTypesShow(String type) throws ApiException {
        ApiResponse<AnimalTypeResponse> resp = animalTypesShowWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * Get Animal Type
     * 
     * @param type Animal type (required)
     * @return ApiResponse&lt;AnimalTypeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnimalTypeResponse> animalTypesShowWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = animalTypesShowValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<AnimalTypeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Animal Type (asynchronously)
     * 
     * @param type Animal type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call animalTypesShowAsync(String type, final ApiCallback<AnimalTypeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = animalTypesShowValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnimalTypeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for animalsList
     * @param type Filter results matching animal type (optional)
     * @param breed Filter results matching animal breed (optional)
     * @param size Filter results matching animal size (optional)
     * @param gender Filter results matching animal gender (optional)
     * @param age Filter results matching animal age (optional)
     * @param color Filter results matching animal color (optional)
     * @param coat Filter results matching animal coat (optional)
     * @param organization Filter results by organization (optional)
     * @param name Filter results by name. Uses partial match. (optional)
     * @param location Filter results matching animal location (postal code, city/state, lat/long) (optional)
     * @param distance Filter results by distance from given location (optional)
     * @param status Filter by adoption status (optional)
     * @param sort Field to sort by (optional, default to recent)
     * @param limit Number of results to return (optional, default to 20)
     * @param page Page of results to return (optional, default to 1)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call animalsListCall(String type, List<String> breed, List<String> size, List<String> gender, List<String> age, List<String> color, List<String> coat, List<String> organization, String name, String location, Integer distance, String status, String sort, Integer limit, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/animals";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (breed != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "breed", breed));
        if (size != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "size", size));
        if (gender != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "gender", gender));
        if (age != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "age", age));
        if (color != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "color", color));
        if (coat != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "coat", coat));
        if (organization != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "organization", organization));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (location != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("location", location));
        if (distance != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("distance", distance));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call animalsListValidateBeforeCall(String type, List<String> breed, List<String> size, List<String> gender, List<String> age, List<String> color, List<String> coat, List<String> organization, String name, String location, Integer distance, String status, String sort, Integer limit, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = animalsListCall(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Animals
     * 
     * @param type Filter results matching animal type (optional)
     * @param breed Filter results matching animal breed (optional)
     * @param size Filter results matching animal size (optional)
     * @param gender Filter results matching animal gender (optional)
     * @param age Filter results matching animal age (optional)
     * @param color Filter results matching animal color (optional)
     * @param coat Filter results matching animal coat (optional)
     * @param organization Filter results by organization (optional)
     * @param name Filter results by name. Uses partial match. (optional)
     * @param location Filter results matching animal location (postal code, city/state, lat/long) (optional)
     * @param distance Filter results by distance from given location (optional)
     * @param status Filter by adoption status (optional)
     * @param sort Field to sort by (optional, default to recent)
     * @param limit Number of results to return (optional, default to 20)
     * @param page Page of results to return (optional, default to 1)
     * @return AnimalsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnimalsResponse animalsList(String type, List<String> breed, List<String> size, List<String> gender, List<String> age, List<String> color, List<String> coat, List<String> organization, String name, String location, Integer distance, String status, String sort, Integer limit, Integer page) throws ApiException {
        ApiResponse<AnimalsResponse> resp = animalsListWithHttpInfo(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page);
        return resp.getData();
    }

    /**
     * Get Animals
     * 
     * @param type Filter results matching animal type (optional)
     * @param breed Filter results matching animal breed (optional)
     * @param size Filter results matching animal size (optional)
     * @param gender Filter results matching animal gender (optional)
     * @param age Filter results matching animal age (optional)
     * @param color Filter results matching animal color (optional)
     * @param coat Filter results matching animal coat (optional)
     * @param organization Filter results by organization (optional)
     * @param name Filter results by name. Uses partial match. (optional)
     * @param location Filter results matching animal location (postal code, city/state, lat/long) (optional)
     * @param distance Filter results by distance from given location (optional)
     * @param status Filter by adoption status (optional)
     * @param sort Field to sort by (optional, default to recent)
     * @param limit Number of results to return (optional, default to 20)
     * @param page Page of results to return (optional, default to 1)
     * @return ApiResponse&lt;AnimalsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnimalsResponse> animalsListWithHttpInfo(String type, List<String> breed, List<String> size, List<String> gender, List<String> age, List<String> color, List<String> coat, List<String> organization, String name, String location, Integer distance, String status, String sort, Integer limit, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = animalsListValidateBeforeCall(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page, null, null);
        Type localVarReturnType = new TypeToken<AnimalsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Animals (asynchronously)
     * 
     * @param type Filter results matching animal type (optional)
     * @param breed Filter results matching animal breed (optional)
     * @param size Filter results matching animal size (optional)
     * @param gender Filter results matching animal gender (optional)
     * @param age Filter results matching animal age (optional)
     * @param color Filter results matching animal color (optional)
     * @param coat Filter results matching animal coat (optional)
     * @param organization Filter results by organization (optional)
     * @param name Filter results by name. Uses partial match. (optional)
     * @param location Filter results matching animal location (postal code, city/state, lat/long) (optional)
     * @param distance Filter results by distance from given location (optional)
     * @param status Filter by adoption status (optional)
     * @param sort Field to sort by (optional, default to recent)
     * @param limit Number of results to return (optional, default to 20)
     * @param page Page of results to return (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call animalsListAsync(String type, List<String> breed, List<String> size, List<String> gender, List<String> age, List<String> color, List<String> coat, List<String> organization, String name, String location, Integer distance, String status, String sort, Integer limit, Integer page, final ApiCallback<AnimalsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = animalsListValidateBeforeCall(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnimalsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for animalsShow
     * @param id Animal ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call animalsShowCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/animals/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call animalsShowValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling animalsShow(Async)");
        }
        
        com.squareup.okhttp.Call call = animalsShowCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Animal
     * 
     * @param id Animal ID (required)
     * @return AnimalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnimalResponse animalsShow(Integer id) throws ApiException {
        ApiResponse<AnimalResponse> resp = animalsShowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Animal
     * 
     * @param id Animal ID (required)
     * @return ApiResponse&lt;AnimalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnimalResponse> animalsShowWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = animalsShowValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<AnimalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Animal (asynchronously)
     * 
     * @param id Animal ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call animalsShowAsync(Integer id, final ApiCallback<AnimalResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = animalsShowValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnimalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
