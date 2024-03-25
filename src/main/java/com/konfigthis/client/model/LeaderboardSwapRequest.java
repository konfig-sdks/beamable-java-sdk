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
 * LeaderboardSwapRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeaderboardSwapRequest {
  public static final String SERIALIZED_NAME_WINNER_ID = "winnerId";
  @SerializedName(SERIALIZED_NAME_WINNER_ID)
  private Integer winnerId;

  public static final String SERIALIZED_NAME_LOSER_ID = "loserId";
  @SerializedName(SERIALIZED_NAME_LOSER_ID)
  private Integer loserId;

  public static final String SERIALIZED_NAME_SWAP_BASE = "swapBase";
  @SerializedName(SERIALIZED_NAME_SWAP_BASE)
  private Integer swapBase;

  public static final String SERIALIZED_NAME_DELTA = "delta";
  @SerializedName(SERIALIZED_NAME_DELTA)
  private Integer delta;

  public LeaderboardSwapRequest() {
  }

  public LeaderboardSwapRequest winnerId(Integer winnerId) {
    
    
    
    
    this.winnerId = winnerId;
    return this;
  }

   /**
   * Get winnerId
   * @return winnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWinnerId() {
    return winnerId;
  }


  public void setWinnerId(Integer winnerId) {
    
    
    
    this.winnerId = winnerId;
  }


  public LeaderboardSwapRequest loserId(Integer loserId) {
    
    
    
    
    this.loserId = loserId;
    return this;
  }

   /**
   * Get loserId
   * @return loserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLoserId() {
    return loserId;
  }


  public void setLoserId(Integer loserId) {
    
    
    
    this.loserId = loserId;
  }


  public LeaderboardSwapRequest swapBase(Integer swapBase) {
    
    
    
    
    this.swapBase = swapBase;
    return this;
  }

   /**
   * Get swapBase
   * @return swapBase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSwapBase() {
    return swapBase;
  }


  public void setSwapBase(Integer swapBase) {
    
    
    
    this.swapBase = swapBase;
  }


  public LeaderboardSwapRequest delta(Integer delta) {
    
    
    
    
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDelta() {
    return delta;
  }


  public void setDelta(Integer delta) {
    
    
    
    this.delta = delta;
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
   * @return the LeaderboardSwapRequest instance itself
   */
  public LeaderboardSwapRequest putAdditionalProperty(String key, Object value) {
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
    LeaderboardSwapRequest leaderboardSwapRequest = (LeaderboardSwapRequest) o;
    return Objects.equals(this.winnerId, leaderboardSwapRequest.winnerId) &&
        Objects.equals(this.loserId, leaderboardSwapRequest.loserId) &&
        Objects.equals(this.swapBase, leaderboardSwapRequest.swapBase) &&
        Objects.equals(this.delta, leaderboardSwapRequest.delta)&&
        Objects.equals(this.additionalProperties, leaderboardSwapRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winnerId, loserId, swapBase, delta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardSwapRequest {\n");
    sb.append("    winnerId: ").append(toIndentedString(winnerId)).append("\n");
    sb.append("    loserId: ").append(toIndentedString(loserId)).append("\n");
    sb.append("    swapBase: ").append(toIndentedString(swapBase)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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
    openapiFields.add("winnerId");
    openapiFields.add("loserId");
    openapiFields.add("swapBase");
    openapiFields.add("delta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("swapBase");
    openapiRequiredFields.add("delta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeaderboardSwapRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeaderboardSwapRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaderboardSwapRequest is not found in the empty JSON string", LeaderboardSwapRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LeaderboardSwapRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaderboardSwapRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaderboardSwapRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaderboardSwapRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaderboardSwapRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaderboardSwapRequest>() {
           @Override
           public void write(JsonWriter out, LeaderboardSwapRequest value) throws IOException {
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
           public LeaderboardSwapRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeaderboardSwapRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LeaderboardSwapRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeaderboardSwapRequest
  * @throws IOException if the JSON string is invalid with respect to LeaderboardSwapRequest
  */
  public static LeaderboardSwapRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaderboardSwapRequest.class);
  }

 /**
  * Convert an instance of LeaderboardSwapRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
