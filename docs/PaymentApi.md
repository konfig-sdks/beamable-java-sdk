# PaymentApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPurchase**](PaymentApi.md#cancelPurchase) | **POST** /basic/payments/test/purchase/cancel |  |
| [**cancelPurchaseProcess**](PaymentApi.md#cancelPurchaseProcess) | **POST** /basic/payments/itunes/purchase/cancel |  |
| [**completeItunesPurchase**](PaymentApi.md#completeItunesPurchase) | **POST** /basic/payments/itunes/purchase/complete |  |
| [**completePurchase**](PaymentApi.md#completePurchase) | **POST** /basic/payments/test/purchase/complete |  |
| [**completePurchaseProcess**](PaymentApi.md#completePurchaseProcess) | **POST** /basic/payments/googleplay/purchase/complete |  |
| [**completePurchase_0**](PaymentApi.md#completePurchase_0) | **POST** /basic/payments/coupon/purchase/complete |  |
| [**couponPurchaseBegin**](PaymentApi.md#couponPurchaseBegin) | **POST** /basic/payments/coupon/purchase/begin |  |
| [**couponPurchaseCancel**](PaymentApi.md#couponPurchaseCancel) | **POST** /basic/payments/coupon/purchase/cancel |  |
| [**facebookPurchaseBegin**](PaymentApi.md#facebookPurchaseBegin) | **POST** /basic/payments/facebook/purchase/begin |  |
| [**facebookPurchaseCancel**](PaymentApi.md#facebookPurchaseCancel) | **POST** /basic/payments/facebook/purchase/cancel |  |
| [**facebookPurchaseComplete**](PaymentApi.md#facebookPurchaseComplete) | **POST** /basic/payments/facebook/purchase/complete |  |
| [**facebookPurchaseFailure**](PaymentApi.md#facebookPurchaseFailure) | **POST** /basic/payments/facebook/purchase/fail |  |
| [**failPurchase**](PaymentApi.md#failPurchase) | **POST** /basic/payments/coupon/purchase/fail |  |
| [**googlePlayPurchaseBegin**](PaymentApi.md#googlePlayPurchaseBegin) | **POST** /basic/payments/googleplay/purchase/begin |  |
| [**googlePlayPurchaseCancel**](PaymentApi.md#googlePlayPurchaseCancel) | **POST** /basic/payments/googleplay/purchase/cancel |  |
| [**initializePurchaseProcess**](PaymentApi.md#initializePurchaseProcess) | **POST** /basic/payments/windows/purchase/begin |  |
| [**itunesPurchaseBegin**](PaymentApi.md#itunesPurchaseBegin) | **POST** /basic/payments/itunes/purchase/begin |  |
| [**itunesPurchaseTrack**](PaymentApi.md#itunesPurchaseTrack) | **POST** /basic/payments/itunes/purchase/track |  |
| [**processBegin**](PaymentApi.md#processBegin) | **POST** /basic/payments/test/purchase/begin |  |
| [**processComplete**](PaymentApi.md#processComplete) | **POST** /basic/payments/windows/purchase/complete |  |
| [**processFailure**](PaymentApi.md#processFailure) | **POST** /basic/payments/itunes/purchase/fail |  |
| [**processFailure_0**](PaymentApi.md#processFailure_0) | **POST** /basic/payments/test/purchase/fail |  |
| [**processFailure_1**](PaymentApi.md#processFailure_1) | **POST** /basic/payments/googleplay/purchase/fail |  |
| [**processFailure_2**](PaymentApi.md#processFailure_2) | **POST** /basic/payments/windows/purchase/fail |  |
| [**steamPurchaseBegin**](PaymentApi.md#steamPurchaseBegin) | **POST** /basic/payments/steam/purchase/begin |  |
| [**steamPurchaseCancel**](PaymentApi.md#steamPurchaseCancel) | **POST** /basic/payments/steam/purchase/cancel |  |
| [**steamPurchaseComplete**](PaymentApi.md#steamPurchaseComplete) | **POST** /basic/payments/steam/purchase/complete |  |
| [**steamPurchaseFail**](PaymentApi.md#steamPurchaseFail) | **POST** /basic/payments/steam/purchase/fail |  |
| [**trackPurchasePost**](PaymentApi.md#trackPurchasePost) | **POST** /basic/payments/test/purchase/track |  |
| [**trackPurchasePost_0**](PaymentApi.md#trackPurchasePost_0) | **POST** /basic/payments/coupon/purchase/track |  |
| [**trackPurchasePost_1**](PaymentApi.md#trackPurchasePost_1) | **POST** /basic/payments/facebook/purchase/track |  |
| [**trackPurchasePost_2**](PaymentApi.md#trackPurchasePost_2) | **POST** /basic/payments/googleplay/purchase/track |  |
| [**trackPurchasePost_3**](PaymentApi.md#trackPurchasePost_3) | **POST** /basic/payments/steam/purchase/track |  |
| [**windowsPurchaseCancel**](PaymentApi.md#windowsPurchaseCancel) | **POST** /basic/payments/windows/purchase/cancel |  |
| [**windowsPurchaseTrack**](PaymentApi.md#windowsPurchaseTrack) | **POST** /basic/payments/windows/purchase/track |  |


<a name="cancelPurchase"></a>
# **cancelPurchase**
> PaymentResultResponse cancelPurchase().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .cancelPurchase(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .cancelPurchase(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelPurchase");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="cancelPurchaseProcess"></a>
# **cancelPurchaseProcess**
> PaymentResultResponse cancelPurchaseProcess().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .cancelPurchaseProcess(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelPurchaseProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .cancelPurchaseProcess(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelPurchaseProcess");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="completeItunesPurchase"></a>
# **completeItunesPurchase**
> PaymentResultResponse completeItunesPurchase().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .completeItunesPurchase(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completeItunesPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .completeItunesPurchase(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completeItunesPurchase");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="completePurchase"></a>
# **completePurchase**
> PaymentResultResponse completePurchase().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .completePurchase(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .completePurchase(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchase");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="completePurchaseProcess"></a>
# **completePurchaseProcess**
> PaymentResultResponse completePurchaseProcess().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .completePurchaseProcess(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchaseProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .completePurchaseProcess(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchaseProcess");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="completePurchase_0"></a>
# **completePurchase_0**
> PaymentResultResponse completePurchase_0().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .completePurchase_0(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchase_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .completePurchase_0(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#completePurchase_0");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="couponPurchaseBegin"></a>
# **couponPurchaseBegin**
> BeginPurchaseResponse couponPurchaseBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .couponPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#couponPurchaseBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .couponPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#couponPurchaseBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="couponPurchaseCancel"></a>
# **couponPurchaseCancel**
> PaymentResultResponse couponPurchaseCancel().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .couponPurchaseCancel(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#couponPurchaseCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .couponPurchaseCancel(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#couponPurchaseCancel");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="facebookPurchaseBegin"></a>
# **facebookPurchaseBegin**
> BeginPurchaseResponse facebookPurchaseBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .facebookPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .facebookPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="facebookPurchaseCancel"></a>
# **facebookPurchaseCancel**
> PaymentResultResponse facebookPurchaseCancel().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .facebookPurchaseCancel(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .facebookPurchaseCancel(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseCancel");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="facebookPurchaseComplete"></a>
# **facebookPurchaseComplete**
> PaymentResultResponse facebookPurchaseComplete().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .facebookPurchaseComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .facebookPurchaseComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseComplete");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="facebookPurchaseFailure"></a>
# **facebookPurchaseFailure**
> PaymentResultResponse facebookPurchaseFailure().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .facebookPurchaseFailure(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseFailure");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .facebookPurchaseFailure(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#facebookPurchaseFailure");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="failPurchase"></a>
# **failPurchase**
> PaymentResultResponse failPurchase().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .failPurchase(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#failPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .failPurchase(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#failPurchase");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="googlePlayPurchaseBegin"></a>
# **googlePlayPurchaseBegin**
> BeginPurchaseResponse googlePlayPurchaseBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .googlePlayPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#googlePlayPurchaseBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .googlePlayPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#googlePlayPurchaseBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="googlePlayPurchaseCancel"></a>
# **googlePlayPurchaseCancel**
> PaymentResultResponse googlePlayPurchaseCancel().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .googlePlayPurchaseCancel(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#googlePlayPurchaseCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .googlePlayPurchaseCancel(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#googlePlayPurchaseCancel");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="initializePurchaseProcess"></a>
# **initializePurchaseProcess**
> BeginPurchaseResponse initializePurchaseProcess().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .initializePurchaseProcess()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#initializePurchaseProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .initializePurchaseProcess()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#initializePurchaseProcess");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="itunesPurchaseBegin"></a>
# **itunesPurchaseBegin**
> BeginPurchaseResponse itunesPurchaseBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .itunesPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#itunesPurchaseBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .itunesPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#itunesPurchaseBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="itunesPurchaseTrack"></a>
# **itunesPurchaseTrack**
> PaymentResultResponse itunesPurchaseTrack().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .itunesPurchaseTrack(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#itunesPurchaseTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .itunesPurchaseTrack(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#itunesPurchaseTrack");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="processBegin"></a>
# **processBegin**
> BeginPurchaseResponse processBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .processBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .processBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="processComplete"></a>
# **processComplete**
> PaymentResultResponse processComplete().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .processComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .processComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processComplete");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="processFailure"></a>
# **processFailure**
> PaymentResultResponse processFailure().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .processFailure(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .processFailure(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="processFailure_0"></a>
# **processFailure_0**
> PaymentResultResponse processFailure_0().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .processFailure_0(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .processFailure_0(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_0");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="processFailure_1"></a>
# **processFailure_1**
> PaymentResultResponse processFailure_1().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .processFailure_1(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .processFailure_1(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_1");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="processFailure_2"></a>
# **processFailure_2**
> PaymentResultResponse processFailure_2().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .processFailure_2(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .processFailure_2(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processFailure_2");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="steamPurchaseBegin"></a>
# **steamPurchaseBegin**
> BeginPurchaseResponse steamPurchaseBegin().beginPurchaseRequest(beginPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String purchaseId = "purchaseId_example";
    String language = "language_example";
    String time = "time_example";
    try {
      BeginPurchaseResponse result = client
              .payment
              .steamPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getTxid());
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseBegin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BeginPurchaseResponse> response = client
              .payment
              .steamPurchaseBegin()
              .purchaseId(purchaseId)
              .language(language)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseBegin");
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
| **beginPurchaseRequest** | [**BeginPurchaseRequest**](BeginPurchaseRequest.md)|  | [optional] |

### Return type

[**BeginPurchaseResponse**](BeginPurchaseResponse.md)

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

<a name="steamPurchaseCancel"></a>
# **steamPurchaseCancel**
> PaymentResultResponse steamPurchaseCancel().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .steamPurchaseCancel(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .steamPurchaseCancel(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseCancel");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="steamPurchaseComplete"></a>
# **steamPurchaseComplete**
> PaymentResultResponse steamPurchaseComplete().completePurchaseRequest(completePurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Integer txid = 56;
    String receipt = "receipt_example";
    String priceInLocalCurrency = "priceInLocalCurrency_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .steamPurchaseComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .steamPurchaseComplete(txid)
              .receipt(receipt)
              .priceInLocalCurrency(priceInLocalCurrency)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseComplete");
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
| **completePurchaseRequest** | [**CompletePurchaseRequest**](CompletePurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="steamPurchaseFail"></a>
# **steamPurchaseFail**
> PaymentResultResponse steamPurchaseFail().failPurchaseRequest(failPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    String reason = "reason_example";
    try {
      PaymentResultResponse result = client
              .payment
              .steamPurchaseFail(txid)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseFail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .steamPurchaseFail(txid)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#steamPurchaseFail");
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
| **failPurchaseRequest** | [**FailPurchaseRequest**](FailPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="trackPurchasePost"></a>
# **trackPurchasePost**
> PaymentResultResponse trackPurchasePost().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .trackPurchasePost(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .trackPurchasePost(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="trackPurchasePost_0"></a>
# **trackPurchasePost_0**
> PaymentResultResponse trackPurchasePost_0().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .trackPurchasePost_0(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .trackPurchasePost_0(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_0");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="trackPurchasePost_1"></a>
# **trackPurchasePost_1**
> PaymentResultResponse trackPurchasePost_1().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .trackPurchasePost_1(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .trackPurchasePost_1(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_1");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="trackPurchasePost_2"></a>
# **trackPurchasePost_2**
> PaymentResultResponse trackPurchasePost_2().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .trackPurchasePost_2(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .trackPurchasePost_2(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_2");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="trackPurchasePost_3"></a>
# **trackPurchasePost_3**
> PaymentResultResponse trackPurchasePost_3().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .trackPurchasePost_3(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_3");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .trackPurchasePost_3(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#trackPurchasePost_3");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="windowsPurchaseCancel"></a>
# **windowsPurchaseCancel**
> PaymentResultResponse windowsPurchaseCancel().cancelPurchaseRequest(cancelPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    Integer txid = 56;
    try {
      PaymentResultResponse result = client
              .payment
              .windowsPurchaseCancel(txid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#windowsPurchaseCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .windowsPurchaseCancel(txid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#windowsPurchaseCancel");
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
| **cancelPurchaseRequest** | [**CancelPurchaseRequest**](CancelPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

<a name="windowsPurchaseTrack"></a>
# **windowsPurchaseTrack**
> PaymentResultResponse windowsPurchaseTrack().trackPurchaseRequest(trackPurchaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double priceInLocalCurrency = 3.4D;
    String skuName = "skuName_example";
    String skuProductId = "skuProductId_example";
    String store = "store_example";
    List<ItemCreateRequest> obtainItems = Arrays.asList();
    List<CurrencyChange> obtainCurrency = Arrays.asList();
    String purchaseId = "purchaseId_example";
    String isoCurrencySymbol = "isoCurrencySymbol_example";
    try {
      PaymentResultResponse result = client
              .payment
              .windowsPurchaseTrack(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#windowsPurchaseTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResultResponse> response = client
              .payment
              .windowsPurchaseTrack(priceInLocalCurrency)
              .skuName(skuName)
              .skuProductId(skuProductId)
              .store(store)
              .obtainItems(obtainItems)
              .obtainCurrency(obtainCurrency)
              .purchaseId(purchaseId)
              .isoCurrencySymbol(isoCurrencySymbol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#windowsPurchaseTrack");
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
| **trackPurchaseRequest** | [**TrackPurchaseRequest**](TrackPurchaseRequest.md)|  | [optional] |

### Return type

[**PaymentResultResponse**](PaymentResultResponse.md)

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

