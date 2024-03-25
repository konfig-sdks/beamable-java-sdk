# AuthenticationApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](AuthenticationApi.md#getToken) | **GET** /basic/auth/token |  |
| [**requestToken**](AuthenticationApi.md#requestToken) | **POST** /basic/auth/token |  |
| [**steamPostAuth**](AuthenticationApi.md#steamPostAuth) | **POST** /basic/payments/steam/auth |  |


<a name="getToken"></a>
# **getToken**
> Token getToken().token(token).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String token = "token_example";
    try {
      Token result = client
              .authentication
              .getToken()
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getGamerTag());
      System.out.println(result.getScopes());
      System.out.println(result.getAccountId());
      System.out.println(result.getCid());
      System.out.println(result.getPid());
      System.out.println(result.getExpiresMs());
      System.out.println(result.getToken());
      System.out.println(result.getType());
      System.out.println(result.getCreated());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .authentication
              .getToken()
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getToken");
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
| **token** | **String**|  | [optional] |

### Return type

[**Token**](Token.md)

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

<a name="requestToken"></a>
# **requestToken**
> TokenResponse requestToken().tokenRequestWrapper(tokenRequestWrapper).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String username = "username_example";
    List<String> scope = Arrays.asList();
    String refreshToken = "refreshToken_example";
    String thirdParty = "thirdParty_example";
    String redirectUri = "redirectUri_example";
    String clientId = "clientId_example";
    String code = "code_example";
    String token = "token_example";
    Boolean customerScoped = true;
    String grantType = "grantType_example";
    String password = "password_example";
    try {
      TokenResponse result = client
              .authentication
              .requestToken()
              .username(username)
              .scope(scope)
              .refreshToken(refreshToken)
              .thirdParty(thirdParty)
              .redirectUri(redirectUri)
              .clientId(clientId)
              .code(code)
              .token(token)
              .customerScoped(customerScoped)
              .grantType(grantType)
              .password(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScopes());
      System.out.println(result.getTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#requestToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenResponse> response = client
              .authentication
              .requestToken()
              .username(username)
              .scope(scope)
              .refreshToken(refreshToken)
              .thirdParty(thirdParty)
              .redirectUri(redirectUri)
              .clientId(clientId)
              .code(code)
              .token(token)
              .customerScoped(customerScoped)
              .grantType(grantType)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#requestToken");
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
| **tokenRequestWrapper** | [**TokenRequestWrapper**](TokenRequestWrapper.md)|  | [optional] |

### Return type

[**TokenResponse**](TokenResponse.md)

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

<a name="steamPostAuth"></a>
# **steamPostAuth**
> EmptyResponse steamPostAuth().steamAuthRequest(steamAuthRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String ticket = "ticket_example";
    try {
      EmptyResponse result = client
              .authentication
              .steamPostAuth()
              .ticket(ticket)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#steamPostAuth");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .authentication
              .steamPostAuth()
              .ticket(ticket)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#steamPostAuth");
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
| **steamAuthRequest** | [**SteamAuthRequest**](SteamAuthRequest.md)|  | [optional] |

### Return type

[**EmptyResponse**](EmptyResponse.md)

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

