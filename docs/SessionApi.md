# SessionApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSessionRequest**](SessionApi.md#createSessionRequest) | **POST** /basic/session |  |
| [**getHistory**](SessionApi.md#getHistory) | **GET** /basic/session/history |  |
| [**getStatus**](SessionApi.md#getStatus) | **GET** /basic/session/status |  |
| [**postHeartbeat**](SessionApi.md#postHeartbeat) | **POST** /basic/session/heartbeat |  |


<a name="createSessionRequest"></a>
# **createSessionRequest**
> StartSessionResponse createSessionRequest().startSessionRequest(startSessionRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
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
    String source = "source_example";
    Map<String, Object> customParams = new HashMap();
    String shard = "shard_example";
    String locale = "locale_example";
    Map<String, Object> deviceParams = new HashMap();
    SessionLanguageContext language = new SessionLanguageContext();
    Integer time = 56;
    String platform = "platform_example";
    Integer gamer = 56;
    String device = "device_example";
    try {
      StartSessionResponse result = client
              .session
              .createSessionRequest()
              .source(source)
              .customParams(customParams)
              .shard(shard)
              .locale(locale)
              .deviceParams(deviceParams)
              .language(language)
              .time(time)
              .platform(platform)
              .gamer(gamer)
              .device(device)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getGamer());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createSessionRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StartSessionResponse> response = client
              .session
              .createSessionRequest()
              .source(source)
              .customParams(customParams)
              .shard(shard)
              .locale(locale)
              .deviceParams(deviceParams)
              .language(language)
              .time(time)
              .platform(platform)
              .gamer(gamer)
              .device(device)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createSessionRequest");
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
| **startSessionRequest** | [**StartSessionRequest**](StartSessionRequest.md)|  | [optional] |

### Return type

[**StartSessionResponse**](StartSessionResponse.md)

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

<a name="getHistory"></a>
# **getHistory**
> SessionHistoryResponse getHistory(dbid).month(month).year(year).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
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
    Integer dbid = 56;
    Integer month = 56;
    Integer year = 56;
    try {
      SessionHistoryResponse result = client
              .session
              .getHistory(dbid)
              .month(month)
              .year(year)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayments());
      System.out.println(result.getTotalPaid());
      System.out.println(result.getSessions());
      System.out.println(result.getDate());
      System.out.println(result.getInstallDate());
      System.out.println(result.getDaysPlayed());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionHistoryResponse> response = client
              .session
              .getHistory(dbid)
              .month(month)
              .year(year)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getHistory");
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
| **dbid** | **Integer**|  | |
| **month** | **Integer**|  | [optional] |
| **year** | **Integer**|  | [optional] |

### Return type

[**SessionHistoryResponse**](SessionHistoryResponse.md)

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

<a name="getStatus"></a>
# **getStatus**
> OnlineStatusResponses getStatus(intervalSecs).playerIds(playerIds).playerIdsSeq(playerIdsSeq).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
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
    Integer intervalSecs = 56;
    String playerIds = "playerIds_example";
    List<Object> playerIdsSeq = null;
    try {
      OnlineStatusResponses result = client
              .session
              .getStatus(intervalSecs)
              .playerIds(playerIds)
              .playerIdsSeq(playerIdsSeq)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlayers());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnlineStatusResponses> response = client
              .session
              .getStatus(intervalSecs)
              .playerIds(playerIds)
              .playerIdsSeq(playerIdsSeq)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getStatus");
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
| **intervalSecs** | **Integer**|  | |
| **playerIds** | **String**|  | [optional] |
| **playerIdsSeq** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |

### Return type

[**OnlineStatusResponses**](OnlineStatusResponses.md)

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

<a name="postHeartbeat"></a>
# **postHeartbeat**
> SessionHeartbeat postHeartbeat().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
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
      SessionHeartbeat result = client
              .session
              .postHeartbeat()
              .execute();
      System.out.println(result);
      System.out.println(result.getGt());
      System.out.println(result.getHeartbeat());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#postHeartbeat");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionHeartbeat> response = client
              .session
              .postHeartbeat()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#postHeartbeat");
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

[**SessionHeartbeat**](SessionHeartbeat.md)

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

