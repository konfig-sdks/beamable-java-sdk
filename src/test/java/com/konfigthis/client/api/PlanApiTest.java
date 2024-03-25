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
import com.konfigthis.client.model.CommonResponse;
import com.konfigthis.client.model.CreatePlanRequest;
import com.konfigthis.client.model.RedisShardRequest;
import com.konfigthis.client.model.ServicePlansResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlanApi
 */
@Disabled
public class PlanApiTest {

    private static PlanApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PlanApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewPlanTest() throws ApiException {
        String name = null;
        String memcachedHosts = null;
        Boolean mongoSSL = null;
        String platformJBDC = null;
        Boolean sharded = null;
        String mongoHosts = null;
        List<RedisShardRequest> redisShards = null;
        List<String> messageBusAnalytics = null;
        List<String> messageBusCommon = null;
        CommonResponse response = api.createNewPlan(name, memcachedHosts, mongoSSL, platformJBDC, sharded, mongoHosts, redisShards)
                .messageBusAnalytics(messageBusAnalytics)
                .messageBusCommon(messageBusCommon)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRealmsPlansTest() throws ApiException {
        ServicePlansResponse response = api.getRealmsPlans()
                .execute();
        // TODO: test validations
    }

}
