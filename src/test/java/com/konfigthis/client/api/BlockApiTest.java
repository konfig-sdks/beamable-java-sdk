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
import com.konfigthis.client.model.FriendshipStatus;
import com.konfigthis.client.model.PlayerIdRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Disabled
public class BlockApiTest {

    private static BlockApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BlockApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSocialBlockedTest() throws ApiException {
        String playerId = null;
        FriendshipStatus response = api.userSocialBlocked()
                .playerId(playerId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSocialUnblockTest() throws ApiException {
        String playerId = null;
        FriendshipStatus response = api.userSocialUnblock()
                .playerId(playerId)
                .execute();
        // TODO: test validations
    }

}
