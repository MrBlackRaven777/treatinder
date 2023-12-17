# AnimalApi

All URIs are relative to *https://api.petfinder.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**animalTypeBreedsList**](AnimalApi.md#animalTypeBreedsList) | **GET** /types/{type}/breeds | Get Animal Breeds
[**animalTypesList**](AnimalApi.md#animalTypesList) | **GET** /types | Get Animal Types
[**animalTypesShow**](AnimalApi.md#animalTypesShow) | **GET** /types/{type} | Get Animal Type
[**animalsList**](AnimalApi.md#animalsList) | **GET** /animals | Get Animals
[**animalsShow**](AnimalApi.md#animalsShow) | **GET** /animals/{id} | Get Animal

<a name="animalTypeBreedsList"></a>
# **animalTypeBreedsList**
> InlineResponse2002 animalTypeBreedsList(type)

Get Animal Breeds

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.AnimalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnimalApi apiInstance = new AnimalApi();
String type = "type_example"; // String | Animal type
try {
    InlineResponse2002 result = apiInstance.animalTypeBreedsList(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalApi#animalTypeBreedsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Animal type |

### Return type

[**InlineResponse2002**](BreedsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="animalTypesList"></a>
# **animalTypesList**
> AnimalTypesResponse animalTypesList()

Get Animal Types

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.AnimalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnimalApi apiInstance = new AnimalApi();
try {
    AnimalTypesResponse result = apiInstance.animalTypesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalApi#animalTypesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnimalTypesResponse**](AnimalTypesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="animalTypesShow"></a>
# **animalTypesShow**
> AnimalTypeResponse animalTypesShow(type)

Get Animal Type

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.AnimalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnimalApi apiInstance = new AnimalApi();
String type = "type_example"; // String | Animal type
try {
    AnimalTypeResponse result = apiInstance.animalTypesShow(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalApi#animalTypesShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Animal type |

### Return type

[**AnimalTypeResponse**](AnimalTypeResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="animalsList"></a>
# **animalsList**
> AnimalBreedsResponse animalsList(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page)

Get Animals

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.AnimalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnimalApi apiInstance = new AnimalApi();
String type = "type_example"; // String | Filter results matching animal type
List<String> breed = Arrays.asList("breed_example"); // List<String> | Filter results matching animal breed
List<String> size = Arrays.asList("size_example"); // List<String> | Filter results matching animal size
List<String> gender = Arrays.asList("gender_example"); // List<String> | Filter results matching animal gender
List<String> age = Arrays.asList("age_example"); // List<String> | Filter results matching animal age
List<String> color = Arrays.asList("color_example"); // List<String> | Filter results matching animal color
List<String> coat = Arrays.asList("coat_example"); // List<String> | Filter results matching animal coat
List<String> organization = Arrays.asList("organization_example"); // List<String> | Filter results by organization
String name = "name_example"; // String | Filter results by name. Uses partial match.
String location = "location_example"; // String | Filter results matching animal location (postal code, city/state, lat/long)
Integer distance = 56; // Integer | Filter results by distance from given location
String status = "status_example"; // String | Filter by adoption status
String sort = "recent"; // String | Field to sort by
Integer limit = 20; // Integer | Number of results to return
Integer page = 1; // Integer | Page of results to return
try {
    AnimalBreedsResponse result = apiInstance.animalsList(type, breed, size, gender, age, color, coat, organization, name, location, distance, status, sort, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalApi#animalsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Filter results matching animal type | [optional] [enum: dog, cat, small-furry, bird, scales-fins-other, barnyard, rabbit, horse]
 **breed** | [**List&lt;String&gt;**](String.md)| Filter results matching animal breed | [optional]
 **size** | [**List&lt;String&gt;**](String.md)| Filter results matching animal size | [optional] [enum: small, medium, large, extra-large]
 **gender** | [**List&lt;String&gt;**](String.md)| Filter results matching animal gender | [optional] [enum: male, female, unknown]
 **age** | [**List&lt;String&gt;**](String.md)| Filter results matching animal age | [optional] [enum: baby, young, adult, senior]
 **color** | [**List&lt;String&gt;**](String.md)| Filter results matching animal color | [optional]
 **coat** | [**List&lt;String&gt;**](String.md)| Filter results matching animal coat | [optional] [enum: short, medium, long, wire, hairless, curly]
 **organization** | [**List&lt;String&gt;**](String.md)| Filter results by organization | [optional]
 **name** | **String**| Filter results by name. Uses partial match. | [optional]
 **location** | **String**| Filter results matching animal location (postal code, city/state, lat/long) | [optional]
 **distance** | **Integer**| Filter results by distance from given location | [optional]
 **status** | **String**| Filter by adoption status | [optional] [enum: adoptable, adopted, found]
 **sort** | **String**| Field to sort by | [optional] [default to recent] [enum: recent, -recent, distance, -distance, random]
 **limit** | **Integer**| Number of results to return | [optional] [default to 20] [enum: 100]
 **page** | **Integer**| Page of results to return | [optional] [default to 1] [enum: 1]

### Return type

[**AnimalBreedsResponse**](AnimalBreedsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="animalsShow"></a>
# **animalsShow**
> AnimalResponse animalsShow(id)

Get Animal

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.AnimalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnimalApi apiInstance = new AnimalApi();
Integer id = 56; // Integer | Animal ID
try {
    AnimalResponse result = apiInstance.animalsShow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalApi#animalsShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Animal ID |

### Return type

[**AnimalResponse**](AnimalResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

