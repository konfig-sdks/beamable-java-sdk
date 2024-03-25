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
import com.konfigthis.client.model.MicroserviceStatePoints;
import com.konfigthis.client.model.MicroserviceStateTotals;
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
 * GetMicroservicesResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetMicroservicesResponse {
  public static final String SERIALIZED_NAME_SERVICE_AGGREGATES = "serviceAggregates";
  @SerializedName(SERIALIZED_NAME_SERVICE_AGGREGATES)
  private MicroserviceStateTotals serviceAggregates;

  public static final String SERIALIZED_NAME_RUNNING_INSTANCE_AGGREGATES = "runningInstanceAggregates";
  @SerializedName(SERIALIZED_NAME_RUNNING_INSTANCE_AGGREGATES)
  private MicroserviceStateTotals runningInstanceAggregates;

  public static final String SERIALIZED_NAME_DATA_POINTS = "dataPoints";
  @SerializedName(SERIALIZED_NAME_DATA_POINTS)
  private List<MicroserviceStatePoints> dataPoints = null;

  public GetMicroservicesResponse() {
  }

  public GetMicroservicesResponse serviceAggregates(MicroserviceStateTotals serviceAggregates) {
    
    
    
    
    this.serviceAggregates = serviceAggregates;
    return this;
  }

   /**
   * Get serviceAggregates
   * @return serviceAggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MicroserviceStateTotals getServiceAggregates() {
    return serviceAggregates;
  }


  public void setServiceAggregates(MicroserviceStateTotals serviceAggregates) {
    
    
    
    this.serviceAggregates = serviceAggregates;
  }


  public GetMicroservicesResponse runningInstanceAggregates(MicroserviceStateTotals runningInstanceAggregates) {
    
    
    
    
    this.runningInstanceAggregates = runningInstanceAggregates;
    return this;
  }

   /**
   * Get runningInstanceAggregates
   * @return runningInstanceAggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MicroserviceStateTotals getRunningInstanceAggregates() {
    return runningInstanceAggregates;
  }


  public void setRunningInstanceAggregates(MicroserviceStateTotals runningInstanceAggregates) {
    
    
    
    this.runningInstanceAggregates = runningInstanceAggregates;
  }


  public GetMicroservicesResponse dataPoints(List<MicroserviceStatePoints> dataPoints) {
    
    
    
    
    this.dataPoints = dataPoints;
    return this;
  }

  public GetMicroservicesResponse addDataPointsItem(MicroserviceStatePoints dataPointsItem) {
    if (this.dataPoints == null) {
      this.dataPoints = new ArrayList<>();
    }
    this.dataPoints.add(dataPointsItem);
    return this;
  }

   /**
   * Get dataPoints
   * @return dataPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MicroserviceStatePoints> getDataPoints() {
    return dataPoints;
  }


  public void setDataPoints(List<MicroserviceStatePoints> dataPoints) {
    
    
    
    this.dataPoints = dataPoints;
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
   * @return the GetMicroservicesResponse instance itself
   */
  public GetMicroservicesResponse putAdditionalProperty(String key, Object value) {
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
    GetMicroservicesResponse getMicroservicesResponse = (GetMicroservicesResponse) o;
    return Objects.equals(this.serviceAggregates, getMicroservicesResponse.serviceAggregates) &&
        Objects.equals(this.runningInstanceAggregates, getMicroservicesResponse.runningInstanceAggregates) &&
        Objects.equals(this.dataPoints, getMicroservicesResponse.dataPoints)&&
        Objects.equals(this.additionalProperties, getMicroservicesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAggregates, runningInstanceAggregates, dataPoints, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMicroservicesResponse {\n");
    sb.append("    serviceAggregates: ").append(toIndentedString(serviceAggregates)).append("\n");
    sb.append("    runningInstanceAggregates: ").append(toIndentedString(runningInstanceAggregates)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
    openapiFields.add("serviceAggregates");
    openapiFields.add("runningInstanceAggregates");
    openapiFields.add("dataPoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMicroservicesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMicroservicesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMicroservicesResponse is not found in the empty JSON string", GetMicroservicesResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `serviceAggregates`
      if (jsonObj.get("serviceAggregates") != null && !jsonObj.get("serviceAggregates").isJsonNull()) {
        MicroserviceStateTotals.validateJsonObject(jsonObj.getAsJsonObject("serviceAggregates"));
      }
      // validate the optional field `runningInstanceAggregates`
      if (jsonObj.get("runningInstanceAggregates") != null && !jsonObj.get("runningInstanceAggregates").isJsonNull()) {
        MicroserviceStateTotals.validateJsonObject(jsonObj.getAsJsonObject("runningInstanceAggregates"));
      }
      if (jsonObj.get("dataPoints") != null && !jsonObj.get("dataPoints").isJsonNull()) {
        JsonArray jsonArraydataPoints = jsonObj.getAsJsonArray("dataPoints");
        if (jsonArraydataPoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataPoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataPoints` to be an array in the JSON string but got `%s`", jsonObj.get("dataPoints").toString()));
          }

          // validate the optional field `dataPoints` (array)
          for (int i = 0; i < jsonArraydataPoints.size(); i++) {
            MicroserviceStatePoints.validateJsonObject(jsonArraydataPoints.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMicroservicesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMicroservicesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMicroservicesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMicroservicesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMicroservicesResponse>() {
           @Override
           public void write(JsonWriter out, GetMicroservicesResponse value) throws IOException {
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
           public GetMicroservicesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetMicroservicesResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetMicroservicesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMicroservicesResponse
  * @throws IOException if the JSON string is invalid with respect to GetMicroservicesResponse
  */
  public static GetMicroservicesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMicroservicesResponse.class);
  }

 /**
  * Convert an instance of GetMicroservicesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
