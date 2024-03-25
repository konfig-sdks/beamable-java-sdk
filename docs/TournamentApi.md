# TournamentApi

All URIs are relative to *https://api.beamable.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminPlayerDataGet**](TournamentApi.md#adminPlayerDataGet) | **GET** /basic/tournaments/admin/player |  |
| [**createNewTournament**](TournamentApi.md#createNewTournament) | **POST** /basic/tournaments |  |
| [**createReward**](TournamentApi.md#createReward) | **POST** /basic/tournaments/rewards |  |
| [**getChampions**](TournamentApi.md#getChampions) | **GET** /basic/tournaments/champions |  |
| [**getGlobalTournaments**](TournamentApi.md#getGlobalTournaments) | **GET** /basic/tournaments/global |  |
| [**getMyTournament**](TournamentApi.md#getMyTournament) | **GET** /basic/tournaments/me |  |
| [**getRewards**](TournamentApi.md#getRewards) | **GET** /basic/tournaments/rewards |  |
| [**getStandings**](TournamentApi.md#getStandings) | **GET** /basic/tournaments/standings |  |
| [**getTournamentObject**](TournamentApi.md#getTournamentObject) | **GET** /object/tournaments/{objectId} |  |
| [**listTournaments**](TournamentApi.md#listTournaments) | **GET** /basic/tournaments |  |
| [**submitScore**](TournamentApi.md#submitScore) | **POST** /basic/tournaments/score |  |
| [**updateAdminPlayer**](TournamentApi.md#updateAdminPlayer) | **PUT** /basic/tournaments/admin/player |  |


<a name="adminPlayerDataGet"></a>
# **adminPlayerDataGet**
> AdminGetPlayerStatusResponse adminPlayerDataGet(playerId).tournamentId(tournamentId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    try {
      AdminGetPlayerStatusResponse result = client
              .tournament
              .adminPlayerDataGet(playerId)
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatuses());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#adminPlayerDataGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminGetPlayerStatusResponse> response = client
              .tournament
              .adminPlayerDataGet(playerId)
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#adminPlayerDataGet");
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
| **playerId** | **Integer**|  | |
| **tournamentId** | **String**|  | [optional] |

### Return type

[**AdminGetPlayerStatusResponse**](AdminGetPlayerStatusResponse.md)

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

<a name="createNewTournament"></a>
# **createNewTournament**
> PlayerStatus createNewTournament().joinRequest(joinRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    try {
      PlayerStatus result = client
              .tournament
              .createNewTournament()
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLastUpdateCycle());
      System.out.println(result.getTournamentId());
      System.out.println(result.getStage());
      System.out.println(result.getUnclaimedRewards());
      System.out.println(result.getTier());
      System.out.println(result.getPlayerId());
      System.out.println(result.getContentId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#createNewTournament");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerStatus> response = client
              .tournament
              .createNewTournament()
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#createNewTournament");
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
| **joinRequest** | [**JoinRequest**](JoinRequest.md)|  | [optional] |

### Return type

[**PlayerStatus**](PlayerStatus.md)

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

<a name="createReward"></a>
# **createReward**
> RewardsResponse createReward().rewardsRequest(rewardsRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    try {
      RewardsResponse result = client
              .tournament
              .createReward()
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRewardCurrencies());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#createReward");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RewardsResponse> response = client
              .tournament
              .createReward()
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#createReward");
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
| **rewardsRequest** | [**RewardsRequest**](RewardsRequest.md)|  | [optional] |

### Return type

[**RewardsResponse**](RewardsResponse.md)

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

<a name="getChampions"></a>
# **getChampions**
> GetChampionsResponse getChampions(cycles).tournamentId(tournamentId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    Integer cycles = 56;
    String tournamentId = "tournamentId_example";
    try {
      GetChampionsResponse result = client
              .tournament
              .getChampions(cycles)
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getChampions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetChampionsResponse> response = client
              .tournament
              .getChampions(cycles)
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getChampions");
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
| **cycles** | **Integer**|  | |
| **tournamentId** | **String**|  | [optional] |

### Return type

[**GetChampionsResponse**](GetChampionsResponse.md)

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

<a name="getGlobalTournaments"></a>
# **getGlobalTournaments**
> GetStandingsResponse getGlobalTournaments().tournamentId(tournamentId).max(max).focus(focus).cycle(cycle).from(from).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    Integer max = 56;
    Integer focus = 56;
    Integer cycle = 56;
    Integer from = 56;
    try {
      GetStandingsResponse result = client
              .tournament
              .getGlobalTournaments()
              .tournamentId(tournamentId)
              .max(max)
              .focus(focus)
              .cycle(cycle)
              .from(from)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getMe());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getGlobalTournaments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetStandingsResponse> response = client
              .tournament
              .getGlobalTournaments()
              .tournamentId(tournamentId)
              .max(max)
              .focus(focus)
              .cycle(cycle)
              .from(from)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getGlobalTournaments");
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
| **tournamentId** | **String**|  | [optional] |
| **max** | **Integer**|  | [optional] |
| **focus** | **Integer**|  | [optional] |
| **cycle** | **Integer**|  | [optional] |
| **from** | **Integer**|  | [optional] |

### Return type

[**GetStandingsResponse**](GetStandingsResponse.md)

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

<a name="getMyTournament"></a>
# **getMyTournament**
> GetPlayerStatusResponse getMyTournament().tournamentId(tournamentId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    try {
      GetPlayerStatusResponse result = client
              .tournament
              .getMyTournament()
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatuses());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getMyTournament");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPlayerStatusResponse> response = client
              .tournament
              .getMyTournament()
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getMyTournament");
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
| **tournamentId** | **String**|  | [optional] |

### Return type

[**GetPlayerStatusResponse**](GetPlayerStatusResponse.md)

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

<a name="getRewards"></a>
# **getRewards**
> RewardsResponse getRewards().tournamentId(tournamentId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    try {
      RewardsResponse result = client
              .tournament
              .getRewards()
              .tournamentId(tournamentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRewardCurrencies());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getRewards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RewardsResponse> response = client
              .tournament
              .getRewards()
              .tournamentId(tournamentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getRewards");
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
| **tournamentId** | **String**|  | [optional] |

### Return type

[**RewardsResponse**](RewardsResponse.md)

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

<a name="getStandings"></a>
# **getStandings**
> GetStandingsResponse getStandings().tournamentId(tournamentId).max(max).focus(focus).cycle(cycle).from(from).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    Integer max = 56;
    Integer focus = 56;
    Integer cycle = 56;
    Integer from = 56;
    try {
      GetStandingsResponse result = client
              .tournament
              .getStandings()
              .tournamentId(tournamentId)
              .max(max)
              .focus(focus)
              .cycle(cycle)
              .from(from)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getMe());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getStandings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetStandingsResponse> response = client
              .tournament
              .getStandings()
              .tournamentId(tournamentId)
              .max(max)
              .focus(focus)
              .cycle(cycle)
              .from(from)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getStandings");
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
| **tournamentId** | **String**|  | [optional] |
| **max** | **Integer**|  | [optional] |
| **focus** | **Integer**|  | [optional] |
| **cycle** | **Integer**|  | [optional] |
| **from** | **Integer**|  | [optional] |

### Return type

[**GetStandingsResponse**](GetStandingsResponse.md)

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

<a name="getTournamentObject"></a>
# **getTournamentObject**
> TournamentClientView getTournamentObject(objectId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    String objectId = "objectId_example";
    try {
      TournamentClientView result = client
              .tournament
              .getTournamentObject(objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTournamentId());
      System.out.println(result.getSecondsRemaining());
      System.out.println(result.getContentId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getTournamentObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TournamentClientView> response = client
              .tournament
              .getTournamentObject(objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#getTournamentObject");
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
| **objectId** | **String**|  | |

### Return type

[**TournamentClientView**](TournamentClientView.md)

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

<a name="listTournaments"></a>
# **listTournaments**
> TournamentQueryResponse listTournaments().isRunning(isRunning).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Boolean isRunning = true;
    try {
      TournamentQueryResponse result = client
              .tournament
              .listTournaments()
              .isRunning(isRunning)
              .execute();
      System.out.println(result);
      System.out.println(result.getTournaments());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#listTournaments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TournamentQueryResponse> response = client
              .tournament
              .listTournaments()
              .isRunning(isRunning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#listTournaments");
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
| **isRunning** | **Boolean**|  | [optional] |

### Return type

[**TournamentQueryResponse**](TournamentQueryResponse.md)

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

<a name="submitScore"></a>
# **submitScore**
> EmptyResponse submitScore().scoreRequest(scoreRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.beamable.com";
    
    configuration.scope  = "YOUR API KEY";
    Beamable client = new Beamable(configuration);
    Double score = 3.4D;
    Integer playerId = 56;
    String tournamentId = "tournamentId_example";
    Map<String, Object> stats = new HashMap();
    Boolean increment = true;
    try {
      EmptyResponse result = client
              .tournament
              .submitScore(score, playerId)
              .tournamentId(tournamentId)
              .stats(stats)
              .increment(increment)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#submitScore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmptyResponse> response = client
              .tournament
              .submitScore(score, playerId)
              .tournamentId(tournamentId)
              .stats(stats)
              .increment(increment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#submitScore");
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
| **scoreRequest** | [**ScoreRequest**](ScoreRequest.md)|  | [optional] |

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

<a name="updateAdminPlayer"></a>
# **updateAdminPlayer**
> AdminPlayerStatus updateAdminPlayer().updatePlayerStatusRequest(updatePlayerStatusRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Beamable;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TournamentApi;
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
    String tournamentId = "tournamentId_example";
    PlayerStatusUpdate update = new PlayerStatusUpdate();
    try {
      AdminPlayerStatus result = client
              .tournament
              .updateAdminPlayer(playerId)
              .tournamentId(tournamentId)
              .update(update)
              .execute();
      System.out.println(result);
      System.out.println(result.getTournamentId());
      System.out.println(result.getStage());
      System.out.println(result.getUnclaimedRewards());
      System.out.println(result.getTier());
      System.out.println(result.getRank());
      System.out.println(result.getScore());
      System.out.println(result.getPlayerId());
      System.out.println(result.getContentId());
      System.out.println(result.getNextCycleStartMs());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#updateAdminPlayer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminPlayerStatus> response = client
              .tournament
              .updateAdminPlayer(playerId)
              .tournamentId(tournamentId)
              .update(update)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TournamentApi#updateAdminPlayer");
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
| **updatePlayerStatusRequest** | [**UpdatePlayerStatusRequest**](UpdatePlayerStatusRequest.md)|  | [optional] |

### Return type

[**AdminPlayerStatus**](AdminPlayerStatus.md)

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

