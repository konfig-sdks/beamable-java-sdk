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


import com.konfigthis.client.model.RegisterReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RegistrationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RegistrationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RegistrationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call pushUserCall(RegisterReq registerReq, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = registerReq;

        // create path and map variables
        String localVarPath = "/basic/push/register";

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
    private okhttp3.Call pushUserValidateBeforeCall(RegisterReq registerReq, final ApiCallback _callback) throws ApiException {
        return pushUserCall(registerReq, _callback);

    }


    private ApiResponse<Object> pushUserWithHttpInfo(RegisterReq registerReq) throws ApiException {
        okhttp3.Call localVarCall = pushUserValidateBeforeCall(registerReq, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call pushUserAsync(RegisterReq registerReq, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = pushUserValidateBeforeCall(registerReq, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class PushUserRequestBuilder {
        private String provider;
        private String token;

        private PushUserRequestBuilder() {
        }

        /**
         * Set provider
         * @param provider  (optional)
         * @return PushUserRequestBuilder
         */
        public PushUserRequestBuilder provider(String provider) {
            this.provider = provider;
            return this;
        }
        
        /**
         * Set token
         * @param token  (optional)
         * @return PushUserRequestBuilder
         */
        public PushUserRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Build call for pushUser
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
            RegisterReq registerReq = buildBodyParams();
            return pushUserCall(registerReq, _callback);
        }

        private RegisterReq buildBodyParams() {
            RegisterReq registerReq = new RegisterReq();
            registerReq.provider(this.provider);
            registerReq.token(this.token);
            return registerReq;
        }

        /**
         * Execute pushUser request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            RegisterReq registerReq = buildBodyParams();
            ApiResponse<Object> localVarResp = pushUserWithHttpInfo(registerReq);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute pushUser request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            RegisterReq registerReq = buildBodyParams();
            return pushUserWithHttpInfo(registerReq);
        }

        /**
         * Execute pushUser request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            RegisterReq registerReq = buildBodyParams();
            return pushUserAsync(registerReq, _callback);
        }
    }

    /**
     * 
     * 
     * @return PushUserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public PushUserRequestBuilder pushUser() throws IllegalArgumentException {
        return new PushUserRequestBuilder();
    }
}
