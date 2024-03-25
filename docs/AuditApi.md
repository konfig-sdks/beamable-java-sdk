# AuditApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentAudits**](AuditApi.md#getPaymentAudits) | **GET** /basic/payments/audits |  |


<a name="getPaymentAudits"></a>
# **getPaymentAudits**
> ListAuditResponse getPaymentAudits().providerid(providerid).provider(provider).state(state).txid(txid).player(player).start(start).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String providerid = "providerid_example";
    String provider = "provider_example";
    String state = "state_example";
    Integer txid = 56;
    Integer player = 56;
    Integer start = 56;
    Integer limit = 56;
    try {
      ListAuditResponse result = client
              .audit
              .getPaymentAudits()
              .providerid(providerid)
              .provider(provider)
              .state(state)
              .txid(txid)
              .player(player)
              .start(start)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudits());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditApi#getPaymentAudits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListAuditResponse> response = client
              .audit
              .getPaymentAudits()
              .providerid(providerid)
              .provider(provider)
              .state(state)
              .txid(txid)
              .player(player)
              .start(start)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditApi#getPaymentAudits");
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
| **providerid** | **String**|  | [optional] |
| **provider** | **String**|  | [optional] |
| **state** | **String**|  | [optional] |
| **txid** | **Integer**|  | [optional] |
| **player** | **Integer**|  | [optional] |
| **start** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListAuditResponse**](ListAuditResponse.md)

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

