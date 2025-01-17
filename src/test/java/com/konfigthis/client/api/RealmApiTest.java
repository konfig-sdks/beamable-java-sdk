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
import com.konfigthis.client.model.AliasAvailableResponse;
import com.konfigthis.client.model.ArchiveProjectRequest;
import com.konfigthis.client.model.CommonResponse;
import com.konfigthis.client.model.CreateProjectRequest;
import com.konfigthis.client.model.CustomerResponse;
import com.konfigthis.client.model.CustomerViewResponse;
import com.konfigthis.client.model.CustomersResponse;
import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.NewCustomerRequest;
import com.konfigthis.client.model.NewCustomerResponse;
import com.konfigthis.client.model.ProjectView;
import com.konfigthis.client.model.PromoteRealmRequest;
import com.konfigthis.client.model.PromoteRealmResponse;
import com.konfigthis.client.model.PromoteRealmResponseOld;
import com.konfigthis.client.model.RealmConfigResponse;
import com.konfigthis.client.model.RealmConfigSaveRequest;
import com.konfigthis.client.model.RenameProjectRequest;
import com.konfigthis.client.model.UnarchiveProjectRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RealmApi
 */
@Disabled
public class RealmApiTest {

    private static RealmApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RealmApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkAliasAvailableTest() throws ApiException {
        String alias = null;
        AliasAvailableResponse response = api.checkAliasAvailable(alias)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkCustomerStatusTest() throws ApiException {
        EmptyResponse response = api.checkCustomerStatus()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBeamableTest() throws ApiException {
        String name = null;
        String plan = null;
        Boolean sharded = null;
        String parent = null;
        CommonResponse response = api.createBeamable(name)
                .plan(plan)
                .sharded(sharded)
                .parent(parent)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerRealmTest() throws ApiException {
        String projectName = null;
        String email = null;
        String password = null;
        String customerName = null;
        Boolean hierarchy = null;
        String alias = null;
        NewCustomerResponse response = api.createCustomerRealm(projectName, email, password)
                .customerName(customerName)
                .hierarchy(hierarchy)
                .alias(alias)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectRealTest() throws ApiException {
        String name = null;
        String plan = null;
        Boolean sharded = null;
        String parent = null;
        CommonResponse response = api.createProjectReal(name)
                .plan(plan)
                .sharded(sharded)
                .parent(parent)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPromotionTest() throws ApiException {
        String sourcePid = null;
        List<String> promotions = null;
        List<String> contentManifestIds = null;
        PromoteRealmResponse response = api.createPromotion(sourcePid)
                .promotions(promotions)
                .contentManifestIds(contentManifestIds)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String pid = null;
        CommonResponse response = api.deleteProject(pid)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        RealmConfigResponse response = api.getConfig()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerRealmsTest() throws ApiException {
        CustomerViewResponse response = api.getCustomerRealms()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerRealms_0Test() throws ApiException {
        CustomerResponse response = api.getCustomerRealms_0()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectRealmsTest() throws ApiException {
        ProjectView response = api.getProjectRealms()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPromotionDataTest() throws ApiException {
        String sourcePid = null;
        List<String> promotions = null;
        List<String> contentManifestIds = null;
        PromoteRealmResponse response = api.getPromotionData(sourcePid)
                .promotions(promotions)
                .contentManifestIds(contentManifestIds)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCustomersRealmsTest() throws ApiException {
        CustomersResponse response = api.listCustomersRealms()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void projectPromoteTest() throws ApiException {
        String sourcePid = null;
        List<String> promotions = null;
        List<String> contentManifestIds = null;
        PromoteRealmResponseOld response = api.projectPromote(sourcePid)
                .promotions(promotions)
                .contentManifestIds(contentManifestIds)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void projectPromoteGetTest() throws ApiException {
        String sourcePid = null;
        List<String> promotions = null;
        List<String> contentManifestIds = null;
        PromoteRealmResponseOld response = api.projectPromoteGet(sourcePid)
                .promotions(promotions)
                .contentManifestIds(contentManifestIds)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renameProjectRealmsTest() throws ApiException {
        String projectId = null;
        String newName = null;
        CommonResponse response = api.renameProjectRealms(projectId, newName)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigTest() throws ApiException {
        Map<String, String> config = null;
        CommonResponse response = api.updateConfig(config)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectRealmsTest() throws ApiException {
        String projectId = null;
        CommonResponse response = api.updateProjectRealms(projectId)
                .execute();
        // TODO: test validations
    }

}
