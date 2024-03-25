# CampaignApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewLegacyCloudCampaign**](CampaignApi.md#createNewLegacyCloudCampaign) | **POST** /basic/legacy-cloud/campaigns |  |
| [**getLegacyCloudCampaigns**](CampaignApi.md#getLegacyCloudCampaigns) | **GET** /basic/legacy-cloud/campaigns |  |
| [**removeLegacyCloud**](CampaignApi.md#removeLegacyCloud) | **DELETE** /basic/legacy-cloud/campaigns |  |
| [**updateSchedule**](CampaignApi.md#updateSchedule) | **PUT** /basic/legacy-cloud/campaigns/schedule |  |


<a name="createNewLegacyCloudCampaign"></a>
# **createNewLegacyCloudCampaign**
> EmptyResponse createNewLegacyCloudCampaign().createMessageCampaignRequest(createMessageCampaignRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignApi;
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
    Boolean resendToPastRecipients = true;
    Integer sent = 56;
    String mtype = "mtype_example";
    String mbStore = "mbStore_example";
    String mbExpiration = "mbExpiration_example";
    String name = "name_example";
    String subject = "subject_example";
    String mbEntSpec = "mbEntSpec_example";
    Integer mbEntQuant = 56;
    String datepoint = "datepoint_example";
    List<AttachmentRequest> mbAttachments = Arrays.asList();
    String recur = "recur_example";
    String msg = "msg_example";
    List<String> rules = Arrays.asList();
    String mbEnt = "mbEnt_example";
    String start = "start_example";
    String days = "days_example";
    try {
      EmptyResponse result = client
              .campaign
              .createNewLegacyCloudCampaign(resendToPastRecipients, sent)
              .mtype(mtype)
              .mbStore(mbStore)
              .mbExpiration(mbExpiration)
              .name(name)
              .subject(subject)
              .mbEntSpec(mbEntSpec)
              .mbEntQuant(mbEntQuant)
              .datepoint(datepoint)
              .mbAttachments(mbAttachments)
              .recur(recur)
              .msg(msg)
              .rules(rules)
              .mbEnt(mbEnt)
              .start(start)
              .days(days)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#createNewLegacyCloudCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .campaign
              .createNewLegacyCloudCampaign(resendToPastRecipients, sent)
              .mtype(mtype)
              .mbStore(mbStore)
              .mbExpiration(mbExpiration)
              .name(name)
              .subject(subject)
              .mbEntSpec(mbEntSpec)
              .mbEntQuant(mbEntQuant)
              .datepoint(datepoint)
              .mbAttachments(mbAttachments)
              .recur(recur)
              .msg(msg)
              .rules(rules)
              .mbEnt(mbEnt)
              .start(start)
              .days(days)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#createNewLegacyCloudCampaign");
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
| **createMessageCampaignRequest** | [**CreateMessageCampaignRequest**](CreateMessageCampaignRequest.md)|  | [optional] |

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

<a name="getLegacyCloudCampaigns"></a>
# **getLegacyCloudCampaigns**
> GetCampaignsResponse getLegacyCloudCampaigns().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignApi;
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
      GetCampaignsResponse result = client
              .campaign
              .getLegacyCloudCampaigns()
              .execute();
      System.out.println(result);
      System.out.println(result.getCampaigns());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getLegacyCloudCampaigns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetCampaignsResponse> response = client
              .campaign
              .getLegacyCloudCampaigns()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getLegacyCloudCampaigns");
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

[**GetCampaignsResponse**](GetCampaignsResponse.md)

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

<a name="removeLegacyCloud"></a>
# **removeLegacyCloud**
> EmptyResponse removeLegacyCloud().ejectMessageCampaignRequest(ejectMessageCampaignRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignApi;
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
    String sid = "sid_example";
    try {
      EmptyResponse result = client
              .campaign
              .removeLegacyCloud()
              .sid(sid)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#removeLegacyCloud");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .campaign
              .removeLegacyCloud()
              .sid(sid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#removeLegacyCloud");
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
| **ejectMessageCampaignRequest** | [**EjectMessageCampaignRequest**](EjectMessageCampaignRequest.md)|  | [optional] |

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

<a name="updateSchedule"></a>
# **updateSchedule**
> EmptyResponse updateSchedule().rescheduleMessageCampaignRequest(rescheduleMessageCampaignRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignApi;
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
    String sid = "sid_example";
    String startDate = "startDate_example";
    try {
      EmptyResponse result = client
              .campaign
              .updateSchedule()
              .sid(sid)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#updateSchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .campaign
              .updateSchedule()
              .sid(sid)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#updateSchedule");
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
| **rescheduleMessageCampaignRequest** | [**RescheduleMessageCampaignRequest**](RescheduleMessageCampaignRequest.md)|  | [optional] |

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

