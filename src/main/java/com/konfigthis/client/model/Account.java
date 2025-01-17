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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.GamerTagAssociation;
import com.konfigthis.client.model.InFlightMessage;
import com.konfigthis.client.model.RoleMapping;
import com.konfigthis.client.model.ThirdPartyAssociation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Account
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Account {
  public static final String SERIALIZED_NAME_IN_FLIGHT = "inFlight";
  @SerializedName(SERIALIZED_NAME_IN_FLIGHT)
  private List<InFlightMessage> inFlight = null;

  public static final String SERIALIZED_NAME_CREATED_TIME_MILLIS = "createdTimeMillis";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME_MILLIS)
  private Long createdTimeMillis;

  public static final String SERIALIZED_NAME_REALM_ID = "realmId";
  @SerializedName(SERIALIZED_NAME_REALM_ID)
  private String realmId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLE_STRING = "roleString";
  @SerializedName(SERIALIZED_NAME_ROLE_STRING)
  private String roleString;

  public static final String SERIALIZED_NAME_DEVICE_IDS = "deviceIds";
  @SerializedName(SERIALIZED_NAME_DEVICE_IDS)
  private List<String> deviceIds = null;

  public static final String SERIALIZED_NAME_PRIVILEGED_ACCOUNT = "privilegedAccount";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED_ACCOUNT)
  private Boolean privilegedAccount;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_WAS_MIGRATED = "wasMigrated";
  @SerializedName(SERIALIZED_NAME_WAS_MIGRATED)
  private Boolean wasMigrated;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_GAMER_TAGS = "gamerTags";
  @SerializedName(SERIALIZED_NAME_GAMER_TAGS)
  private List<GamerTagAssociation> gamerTags = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RoleMapping> roles = null;

  public static final String SERIALIZED_NAME_UPDATED_TIME_MILLIS = "updatedTimeMillis";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME_MILLIS)
  private Long updatedTimeMillis;

  public static final String SERIALIZED_NAME_THIRD_PARTIES = "thirdParties";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTIES)
  private List<ThirdPartyAssociation> thirdParties = null;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_HEARTBEAT = "heartbeat";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT)
  private Long heartbeat;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<String> projects = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public Account() {
  }

  public Account inFlight(List<InFlightMessage> inFlight) {
    
    
    
    
    this.inFlight = inFlight;
    return this;
  }

  public Account addInFlightItem(InFlightMessage inFlightItem) {
    if (this.inFlight == null) {
      this.inFlight = new ArrayList<>();
    }
    this.inFlight.add(inFlightItem);
    return this;
  }

   /**
   * Get inFlight
   * @return inFlight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InFlightMessage> getInFlight() {
    return inFlight;
  }


  public void setInFlight(List<InFlightMessage> inFlight) {
    
    
    
    this.inFlight = inFlight;
  }


  public Account createdTimeMillis(Long createdTimeMillis) {
    
    
    
    
    this.createdTimeMillis = createdTimeMillis;
    return this;
  }

   /**
   * Get createdTimeMillis
   * @return createdTimeMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreatedTimeMillis() {
    return createdTimeMillis;
  }


  public void setCreatedTimeMillis(Long createdTimeMillis) {
    
    
    
    this.createdTimeMillis = createdTimeMillis;
  }


  public Account realmId(String realmId) {
    
    
    
    
    this.realmId = realmId;
    return this;
  }

   /**
   * Get realmId
   * @return realmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRealmId() {
    return realmId;
  }


  public void setRealmId(String realmId) {
    
    
    
    this.realmId = realmId;
  }


  public Account email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public Account roleString(String roleString) {
    
    
    
    
    this.roleString = roleString;
    return this;
  }

   /**
   * Get roleString
   * @return roleString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleString() {
    return roleString;
  }


  public void setRoleString(String roleString) {
    
    
    
    this.roleString = roleString;
  }


  public Account deviceIds(List<String> deviceIds) {
    
    
    
    
    this.deviceIds = deviceIds;
    return this;
  }

  public Account addDeviceIdsItem(String deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeviceIds() {
    return deviceIds;
  }


  public void setDeviceIds(List<String> deviceIds) {
    
    
    
    this.deviceIds = deviceIds;
  }


  public Account privilegedAccount(Boolean privilegedAccount) {
    
    
    
    
    this.privilegedAccount = privilegedAccount;
    return this;
  }

   /**
   * Get privilegedAccount
   * @return privilegedAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrivilegedAccount() {
    return privilegedAccount;
  }


  public void setPrivilegedAccount(Boolean privilegedAccount) {
    
    
    
    this.privilegedAccount = privilegedAccount;
  }


  public Account country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Account wasMigrated(Boolean wasMigrated) {
    
    
    
    
    this.wasMigrated = wasMigrated;
    return this;
  }

   /**
   * Get wasMigrated
   * @return wasMigrated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWasMigrated() {
    return wasMigrated;
  }


  public void setWasMigrated(Boolean wasMigrated) {
    
    
    
    this.wasMigrated = wasMigrated;
  }


  public Account id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public Account gamerTags(List<GamerTagAssociation> gamerTags) {
    
    
    
    
    this.gamerTags = gamerTags;
    return this;
  }

  public Account addGamerTagsItem(GamerTagAssociation gamerTagsItem) {
    if (this.gamerTags == null) {
      this.gamerTags = new ArrayList<>();
    }
    this.gamerTags.add(gamerTagsItem);
    return this;
  }

   /**
   * Get gamerTags
   * @return gamerTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GamerTagAssociation> getGamerTags() {
    return gamerTags;
  }


  public void setGamerTags(List<GamerTagAssociation> gamerTags) {
    
    
    
    this.gamerTags = gamerTags;
  }


  public Account language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public Account roles(List<RoleMapping> roles) {
    
    
    
    
    this.roles = roles;
    return this;
  }

  public Account addRolesItem(RoleMapping rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleMapping> getRoles() {
    return roles;
  }


  public void setRoles(List<RoleMapping> roles) {
    
    
    
    this.roles = roles;
  }


  public Account updatedTimeMillis(Long updatedTimeMillis) {
    
    
    
    
    this.updatedTimeMillis = updatedTimeMillis;
    return this;
  }

   /**
   * Get updatedTimeMillis
   * @return updatedTimeMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUpdatedTimeMillis() {
    return updatedTimeMillis;
  }


  public void setUpdatedTimeMillis(Long updatedTimeMillis) {
    
    
    
    this.updatedTimeMillis = updatedTimeMillis;
  }


  public Account thirdParties(List<ThirdPartyAssociation> thirdParties) {
    
    
    
    
    this.thirdParties = thirdParties;
    return this;
  }

  public Account addThirdPartiesItem(ThirdPartyAssociation thirdPartiesItem) {
    if (this.thirdParties == null) {
      this.thirdParties = new ArrayList<>();
    }
    this.thirdParties.add(thirdPartiesItem);
    return this;
  }

   /**
   * Get thirdParties
   * @return thirdParties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ThirdPartyAssociation> getThirdParties() {
    return thirdParties;
  }


  public void setThirdParties(List<ThirdPartyAssociation> thirdParties) {
    
    
    
    this.thirdParties = thirdParties;
  }


  public Account deviceId(String deviceId) {
    
    
    
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    
    
    
    this.deviceId = deviceId;
  }


  public Account userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public Account heartbeat(Long heartbeat) {
    
    
    
    
    this.heartbeat = heartbeat;
    return this;
  }

   /**
   * Get heartbeat
   * @return heartbeat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHeartbeat() {
    return heartbeat;
  }


  public void setHeartbeat(Long heartbeat) {
    
    
    
    this.heartbeat = heartbeat;
  }


  public Account password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public Account user(String user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    
    
    
    this.user = user;
  }


  public Account projects(List<String> projects) {
    
    
    
    
    this.projects = projects;
    return this;
  }

  public Account addProjectsItem(String projectsItem) {
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getProjects() {
    return projects;
  }


  public void setProjects(List<String> projects) {
    
    
    
    this.projects = projects;
  }


  public Account created(Long created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    
    
    
    this.created = created;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.inFlight, account.inFlight) &&
        Objects.equals(this.createdTimeMillis, account.createdTimeMillis) &&
        Objects.equals(this.realmId, account.realmId) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.roleString, account.roleString) &&
        Objects.equals(this.deviceIds, account.deviceIds) &&
        Objects.equals(this.privilegedAccount, account.privilegedAccount) &&
        Objects.equals(this.country, account.country) &&
        Objects.equals(this.wasMigrated, account.wasMigrated) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.gamerTags, account.gamerTags) &&
        Objects.equals(this.language, account.language) &&
        Objects.equals(this.roles, account.roles) &&
        Objects.equals(this.updatedTimeMillis, account.updatedTimeMillis) &&
        Objects.equals(this.thirdParties, account.thirdParties) &&
        Objects.equals(this.deviceId, account.deviceId) &&
        Objects.equals(this.userName, account.userName) &&
        Objects.equals(this.heartbeat, account.heartbeat) &&
        Objects.equals(this.password, account.password) &&
        Objects.equals(this.user, account.user) &&
        Objects.equals(this.projects, account.projects) &&
        Objects.equals(this.created, account.created)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inFlight, createdTimeMillis, realmId, email, roleString, deviceIds, privilegedAccount, country, wasMigrated, id, gamerTags, language, roles, updatedTimeMillis, thirdParties, deviceId, userName, heartbeat, password, user, projects, created, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    inFlight: ").append(toIndentedString(inFlight)).append("\n");
    sb.append("    createdTimeMillis: ").append(toIndentedString(createdTimeMillis)).append("\n");
    sb.append("    realmId: ").append(toIndentedString(realmId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roleString: ").append(toIndentedString(roleString)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    privilegedAccount: ").append(toIndentedString(privilegedAccount)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    wasMigrated: ").append(toIndentedString(wasMigrated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gamerTags: ").append(toIndentedString(gamerTags)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    updatedTimeMillis: ").append(toIndentedString(updatedTimeMillis)).append("\n");
    sb.append("    thirdParties: ").append(toIndentedString(thirdParties)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("inFlight");
    openapiFields.add("createdTimeMillis");
    openapiFields.add("realmId");
    openapiFields.add("email");
    openapiFields.add("roleString");
    openapiFields.add("deviceIds");
    openapiFields.add("privilegedAccount");
    openapiFields.add("country");
    openapiFields.add("wasMigrated");
    openapiFields.add("id");
    openapiFields.add("gamerTags");
    openapiFields.add("language");
    openapiFields.add("roles");
    openapiFields.add("updatedTimeMillis");
    openapiFields.add("thirdParties");
    openapiFields.add("deviceId");
    openapiFields.add("userName");
    openapiFields.add("heartbeat");
    openapiFields.add("password");
    openapiFields.add("user");
    openapiFields.add("projects");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("projects");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("inFlight") != null && !jsonObj.get("inFlight").isJsonNull()) {
        JsonArray jsonArrayinFlight = jsonObj.getAsJsonArray("inFlight");
        if (jsonArrayinFlight != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inFlight").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inFlight` to be an array in the JSON string but got `%s`", jsonObj.get("inFlight").toString()));
          }

          // validate the optional field `inFlight` (array)
          for (int i = 0; i < jsonArrayinFlight.size(); i++) {
            InFlightMessage.validateJsonObject(jsonArrayinFlight.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("realmId") != null && !jsonObj.get("realmId").isJsonNull()) && !jsonObj.get("realmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realmId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("roleString") != null && !jsonObj.get("roleString").isJsonNull()) && !jsonObj.get("roleString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleString").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("deviceIds") != null && !jsonObj.get("deviceIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceIds` to be an array in the JSON string but got `%s`", jsonObj.get("deviceIds").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("gamerTags") != null && !jsonObj.get("gamerTags").isJsonNull()) {
        JsonArray jsonArraygamerTags = jsonObj.getAsJsonArray("gamerTags");
        if (jsonArraygamerTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gamerTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gamerTags` to be an array in the JSON string but got `%s`", jsonObj.get("gamerTags").toString()));
          }

          // validate the optional field `gamerTags` (array)
          for (int i = 0; i < jsonArraygamerTags.size(); i++) {
            GamerTagAssociation.validateJsonObject(jsonArraygamerTags.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            RoleMapping.validateJsonObject(jsonArrayroles.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("thirdParties") != null && !jsonObj.get("thirdParties").isJsonNull()) {
        JsonArray jsonArraythirdParties = jsonObj.getAsJsonArray("thirdParties");
        if (jsonArraythirdParties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("thirdParties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `thirdParties` to be an array in the JSON string but got `%s`", jsonObj.get("thirdParties").toString()));
          }

          // validate the optional field `thirdParties` (array)
          for (int i = 0; i < jsonArraythirdParties.size(); i++) {
            ThirdPartyAssociation.validateJsonObject(jsonArraythirdParties.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("projects") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("projects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

