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
import com.konfigthis.client.model.MetadataUpdate;
import com.konfigthis.client.model.ShardDef;
import com.konfigthis.client.model.ShardDeleteRequest;
import com.konfigthis.client.model.ShardListResponse;
import com.konfigthis.client.model.ShardResponse;
import com.konfigthis.client.model.ShardUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShardApi
 */
@Disabled
public class ShardApiTest {

    private static ShardApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ShardApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLegacyShardTest() throws ApiException {
        String shardId = null;
        ShardResponse response = api.deleteLegacyShard()
                .shardId(shardId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLegacyAcceptingTest() throws ApiException {
        ShardListResponse response = api.getLegacyAccepting()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLegacyDataTest() throws ApiException {
        ShardListResponse response = api.getLegacyData()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPreferredLegacyShardsTest() throws ApiException {
        String preference = null;
        ShardResponse response = api.getPreferredLegacyShards()
                .preference(preference)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postLegacyShardTest() throws ApiException {
        String shardId = null;
        String uri = null;
        Map<String, Object> metadata = null;
        ShardResponse response = api.postLegacyShard()
                .shardId(shardId)
                .uri(uri)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLegacyShardDataTest() throws ApiException {
        String shardId = null;
        String uri = null;
        MetadataUpdate metadata = null;
        ShardResponse response = api.updateLegacyShardData()
                .shardId(shardId)
                .uri(uri)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

}
