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
 * ReportPurchaseRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportPurchaseRequest {
  public static final String SERIALIZED_NAME_LISTING_ID = "listingId";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private String listingId;

  public static final String SERIALIZED_NAME_FREE = "free";
  @SerializedName(SERIALIZED_NAME_FREE)
  private Boolean free;

  public ReportPurchaseRequest() {
  }

  public ReportPurchaseRequest listingId(String listingId) {
    
    
    
    
    this.listingId = listingId;
    return this;
  }

   /**
   * Get listingId
   * @return listingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListingId() {
    return listingId;
  }


  public void setListingId(String listingId) {
    
    
    
    this.listingId = listingId;
  }


  public ReportPurchaseRequest free(Boolean free) {
    
    
    
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFree() {
    return free;
  }


  public void setFree(Boolean free) {
    
    
    
    this.free = free;
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
   * @return the ReportPurchaseRequest instance itself
   */
  public ReportPurchaseRequest putAdditionalProperty(String key, Object value) {
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
    ReportPurchaseRequest reportPurchaseRequest = (ReportPurchaseRequest) o;
    return Objects.equals(this.listingId, reportPurchaseRequest.listingId) &&
        Objects.equals(this.free, reportPurchaseRequest.free)&&
        Objects.equals(this.additionalProperties, reportPurchaseRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, free, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportPurchaseRequest {\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
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
    openapiFields.add("listingId");
    openapiFields.add("free");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportPurchaseRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportPurchaseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportPurchaseRequest is not found in the empty JSON string", ReportPurchaseRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("listingId") != null && !jsonObj.get("listingId").isJsonNull()) && !jsonObj.get("listingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listingId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportPurchaseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportPurchaseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportPurchaseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportPurchaseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportPurchaseRequest>() {
           @Override
           public void write(JsonWriter out, ReportPurchaseRequest value) throws IOException {
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
           public ReportPurchaseRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportPurchaseRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportPurchaseRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportPurchaseRequest
  * @throws IOException if the JSON string is invalid with respect to ReportPurchaseRequest
  */
  public static ReportPurchaseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportPurchaseRequest.class);
  }

 /**
  * Convert an instance of ReportPurchaseRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
