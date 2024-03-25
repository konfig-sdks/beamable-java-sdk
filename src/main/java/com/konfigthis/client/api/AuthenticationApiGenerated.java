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


import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.SteamAuthRequest;
import com.konfigthis.client.model.Token;
import com.konfigthis.client.model.TokenRequestWrapper;
import com.konfigthis.client.model.TokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthenticationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getTokenCall(String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/basic/auth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "scope" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTokenValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        return getTokenCall(token, _callback);

    }


    private ApiResponse<Token> getTokenWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = getTokenValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getTokenAsync(String token, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTokenValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetTokenRequestBuilder {
        private String token;

        private GetTokenRequestBuilder() {
        }

        /**
         * Set token
         * @param token  (optional)
         * @return GetTokenRequestBuilder
         */
        public GetTokenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Build call for getToken
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
            return getTokenCall(token, _callback);
        }


        /**
         * Execute getToken request
         * @return Token
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public Token execute() throws ApiException {
            ApiResponse<Token> localVarResp = getTokenWithHttpInfo(token);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getToken request with HTTP info returned
         * @return ApiResponse&lt;Token&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Token> executeWithHttpInfo() throws ApiException {
            return getTokenWithHttpInfo(token);
        }

        /**
         * Execute getToken request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Token> _callback) throws ApiException {
            return getTokenAsync(token, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public GetTokenRequestBuilder getToken() throws IllegalArgumentException {
        return new GetTokenRequestBuilder();
    }
    private okhttp3.Call requestTokenCall(TokenRequestWrapper tokenRequestWrapper, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tokenRequestWrapper;

        // create path and map variables
        String localVarPath = "/basic/auth/token";

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

        String[] localVarAuthNames = new String[] { "scope" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call requestTokenValidateBeforeCall(TokenRequestWrapper tokenRequestWrapper, final ApiCallback _callback) throws ApiException {
        return requestTokenCall(tokenRequestWrapper, _callback);

    }


    private ApiResponse<TokenResponse> requestTokenWithHttpInfo(TokenRequestWrapper tokenRequestWrapper) throws ApiException {
        okhttp3.Call localVarCall = requestTokenValidateBeforeCall(tokenRequestWrapper, null);
        Type localVarReturnType = new TypeToken<TokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call requestTokenAsync(TokenRequestWrapper tokenRequestWrapper, final ApiCallback<TokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestTokenValidateBeforeCall(tokenRequestWrapper, _callback);
        Type localVarReturnType = new TypeToken<TokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RequestTokenRequestBuilder {
        private String username;
        private List<String> scope;
        private String refreshToken;
        private String thirdParty;
        private String redirectUri;
        private String clientId;
        private String code;
        private String token;
        private Boolean customerScoped;
        private String grantType;
        private String password;

        private RequestTokenRequestBuilder() {
        }

        /**
         * Set username
         * @param username  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder username(String username) {
            this.username = username;
            return this;
        }
        
        /**
         * Set scope
         * @param scope  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder scope(List<String> scope) {
            this.scope = scope;
            return this;
        }
        
        /**
         * Set refreshToken
         * @param refreshToken  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        
        /**
         * Set thirdParty
         * @param thirdParty  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder thirdParty(String thirdParty) {
            this.thirdParty = thirdParty;
            return this;
        }
        
        /**
         * Set redirectUri
         * @param redirectUri  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        
        /**
         * Set clientId
         * @param clientId  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        
        /**
         * Set code
         * @param code  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder code(String code) {
            this.code = code;
            return this;
        }
        
        /**
         * Set token
         * @param token  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set customerScoped
         * @param customerScoped  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder customerScoped(Boolean customerScoped) {
            this.customerScoped = customerScoped;
            return this;
        }
        
        /**
         * Set grantType
         * @param grantType  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        
        /**
         * Set password
         * @param password  (optional)
         * @return RequestTokenRequestBuilder
         */
        public RequestTokenRequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        /**
         * Build call for requestToken
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
            TokenRequestWrapper tokenRequestWrapper = buildBodyParams();
            return requestTokenCall(tokenRequestWrapper, _callback);
        }

        private TokenRequestWrapper buildBodyParams() {
            TokenRequestWrapper tokenRequestWrapper = new TokenRequestWrapper();
            tokenRequestWrapper.username(this.username);
            tokenRequestWrapper.scope(this.scope);
            tokenRequestWrapper.refreshToken(this.refreshToken);
            tokenRequestWrapper.thirdParty(this.thirdParty);
            tokenRequestWrapper.redirectUri(this.redirectUri);
            tokenRequestWrapper.clientId(this.clientId);
            tokenRequestWrapper.code(this.code);
            tokenRequestWrapper.token(this.token);
            tokenRequestWrapper.customerScoped(this.customerScoped);
            tokenRequestWrapper.grantType(this.grantType);
            tokenRequestWrapper.password(this.password);
            return tokenRequestWrapper;
        }

        /**
         * Execute requestToken request
         * @return TokenResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public TokenResponse execute() throws ApiException {
            TokenRequestWrapper tokenRequestWrapper = buildBodyParams();
            ApiResponse<TokenResponse> localVarResp = requestTokenWithHttpInfo(tokenRequestWrapper);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute requestToken request with HTTP info returned
         * @return ApiResponse&lt;TokenResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TokenResponse> executeWithHttpInfo() throws ApiException {
            TokenRequestWrapper tokenRequestWrapper = buildBodyParams();
            return requestTokenWithHttpInfo(tokenRequestWrapper);
        }

        /**
         * Execute requestToken request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<TokenResponse> _callback) throws ApiException {
            TokenRequestWrapper tokenRequestWrapper = buildBodyParams();
            return requestTokenAsync(tokenRequestWrapper, _callback);
        }
    }

    /**
     * 
     * 
     * @return RequestTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public RequestTokenRequestBuilder requestToken() throws IllegalArgumentException {
        return new RequestTokenRequestBuilder();
    }
    private okhttp3.Call steamPostAuthCall(SteamAuthRequest steamAuthRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = steamAuthRequest;

        // create path and map variables
        String localVarPath = "/basic/payments/steam/auth";

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

        String[] localVarAuthNames = new String[] { "scope" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call steamPostAuthValidateBeforeCall(SteamAuthRequest steamAuthRequest, final ApiCallback _callback) throws ApiException {
        return steamPostAuthCall(steamAuthRequest, _callback);

    }


    private ApiResponse<EmptyResponse> steamPostAuthWithHttpInfo(SteamAuthRequest steamAuthRequest) throws ApiException {
        okhttp3.Call localVarCall = steamPostAuthValidateBeforeCall(steamAuthRequest, null);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call steamPostAuthAsync(SteamAuthRequest steamAuthRequest, final ApiCallback<EmptyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = steamPostAuthValidateBeforeCall(steamAuthRequest, _callback);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SteamPostAuthRequestBuilder {
        private String ticket;

        private SteamPostAuthRequestBuilder() {
        }

        /**
         * Set ticket
         * @param ticket  (optional)
         * @return SteamPostAuthRequestBuilder
         */
        public SteamPostAuthRequestBuilder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        
        /**
         * Build call for steamPostAuth
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
            SteamAuthRequest steamAuthRequest = buildBodyParams();
            return steamPostAuthCall(steamAuthRequest, _callback);
        }

        private SteamAuthRequest buildBodyParams() {
            SteamAuthRequest steamAuthRequest = new SteamAuthRequest();
            steamAuthRequest.ticket(this.ticket);
            return steamAuthRequest;
        }

        /**
         * Execute steamPostAuth request
         * @return EmptyResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public EmptyResponse execute() throws ApiException {
            SteamAuthRequest steamAuthRequest = buildBodyParams();
            ApiResponse<EmptyResponse> localVarResp = steamPostAuthWithHttpInfo(steamAuthRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute steamPostAuth request with HTTP info returned
         * @return ApiResponse&lt;EmptyResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmptyResponse> executeWithHttpInfo() throws ApiException {
            SteamAuthRequest steamAuthRequest = buildBodyParams();
            return steamPostAuthWithHttpInfo(steamAuthRequest);
        }

        /**
         * Execute steamPostAuth request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<EmptyResponse> _callback) throws ApiException {
            SteamAuthRequest steamAuthRequest = buildBodyParams();
            return steamPostAuthAsync(steamAuthRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return SteamPostAuthRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public SteamPostAuthRequestBuilder steamPostAuth() throws IllegalArgumentException {
        return new SteamPostAuthRequestBuilder();
    }
}
