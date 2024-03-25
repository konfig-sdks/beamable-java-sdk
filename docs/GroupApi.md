# GroupApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyObjectGroups**](GroupApi.md#applyObjectGroups) | **POST** /object/groups/{objectId}/apply |  |
| [**assignObjectGroup**](GroupApi.md#assignObjectGroup) | **POST** /object/group-users/{objectId}/group |  |
| [**createDonation**](GroupApi.md#createDonation) | **POST** /object/groups/{objectId}/donations |  |
| [**createPetition**](GroupApi.md#createPetition) | **POST** /object/groups/{objectId}/petition |  |
| [**deleteObjectGroup**](GroupApi.md#deleteObjectGroup) | **DELETE** /object/groups/{objectId} |  |
| [**getGroupUsers**](GroupApi.md#getGroupUsers) | **GET** /object/group-users/{objectId} |  |
| [**getObjectGroups**](GroupApi.md#getObjectGroups) | **GET** /object/groups/{objectId} |  |
| [**getRecommendedUsers**](GroupApi.md#getRecommendedUsers) | **GET** /object/group-users/{objectId}/recommended |  |
| [**getUserAvailability**](GroupApi.md#getUserAvailability) | **GET** /object/group-users/{objectId}/availability |  |
| [**inviteObjectGroup**](GroupApi.md#inviteObjectGroup) | **POST** /object/groups/{objectId}/invite |  |
| [**joinUserDelete**](GroupApi.md#joinUserDelete) | **DELETE** /object/group-users/{objectId}/join |  |
| [**joinUserToGroup**](GroupApi.md#joinUserToGroup) | **POST** /object/group-users/{objectId}/join |  |
| [**kickObjectGroup**](GroupApi.md#kickObjectGroup) | **POST** /object/groups/{objectId}/kick |  |
| [**removeMember**](GroupApi.md#removeMember) | **DELETE** /object/groups/{objectId}/member |  |
| [**searchGroups**](GroupApi.md#searchGroups) | **GET** /basic/groups/search |  |
| [**searchUsers**](GroupApi.md#searchUsers) | **GET** /object/group-users/{objectId}/search |  |
| [**updateDonation**](GroupApi.md#updateDonation) | **PUT** /object/groups/{objectId}/donations |  |
| [**updateObjectGroup**](GroupApi.md#updateObjectGroup) | **PUT** /object/groups/{objectId} |  |
| [**updateRole**](GroupApi.md#updateRole) | **PUT** /object/groups/{objectId}/role |  |


<a name="applyObjectGroups"></a>
# **applyObjectGroups**
> CommonResponse applyObjectGroups(objectId).groupApplication(groupApplication).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .applyObjectGroups(objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#applyObjectGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .applyObjectGroups(objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#applyObjectGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupApplication** | [**GroupApplication**](GroupApplication.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="assignObjectGroup"></a>
# **assignObjectGroup**
> GroupCreateResponse assignObjectGroup(objectId).groupCreate(groupCreate).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer requirement = 56;
    Integer maxSize = 56;
    String objectId = "objectId_example";
    String name = "name_example";
    String enrollmentType = "enrollmentType_example";
    String tag = "tag_example";
    String clientData = "clientData_example";
    List<GroupScoreBinding> scores = Arrays.asList();
    Integer time = 56;
    String type = "not-available";
    Integer group = 56;
    try {
      GroupCreateResponse result = client
              .group
              .assignObjectGroup(requirement, maxSize, objectId)
              .name(name)
              .enrollmentType(enrollmentType)
              .tag(tag)
              .clientData(clientData)
              .scores(scores)
              .time(time)
              .type(type)
              .group(group)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#assignObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupCreateResponse> response = client
              .group
              .assignObjectGroup(requirement, maxSize, objectId)
              .name(name)
              .enrollmentType(enrollmentType)
              .tag(tag)
              .clientData(clientData)
              .scores(scores)
              .time(time)
              .type(type)
              .group(group)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#assignObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupCreate** | [**GroupCreate**](GroupCreate.md)|  | [optional] |

### Return type

[**GroupCreateResponse**](GroupCreateResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="createDonation"></a>
# **createDonation**
> EmptyResponse createDonation(objectId).createDonationRequest(createDonationRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    Integer amount = 56;
    String objectId = "objectId_example";
    String currencyId = "currencyId_example";
    String config = "config_example";
    try {
      EmptyResponse result = client
              .group
              .createDonation(amount, objectId)
              .currencyId(currencyId)
              .config(config)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createDonation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .group
              .createDonation(amount, objectId)
              .currencyId(currencyId)
              .config(config)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createDonation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **createDonationRequest** | [**CreateDonationRequest**](CreateDonationRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="createPetition"></a>
# **createPetition**
> CommonResponse createPetition(objectId).groupApplication(groupApplication).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .createPetition(objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createPetition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .createPetition(objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createPetition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupApplication** | [**GroupApplication**](GroupApplication.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="deleteObjectGroup"></a>
# **deleteObjectGroup**
> CommonResponse deleteObjectGroup(objectId).disbandRequest(disbandRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .deleteObjectGroup(objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deleteObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .deleteObjectGroup(objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deleteObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **disbandRequest** | [**DisbandRequest**](DisbandRequest.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getGroupUsers"></a>
# **getGroupUsers**
> GroupUser getGroupUsers(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    try {
      GroupUser result = client
              .group
              .getGroupUsers(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInFlight());
      System.out.println(result.getGamerTag());
      System.out.println(result.getAllGroups());
      System.out.println(result.getUpdated());
      System.out.println(result.getMember());
      System.out.println(result.getScores());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getGroupUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupUser> response = client
              .group
              .getGroupUsers(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getGroupUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |

### Return type

[**GroupUser**](GroupUser.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getObjectGroups"></a>
# **getObjectGroups**
> Group getObjectGroups(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    try {
      Group result = client
              .group
              .getObjectGroups(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getInFlight());
      System.out.println(result.getName());
      System.out.println(result.getEnrollmentType());
      System.out.println(result.getDonations());
      System.out.println(result.getFreeSlots());
      System.out.println(result.getMaybeDonations());
      System.out.println(result.getTag());
      System.out.println(result.getCanUpdateMOTD());
      System.out.println(result.getShard());
      System.out.println(result.getCanUpdateSlogan());
      System.out.println(result.getLeader());
      System.out.println(result.getSlogan());
      System.out.println(result.getRequirement());
      System.out.println(result.getMotd());
      System.out.println(result.getId());
      System.out.println(result.getClientData());
      System.out.println(result.getRoles());
      System.out.println(result.getScores());
      System.out.println(result.getCanUpdateEnrollment());
      System.out.println(result.getMembers());
      System.out.println(result.getCanDisband());
      System.out.println(result.getType());
      System.out.println(result.getMaxSize());
      System.out.println(result.getSubGroups());
      System.out.println(result.getCreated());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getObjectGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .group
              .getObjectGroups(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getObjectGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |

### Return type

[**Group**](Group.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getRecommendedUsers"></a>
# **getRecommendedUsers**
> GroupSearchResponse getRecommendedUsers(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    try {
      GroupSearchResponse result = client
              .group
              .getRecommendedUsers(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRecommendedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupSearchResponse> response = client
              .group
              .getRecommendedUsers(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRecommendedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |

### Return type

[**GroupSearchResponse**](GroupSearchResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getUserAvailability"></a>
# **getUserAvailability**
> AvailabilityResponse getUserAvailability(objectId).name(name).tag(tag).type(type).subGroup(subGroup).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    String name = "name_example";
    String tag = "tag_example";
    String type = "type_example";
    Boolean subGroup = true;
    try {
      AvailabilityResponse result = client
              .group
              .getUserAvailability(objectId)
              .name(name)
              .tag(tag)
              .type(type)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getTag());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getUserAvailability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityResponse> response = client
              .group
              .getUserAvailability(objectId)
              .name(name)
              .tag(tag)
              .type(type)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getUserAvailability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **name** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |
| **subGroup** | **Boolean**|  | [optional] |

### Return type

[**AvailabilityResponse**](AvailabilityResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="inviteObjectGroup"></a>
# **inviteObjectGroup**
> CommonResponse inviteObjectGroup(objectId).groupInvite(groupInvite).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    Integer gamerTag = 56;
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .inviteObjectGroup(gamerTag, objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#inviteObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .inviteObjectGroup(gamerTag, objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#inviteObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupInvite** | [**GroupInvite**](GroupInvite.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="joinUserDelete"></a>
# **joinUserDelete**
> GroupMembershipResponse joinUserDelete(objectId).groupMembershipRequest(groupMembershipRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer group = 56;
    String objectId = "objectId_example";
    Integer successor = 56;
    Integer score = 56;
    Integer subGroup = 56;
    String type = "not-available";
    try {
      GroupMembershipResponse result = client
              .group
              .joinUserDelete(group, objectId)
              .successor(successor)
              .score(score)
              .subGroup(subGroup)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getGamerTag());
      System.out.println(result.getMember());
      System.out.println(result.getType());
      System.out.println(result.getSubGroups());
      System.out.println(result.getGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#joinUserDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembershipResponse> response = client
              .group
              .joinUserDelete(group, objectId)
              .successor(successor)
              .score(score)
              .subGroup(subGroup)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#joinUserDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupMembershipRequest** | [**GroupMembershipRequest**](GroupMembershipRequest.md)|  | [optional] |

### Return type

[**GroupMembershipResponse**](GroupMembershipResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="joinUserToGroup"></a>
# **joinUserToGroup**
> GroupMembershipResponse joinUserToGroup(objectId).groupMembershipRequest(groupMembershipRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer group = 56;
    String objectId = "objectId_example";
    Integer successor = 56;
    Integer score = 56;
    Integer subGroup = 56;
    String type = "not-available";
    try {
      GroupMembershipResponse result = client
              .group
              .joinUserToGroup(group, objectId)
              .successor(successor)
              .score(score)
              .subGroup(subGroup)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getGamerTag());
      System.out.println(result.getMember());
      System.out.println(result.getType());
      System.out.println(result.getSubGroups());
      System.out.println(result.getGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#joinUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembershipResponse> response = client
              .group
              .joinUserToGroup(group, objectId)
              .successor(successor)
              .score(score)
              .subGroup(subGroup)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#joinUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupMembershipRequest** | [**GroupMembershipRequest**](GroupMembershipRequest.md)|  | [optional] |

### Return type

[**GroupMembershipResponse**](GroupMembershipResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="kickObjectGroup"></a>
# **kickObjectGroup**
> GroupMembershipResponse kickObjectGroup(objectId).kickRequest(kickRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer gamerTag = 56;
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      GroupMembershipResponse result = client
              .group
              .kickObjectGroup(gamerTag, objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getGamerTag());
      System.out.println(result.getMember());
      System.out.println(result.getType());
      System.out.println(result.getSubGroups());
      System.out.println(result.getGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#kickObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembershipResponse> response = client
              .group
              .kickObjectGroup(gamerTag, objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#kickObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **kickRequest** | [**KickRequest**](KickRequest.md)|  | [optional] |

### Return type

[**GroupMembershipResponse**](GroupMembershipResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="removeMember"></a>
# **removeMember**
> GroupMembershipResponse removeMember(objectId).kickRequest(kickRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer gamerTag = 56;
    String objectId = "objectId_example";
    Integer subGroup = 56;
    try {
      GroupMembershipResponse result = client
              .group
              .removeMember(gamerTag, objectId)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getGamerTag());
      System.out.println(result.getMember());
      System.out.println(result.getType());
      System.out.println(result.getSubGroups());
      System.out.println(result.getGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembershipResponse> response = client
              .group
              .removeMember(gamerTag, objectId)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **kickRequest** | [**KickRequest**](KickRequest.md)|  | [optional] |

### Return type

[**GroupMembershipResponse**](GroupMembershipResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="searchGroups"></a>
# **searchGroups**
> GroupSearchResponse searchGroups().name(name).scoreMin(scoreMin).sortField(sortField).userScore(userScore).hasSlots(hasSlots).enrollmentTypes(enrollmentTypes).offset(offset).scoreMax(scoreMax).subGroup(subGroup).sortValue(sortValue).type(type).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String name = "name_example";
    Integer scoreMin = 56;
    String sortField = "sortField_example";
    Integer userScore = 56;
    Boolean hasSlots = true;
    String enrollmentTypes = "enrollmentTypes_example";
    Integer offset = 56;
    Integer scoreMax = 56;
    Boolean subGroup = true;
    Integer sortValue = 56;
    String type = "type_example";
    Integer limit = 56;
    try {
      GroupSearchResponse result = client
              .group
              .searchGroups()
              .name(name)
              .scoreMin(scoreMin)
              .sortField(sortField)
              .userScore(userScore)
              .hasSlots(hasSlots)
              .enrollmentTypes(enrollmentTypes)
              .offset(offset)
              .scoreMax(scoreMax)
              .subGroup(subGroup)
              .sortValue(sortValue)
              .type(type)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#searchGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupSearchResponse> response = client
              .group
              .searchGroups()
              .name(name)
              .scoreMin(scoreMin)
              .sortField(sortField)
              .userScore(userScore)
              .hasSlots(hasSlots)
              .enrollmentTypes(enrollmentTypes)
              .offset(offset)
              .scoreMax(scoreMax)
              .subGroup(subGroup)
              .sortValue(sortValue)
              .type(type)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#searchGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **scoreMin** | **Integer**|  | [optional] |
| **sortField** | **String**|  | [optional] |
| **userScore** | **Integer**|  | [optional] |
| **hasSlots** | **Boolean**|  | [optional] |
| **enrollmentTypes** | **String**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **scoreMax** | **Integer**|  | [optional] |
| **subGroup** | **Boolean**|  | [optional] |
| **sortValue** | **Integer**|  | [optional] |
| **type** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**GroupSearchResponse**](GroupSearchResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="searchUsers"></a>
# **searchUsers**
> GroupSearchResponse searchUsers(objectId).name(name).scoreMin(scoreMin).sortField(sortField).userScore(userScore).hasSlots(hasSlots).enrollmentTypes(enrollmentTypes).offset(offset).scoreMax(scoreMax).subGroup(subGroup).sortValue(sortValue).type(type).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    String name = "name_example";
    Integer scoreMin = 56;
    String sortField = "sortField_example";
    Integer userScore = 56;
    Boolean hasSlots = true;
    String enrollmentTypes = "enrollmentTypes_example";
    Integer offset = 56;
    Integer scoreMax = 56;
    Boolean subGroup = true;
    Integer sortValue = 56;
    String type = "type_example";
    Integer limit = 56;
    try {
      GroupSearchResponse result = client
              .group
              .searchUsers(objectId)
              .name(name)
              .scoreMin(scoreMin)
              .sortField(sortField)
              .userScore(userScore)
              .hasSlots(hasSlots)
              .enrollmentTypes(enrollmentTypes)
              .offset(offset)
              .scoreMax(scoreMax)
              .subGroup(subGroup)
              .sortValue(sortValue)
              .type(type)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#searchUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupSearchResponse> response = client
              .group
              .searchUsers(objectId)
              .name(name)
              .scoreMin(scoreMin)
              .sortField(sortField)
              .userScore(userScore)
              .hasSlots(hasSlots)
              .enrollmentTypes(enrollmentTypes)
              .offset(offset)
              .scoreMax(scoreMax)
              .subGroup(subGroup)
              .sortValue(sortValue)
              .type(type)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#searchUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **name** | **String**|  | [optional] |
| **scoreMin** | **Integer**|  | [optional] |
| **sortField** | **String**|  | [optional] |
| **userScore** | **Integer**|  | [optional] |
| **hasSlots** | **Boolean**|  | [optional] |
| **enrollmentTypes** | **String**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **scoreMax** | **Integer**|  | [optional] |
| **subGroup** | **Boolean**|  | [optional] |
| **sortValue** | **Integer**|  | [optional] |
| **type** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**GroupSearchResponse**](GroupSearchResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="updateDonation"></a>
# **updateDonation**
> EmptyResponse updateDonation(objectId).makeDonationRequest(makeDonationRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    Integer recipientId = 56;
    Integer amount = 56;
    String objectId = "objectId_example";
    try {
      EmptyResponse result = client
              .group
              .updateDonation(recipientId, amount, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateDonation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .group
              .updateDonation(recipientId, amount, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateDonation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **makeDonationRequest** | [**MakeDonationRequest**](MakeDonationRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="updateObjectGroup"></a>
# **updateObjectGroup**
> CommonResponse updateObjectGroup(objectId).groupUpdate(groupUpdate).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    String name = "name_example";
    String enrollmentType = "enrollmentType_example";
    String tag = "tag_example";
    String slogan = "slogan_example";
    Integer requirement = 56;
    String motd = "motd_example";
    String clientData = "clientData_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .updateObjectGroup(objectId)
              .name(name)
              .enrollmentType(enrollmentType)
              .tag(tag)
              .slogan(slogan)
              .requirement(requirement)
              .motd(motd)
              .clientData(clientData)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .updateObjectGroup(objectId)
              .name(name)
              .enrollmentType(enrollmentType)
              .tag(tag)
              .slogan(slogan)
              .requirement(requirement)
              .motd(motd)
              .clientData(clientData)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateObjectGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **groupUpdate** | [**GroupUpdate**](GroupUpdate.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="updateRole"></a>
# **updateRole**
> CommonResponse updateRole(objectId).roleChangeRequest(roleChangeRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: user
    configuration.token = "BEARER TOKEN";
    Beamable client = new Beamable(configuration);
    Integer gamerTag = 56;
    String objectId = "objectId_example";
    String role = "role_example";
    Integer subGroup = 56;
    try {
      CommonResponse result = client
              .group
              .updateRole(gamerTag, objectId)
              .role(role)
              .subGroup(subGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .group
              .updateRole(gamerTag, objectId)
              .role(role)
              .subGroup(subGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectId** | **String**|  | |
| **roleChangeRequest** | [**RoleChangeRequest**](RoleChangeRequest.md)|  | [optional] |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

