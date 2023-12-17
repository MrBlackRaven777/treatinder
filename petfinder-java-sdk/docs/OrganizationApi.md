# OrganizationApi

All URIs are relative to *https://api.petfinder.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationsList**](OrganizationApi.md#organizationsList) | **GET** /organizations | Get Organizations
[**organizationsShow**](OrganizationApi.md#organizationsShow) | **GET** /organizations/{id} | Get Organization

<a name="organizationsList"></a>
# **organizationsList**
> OrganizationsResponse organizationsList(name, location, distance, country, state, query, sort, limit, page)

Get Organizations

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
String name = "name_example"; // String | Filter results matching organization name
String location = "location_example"; // String | Filter results by location (_postal code_, _city/state_, or _lat/long_)
Integer distance = 56; // Integer | Filter results by distance from given location
String country = "country_example"; // String | Filter results by country
String state = "state_example"; // String | Filter results by state
String query = "query_example"; // String | Search on _name_, _city_, _state_; Fuzzy search that includes synonyms, punctuation, etc.
String sort = "sort_example"; // String | Sort results by field
Integer limit = 20; // Integer | Number of results to return
Integer page = 1; // Integer | Page of results to return
try {
    OrganizationsResponse result = apiInstance.organizationsList(name, location, distance, country, state, query, sort, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#organizationsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filter results matching organization name | [optional]
 **location** | **String**| Filter results by location (_postal code_, _city/state_, or _lat/long_) | [optional]
 **distance** | **Integer**| Filter results by distance from given location | [optional]
 **country** | **String**| Filter results by country | [optional]
 **state** | **String**| Filter results by state | [optional]
 **query** | **String**| Search on _name_, _city_, _state_; Fuzzy search that includes synonyms, punctuation, etc. | [optional]
 **sort** | **String**| Sort results by field | [optional] [enum: distance, -distance, name, -name, country, -country, state, -state]
 **limit** | **Integer**| Number of results to return | [optional] [default to 20] [enum: 100]
 **page** | **Integer**| Page of results to return | [optional] [default to 1] [enum: 1]

### Return type

[**OrganizationsResponse**](OrganizationsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="organizationsShow"></a>
# **organizationsShow**
> OrganizationResponse organizationsShow(id)

Get Organization

### Example
```java
// Import classes:
//import com.petfinder.client.ApiClient;
//import com.petfinder.client.ApiException;
//import com.petfinder.client.Configuration;
//import io.swagger.client.auth.*;
//import api.com.petfinder.client.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
String id = "id_example"; // String | Organization ID
try {
    OrganizationResponse result = apiInstance.organizationsShow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#organizationsShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Organization ID |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

