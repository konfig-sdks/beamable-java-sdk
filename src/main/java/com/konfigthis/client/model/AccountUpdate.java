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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * AccountUpdate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountUpdate {
  public static final String SERIALIZED_NAME_THIRD_PARTY = "thirdParty";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY)
  private String thirdParty;

  public static final String SERIALIZED_NAME_HAS_THIRD_PARTY_TOKEN = "hasThirdPartyToken";
  @SerializedName(SERIALIZED_NAME_HAS_THIRD_PARTY_TOKEN)
  private Boolean hasThirdPartyToken;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_GAMER_TAG_ASSOC = "gamerTagAssoc";
  @SerializedName(SERIALIZED_NAME_GAMER_TAG_ASSOC)
  private GamerTagAssociation gamerTagAssoc;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public AccountUpdate() {
  }

  public AccountUpdate thirdParty(String thirdParty) {
    
    
    
    
    this.thirdParty = thirdParty;
    return this;
  }

   /**
   * Get thirdParty
   * @return thirdParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThirdParty() {
    return thirdParty;
  }


  public void setThirdParty(String thirdParty) {
    
    
    
    this.thirdParty = thirdParty;
  }


  public AccountUpdate hasThirdPartyToken(Boolean hasThirdPartyToken) {
    
    
    
    
    this.hasThirdPartyToken = hasThirdPartyToken;
    return this;
  }

   /**
   * Get hasThirdPartyToken
   * @return hasThirdPartyToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasThirdPartyToken() {
    return hasThirdPartyToken;
  }


  public void setHasThirdPartyToken(Boolean hasThirdPartyToken) {
    
    
    
    this.hasThirdPartyToken = hasThirdPartyToken;
  }


  public AccountUpdate country(String country) {
    
    
    
    
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


  public AccountUpdate language(String language) {
    
    
    
    
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


  public AccountUpdate gamerTagAssoc(GamerTagAssociation gamerTagAssoc) {
    
    
    
    
    this.gamerTagAssoc = gamerTagAssoc;
    return this;
  }

   /**
   * Get gamerTagAssoc
   * @return gamerTagAssoc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GamerTagAssociation getGamerTagAssoc() {
    return gamerTagAssoc;
  }


  public void setGamerTagAssoc(GamerTagAssociation gamerTagAssoc) {
    
    
    
    this.gamerTagAssoc = gamerTagAssoc;
  }


  public AccountUpdate token(String token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    
    
    
    this.token = token;
  }


  public AccountUpdate deviceId(String deviceId) {
    
    
    
    
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


  public AccountUpdate userName(String userName) {
    
    
    
    
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
   * @return the AccountUpdate instance itself
   */
  public AccountUpdate putAdditionalProperty(String key, Object value) {
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
    AccountUpdate accountUpdate = (AccountUpdate) o;
    return Objects.equals(this.thirdParty, accountUpdate.thirdParty) &&
        Objects.equals(this.hasThirdPartyToken, accountUpdate.hasThirdPartyToken) &&
        Objects.equals(this.country, accountUpdate.country) &&
        Objects.equals(this.language, accountUpdate.language) &&
        Objects.equals(this.gamerTagAssoc, accountUpdate.gamerTagAssoc) &&
        Objects.equals(this.token, accountUpdate.token) &&
        Objects.equals(this.deviceId, accountUpdate.deviceId) &&
        Objects.equals(this.userName, accountUpdate.userName)&&
        Objects.equals(this.additionalProperties, accountUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdParty, hasThirdPartyToken, country, language, gamerTagAssoc, token, deviceId, userName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdate {\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    hasThirdPartyToken: ").append(toIndentedString(hasThirdPartyToken)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    gamerTagAssoc: ").append(toIndentedString(gamerTagAssoc)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("thirdParty");
    openapiFields.add("hasThirdPartyToken");
    openapiFields.add("country");
    openapiFields.add("language");
    openapiFields.add("gamerTagAssoc");
    openapiFields.add("token");
    openapiFields.add("deviceId");
    openapiFields.add("userName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hasThirdPartyToken");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountUpdate is not found in the empty JSON string", AccountUpdate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountUpdate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("thirdParty") != null && !jsonObj.get("thirdParty").isJsonNull()) && !jsonObj.get("thirdParty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdParty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdParty").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field `gamerTagAssoc`
      if (jsonObj.get("gamerTagAssoc") != null && !jsonObj.get("gamerTagAssoc").isJsonNull()) {
        GamerTagAssociation.validateJsonObject(jsonObj.getAsJsonObject("gamerTagAssoc"));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountUpdate>() {
           @Override
           public void write(JsonWriter out, AccountUpdate value) throws IOException {
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
           public AccountUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountUpdate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountUpdate
  * @throws IOException if the JSON string is invalid with respect to AccountUpdate
  */
  public static AccountUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountUpdate.class);
  }

 /**
  * Convert an instance of AccountUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
