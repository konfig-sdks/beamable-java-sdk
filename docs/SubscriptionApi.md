# SubscriptionApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBasicStatsSubscription**](SubscriptionApi.md#addBasicStatsSubscription) | **PUT** /basic/stats/subscribe |  |


<a name="addBasicStatsSubscription"></a>
# **addBasicStatsSubscription**
> CommonResponse addBasicStatsSubscription().statsSubscribeRequest(statsSubscribeRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String service = "service_example";
    List<String> subscriptions = Arrays.asList();
    try {
      CommonResponse result = client
              .subscription
              .addBasicStatsSubscription()
              .service(service)
              .subscriptions(subscriptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#addBasicStatsSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommonResponse> response = client
              .subscription
              .addBasicStatsSubscription()
              .service(service)
              .subscriptions(subscriptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#addBasicStatsSubscription");
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
| **statsSubscribeRequest** | [**StatsSubscribeRequest**](StatsSubscribeRequest.md)|  | [optional] |

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

