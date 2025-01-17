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
import com.konfigthis.client.model.CloudStorage;
import com.konfigthis.client.model.CustomCohortRule;
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
 * Cohort
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Cohort {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CUSTOM_RULE = "customRule";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RULE)
  private List<CustomCohortRule> customRule = null;

  public static final String SERIALIZED_NAME_POPULATION_CAP = "populationCap";
  @SerializedName(SERIALIZED_NAME_POPULATION_CAP)
  private Integer populationCap;

  public static final String SERIALIZED_NAME_ASSIGNED = "assigned";
  @SerializedName(SERIALIZED_NAME_ASSIGNED)
  private Integer assigned;

  public static final String SERIALIZED_NAME_PCT = "pct";
  @SerializedName(SERIALIZED_NAME_PCT)
  private Integer pct;

  public static final String SERIALIZED_NAME_CLOUD_DATA = "cloudData";
  @SerializedName(SERIALIZED_NAME_CLOUD_DATA)
  private List<CloudStorage> cloudData = null;

  public Cohort() {
  }

  public Cohort name(String name) {
    
    
    
    
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


  public Cohort customRule(List<CustomCohortRule> customRule) {
    
    
    
    
    this.customRule = customRule;
    return this;
  }

  public Cohort addCustomRuleItem(CustomCohortRule customRuleItem) {
    if (this.customRule == null) {
      this.customRule = new ArrayList<>();
    }
    this.customRule.add(customRuleItem);
    return this;
  }

   /**
   * Get customRule
   * @return customRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomCohortRule> getCustomRule() {
    return customRule;
  }


  public void setCustomRule(List<CustomCohortRule> customRule) {
    
    
    
    this.customRule = customRule;
  }


  public Cohort populationCap(Integer populationCap) {
    
    
    
    
    this.populationCap = populationCap;
    return this;
  }

   /**
   * Get populationCap
   * @return populationCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPopulationCap() {
    return populationCap;
  }


  public void setPopulationCap(Integer populationCap) {
    
    
    
    this.populationCap = populationCap;
  }


  public Cohort assigned(Integer assigned) {
    
    
    
    
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAssigned() {
    return assigned;
  }


  public void setAssigned(Integer assigned) {
    
    
    
    this.assigned = assigned;
  }


  public Cohort pct(Integer pct) {
    
    
    
    
    this.pct = pct;
    return this;
  }

   /**
   * Get pct
   * @return pct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPct() {
    return pct;
  }


  public void setPct(Integer pct) {
    
    
    
    this.pct = pct;
  }


  public Cohort cloudData(List<CloudStorage> cloudData) {
    
    
    
    
    this.cloudData = cloudData;
    return this;
  }

  public Cohort addCloudDataItem(CloudStorage cloudDataItem) {
    if (this.cloudData == null) {
      this.cloudData = new ArrayList<>();
    }
    this.cloudData.add(cloudDataItem);
    return this;
  }

   /**
   * Get cloudData
   * @return cloudData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CloudStorage> getCloudData() {
    return cloudData;
  }


  public void setCloudData(List<CloudStorage> cloudData) {
    
    
    
    this.cloudData = cloudData;
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
   * @return the Cohort instance itself
   */
  public Cohort putAdditionalProperty(String key, Object value) {
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
    Cohort cohort = (Cohort) o;
    return Objects.equals(this.name, cohort.name) &&
        Objects.equals(this.customRule, cohort.customRule) &&
        Objects.equals(this.populationCap, cohort.populationCap) &&
        Objects.equals(this.assigned, cohort.assigned) &&
        Objects.equals(this.pct, cohort.pct) &&
        Objects.equals(this.cloudData, cohort.cloudData)&&
        Objects.equals(this.additionalProperties, cohort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customRule, populationCap, assigned, pct, cloudData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cohort {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customRule: ").append(toIndentedString(customRule)).append("\n");
    sb.append("    populationCap: ").append(toIndentedString(populationCap)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    pct: ").append(toIndentedString(pct)).append("\n");
    sb.append("    cloudData: ").append(toIndentedString(cloudData)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("customRule");
    openapiFields.add("populationCap");
    openapiFields.add("assigned");
    openapiFields.add("pct");
    openapiFields.add("cloudData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assigned");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Cohort
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Cohort.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Cohort is not found in the empty JSON string", Cohort.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Cohort.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("customRule") != null && !jsonObj.get("customRule").isJsonNull()) {
        JsonArray jsonArraycustomRule = jsonObj.getAsJsonArray("customRule");
        if (jsonArraycustomRule != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customRule").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customRule` to be an array in the JSON string but got `%s`", jsonObj.get("customRule").toString()));
          }

          // validate the optional field `customRule` (array)
          for (int i = 0; i < jsonArraycustomRule.size(); i++) {
            CustomCohortRule.validateJsonObject(jsonArraycustomRule.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("cloudData") != null && !jsonObj.get("cloudData").isJsonNull()) {
        JsonArray jsonArraycloudData = jsonObj.getAsJsonArray("cloudData");
        if (jsonArraycloudData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cloudData").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cloudData` to be an array in the JSON string but got `%s`", jsonObj.get("cloudData").toString()));
          }

          // validate the optional field `cloudData` (array)
          for (int i = 0; i < jsonArraycloudData.size(); i++) {
            CloudStorage.validateJsonObject(jsonArraycloudData.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Cohort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Cohort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Cohort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Cohort.class));

       return (TypeAdapter<T>) new TypeAdapter<Cohort>() {
           @Override
           public void write(JsonWriter out, Cohort value) throws IOException {
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
           public Cohort read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Cohort instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Cohort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Cohort
  * @throws IOException if the JSON string is invalid with respect to Cohort
  */
  public static Cohort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Cohort.class);
  }

 /**
  * Convert an instance of Cohort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

