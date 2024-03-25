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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ClaimEntitlementRequest;
import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.EntitlementDefRequest;
import com.konfigthis.client.model.EntitlementGenerator;
import com.konfigthis.client.model.EntitlementGrantMultiRequest;
import com.konfigthis.client.model.EntitlementListResponse;
import com.konfigthis.client.model.EntitlementResponse;
import com.konfigthis.client.model.ModifyEntitlementDefinitionRequest;
import com.konfigthis.client.model.RevokeEntitlementRequest;
import com.konfigthis.client.model.UploadEntitlementDefinitionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntitlementApi
 */
@Disabled
public class EntitlementApiTest {

    private static EntitlementApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EntitlementApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLegacyEntitlementDefsTest() throws ApiException {
        List<Integer> gamerTags = null;
        List<EntitlementGenerator> generators = null;
        EmptyResponse response = api.createLegacyEntitlementDefs()
                .gamerTags(gamerTags)
                .generators(generators)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLegacyEntitlementDefs_0Test() throws ApiException {
        String symbol = null;
        EntitlementDefRequest request = null;
        EmptyResponse response = api.createLegacyEntitlementDefs_0()
                .symbol(symbol)
                .request(request)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void defineEntitlementLegacyTest() throws ApiException {
        Integer gt = null;
        String symbol = null;
        String spec = null;
        String uuid = null;
        EntitlementResponse response = api.defineEntitlementLegacy(gt)
                .symbol(symbol)
                .spec(spec)
                .uuid(uuid)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayerEntitlementsTest() throws ApiException {
        Integer gt = null;
        String state = null;
        Integer skip = null;
        String symbol = null;
        Boolean icw = null;
        String spec = null;
        Integer limit = null;
        EntitlementListResponse response = api.getPlayerEntitlements(gt)
                .state(state)
                .skip(skip)
                .symbol(symbol)
                .icw(icw)
                .spec(spec)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeLegacyEntitlementDefsTest() throws ApiException {
        String uuid = null;
        EntitlementResponse response = api.revokeLegacyEntitlementDefs()
                .uuid(uuid)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadLegacyEntitlementDefsTest() throws ApiException {
        List<ModifyEntitlementDefinitionRequest> entitlements = null;
        EmptyResponse response = api.uploadLegacyEntitlementDefs()
                .entitlements(entitlements)
                .execute();
        // TODO: test validations
    }

}
