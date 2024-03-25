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
import com.konfigthis.client.model.DeleteEntitlementDefinitionRequest;
import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.EntitlementDefinitions;
import com.konfigthis.client.model.PvpDefinitions;
import com.konfigthis.client.model.PvpRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LegacyPvpDefApi
 */
@Disabled
public class LegacyPvpDefApiTest {

    private static LegacyPvpDefApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LegacyPvpDefApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrUpdateDefinitionTest() throws ApiException {
        String lbid = null;
        EmptyResponse response = api.createOrUpdateDefinition()
                .lbid(lbid)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDefinitionTest() throws ApiException {
        String lbid = null;
        EmptyResponse response = api.deleteDefinition()
                .lbid(lbid)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEntitlementDefinitionTest() throws ApiException {
        String symbol = null;
        EmptyResponse response = api.deleteEntitlementDefinition()
                .symbol(symbol)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefinitionsTest() throws ApiException {
        PvpDefinitions response = api.getDefinitions()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntitlementDefsTest() throws ApiException {
        String symbol = null;
        EntitlementDefinitions response = api.getEntitlementDefs()
                .symbol(symbol)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitPvpFileTest() throws ApiException {
        String lbid = null;
        EmptyResponse response = api.submitPvpFile()
                .lbid(lbid)
                .execute();
        // TODO: test validations
    }

}
