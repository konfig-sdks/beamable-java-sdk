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
import com.konfigthis.client.model.SessionLanguageContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
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
 * StartSessionRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StartSessionRequest {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_CUSTOM_PARAMS = "customParams";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMS)
  private Map<String, Object> customParams = null;

  public static final String SERIALIZED_NAME_SHARD = "shard";
  @SerializedName(SERIALIZED_NAME_SHARD)
  private String shard;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DEVICE_PARAMS = "deviceParams";
  @SerializedName(SERIALIZED_NAME_DEVICE_PARAMS)
  private Map<String, Object> deviceParams = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private SessionLanguageContext language;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_GAMER = "gamer";
  @SerializedName(SERIALIZED_NAME_GAMER)
  private Integer gamer;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public StartSessionRequest() {
  }

  public StartSessionRequest source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public StartSessionRequest customParams(Map<String, Object> customParams) {
    
    
    
    
    this.customParams = customParams;
    return this;
  }

  public StartSessionRequest putCustomParamsItem(String key, Object customParamsItem) {
    if (this.customParams == null) {
      this.customParams = new HashMap<>();
    }
    this.customParams.put(key, customParamsItem);
    return this;
  }

   /**
   * Get customParams
   * @return customParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomParams() {
    return customParams;
  }


  public void setCustomParams(Map<String, Object> customParams) {
    
    
    
    this.customParams = customParams;
  }


  public StartSessionRequest shard(String shard) {
    
    
    
    
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


  public StartSessionRequest locale(String locale) {
    
    
    
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    
    
    
    this.locale = locale;
  }


  public StartSessionRequest deviceParams(Map<String, Object> deviceParams) {
    
    
    
    
    this.deviceParams = deviceParams;
    return this;
  }

  public StartSessionRequest putDeviceParamsItem(String key, Object deviceParamsItem) {
    if (this.deviceParams == null) {
      this.deviceParams = new HashMap<>();
    }
    this.deviceParams.put(key, deviceParamsItem);
    return this;
  }

   /**
   * Get deviceParams
   * @return deviceParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getDeviceParams() {
    return deviceParams;
  }


  public void setDeviceParams(Map<String, Object> deviceParams) {
    
    
    
    this.deviceParams = deviceParams;
  }


  public StartSessionRequest language(SessionLanguageContext language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SessionLanguageContext getLanguage() {
    return language;
  }


  public void setLanguage(SessionLanguageContext language) {
    
    
    
    this.language = language;
  }


  public StartSessionRequest time(Integer time) {
    
    
    
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    
    
    
    this.time = time;
  }


  public StartSessionRequest platform(String platform) {
    
    
    
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    
    
    
    this.platform = platform;
  }


  public StartSessionRequest gamer(Integer gamer) {
    
    
    
    
    this.gamer = gamer;
    return this;
  }

   /**
   * Get gamer
   * @return gamer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGamer() {
    return gamer;
  }


  public void setGamer(Integer gamer) {
    
    
    
    this.gamer = gamer;
  }


  public StartSessionRequest device(String device) {
    
    
    
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    
    
    
    this.device = device;
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
   * @return the StartSessionRequest instance itself
   */
  public StartSessionRequest putAdditionalProperty(String key, Object value) {
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
    StartSessionRequest startSessionRequest = (StartSessionRequest) o;
    return Objects.equals(this.source, startSessionRequest.source) &&
        Objects.equals(this.customParams, startSessionRequest.customParams) &&
        Objects.equals(this.shard, startSessionRequest.shard) &&
        Objects.equals(this.locale, startSessionRequest.locale) &&
        Objects.equals(this.deviceParams, startSessionRequest.deviceParams) &&
        Objects.equals(this.language, startSessionRequest.language) &&
        Objects.equals(this.time, startSessionRequest.time) &&
        Objects.equals(this.platform, startSessionRequest.platform) &&
        Objects.equals(this.gamer, startSessionRequest.gamer) &&
        Objects.equals(this.device, startSessionRequest.device)&&
        Objects.equals(this.additionalProperties, startSessionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, customParams, shard, locale, deviceParams, language, time, platform, gamer, device, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSessionRequest {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    customParams: ").append(toIndentedString(customParams)).append("\n");
    sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    deviceParams: ").append(toIndentedString(deviceParams)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    gamer: ").append(toIndentedString(gamer)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("customParams");
    openapiFields.add("shard");
    openapiFields.add("locale");
    openapiFields.add("deviceParams");
    openapiFields.add("language");
    openapiFields.add("time");
    openapiFields.add("platform");
    openapiFields.add("gamer");
    openapiFields.add("device");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StartSessionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StartSessionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartSessionRequest is not found in the empty JSON string", StartSessionRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("shard") != null && !jsonObj.get("shard").isJsonNull()) && !jsonObj.get("shard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shard").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // validate the optional field `language`
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) {
        SessionLanguageContext.validateJsonObject(jsonObj.getAsJsonObject("language"));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartSessionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartSessionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartSessionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartSessionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StartSessionRequest>() {
           @Override
           public void write(JsonWriter out, StartSessionRequest value) throws IOException {
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
           public StartSessionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StartSessionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StartSessionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StartSessionRequest
  * @throws IOException if the JSON string is invalid with respect to StartSessionRequest
  */
  public static StartSessionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartSessionRequest.class);
  }

 /**
  * Convert an instance of StartSessionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
