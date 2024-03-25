# BlockApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSocialBlocked**](BlockApi.md#userSocialBlocked) | **POST** /basic/social/blocked |  |
| [**userSocialUnblock**](BlockApi.md#userSocialUnblock) | **DELETE** /basic/social/blocked |  |


<a name="userSocialBlocked"></a>
# **userSocialBlocked**
> FriendshipStatus userSocialBlocked().playerIdRequest(playerIdRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
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
    String playerId = "playerId_example";
    try {
      FriendshipStatus result = client
              .block
              .userSocialBlocked()
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlayerId());
      System.out.println(result.getFriendId());
      System.out.println(result.getIsBlocked());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#userSocialBlocked");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FriendshipStatus> response = client
              .block
              .userSocialBlocked()
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#userSocialBlocked");
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
| **playerIdRequest** | [**PlayerIdRequest**](PlayerIdRequest.md)|  | [optional] |

### Return type

[**FriendshipStatus**](FriendshipStatus.md)

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

<a name="userSocialUnblock"></a>
# **userSocialUnblock**
> FriendshipStatus userSocialUnblock().playerIdRequest(playerIdRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
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
    String playerId = "playerId_example";
    try {
      FriendshipStatus result = client
              .block
              .userSocialUnblock()
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlayerId());
      System.out.println(result.getFriendId());
      System.out.println(result.getIsBlocked());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#userSocialUnblock");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FriendshipStatus> response = client
              .block
              .userSocialUnblock()
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#userSocialUnblock");
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
| **playerIdRequest** | [**PlayerIdRequest**](PlayerIdRequest.md)|  | [optional] |

### Return type

[**FriendshipStatus**](FriendshipStatus.md)

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

