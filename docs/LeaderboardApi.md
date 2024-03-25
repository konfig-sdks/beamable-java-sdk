# LeaderboardApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFreezeRequest**](LeaderboardApi.md#createFreezeRequest) | **PUT** /object/leaderboards/{objectId}/freeze |  |
| [**deleteEntries**](LeaderboardApi.md#deleteEntries) | **DELETE** /object/leaderboards/{objectId}/entries |  |
| [**deleteObjectById**](LeaderboardApi.md#deleteObjectById) | **DELETE** /object/leaderboards/{objectId} |  |
| [**getAssignmentLeaderboard**](LeaderboardApi.md#getAssignmentLeaderboard) | **GET** /basic/leaderboards/assignment |  |
| [**getObjectDetails**](LeaderboardApi.md#getObjectDetails) | **GET** /object/leaderboards/{objectId}/details |  |
| [**getObjectMatches**](LeaderboardApi.md#getObjectMatches) | **GET** /object/leaderboards/{objectId}/matches |  |
| [**getObjectMembership**](LeaderboardApi.md#getObjectMembership) | **GET** /object/leaderboards/{objectId}/membership |  |
| [**getObjectPartition**](LeaderboardApi.md#getObjectPartition) | **GET** /object/leaderboards/{objectId}/partition |  |
| [**getObjectView**](LeaderboardApi.md#getObjectView) | **GET** /object/leaderboards/{objectId}/view |  |
| [**getPlayerScores**](LeaderboardApi.md#getPlayerScores) | **GET** /basic/leaderboards/player |  |
| [**getUserScores**](LeaderboardApi.md#getUserScores) | **GET** /basic/leaderboards/uid |  |
| [**listObjectRanks**](LeaderboardApi.md#listObjectRanks) | **GET** /object/leaderboards/{objectId}/ranks |  |
| [**listUserScores**](LeaderboardApi.md#listUserScores) | **GET** /basic/leaderboards/list |  |
| [**removeAssignment**](LeaderboardApi.md#removeAssignment) | **DELETE** /object/leaderboards/{objectId}/assignment |  |
| [**removeEntry**](LeaderboardApi.md#removeEntry) | **DELETE** /object/leaderboards/{objectId}/entry |  |
| [**submitObjectScores**](LeaderboardApi.md#submitObjectScores) | **POST** /object/leaderboards/{objectId} |  |
| [**swapObjectLeaderboard**](LeaderboardApi.md#swapObjectLeaderboard) | **PUT** /object/leaderboards/{objectId}/swap |  |
| [**updateEntry**](LeaderboardApi.md#updateEntry) | **PUT** /object/leaderboards/{objectId}/entry |  |


<a name="createFreezeRequest"></a>
# **createFreezeRequest**
> CommonResponse createFreezeRequest(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    try {
      CommonResponse result = client
              .leaderboard
              .createFreezeRequest(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#createFreezeRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .createFreezeRequest(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#createFreezeRequest");
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

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="deleteEntries"></a>
# **deleteEntries**
> CommonResponse deleteEntries(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    try {
      CommonResponse result = client
              .leaderboard
              .deleteEntries(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#deleteEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .deleteEntries(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#deleteEntries");
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

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="deleteObjectById"></a>
# **deleteObjectById**
> CommonResponse deleteObjectById(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    try {
      CommonResponse result = client
              .leaderboard
              .deleteObjectById(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#deleteObjectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .deleteObjectById(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#deleteObjectById");
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

[**CommonResponse**](CommonResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getAssignmentLeaderboard"></a>
# **getAssignmentLeaderboard**
> LeaderboardAssignmentInfo getAssignmentLeaderboard(boardId).joinBoard(joinBoard).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    String boardId = "boardId_example";
    Boolean joinBoard = true;
    try {
      LeaderboardAssignmentInfo result = client
              .leaderboard
              .getAssignmentLeaderboard(boardId)
              .joinBoard(joinBoard)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlayerId());
      System.out.println(result.getLeaderboardId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getAssignmentLeaderboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardAssignmentInfo> response = client
              .leaderboard
              .getAssignmentLeaderboard(boardId)
              .joinBoard(joinBoard)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getAssignmentLeaderboard");
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
| **boardId** | **String**|  | |
| **joinBoard** | **Boolean**|  | [optional] |

### Return type

[**LeaderboardAssignmentInfo**](LeaderboardAssignmentInfo.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getObjectDetails"></a>
# **getObjectDetails**
> LeaderboardDetails getObjectDetails(objectId).from(from).max(max).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer from = 56;
    Integer max = 56;
    try {
      LeaderboardDetails result = client
              .leaderboard
              .getObjectDetails(objectId)
              .from(from)
              .max(max)
              .execute();
      System.out.println(result);
      System.out.println(result.getLbid());
      System.out.println(result.getOrules());
      System.out.println(result.getNumberOfEntries());
      System.out.println(result.getFullName());
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardDetails> response = client
              .leaderboard
              .getObjectDetails(objectId)
              .from(from)
              .max(max)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectDetails");
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
| **from** | **Integer**|  | [optional] |
| **max** | **Integer**|  | [optional] |

### Return type

[**LeaderboardDetails**](LeaderboardDetails.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getObjectMatches"></a>
# **getObjectMatches**
> MatchMakingMatchesPvpResponse getObjectMatches(poolSize, windows, windowSize, objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer poolSize = 56;
    Integer windows = 56;
    Integer windowSize = 56;
    String objectId = "objectId_example";
    try {
      MatchMakingMatchesPvpResponse result = client
              .leaderboard
              .getObjectMatches(poolSize, windows, windowSize, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getTotalEntries());
      System.out.println(result.getPlayerRank());
      System.out.println(result.getWindows());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectMatches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MatchMakingMatchesPvpResponse> response = client
              .leaderboard
              .getObjectMatches(poolSize, windows, windowSize, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectMatches");
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
| **poolSize** | **Integer**|  | |
| **windows** | **Integer**|  | |
| **windowSize** | **Integer**|  | |
| **objectId** | **String**|  | |

### Return type

[**MatchMakingMatchesPvpResponse**](MatchMakingMatchesPvpResponse.md)

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

<a name="getObjectMembership"></a>
# **getObjectMembership**
> LeaderboardMembershipResponse getObjectMembership(playerId, objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer playerId = 56;
    String objectId = "objectId_example";
    try {
      LeaderboardMembershipResponse result = client
              .leaderboard
              .getObjectMembership(playerId, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardMembershipResponse> response = client
              .leaderboard
              .getObjectMembership(playerId, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectMembership");
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
| **playerId** | **Integer**|  | |
| **objectId** | **String**|  | |

### Return type

[**LeaderboardMembershipResponse**](LeaderboardMembershipResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getObjectPartition"></a>
# **getObjectPartition**
> LeaderboardPartitionInfo getObjectPartition(playerId, objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer playerId = 56;
    String objectId = "objectId_example";
    try {
      LeaderboardPartitionInfo result = client
              .leaderboard
              .getObjectPartition(playerId, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlayerId());
      System.out.println(result.getLeaderboardId());
      System.out.println(result.getPartition());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectPartition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardPartitionInfo> response = client
              .leaderboard
              .getObjectPartition(playerId, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectPartition");
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
| **playerId** | **Integer**|  | |
| **objectId** | **String**|  | |

### Return type

[**LeaderboardPartitionInfo**](LeaderboardPartitionInfo.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getObjectView"></a>
# **getObjectView**
> LeaderBoardViewResponse getObjectView(objectId).max(max).focus(focus).friends(friends).from(from).outlier(outlier).guild(guild).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer max = 56;
    Integer focus = 56;
    Boolean friends = true;
    Integer from = 56;
    Integer outlier = 56;
    Boolean guild = true;
    try {
      LeaderBoardViewResponse result = client
              .leaderboard
              .getObjectView(objectId)
              .max(max)
              .focus(focus)
              .friends(friends)
              .from(from)
              .outlier(outlier)
              .guild(guild)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getLb());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderBoardViewResponse> response = client
              .leaderboard
              .getObjectView(objectId)
              .max(max)
              .focus(focus)
              .friends(friends)
              .from(from)
              .outlier(outlier)
              .guild(guild)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getObjectView");
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
| **max** | **Integer**|  | [optional] |
| **focus** | **Integer**|  | [optional] |
| **friends** | **Boolean**|  | [optional] |
| **from** | **Integer**|  | [optional] |
| **outlier** | **Integer**|  | [optional] |
| **guild** | **Boolean**|  | [optional] |

### Return type

[**LeaderBoardViewResponse**](LeaderBoardViewResponse.md)

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

<a name="getPlayerScores"></a>
# **getPlayerScores**
> ListLeaderBoardViewResponse getPlayerScores(dbid).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Long dbid = 56L;
    try {
      ListLeaderBoardViewResponse result = client
              .leaderboard
              .getPlayerScores(dbid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getLbs());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getPlayerScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListLeaderBoardViewResponse> response = client
              .leaderboard
              .getPlayerScores(dbid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getPlayerScores");
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
| **dbid** | **Long**|  | |

### Return type

[**ListLeaderBoardViewResponse**](ListLeaderBoardViewResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="getUserScores"></a>
# **getUserScores**
> LeaderboardUidResponse getUserScores().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    try {
      LeaderboardUidResponse result = client
              .leaderboard
              .getUserScores()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getUserScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardUidResponse> response = client
              .leaderboard
              .getUserScores()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#getUserScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LeaderboardUidResponse**](LeaderboardUidResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="listObjectRanks"></a>
# **listObjectRanks**
> LeaderBoardViewResponse listObjectRanks(objectId).ids(ids).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    String ids = "ids_example";
    try {
      LeaderBoardViewResponse result = client
              .leaderboard
              .listObjectRanks(objectId)
              .ids(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getLb());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#listObjectRanks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderBoardViewResponse> response = client
              .leaderboard
              .listObjectRanks(objectId)
              .ids(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#listObjectRanks");
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
| **ids** | **String**|  | [optional] |

### Return type

[**LeaderBoardViewResponse**](LeaderBoardViewResponse.md)

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

<a name="listUserScores"></a>
# **listUserScores**
> LeaderboardListResponse listUserScores().skip(skip).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer skip = 56;
    Integer limit = 56;
    try {
      LeaderboardListResponse result = client
              .leaderboard
              .listUserScores()
              .skip(skip)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getOffset());
      System.out.println(result.getNameList());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#listUserScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaderboardListResponse> response = client
              .leaderboard
              .listUserScores()
              .skip(skip)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#listUserScores");
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
| **skip** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**LeaderboardListResponse**](LeaderboardListResponse.md)

### Authorization

[scope](../README.md#scope), [user](../README.md#user)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |

<a name="removeAssignment"></a>
# **removeAssignment**
> CommonResponse removeAssignment(objectId).leaderboardRemoveCacheEntryRequest(leaderboardRemoveCacheEntryRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer playerId = 56;
    String objectId = "objectId_example";
    try {
      CommonResponse result = client
              .leaderboard
              .removeAssignment(playerId, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#removeAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .removeAssignment(playerId, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#removeAssignment");
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
| **leaderboardRemoveCacheEntryRequest** | [**LeaderboardRemoveCacheEntryRequest**](LeaderboardRemoveCacheEntryRequest.md)|  | [optional] |

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

<a name="removeEntry"></a>
# **removeEntry**
> CommonResponse removeEntry(objectId).leaderboardRemoveEntryRequest(leaderboardRemoveEntryRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer id = 56;
    String objectId = "objectId_example";
    try {
      CommonResponse result = client
              .leaderboard
              .removeEntry(id, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#removeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .removeEntry(id, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#removeEntry");
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
| **leaderboardRemoveEntryRequest** | [**LeaderboardRemoveEntryRequest**](LeaderboardRemoveEntryRequest.md)|  | [optional] |

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

<a name="submitObjectScores"></a>
# **submitObjectScores**
> CommonResponse submitObjectScores(objectId).leaderboardCreateRequest(leaderboardCreateRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Boolean sharded = true;
    String objectId = "objectId_example";
    Integer freezeTime = 56;
    List<String> derivatives = Arrays.asList();
    String scoreName = "scoreName_example";
    ClientPermission permissions = new ClientPermission();
    Integer maxEntries = 56;
    Boolean partitioned = true;
    Integer ttl = 56;
    try {
      CommonResponse result = client
              .leaderboard
              .submitObjectScores(sharded, objectId)
              .freezeTime(freezeTime)
              .derivatives(derivatives)
              .scoreName(scoreName)
              .permissions(permissions)
              .maxEntries(maxEntries)
              .partitioned(partitioned)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#submitObjectScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .submitObjectScores(sharded, objectId)
              .freezeTime(freezeTime)
              .derivatives(derivatives)
              .scoreName(scoreName)
              .permissions(permissions)
              .maxEntries(maxEntries)
              .partitioned(partitioned)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#submitObjectScores");
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
| **leaderboardCreateRequest** | [**LeaderboardCreateRequest**](LeaderboardCreateRequest.md)|  | [optional] |

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

<a name="swapObjectLeaderboard"></a>
# **swapObjectLeaderboard**
> CommonResponse swapObjectLeaderboard(objectId).leaderboardSwapRequest(leaderboardSwapRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
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
    Integer swapBase = 56;
    Integer delta = 56;
    String objectId = "objectId_example";
    Integer winnerId = 56;
    Integer loserId = 56;
    try {
      CommonResponse result = client
              .leaderboard
              .swapObjectLeaderboard(swapBase, delta, objectId)
              .winnerId(winnerId)
              .loserId(loserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#swapObjectLeaderboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .swapObjectLeaderboard(swapBase, delta, objectId)
              .winnerId(winnerId)
              .loserId(loserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#swapObjectLeaderboard");
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
| **leaderboardSwapRequest** | [**LeaderboardSwapRequest**](LeaderboardSwapRequest.md)|  | [optional] |

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

<a name="updateEntry"></a>
# **updateEntry**
> CommonResponse updateEntry(objectId).leaderboardAddRequest(leaderboardAddRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaderboardApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double score = 3.4D;
    Integer id = 56;
    String objectId = "objectId_example";
    Double maxScore = 3.4D;
    Map<String, Object> stats = new HashMap();
    Double minScore = 3.4D;
    Boolean increment = true;
    try {
      CommonResponse result = client
              .leaderboard
              .updateEntry(score, id, objectId)
              .maxScore(maxScore)
              .stats(stats)
              .minScore(minScore)
              .increment(increment)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#updateEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .leaderboard
              .updateEntry(score, id, objectId)
              .maxScore(maxScore)
              .stats(stats)
              .minScore(minScore)
              .increment(increment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaderboardApi#updateEntry");
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
| **leaderboardAddRequest** | [**LeaderboardAddRequest**](LeaderboardAddRequest.md)|  | [optional] |

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

