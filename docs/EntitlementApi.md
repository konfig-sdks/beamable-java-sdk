# EntitlementApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLegacyEntitlementDefs**](EntitlementApi.md#createLegacyEntitlementDefs) | **POST** /basic/legacy-entitlement-defs/grant |  |
| [**createLegacyEntitlementDefs_0**](EntitlementApi.md#createLegacyEntitlementDefs_0) | **PUT** /basic/legacy-entitlement-defs |  |
| [**defineEntitlementLegacy**](EntitlementApi.md#defineEntitlementLegacy) | **PUT** /basic/legacy-entitlement-defs/claim |  |
| [**getPlayerEntitlements**](EntitlementApi.md#getPlayerEntitlements) | **GET** /basic/legacy-entitlement-defs/player |  |
| [**revokeLegacyEntitlementDefs**](EntitlementApi.md#revokeLegacyEntitlementDefs) | **DELETE** /basic/legacy-entitlement-defs/revoke |  |
| [**uploadLegacyEntitlementDefs**](EntitlementApi.md#uploadLegacyEntitlementDefs) | **POST** /basic/legacy-entitlement-defs/upload |  |


<a name="createLegacyEntitlementDefs"></a>
# **createLegacyEntitlementDefs**
> EmptyResponse createLegacyEntitlementDefs().entitlementGrantMultiRequest(entitlementGrantMultiRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    List<Integer> gamerTags = Arrays.asList();
    List<EntitlementGenerator> generators = Arrays.asList();
    try {
      EmptyResponse result = client
              .entitlement
              .createLegacyEntitlementDefs()
              .gamerTags(gamerTags)
              .generators(generators)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#createLegacyEntitlementDefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .entitlement
              .createLegacyEntitlementDefs()
              .gamerTags(gamerTags)
              .generators(generators)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#createLegacyEntitlementDefs");
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
| **entitlementGrantMultiRequest** | [**EntitlementGrantMultiRequest**](EntitlementGrantMultiRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

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

<a name="createLegacyEntitlementDefs_0"></a>
# **createLegacyEntitlementDefs_0**
> EmptyResponse createLegacyEntitlementDefs_0().modifyEntitlementDefinitionRequest(modifyEntitlementDefinitionRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    String symbol = "symbol_example";
    EntitlementDefRequest request = new EntitlementDefRequest();
    try {
      EmptyResponse result = client
              .entitlement
              .createLegacyEntitlementDefs_0()
              .symbol(symbol)
              .request(request)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#createLegacyEntitlementDefs_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .entitlement
              .createLegacyEntitlementDefs_0()
              .symbol(symbol)
              .request(request)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#createLegacyEntitlementDefs_0");
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
| **modifyEntitlementDefinitionRequest** | [**ModifyEntitlementDefinitionRequest**](ModifyEntitlementDefinitionRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

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

<a name="defineEntitlementLegacy"></a>
# **defineEntitlementLegacy**
> EntitlementResponse defineEntitlementLegacy().claimEntitlementRequest(claimEntitlementRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    Integer gt = 56;
    String symbol = "symbol_example";
    String spec = "spec_example";
    String uuid = "uuid_example";
    try {
      EntitlementResponse result = client
              .entitlement
              .defineEntitlementLegacy(gt)
              .symbol(symbol)
              .spec(spec)
              .uuid(uuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getUuid());
      System.out.println(result.getState());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#defineEntitlementLegacy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntitlementResponse> response = client
              .entitlement
              .defineEntitlementLegacy(gt)
              .symbol(symbol)
              .spec(spec)
              .uuid(uuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#defineEntitlementLegacy");
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
| **claimEntitlementRequest** | [**ClaimEntitlementRequest**](ClaimEntitlementRequest.md)|  | [optional] |

### Return type

[**EntitlementResponse**](EntitlementResponse.md)

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

<a name="getPlayerEntitlements"></a>
# **getPlayerEntitlements**
> EntitlementListResponse getPlayerEntitlements(gt).state(state).skip(skip).symbol(symbol).icw(icw).spec(spec).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    Integer gt = 56;
    String state = "state_example";
    Integer skip = 56;
    String symbol = "symbol_example";
    Boolean icw = true;
    String spec = "spec_example";
    Integer limit = 56;
    try {
      EntitlementListResponse result = client
              .entitlement
              .getPlayerEntitlements(gt)
              .state(state)
              .skip(skip)
              .symbol(symbol)
              .icw(icw)
              .spec(spec)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntitlements());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#getPlayerEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntitlementListResponse> response = client
              .entitlement
              .getPlayerEntitlements(gt)
              .state(state)
              .skip(skip)
              .symbol(symbol)
              .icw(icw)
              .spec(spec)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#getPlayerEntitlements");
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
| **gt** | **Integer**|  | |
| **state** | **String**|  | [optional] |
| **skip** | **Integer**|  | [optional] |
| **symbol** | **String**|  | [optional] |
| **icw** | **Boolean**|  | [optional] |
| **spec** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**EntitlementListResponse**](EntitlementListResponse.md)

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

<a name="revokeLegacyEntitlementDefs"></a>
# **revokeLegacyEntitlementDefs**
> EntitlementResponse revokeLegacyEntitlementDefs().revokeEntitlementRequest(revokeEntitlementRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    String uuid = "uuid_example";
    try {
      EntitlementResponse result = client
              .entitlement
              .revokeLegacyEntitlementDefs()
              .uuid(uuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getUuid());
      System.out.println(result.getState());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#revokeLegacyEntitlementDefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntitlementResponse> response = client
              .entitlement
              .revokeLegacyEntitlementDefs()
              .uuid(uuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#revokeLegacyEntitlementDefs");
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
| **revokeEntitlementRequest** | [**RevokeEntitlementRequest**](RevokeEntitlementRequest.md)|  | [optional] |

### Return type

[**EntitlementResponse**](EntitlementResponse.md)

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

<a name="uploadLegacyEntitlementDefs"></a>
# **uploadLegacyEntitlementDefs**
> EmptyResponse uploadLegacyEntitlementDefs().uploadEntitlementDefinitionRequest(uploadEntitlementDefinitionRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntitlementApi;
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
    List<ModifyEntitlementDefinitionRequest> entitlements = Arrays.asList();
    try {
      EmptyResponse result = client
              .entitlement
              .uploadLegacyEntitlementDefs()
              .entitlements(entitlements)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#uploadLegacyEntitlementDefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .entitlement
              .uploadLegacyEntitlementDefs()
              .entitlements(entitlements)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementApi#uploadLegacyEntitlementDefs");
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
| **uploadEntitlementDefinitionRequest** | [**UploadEntitlementDefinitionRequest**](UploadEntitlementDefinitionRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

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

