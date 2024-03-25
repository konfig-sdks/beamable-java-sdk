# OrderApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSteam**](OrderApi.md#getSteam) | **GET** /basic/payments/steam/order |  |


<a name="getSteam"></a>
# **getSteam**
> SteamOrderInfoResponse getSteam().orderId(orderId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
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
    String orderId = "orderId_example";
    try {
      SteamOrderInfoResponse result = client
              .order
              .getSteam()
              .orderId(orderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsstate());
      System.out.println(result.getItems());
      System.out.println(result.getCountry());
      System.out.println(result.getTimecreated());
      System.out.println(result.getTransid());
      System.out.println(result.getStatus());
      System.out.println(result.getOrderid());
      System.out.println(result.getSteamid());
      System.out.println(result.getCurrency());
      System.out.println(result.getTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getSteam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SteamOrderInfoResponse> response = client
              .order
              .getSteam()
              .orderId(orderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getSteam");
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
| **orderId** | **String**|  | [optional] |

### Return type

[**SteamOrderInfoResponse**](SteamOrderInfoResponse.md)

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

