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
import com.konfigthis.client.model.Account;
import com.konfigthis.client.model.AccountAvailableResponse;
import com.konfigthis.client.model.AccountPersonallyIdentifiableInformationResponse;
import com.konfigthis.client.model.AccountPlayerView;
import com.konfigthis.client.model.AccountPortalView;
import com.konfigthis.client.model.AccountRegistration;
import com.konfigthis.client.model.AccountSearchResponse;
import com.konfigthis.client.model.AccountUpdate;
import com.konfigthis.client.model.AddAccountRequest;
import com.konfigthis.client.model.AdminUserRolesView;
import com.konfigthis.client.model.AvailableRolesResponse;
import com.konfigthis.client.model.DeleteDevicesRequest;
import com.konfigthis.client.model.DeleteThirdPartyAssociation;
import com.konfigthis.client.model.EmptyResponse;
import com.konfigthis.client.model.GamerTagAssociation;
import com.konfigthis.client.model.GetAdminsResponse;
import com.konfigthis.client.model.PasswordUpdateConfirmation;
import com.konfigthis.client.model.PasswordUpdateRequest;
import com.konfigthis.client.model.ThirdPartyAssociation;
import com.konfigthis.client.model.ThirdPartyAvailableRequest;
import com.konfigthis.client.model.TransferThirdPartyAssociation;
import com.konfigthis.client.model.UpdateRole;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Disabled
public class AccountApiTest {

    private static AccountApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccountApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkAvailabilityTest() throws ApiException {
        String deviceId = null;
        AccountAvailableResponse response = api.checkAvailability(deviceId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkAvailability_0Test() throws ApiException {
        String email = null;
        AccountAvailableResponse response = api.checkAvailability_0(email)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkThirdPartyAvailabilityTest() throws ApiException {
        String thirdParty = null;
        String token = null;
        AccountAvailableResponse response = api.checkThirdPartyAvailability(thirdParty, token)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAdminUserTest() throws ApiException {
        String email = null;
        String role = null;
        AccountPortalView response = api.createAdminUser(email)
                .role(role)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAdminScopeTest() throws ApiException {
        String objectId = null;
        EmptyResponse response = api.deleteAdminScope(objectId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThirdPartyTest() throws ApiException {
        String thirdParty = null;
        String token = null;
        AccountPlayerView response = api.deleteThirdParty(thirdParty, token)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThirdPartyAdminTest() throws ApiException {
        String objectId = null;
        String thirdParty = null;
        String userAppId = null;
        EmptyResponse response = api.deleteThirdPartyAdmin(objectId)
                .thirdParty(thirdParty)
                .userAppId(userAppId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAccountsTest() throws ApiException {
        String query = null;
        Account response = api.findAccounts(query)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdminUsersTest() throws ApiException {
        GetAdminsResponse response = api.getAdminUsers()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        AccountPortalView response = api.getDetails()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectAvailableRolesTest() throws ApiException {
        String objectId = null;
        AvailableRolesResponse response = api.getObjectAvailableRoles(objectId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonallyIdentifiableInformationTest() throws ApiException {
        String query = null;
        AccountPersonallyIdentifiableInformationResponse response = api.getPersonallyIdentifiableInformation(query)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserInfoTest() throws ApiException {
        AccountPlayerView response = api.getUserInfo()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRolesTest() throws ApiException {
        AdminUserRolesView response = api.listRoles()
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerNewAccountTest() throws ApiException {
        String email = null;
        String password = null;
        AccountPlayerView response = api.registerNewAccount(email, password)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAdminForgetTest() throws ApiException {
        String objectId = null;
        Account response = api.removeAdminForget(objectId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeDeviceTest() throws ApiException {
        List<String> deviceIds = null;
        AccountPlayerView response = api.removeDevice()
                .deviceIds(deviceIds)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRoleTest() throws ApiException {
        String objectId = null;
        EmptyResponse response = api.removeRole(objectId)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAccountsTest() throws ApiException {
        String query = null;
        Integer page = null;
        Integer pagesize = null;
        AccountSearchResponse response = api.searchAccounts(query, page, pagesize)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAccountInfoTest() throws ApiException {
        Boolean hasThirdPartyToken = null;
        String thirdParty = null;
        String country = null;
        String language = null;
        GamerTagAssociation gamerTagAssoc = null;
        String token = null;
        String deviceId = null;
        String userName = null;
        AccountPlayerView response = api.updateAccountInfo(hasThirdPartyToken)
                .thirdParty(thirdParty)
                .country(country)
                .language(language)
                .gamerTagAssoc(gamerTagAssoc)
                .token(token)
                .deviceId(deviceId)
                .userName(userName)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdminScopeTest() throws ApiException {
        String objectId = null;
        String cid = null;
        String realm = null;
        String role = null;
        EmptyResponse response = api.updateAdminScope(objectId)
                .cid(cid)
                .realm(realm)
                .role(role)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePasswordConfirmationTest() throws ApiException {
        String code = null;
        String newPassword = null;
        String email = null;
        EmptyResponse response = api.updatePasswordConfirmation(code, newPassword)
                .email(email)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePasswordInitTest() throws ApiException {
        String email = null;
        String codeType = null;
        EmptyResponse response = api.updatePasswordInit(email)
                .codeType(codeType)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String objectId = null;
        String cid = null;
        String realm = null;
        String role = null;
        EmptyResponse response = api.updateRole(objectId)
                .cid(cid)
                .realm(realm)
                .role(role)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateThirdPartyAdminTest() throws ApiException {
        Integer fromAccountId = null;
        String objectId = null;
        ThirdPartyAssociation thirdParty = null;
        EmptyResponse response = api.updateThirdPartyAdmin(fromAccountId, objectId)
                .thirdParty(thirdParty)
                .execute();
        // TODO: test validations
    }

}
