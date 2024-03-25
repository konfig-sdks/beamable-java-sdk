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
import com.konfigthis.client.model.StatsSubscribeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionApi
 */
@Disabled
public class SubscriptionApiTest {

    private static SubscriptionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SubscriptionApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBasicStatsSubscriptionTest() throws ApiException {
        String service = null;
        List<String> subscriptions = null;
        CommonResponse response = api.addBasicStatsSubscription()
                .service(service)
                .subscriptions(subscriptions)
                .execute();
        // TODO: test validations
    }

}
