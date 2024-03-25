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
import com.konfigthis.client.model.EntitlementGenerator;
import com.konfigthis.client.model.PlayerReward;
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
 * CreateRedemptionDef
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateRedemptionDef {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIME_EXPIRES = "timeExpires";
  @SerializedName(SERIALIZED_NAME_TIME_EXPIRES)
  private Integer timeExpires;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private EntitlementGenerator reward;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private PlayerReward gift;

  public static final String SERIALIZED_NAME_MAX_PER_USER = "maxPerUser";
  @SerializedName(SERIALIZED_NAME_MAX_PER_USER)
  private Integer maxPerUser;

  public static final String SERIALIZED_NAME_WHITELIST = "whitelist";
  @SerializedName(SERIALIZED_NAME_WHITELIST)
  private List<Integer> whitelist = null;

  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public CreateRedemptionDef() {
  }

  public CreateRedemptionDef description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CreateRedemptionDef name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateRedemptionDef timeExpires(Integer timeExpires) {
    
    
    
    
    this.timeExpires = timeExpires;
    return this;
  }

   /**
   * Get timeExpires
   * @return timeExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeExpires() {
    return timeExpires;
  }


  public void setTimeExpires(Integer timeExpires) {
    
    
    
    this.timeExpires = timeExpires;
  }


  public CreateRedemptionDef reward(EntitlementGenerator reward) {
    
    
    
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntitlementGenerator getReward() {
    return reward;
  }


  public void setReward(EntitlementGenerator reward) {
    
    
    
    this.reward = reward;
  }


  public CreateRedemptionDef gift(PlayerReward gift) {
    
    
    
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlayerReward getGift() {
    return gift;
  }


  public void setGift(PlayerReward gift) {
    
    
    
    this.gift = gift;
  }


  public CreateRedemptionDef maxPerUser(Integer maxPerUser) {
    
    
    
    
    this.maxPerUser = maxPerUser;
    return this;
  }

   /**
   * Get maxPerUser
   * @return maxPerUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxPerUser() {
    return maxPerUser;
  }


  public void setMaxPerUser(Integer maxPerUser) {
    
    
    
    this.maxPerUser = maxPerUser;
  }


  public CreateRedemptionDef whitelist(List<Integer> whitelist) {
    
    
    
    
    this.whitelist = whitelist;
    return this;
  }

  public CreateRedemptionDef addWhitelistItem(Integer whitelistItem) {
    if (this.whitelist == null) {
      this.whitelist = new ArrayList<>();
    }
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getWhitelist() {
    return whitelist;
  }


  public void setWhitelist(List<Integer> whitelist) {
    
    
    
    this.whitelist = whitelist;
  }


  public CreateRedemptionDef classification(String classification) {
    
    
    
    
    this.classification = classification;
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassification() {
    return classification;
  }


  public void setClassification(String classification) {
    
    
    
    this.classification = classification;
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
   * @return the CreateRedemptionDef instance itself
   */
  public CreateRedemptionDef putAdditionalProperty(String key, Object value) {
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
    CreateRedemptionDef createRedemptionDef = (CreateRedemptionDef) o;
    return Objects.equals(this.description, createRedemptionDef.description) &&
        Objects.equals(this.name, createRedemptionDef.name) &&
        Objects.equals(this.timeExpires, createRedemptionDef.timeExpires) &&
        Objects.equals(this.reward, createRedemptionDef.reward) &&
        Objects.equals(this.gift, createRedemptionDef.gift) &&
        Objects.equals(this.maxPerUser, createRedemptionDef.maxPerUser) &&
        Objects.equals(this.whitelist, createRedemptionDef.whitelist) &&
        Objects.equals(this.classification, createRedemptionDef.classification)&&
        Objects.equals(this.additionalProperties, createRedemptionDef.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, timeExpires, reward, gift, maxPerUser, whitelist, classification, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRedemptionDef {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeExpires: ").append(toIndentedString(timeExpires)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    maxPerUser: ").append(toIndentedString(maxPerUser)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("timeExpires");
    openapiFields.add("reward");
    openapiFields.add("gift");
    openapiFields.add("maxPerUser");
    openapiFields.add("whitelist");
    openapiFields.add("classification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maxPerUser");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateRedemptionDef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateRedemptionDef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRedemptionDef is not found in the empty JSON string", CreateRedemptionDef.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRedemptionDef.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `reward`
      if (jsonObj.get("reward") != null && !jsonObj.get("reward").isJsonNull()) {
        EntitlementGenerator.validateJsonObject(jsonObj.getAsJsonObject("reward"));
      }
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        PlayerReward.validateJsonObject(jsonObj.getAsJsonObject("gift"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("whitelist") != null && !jsonObj.get("whitelist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `whitelist` to be an array in the JSON string but got `%s`", jsonObj.get("whitelist").toString()));
      }
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRedemptionDef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRedemptionDef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRedemptionDef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRedemptionDef.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRedemptionDef>() {
           @Override
           public void write(JsonWriter out, CreateRedemptionDef value) throws IOException {
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
           public CreateRedemptionDef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateRedemptionDef instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateRedemptionDef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRedemptionDef
  * @throws IOException if the JSON string is invalid with respect to CreateRedemptionDef
  */
  public static CreateRedemptionDef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRedemptionDef.class);
  }

 /**
  * Convert an instance of CreateRedemptionDef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
