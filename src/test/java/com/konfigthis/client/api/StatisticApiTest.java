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
import com.konfigthis.client.model.BatchReadStatsResponse;
import com.konfigthis.client.model.BatchSetStatsRequest;
import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.StatUpdateRequest;
import com.konfigthis.client.model.StatsSearchCriteria;
import com.konfigthis.client.model.StatsSearchRequest;
import com.konfigthis.client.model.StatsSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticApi
 */
@Disabled
public class StatisticApiTest {

    private static StatisticApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new StatisticApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchPostTest() throws ApiException {
        List<StatUpdateRequest> updates = null;
        EmptyResponse response = api.batchPost()
                .updates(updates)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientBatchStatsTest() throws ApiException {
        String objectIds = null;
        String stats = null;
        String format = null;
        BatchReadStatsResponse response = api.getClientBatchStats()
                .objectIds(objectIds)
                .stats(stats)
                .format(format)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDataTest() throws ApiException {
        String domain = null;
        String access = null;
        String objectType = null;
        List<StatsSearchCriteria> criteria = null;
        StatsSearchResponse response = api.searchData()
                .domain(domain)
                .access(access)
                .objectType(objectType)
                .criteria(criteria)
                .execute();
        // TODO: test validations
    }

}
