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


import com.konfigthis.client.model.SteamOrderInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OrderApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrderApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSteamCall(String orderId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/basic/payments/steam/order";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderId", orderId));
        }

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
    private okhttp3.Call getSteamValidateBeforeCall(String orderId, final ApiCallback _callback) throws ApiException {
        return getSteamCall(orderId, _callback);

    }


    private ApiResponse<SteamOrderInfoResponse> getSteamWithHttpInfo(String orderId) throws ApiException {
        okhttp3.Call localVarCall = getSteamValidateBeforeCall(orderId, null);
        Type localVarReturnType = new TypeToken<SteamOrderInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSteamAsync(String orderId, final ApiCallback<SteamOrderInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSteamValidateBeforeCall(orderId, _callback);
        Type localVarReturnType = new TypeToken<SteamOrderInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSteamRequestBuilder {
        private String orderId;

        private GetSteamRequestBuilder() {
        }

        /**
         * Set orderId
         * @param orderId  (optional)
         * @return GetSteamRequestBuilder
         */
        public GetSteamRequestBuilder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        
        /**
         * Build call for getSteam
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
            return getSteamCall(orderId, _callback);
        }


        /**
         * Execute getSteam request
         * @return SteamOrderInfoResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public SteamOrderInfoResponse execute() throws ApiException {
            ApiResponse<SteamOrderInfoResponse> localVarResp = getSteamWithHttpInfo(orderId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSteam request with HTTP info returned
         * @return ApiResponse&lt;SteamOrderInfoResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SteamOrderInfoResponse> executeWithHttpInfo() throws ApiException {
            return getSteamWithHttpInfo(orderId);
        }

        /**
         * Execute getSteam request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<SteamOrderInfoResponse> _callback) throws ApiException {
            return getSteamAsync(orderId, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetSteamRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public GetSteamRequestBuilder getSteam() throws IllegalArgumentException {
        return new GetSteamRequestBuilder();
    }
}
