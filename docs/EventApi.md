# EventApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**claimObjectEventPlayers**](EventApi.md#claimObjectEventPlayers) | **POST** /object/event-players/{objectId}/claim |  |
| [**getCalendarEvents**](EventApi.md#getCalendarEvents) | **GET** /basic/events/calendar |  |
| [**getObjectEvents**](EventApi.md#getObjectEvents) | **GET** /object/events/{objectId} |  |
| [**getPlayersData**](EventApi.md#getPlayersData) | **GET** /object/event-players/{objectId} |  |
| [**pingObjectEvents**](EventApi.md#pingObjectEvents) | **GET** /object/events/{objectId}/ping |  |
| [**refreshObjectEvents**](EventApi.md#refreshObjectEvents) | **PUT** /object/events/{objectId}/refresh |  |
| [**updateObjectEndPhase**](EventApi.md#updateObjectEndPhase) | **PUT** /object/events/{objectId}/endPhase |  |
| [**updatePlayerScore**](EventApi.md#updatePlayerScore) | **PUT** /object/event-players/{objectId}/score |  |


<a name="claimObjectEventPlayers"></a>
# **claimObjectEventPlayers**
> EventClaimResponse claimObjectEventPlayers(objectId).eventClaimRequest(eventClaimRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
    String eventId = "eventId_example";
    try {
      EventClaimResponse result = client
              .event
              .claimObjectEventPlayers(objectId)
              .eventId(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
      System.out.println(result.getGameRspJson());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#claimObjectEventPlayers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventClaimResponse> response = client
              .event
              .claimObjectEventPlayers(objectId)
              .eventId(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#claimObjectEventPlayers");
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
| **eventClaimRequest** | [**EventClaimRequest**](EventClaimRequest.md)|  | [optional] |

### Return type

[**EventClaimResponse**](EventClaimResponse.md)

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

<a name="getCalendarEvents"></a>
# **getCalendarEvents**
> EventsInDateRangeResponse getCalendarEvents().from(from).to(to).query(query).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
    String from = "from_example";
    String to = "to_example";
    String query = "query_example";
    Integer limit = 56;
    try {
      EventsInDateRangeResponse result = client
              .event
              .getCalendarEvents()
              .from(from)
              .to(to)
              .query(query)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getEventInDateRange());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getCalendarEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventsInDateRangeResponse> response = client
              .event
              .getCalendarEvents()
              .from(from)
              .to(to)
              .query(query)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getCalendarEvents");
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
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |
| **query** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**EventsInDateRangeResponse**](EventsInDateRangeResponse.md)

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

<a name="getObjectEvents"></a>
# **getObjectEvents**
> EventObjectData getObjectEvents(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
      EventObjectData result = client
              .event
              .getObjectEvents(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInFlight());
      System.out.println(result.getStartTime());
      System.out.println(result.getRootEventId());
      System.out.println(result.getState());
      System.out.println(result.getRunning());
      System.out.println(result.getPhase());
      System.out.println(result.getPermissions());
      System.out.println(result.getLastChildEventId());
      System.out.println(result.getId());
      System.out.println(result.getOrigin());
      System.out.println(result.getContent());
      System.out.println(result.getDone());
      System.out.println(result.getLeaderboardId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getObjectEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventObjectData> response = client
              .event
              .getObjectEvents(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getObjectEvents");
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

[**EventObjectData**](EventObjectData.md)

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

<a name="getPlayersData"></a>
# **getPlayersData**
> EventPlayerView getPlayersData(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
      EventPlayerView result = client
              .event
              .getPlayersData(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRunning());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getPlayersData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventPlayerView> response = client
              .event
              .getPlayersData(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getPlayersData");
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

[**EventPlayerView**](EventPlayerView.md)

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

<a name="pingObjectEvents"></a>
# **pingObjectEvents**
> PingRsp pingObjectEvents(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
      PingRsp result = client
              .event
              .pingObjectEvents(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeepAlive());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#pingObjectEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PingRsp> response = client
              .event
              .pingObjectEvents(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#pingObjectEvents");
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

[**PingRsp**](PingRsp.md)

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

<a name="refreshObjectEvents"></a>
# **refreshObjectEvents**
> CommonResponse refreshObjectEvents(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
              .event
              .refreshObjectEvents(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#refreshObjectEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .event
              .refreshObjectEvents(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#refreshObjectEvents");
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

<a name="updateObjectEndPhase"></a>
# **updateObjectEndPhase**
> CommonResponse updateObjectEndPhase(objectId).eventPhaseEndRequest(eventPhaseEndRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
    String time = "time_example";
    try {
      CommonResponse result = client
              .event
              .updateObjectEndPhase(objectId)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updateObjectEndPhase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .event
              .updateObjectEndPhase(objectId)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updateObjectEndPhase");
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
| **eventPhaseEndRequest** | [**EventPhaseEndRequest**](EventPhaseEndRequest.md)|  | [optional] |

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

<a name="updatePlayerScore"></a>
# **updatePlayerScore**
> CommonResponse updatePlayerScore(objectId).eventScoreRequest(eventScoreRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
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
    String objectId = "objectId_example";
    String eventId = "eventId_example";
    Boolean increment = true;
    Map<String, Object> stats = new HashMap();
    try {
      CommonResponse result = client
              .event
              .updatePlayerScore(score, objectId)
              .eventId(eventId)
              .increment(increment)
              .stats(stats)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updatePlayerScore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .event
              .updatePlayerScore(score, objectId)
              .eventId(eventId)
              .increment(increment)
              .stats(stats)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updatePlayerScore");
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
| **eventScoreRequest** | [**EventScoreRequest**](EventScoreRequest.md)|  | [optional] |

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

