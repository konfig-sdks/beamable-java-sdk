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
import com.konfigthis.client.model.ScheduleDefinition;
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
 * Schedule
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Schedule {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CRONS = "crons";
  @SerializedName(SERIALIZED_NAME_CRONS)
  private List<String> crons = null;

  public static final String SERIALIZED_NAME_ACTIVE_TO = "activeTo";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TO)
  private String activeTo;

  public static final String SERIALIZED_NAME_ACTIVE_FROM = "activeFrom";
  @SerializedName(SERIALIZED_NAME_ACTIVE_FROM)
  private String activeFrom;

  public static final String SERIALIZED_NAME_DEFINITIONS = "definitions";
  @SerializedName(SERIALIZED_NAME_DEFINITIONS)
  private List<ScheduleDefinition> definitions = null;

  public Schedule() {
  }

  public Schedule description(String description) {
    
    
    
    
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


  public Schedule crons(List<String> crons) {
    
    
    
    
    this.crons = crons;
    return this;
  }

  public Schedule addCronsItem(String cronsItem) {
    if (this.crons == null) {
      this.crons = new ArrayList<>();
    }
    this.crons.add(cronsItem);
    return this;
  }

   /**
   * Get crons
   * @return crons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCrons() {
    return crons;
  }


  public void setCrons(List<String> crons) {
    
    
    
    this.crons = crons;
  }


  public Schedule activeTo(String activeTo) {
    
    
    
    
    this.activeTo = activeTo;
    return this;
  }

   /**
   * Get activeTo
   * @return activeTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActiveTo() {
    return activeTo;
  }


  public void setActiveTo(String activeTo) {
    
    
    
    this.activeTo = activeTo;
  }


  public Schedule activeFrom(String activeFrom) {
    
    
    
    
    this.activeFrom = activeFrom;
    return this;
  }

   /**
   * Get activeFrom
   * @return activeFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActiveFrom() {
    return activeFrom;
  }


  public void setActiveFrom(String activeFrom) {
    
    
    
    this.activeFrom = activeFrom;
  }


  public Schedule definitions(List<ScheduleDefinition> definitions) {
    
    
    
    
    this.definitions = definitions;
    return this;
  }

  public Schedule addDefinitionsItem(ScheduleDefinition definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new ArrayList<>();
    }
    this.definitions.add(definitionsItem);
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ScheduleDefinition> getDefinitions() {
    return definitions;
  }


  public void setDefinitions(List<ScheduleDefinition> definitions) {
    
    
    
    this.definitions = definitions;
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
   * @return the Schedule instance itself
   */
  public Schedule putAdditionalProperty(String key, Object value) {
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
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.description, schedule.description) &&
        Objects.equals(this.crons, schedule.crons) &&
        Objects.equals(this.activeTo, schedule.activeTo) &&
        Objects.equals(this.activeFrom, schedule.activeFrom) &&
        Objects.equals(this.definitions, schedule.definitions)&&
        Objects.equals(this.additionalProperties, schedule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, crons, activeTo, activeFrom, definitions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    crons: ").append(toIndentedString(crons)).append("\n");
    sb.append("    activeTo: ").append(toIndentedString(activeTo)).append("\n");
    sb.append("    activeFrom: ").append(toIndentedString(activeFrom)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
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
    openapiFields.add("crons");
    openapiFields.add("activeTo");
    openapiFields.add("activeFrom");
    openapiFields.add("definitions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Schedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Schedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedule is not found in the empty JSON string", Schedule.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("crons") != null && !jsonObj.get("crons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `crons` to be an array in the JSON string but got `%s`", jsonObj.get("crons").toString()));
      }
      if ((jsonObj.get("activeTo") != null && !jsonObj.get("activeTo").isJsonNull()) && !jsonObj.get("activeTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeTo").toString()));
      }
      if ((jsonObj.get("activeFrom") != null && !jsonObj.get("activeFrom").isJsonNull()) && !jsonObj.get("activeFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeFrom").toString()));
      }
      if (jsonObj.get("definitions") != null && !jsonObj.get("definitions").isJsonNull()) {
        JsonArray jsonArraydefinitions = jsonObj.getAsJsonArray("definitions");
        if (jsonArraydefinitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("definitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `definitions` to be an array in the JSON string but got `%s`", jsonObj.get("definitions").toString()));
          }

          // validate the optional field `definitions` (array)
          for (int i = 0; i < jsonArraydefinitions.size(); i++) {
            ScheduleDefinition.validateJsonObject(jsonArraydefinitions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedule.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedule>() {
           @Override
           public void write(JsonWriter out, Schedule value) throws IOException {
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
           public Schedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Schedule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Schedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedule
  * @throws IOException if the JSON string is invalid with respect to Schedule
  */
  public static Schedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedule.class);
  }

 /**
  * Convert an instance of Schedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

