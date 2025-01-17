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
import com.konfigthis.client.model.CreateRoomRequest;
import com.konfigthis.client.model.GameResultsMessage;
import com.konfigthis.client.model.GetGameResponse;
import com.konfigthis.client.model.NewGameRequest;
import com.konfigthis.client.model.NotificationRequest;
import com.konfigthis.client.model.NotificationRequestData;
import com.konfigthis.client.model.PlayerResult;
import com.konfigthis.client.model.ProjectView;
import com.konfigthis.client.model.ResultsRequest;
import com.konfigthis.client.model.SimEvent;
import com.konfigthis.client.model.SyncReq;
import com.konfigthis.client.model.SyncRsp;
import com.konfigthis.client.model.UpdateGameHierarchyRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameApi
 */
@Disabled
public class GameApiTest {

    private static GameApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GameApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRealmTest() throws ApiException {
        String gameName = null;
        CommonResponse response = api.createRealm(gameName)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRealmsTest() throws ApiException {
        String rootPID = null;
        GetGameResponse response = api.getRealms(rootPID)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRealmsGamesTest() throws ApiException {
        GetGameResponse response = api.getRealmsGames()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postNotificationTest() throws ApiException {
        NotificationRequestData payload = null;
        Integer dbid = null;
        String customChannelSuffix = null;
        List<Integer> dbids = null;
        CommonResponse response = api.postNotification()
                .payload(payload)
                .dbid(dbid)
                .customChannelSuffix(customChannelSuffix)
                .dbids(dbids)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void relayObjectPostTest() throws ApiException {
        Boolean keepSubscribed = null;
        String objectId = null;
        String roomName = null;
        List<Integer> players = null;
        String gameType = null;
        List<Integer> dbids = null;
        CommonResponse response = api.relayObjectPost(keepSubscribed, objectId)
                .roomName(roomName)
                .players(players)
                .gameType(gameType)
                .dbids(dbids)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void relayObjectResultsTest() throws ApiException {
        String objectId = null;
        List<PlayerResult> results = null;
        GameResultsMessage response = api.relayObjectResults(objectId)
                .results(results)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void relayObjectSyncTest() throws ApiException {
        Integer t = null;
        String objectId = null;
        List<SimEvent> events = null;
        SyncRsp response = api.relayObjectSync(t, objectId)
                .events(events)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRealmTest() throws ApiException {
        String rootPID = null;
        List<ProjectView> projects = null;
        CommonResponse response = api.updateRealm(rootPID, projects)
                .execute();
        // TODO: test validations
    }

}
