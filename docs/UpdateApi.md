# UpdateApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**facebookPaymentsUpdate**](UpdateApi.md#facebookPaymentsUpdate) | **GET** /basic/payments/facebook/update |  |
| [**facebookPaymentsUpdate_0**](UpdateApi.md#facebookPaymentsUpdate_0) | **POST** /basic/payments/facebook/update |  |


<a name="facebookPaymentsUpdate"></a>
# **facebookPaymentsUpdate**
> SubscriptionVerificationResponse facebookPaymentsUpdate().hubMode(hubMode).hubChallenge(hubChallenge).hubVerifyToken(hubVerifyToken).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UpdateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String hubMode = "hubMode_example";
    String hubChallenge = "hubChallenge_example";
    String hubVerifyToken = "hubVerifyToken_example";
    try {
      SubscriptionVerificationResponse result = client
              .update
              .facebookPaymentsUpdate()
              .hubMode(hubMode)
              .hubChallenge(hubChallenge)
              .hubVerifyToken(hubVerifyToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHubChallenge());
      System.out.println(result.getContentType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#facebookPaymentsUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionVerificationResponse> response = client
              .update
              .facebookPaymentsUpdate()
              .hubMode(hubMode)
              .hubChallenge(hubChallenge)
              .hubVerifyToken(hubVerifyToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#facebookPaymentsUpdate");
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
| **hubMode** | **String**|  | [optional] |
| **hubChallenge** | **String**|  | [optional] |
| **hubVerifyToken** | **String**|  | [optional] |

### Return type

[**SubscriptionVerificationResponse**](SubscriptionVerificationResponse.md)

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

<a name="facebookPaymentsUpdate_0"></a>
# **facebookPaymentsUpdate_0**
> FacebookPaymentUpdateResponse facebookPaymentsUpdate_0().facebookPaymentUpdateRequest(facebookPaymentUpdateRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UpdateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String _object = "_object_example";
    List<FacebookUpdatedEntry> entry = Arrays.asList();
    try {
      FacebookPaymentUpdateResponse result = client
              .update
              .facebookPaymentsUpdate_0()
              ._object(_object)
              .entry(entry)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getContentType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#facebookPaymentsUpdate_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FacebookPaymentUpdateResponse> response = client
              .update
              .facebookPaymentsUpdate_0()
              ._object(_object)
              .entry(entry)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateApi#facebookPaymentsUpdate_0");
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
| **facebookPaymentUpdateRequest** | [**FacebookPaymentUpdateRequest**](FacebookPaymentUpdateRequest.md)|  | [optional] |

### Return type

[**FacebookPaymentUpdateResponse**](FacebookPaymentUpdateResponse.md)

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

