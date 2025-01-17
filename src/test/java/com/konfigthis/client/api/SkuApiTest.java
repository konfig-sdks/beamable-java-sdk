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
import com.konfigthis.client.model.GetSKUsResponse;
import com.konfigthis.client.model.ResultResponse;
import com.konfigthis.client.model.SKU;
import com.konfigthis.client.model.SaveSKUsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SkuApi
 */
@Disabled
public class SkuApiTest {

    private static SkuApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SkuApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSkuTest() throws ApiException {
        List<SKU> definitions = null;
        ResultResponse response = api.createSku()
                .definitions(definitions)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSkusTest() throws ApiException {
        Integer version = null;
        GetSKUsResponse response = api.listSkus()
                .version(version)
                .execute();
        // TODO: test validations
    }

}
