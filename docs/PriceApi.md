# PriceApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSteamPrices**](PriceApi.md#getSteamPrices) | **GET** /basic/payments/steam/prices |  |


<a name="getSteamPrices"></a>
# **getSteamPrices**
> LocalizedPriceMap getSteamPrices(steamId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PriceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer steamId = 56;
    try {
      LocalizedPriceMap result = client
              .price
              .getSteamPrices(steamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getPrices());
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceApi#getSteamPrices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalizedPriceMap> response = client
              .price
              .getSteamPrices(steamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceApi#getSteamPrices");
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
| **steamId** | **Integer**|  | |

### Return type

[**LocalizedPriceMap**](LocalizedPriceMap.md)

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

