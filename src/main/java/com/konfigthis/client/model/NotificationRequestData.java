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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * NotificationRequestData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NotificationRequestData {
  public static final String SERIALIZED_NAME_MESSAGE_PARAMS = "messageParams";
  @SerializedName(SERIALIZED_NAME_MESSAGE_PARAMS)
  private List<String> messageParams = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MESSAGE_KEY = "messageKey";
  @SerializedName(SERIALIZED_NAME_MESSAGE_KEY)
  private String messageKey;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_SHARD = "shard";
  @SerializedName(SERIALIZED_NAME_SHARD)
  private String shard;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = null;

  public static final String SERIALIZED_NAME_MESSAGE_FULL = "messageFull";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FULL)
  private String messageFull;

  public NotificationRequestData() {
  }

  public NotificationRequestData messageParams(List<String> messageParams) {
    
    
    
    
    this.messageParams = messageParams;
    return this;
  }

  public NotificationRequestData addMessageParamsItem(String messageParamsItem) {
    if (this.messageParams == null) {
      this.messageParams = new ArrayList<>();
    }
    this.messageParams.add(messageParamsItem);
    return this;
  }

   /**
   * Get messageParams
   * @return messageParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessageParams() {
    return messageParams;
  }


  public void setMessageParams(List<String> messageParams) {
    
    
    
    this.messageParams = messageParams;
  }


  public NotificationRequestData channel(String channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    
    
    
    this.channel = channel;
  }


  public NotificationRequestData messageKey(String messageKey) {
    
    
    
    
    this.messageKey = messageKey;
    return this;
  }

   /**
   * Get messageKey
   * @return messageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageKey() {
    return messageKey;
  }


  public void setMessageKey(String messageKey) {
    
    
    
    this.messageKey = messageKey;
  }


  public NotificationRequestData context(String context) {
    
    
    
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContext() {
    return context;
  }


  public void setContext(String context) {
    
    
    
    this.context = context;
  }


  public NotificationRequestData shard(String shard) {
    
    
    
    
    this.shard = shard;
    return this;
  }

   /**
   * Get shard
   * @return shard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShard() {
    return shard;
  }


  public void setShard(String shard) {
    
    
    
    this.shard = shard;
  }


  public NotificationRequestData meta(Map<String, Object> meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

  public NotificationRequestData putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
    
    
    
    this.meta = meta;
  }


  public NotificationRequestData messageFull(String messageFull) {
    
    
    
    
    this.messageFull = messageFull;
    return this;
  }

   /**
   * Get messageFull
   * @return messageFull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageFull() {
    return messageFull;
  }


  public void setMessageFull(String messageFull) {
    
    
    
    this.messageFull = messageFull;
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
   * @return the NotificationRequestData instance itself
   */
  public NotificationRequestData putAdditionalProperty(String key, Object value) {
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
    NotificationRequestData notificationRequestData = (NotificationRequestData) o;
    return Objects.equals(this.messageParams, notificationRequestData.messageParams) &&
        Objects.equals(this.channel, notificationRequestData.channel) &&
        Objects.equals(this.messageKey, notificationRequestData.messageKey) &&
        Objects.equals(this.context, notificationRequestData.context) &&
        Objects.equals(this.shard, notificationRequestData.shard) &&
        Objects.equals(this.meta, notificationRequestData.meta) &&
        Objects.equals(this.messageFull, notificationRequestData.messageFull)&&
        Objects.equals(this.additionalProperties, notificationRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageParams, channel, messageKey, context, shard, meta, messageFull, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequestData {\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    messageFull: ").append(toIndentedString(messageFull)).append("\n");
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
    openapiFields.add("messageParams");
    openapiFields.add("channel");
    openapiFields.add("messageKey");
    openapiFields.add("context");
    openapiFields.add("shard");
    openapiFields.add("meta");
    openapiFields.add("messageFull");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationRequestData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationRequestData is not found in the empty JSON string", NotificationRequestData.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("messageParams") != null && !jsonObj.get("messageParams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageParams` to be an array in the JSON string but got `%s`", jsonObj.get("messageParams").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("messageKey") != null && !jsonObj.get("messageKey").isJsonNull()) && !jsonObj.get("messageKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageKey").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("shard") != null && !jsonObj.get("shard").isJsonNull()) && !jsonObj.get("shard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shard").toString()));
      }
      if ((jsonObj.get("messageFull") != null && !jsonObj.get("messageFull").isJsonNull()) && !jsonObj.get("messageFull").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageFull` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageFull").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationRequestData>() {
           @Override
           public void write(JsonWriter out, NotificationRequestData value) throws IOException {
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
           public NotificationRequestData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NotificationRequestData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NotificationRequestData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationRequestData
  * @throws IOException if the JSON string is invalid with respect to NotificationRequestData
  */
  public static NotificationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationRequestData.class);
  }

 /**
  * Convert an instance of NotificationRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

