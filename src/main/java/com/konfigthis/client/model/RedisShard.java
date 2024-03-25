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
 * RedisShard
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RedisShard {
  public static final String SERIALIZED_NAME_SHARD_ID = "shardId";
  @SerializedName(SERIALIZED_NAME_SHARD_ID)
  private Integer shardId;

  public static final String SERIALIZED_NAME_MASTER_HOST = "masterHost";
  @SerializedName(SERIALIZED_NAME_MASTER_HOST)
  private String masterHost;

  public static final String SERIALIZED_NAME_SLAVE_HOSTS = "slaveHosts";
  @SerializedName(SERIALIZED_NAME_SLAVE_HOSTS)
  private List<String> slaveHosts = new ArrayList<>();

  public RedisShard() {
  }

  public RedisShard shardId(Integer shardId) {
    
    
    
    
    this.shardId = shardId;
    return this;
  }

   /**
   * Get shardId
   * @return shardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getShardId() {
    return shardId;
  }


  public void setShardId(Integer shardId) {
    
    
    
    this.shardId = shardId;
  }


  public RedisShard masterHost(String masterHost) {
    
    
    
    
    this.masterHost = masterHost;
    return this;
  }

   /**
   * Get masterHost
   * @return masterHost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMasterHost() {
    return masterHost;
  }


  public void setMasterHost(String masterHost) {
    
    
    
    this.masterHost = masterHost;
  }


  public RedisShard slaveHosts(List<String> slaveHosts) {
    
    
    
    
    this.slaveHosts = slaveHosts;
    return this;
  }

  public RedisShard addSlaveHostsItem(String slaveHostsItem) {
    this.slaveHosts.add(slaveHostsItem);
    return this;
  }

   /**
   * Get slaveHosts
   * @return slaveHosts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getSlaveHosts() {
    return slaveHosts;
  }


  public void setSlaveHosts(List<String> slaveHosts) {
    
    
    
    this.slaveHosts = slaveHosts;
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
   * @return the RedisShard instance itself
   */
  public RedisShard putAdditionalProperty(String key, Object value) {
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
    RedisShard redisShard = (RedisShard) o;
    return Objects.equals(this.shardId, redisShard.shardId) &&
        Objects.equals(this.masterHost, redisShard.masterHost) &&
        Objects.equals(this.slaveHosts, redisShard.slaveHosts)&&
        Objects.equals(this.additionalProperties, redisShard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shardId, masterHost, slaveHosts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisShard {\n");
    sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
    sb.append("    masterHost: ").append(toIndentedString(masterHost)).append("\n");
    sb.append("    slaveHosts: ").append(toIndentedString(slaveHosts)).append("\n");
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
    openapiFields.add("shardId");
    openapiFields.add("masterHost");
    openapiFields.add("slaveHosts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shardId");
    openapiRequiredFields.add("masterHost");
    openapiRequiredFields.add("slaveHosts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RedisShard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RedisShard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedisShard is not found in the empty JSON string", RedisShard.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RedisShard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("masterHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masterHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masterHost").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("slaveHosts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("slaveHosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `slaveHosts` to be an array in the JSON string but got `%s`", jsonObj.get("slaveHosts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedisShard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedisShard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedisShard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedisShard.class));

       return (TypeAdapter<T>) new TypeAdapter<RedisShard>() {
           @Override
           public void write(JsonWriter out, RedisShard value) throws IOException {
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
           public RedisShard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RedisShard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedisShard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedisShard
  * @throws IOException if the JSON string is invalid with respect to RedisShard
  */
  public static RedisShard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedisShard.class);
  }

 /**
  * Convert an instance of RedisShard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

