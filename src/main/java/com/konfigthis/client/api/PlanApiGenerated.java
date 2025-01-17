/*
 * history basic
 * var Beamable = BeamContext.Default; - That one line of code is a gateway to everything you need to build custom server logic via microservices along with a world of LiveOps tools and live services to build games that players love.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@beamable.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CommonResponse;
import com.konfigthis.client.model.CreatePlanRequest;
import com.konfigthis.client.model.RedisShardRequest;
import com.konfigthis.client.model.ServicePlansResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PlanApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PlanApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PlanApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApi() == null) {
            throw new IllegalArgumentException("\"X-DE-SIGNATURE\" is required but no API key was provided. Please set \"X-DE-SIGNATURE\" with ApiClient#setApi(String).");
        }
        if (apiClient.getScope() == null) {
            throw new IllegalArgumentException("\"X-DE-SCOPE\" is required but no API key was provided. Please set \"X-DE-SCOPE\" with ApiClient#setScope(String).");
        }
        if (apiClient.getUserRequired() == null) {
            throw new IllegalArgumentException("\"X-DE-GAMERTAG\" is required but no API key was provided. Please set \"X-DE-GAMERTAG\" with ApiClient#setUserRequired(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewPlanCall(CreatePlanRequest createPlanRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createPlanRequest;

        // create path and map variables
        String localVarPath = "/basic/realms/plans";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "scope", "user" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewPlanValidateBeforeCall(CreatePlanRequest createPlanRequest, final ApiCallback _callback) throws ApiException {
        return createNewPlanCall(createPlanRequest, _callback);

    }


    private ApiResponse<CommonResponse> createNewPlanWithHttpInfo(CreatePlanRequest createPlanRequest) throws ApiException {
        okhttp3.Call localVarCall = createNewPlanValidateBeforeCall(createPlanRequest, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewPlanAsync(CreatePlanRequest createPlanRequest, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewPlanValidateBeforeCall(createPlanRequest, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewPlanRequestBuilder {
        private final String name;
        private final String memcachedHosts;
        private final Boolean mongoSSL;
        private final String platformJBDC;
        private final Boolean sharded;
        private final String mongoHosts;
        private final List<RedisShardRequest> redisShards;
        private List<String> messageBusAnalytics;
        private List<String> messageBusCommon;

        private CreateNewPlanRequestBuilder(String name, String memcachedHosts, Boolean mongoSSL, String platformJBDC, Boolean sharded, String mongoHosts, List<RedisShardRequest> redisShards) {
            this.name = name;
            this.memcachedHosts = memcachedHosts;
            this.mongoSSL = mongoSSL;
            this.platformJBDC = platformJBDC;
            this.sharded = sharded;
            this.mongoHosts = mongoHosts;
            this.redisShards = redisShards;
        }

        /**
         * Set messageBusAnalytics
         * @param messageBusAnalytics  (optional)
         * @return CreateNewPlanRequestBuilder
         */
        public CreateNewPlanRequestBuilder messageBusAnalytics(List<String> messageBusAnalytics) {
            this.messageBusAnalytics = messageBusAnalytics;
            return this;
        }
        
        /**
         * Set messageBusCommon
         * @param messageBusCommon  (optional)
         * @return CreateNewPlanRequestBuilder
         */
        public CreateNewPlanRequestBuilder messageBusCommon(List<String> messageBusCommon) {
            this.messageBusCommon = messageBusCommon;
            return this;
        }
        
        /**
         * Build call for createNewPlan
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CreatePlanRequest createPlanRequest = buildBodyParams();
            return createNewPlanCall(createPlanRequest, _callback);
        }

        private CreatePlanRequest buildBodyParams() {
            CreatePlanRequest createPlanRequest = new CreatePlanRequest();
            createPlanRequest.name(this.name);
            createPlanRequest.messageBusAnalytics(this.messageBusAnalytics);
            createPlanRequest.memcachedHosts(this.memcachedHosts);
            createPlanRequest.mongoSSL(this.mongoSSL);
            createPlanRequest.platformJBDC(this.platformJBDC);
            createPlanRequest.sharded(this.sharded);
            createPlanRequest.mongoHosts(this.mongoHosts);
            createPlanRequest.messageBusCommon(this.messageBusCommon);
            createPlanRequest.redisShards(this.redisShards);
            return createPlanRequest;
        }

        /**
         * Execute createNewPlan request
         * @return CommonResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public CommonResponse execute() throws ApiException {
            CreatePlanRequest createPlanRequest = buildBodyParams();
            ApiResponse<CommonResponse> localVarResp = createNewPlanWithHttpInfo(createPlanRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewPlan request with HTTP info returned
         * @return ApiResponse&lt;CommonResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CommonResponse> executeWithHttpInfo() throws ApiException {
            CreatePlanRequest createPlanRequest = buildBodyParams();
            return createNewPlanWithHttpInfo(createPlanRequest);
        }

        /**
         * Execute createNewPlan request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CommonResponse> _callback) throws ApiException {
            CreatePlanRequest createPlanRequest = buildBodyParams();
            return createNewPlanAsync(createPlanRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return CreateNewPlanRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewPlanRequestBuilder createNewPlan(String name, String memcachedHosts, Boolean mongoSSL, String platformJBDC, Boolean sharded, String mongoHosts, List<RedisShardRequest> redisShards) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (memcachedHosts == null) throw new IllegalArgumentException("\"memcachedHosts\" is required but got null");
            

        if (mongoSSL == null) throw new IllegalArgumentException("\"mongoSSL\" is required but got null");
        if (platformJBDC == null) throw new IllegalArgumentException("\"platformJBDC\" is required but got null");
            

        if (sharded == null) throw new IllegalArgumentException("\"sharded\" is required but got null");
        if (mongoHosts == null) throw new IllegalArgumentException("\"mongoHosts\" is required but got null");
            

        if (redisShards == null) throw new IllegalArgumentException("\"redisShards\" is required but got null");
        return new CreateNewPlanRequestBuilder(name, memcachedHosts, mongoSSL, platformJBDC, sharded, mongoHosts, redisShards);
    }
    private okhttp3.Call getRealmsPlansCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/basic/realms/plans";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "scope", "user" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRealmsPlansValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getRealmsPlansCall(_callback);

    }


    private ApiResponse<ServicePlansResponse> getRealmsPlansWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getRealmsPlansValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ServicePlansResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRealmsPlansAsync(final ApiCallback<ServicePlansResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRealmsPlansValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ServicePlansResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRealmsPlansRequestBuilder {

        private GetRealmsPlansRequestBuilder() {
        }

        /**
         * Build call for getRealmsPlans
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getRealmsPlansCall(_callback);
        }


        /**
         * Execute getRealmsPlans request
         * @return ServicePlansResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ServicePlansResponse execute() throws ApiException {
            ApiResponse<ServicePlansResponse> localVarResp = getRealmsPlansWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getRealmsPlans request with HTTP info returned
         * @return ApiResponse&lt;ServicePlansResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ServicePlansResponse> executeWithHttpInfo() throws ApiException {
            return getRealmsPlansWithHttpInfo();
        }

        /**
         * Execute getRealmsPlans request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ServicePlansResponse> _callback) throws ApiException {
            return getRealmsPlansAsync(_callback);
        }
    }

    /**
     * 
     * 
     * @return GetRealmsPlansRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public GetRealmsPlansRequestBuilder getRealmsPlans() throws IllegalArgumentException {
        return new GetRealmsPlansRequestBuilder();
    }
}
