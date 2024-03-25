# ShardApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLegacyShard**](ShardApi.md#deleteLegacyShard) | **DELETE** /basic/legacy-shards |  |
| [**getLegacyAccepting**](ShardApi.md#getLegacyAccepting) | **GET** /basic/legacy-shards/accepting |  |
| [**getLegacyData**](ShardApi.md#getLegacyData) | **GET** /basic/legacy-shards |  |
| [**getPreferredLegacyShards**](ShardApi.md#getPreferredLegacyShards) | **GET** /basic/legacy-shards/preferred |  |
| [**postLegacyShard**](ShardApi.md#postLegacyShard) | **POST** /basic/legacy-shards |  |
| [**updateLegacyShardData**](ShardApi.md#updateLegacyShardData) | **PUT** /basic/legacy-shards |  |


<a name="deleteLegacyShard"></a>
# **deleteLegacyShard**
> ShardResponse deleteLegacyShard().shardDeleteRequest(shardDeleteRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
    String shardId = "shardId_example";
    try {
      ShardResponse result = client
              .shard
              .deleteLegacyShard()
              .shardId(shardId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShard());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#deleteLegacyShard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardResponse> response = client
              .shard
              .deleteLegacyShard()
              .shardId(shardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#deleteLegacyShard");
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
| **shardDeleteRequest** | [**ShardDeleteRequest**](ShardDeleteRequest.md)|  | [optional] |

### Return type

[**ShardResponse**](ShardResponse.md)

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

<a name="getLegacyAccepting"></a>
# **getLegacyAccepting**
> ShardListResponse getLegacyAccepting().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
      ShardListResponse result = client
              .shard
              .getLegacyAccepting()
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShards());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getLegacyAccepting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardListResponse> response = client
              .shard
              .getLegacyAccepting()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getLegacyAccepting");
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

[**ShardListResponse**](ShardListResponse.md)

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

<a name="getLegacyData"></a>
# **getLegacyData**
> ShardListResponse getLegacyData().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
      ShardListResponse result = client
              .shard
              .getLegacyData()
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShards());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getLegacyData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardListResponse> response = client
              .shard
              .getLegacyData()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getLegacyData");
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

[**ShardListResponse**](ShardListResponse.md)

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

<a name="getPreferredLegacyShards"></a>
# **getPreferredLegacyShards**
> ShardResponse getPreferredLegacyShards().preference(preference).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
    String preference = "preference_example";
    try {
      ShardResponse result = client
              .shard
              .getPreferredLegacyShards()
              .preference(preference)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShard());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getPreferredLegacyShards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardResponse> response = client
              .shard
              .getPreferredLegacyShards()
              .preference(preference)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#getPreferredLegacyShards");
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
| **preference** | **String**|  | [optional] |

### Return type

[**ShardResponse**](ShardResponse.md)

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

<a name="postLegacyShard"></a>
# **postLegacyShard**
> ShardResponse postLegacyShard().shardDef(shardDef).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
    String shardId = "shardId_example";
    String uri = "uri_example";
    Map<String, Object> metadata = new HashMap();
    try {
      ShardResponse result = client
              .shard
              .postLegacyShard()
              .shardId(shardId)
              .uri(uri)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShard());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#postLegacyShard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardResponse> response = client
              .shard
              .postLegacyShard()
              .shardId(shardId)
              .uri(uri)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#postLegacyShard");
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
| **shardDef** | [**ShardDef**](ShardDef.md)|  | [optional] |

### Return type

[**ShardResponse**](ShardResponse.md)

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

<a name="updateLegacyShardData"></a>
# **updateLegacyShardData**
> ShardResponse updateLegacyShardData().shardUpdateRequest(shardUpdateRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShardApi;
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
    String shardId = "shardId_example";
    String uri = "uri_example";
    MetadataUpdate metadata = new MetadataUpdate();
    try {
      ShardResponse result = client
              .shard
              .updateLegacyShardData()
              .shardId(shardId)
              .uri(uri)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getShard());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#updateLegacyShardData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShardResponse> response = client
              .shard
              .updateLegacyShardData()
              .shardId(shardId)
              .uri(uri)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShardApi#updateLegacyShardData");
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
| **shardUpdateRequest** | [**ShardUpdateRequest**](ShardUpdateRequest.md)|  | [optional] |

### Return type

[**ShardResponse**](ShardResponse.md)

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

