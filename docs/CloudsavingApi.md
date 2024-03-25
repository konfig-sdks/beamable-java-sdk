# CloudsavingApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commitManifestPut**](CloudsavingApi.md#commitManifestPut) | **PUT** /basic/cloudsaving/data/commitManifest |  |
| [**deleteData**](CloudsavingApi.md#deleteData) | **DELETE** /basic/cloudsaving/data |  |
| [**getData**](CloudsavingApi.md#getData) | **GET** /basic/cloudsaving |  |
| [**getDataDownloadUrl**](CloudsavingApi.md#getDataDownloadUrl) | **POST** /basic/cloudsaving/data/downloadURL |  |
| [**getDataMetadata**](CloudsavingApi.md#getDataMetadata) | **GET** /basic/cloudsaving/data/metadata |  |
| [**moveDataPut**](CloudsavingApi.md#moveDataPut) | **PUT** /basic/cloudsaving/data/move |  |
| [**replaceData**](CloudsavingApi.md#replaceData) | **POST** /basic/cloudsaving/data/replace |  |
| [**uploadDataUrl**](CloudsavingApi.md#uploadDataUrl) | **POST** /basic/cloudsaving/data/uploadURL |  |
| [**uploadUrlFromPortal**](CloudsavingApi.md#uploadUrlFromPortal) | **POST** /basic/cloudsaving/data/uploadURLFromPortal |  |


<a name="commitManifestPut"></a>
# **commitManifestPut**
> Manifest commitManifestPut().uploadRequests(uploadRequests).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<UploadRequest> request = Arrays.asList();
    Integer playerId = 56;
    try {
      Manifest result = client
              .cloudsaving
              .commitManifestPut()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getManifest());
      System.out.println(result.getCreated());
      System.out.println(result.getReplacement());
      System.out.println(result.getReferences());
      System.out.println(result.getChecksum());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#commitManifestPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Manifest> response = client
              .cloudsaving
              .commitManifestPut()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#commitManifestPut");
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
| **uploadRequests** | [**UploadRequests**](UploadRequests.md)|  | [optional] |

### Return type

[**Manifest**](Manifest.md)

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

<a name="deleteData"></a>
# **deleteData**
> EmptyResponse deleteData().objectRequests(objectRequests).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<ObjectRequest> request = Arrays.asList();
    Integer playerId = 56;
    try {
      EmptyResponse result = client
              .cloudsaving
              .deleteData()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#deleteData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .cloudsaving
              .deleteData()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#deleteData");
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
| **objectRequests** | [**ObjectRequests**](ObjectRequests.md)|  | [optional] |

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

<a name="getData"></a>
# **getData**
> Manifest getData().playerId(playerId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    Integer playerId = 56;
    try {
      Manifest result = client
              .cloudsaving
              .getData()
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getManifest());
      System.out.println(result.getCreated());
      System.out.println(result.getReplacement());
      System.out.println(result.getReferences());
      System.out.println(result.getChecksum());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Manifest> response = client
              .cloudsaving
              .getData()
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getData");
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
| **playerId** | **Integer**|  | [optional] |

### Return type

[**Manifest**](Manifest.md)

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

<a name="getDataDownloadUrl"></a>
# **getDataDownloadUrl**
> URLSResponse getDataDownloadUrl().objectRequests(objectRequests).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<ObjectRequest> request = Arrays.asList();
    Integer playerId = 56;
    try {
      URLSResponse result = client
              .cloudsaving
              .getDataDownloadUrl()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getDataDownloadUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<URLSResponse> response = client
              .cloudsaving
              .getDataDownloadUrl()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getDataDownloadUrl");
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
| **objectRequests** | [**ObjectRequests**](ObjectRequests.md)|  | [optional] |

### Return type

[**URLSResponse**](URLSResponse.md)

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

<a name="getDataMetadata"></a>
# **getDataMetadata**
> ObjectsMetadataResponse getDataMetadata().request(request).playerId(playerId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<Object> request = null;
    Integer playerId = 56;
    try {
      ObjectsMetadataResponse result = client
              .cloudsaving
              .getDataMetadata()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getDataMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObjectsMetadataResponse> response = client
              .cloudsaving
              .getDataMetadata()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#getDataMetadata");
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
| **request** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |
| **playerId** | **Integer**|  | [optional] |

### Return type

[**ObjectsMetadataResponse**](ObjectsMetadataResponse.md)

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

<a name="moveDataPut"></a>
# **moveDataPut**
> Manifest moveDataPut().playerBasicCloudDataRequest(playerBasicCloudDataRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    Integer playerId = 56;
    try {
      Manifest result = client
              .cloudsaving
              .moveDataPut()
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getManifest());
      System.out.println(result.getCreated());
      System.out.println(result.getReplacement());
      System.out.println(result.getReferences());
      System.out.println(result.getChecksum());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#moveDataPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Manifest> response = client
              .cloudsaving
              .moveDataPut()
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#moveDataPut");
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
| **playerBasicCloudDataRequest** | [**PlayerBasicCloudDataRequest**](PlayerBasicCloudDataRequest.md)|  | [optional] |

### Return type

[**Manifest**](Manifest.md)

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

<a name="replaceData"></a>
# **replaceData**
> Manifest replaceData().replaceObjectsRequest(replaceObjectsRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    Integer sourcePlayerId = 56;
    Integer targetPlayerId = 56;
    try {
      Manifest result = client
              .cloudsaving
              .replaceData(sourcePlayerId, targetPlayerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getManifest());
      System.out.println(result.getCreated());
      System.out.println(result.getReplacement());
      System.out.println(result.getReferences());
      System.out.println(result.getChecksum());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#replaceData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Manifest> response = client
              .cloudsaving
              .replaceData(sourcePlayerId, targetPlayerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#replaceData");
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
| **replaceObjectsRequest** | [**ReplaceObjectsRequest**](ReplaceObjectsRequest.md)|  | [optional] |

### Return type

[**Manifest**](Manifest.md)

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

<a name="uploadDataUrl"></a>
# **uploadDataUrl**
> URLSResponse uploadDataUrl().uploadRequests(uploadRequests).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<UploadRequest> request = Arrays.asList();
    Integer playerId = 56;
    try {
      URLSResponse result = client
              .cloudsaving
              .uploadDataUrl()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#uploadDataUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<URLSResponse> response = client
              .cloudsaving
              .uploadDataUrl()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#uploadDataUrl");
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
| **uploadRequests** | [**UploadRequests**](UploadRequests.md)|  | [optional] |

### Return type

[**URLSResponse**](URLSResponse.md)

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

<a name="uploadUrlFromPortal"></a>
# **uploadUrlFromPortal**
> URLSResponse uploadUrlFromPortal().uploadRequestsFromPortal(uploadRequestsFromPortal).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudsavingApi;
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
    List<UploadRequestFromPortal> request = Arrays.asList();
    Integer playerId = 56;
    try {
      URLSResponse result = client
              .cloudsaving
              .uploadUrlFromPortal()
              .request(request)
              .playerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#uploadUrlFromPortal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<URLSResponse> response = client
              .cloudsaving
              .uploadUrlFromPortal()
              .request(request)
              .playerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudsavingApi#uploadUrlFromPortal");
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
| **uploadRequestsFromPortal** | [**UploadRequestsFromPortal**](UploadRequestsFromPortal.md)|  | [optional] |

### Return type

[**URLSResponse**](URLSResponse.md)

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

