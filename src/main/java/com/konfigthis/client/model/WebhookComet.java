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
import com.konfigthis.client.model.RouteParameters;
import com.konfigthis.client.model.RouteVariables;
import com.konfigthis.client.model.ServiceRoute;
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
 * WebhookComet
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookComet {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private RouteParameters parameters;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private RouteVariables variables;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private ServiceRoute route;

  public WebhookComet() {
  }

  public WebhookComet description(String description) {
    
    
    
    
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


  public WebhookComet parameters(RouteParameters parameters) {
    
    
    
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RouteParameters getParameters() {
    return parameters;
  }


  public void setParameters(RouteParameters parameters) {
    
    
    
    this.parameters = parameters;
  }


  public WebhookComet method(String method) {
    
    
    
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    
    
    
    this.method = method;
  }


  public WebhookComet variables(RouteVariables variables) {
    
    
    
    
    this.variables = variables;
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RouteVariables getVariables() {
    return variables;
  }


  public void setVariables(RouteVariables variables) {
    
    
    
    this.variables = variables;
  }


  public WebhookComet symbol(String symbol) {
    
    
    
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    
    
    
    this.symbol = symbol;
  }


  public WebhookComet route(ServiceRoute route) {
    
    
    
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceRoute getRoute() {
    return route;
  }


  public void setRoute(ServiceRoute route) {
    
    
    
    this.route = route;
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
   * @return the WebhookComet instance itself
   */
  public WebhookComet putAdditionalProperty(String key, Object value) {
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
    WebhookComet webhookComet = (WebhookComet) o;
    return Objects.equals(this.description, webhookComet.description) &&
        Objects.equals(this.parameters, webhookComet.parameters) &&
        Objects.equals(this.method, webhookComet.method) &&
        Objects.equals(this.variables, webhookComet.variables) &&
        Objects.equals(this.symbol, webhookComet.symbol) &&
        Objects.equals(this.route, webhookComet.route)&&
        Objects.equals(this.additionalProperties, webhookComet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, parameters, method, variables, symbol, route, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookComet {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("parameters");
    openapiFields.add("method");
    openapiFields.add("variables");
    openapiFields.add("symbol");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookComet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookComet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookComet is not found in the empty JSON string", WebhookComet.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        RouteParameters.validateJsonObject(jsonObj.getAsJsonObject("parameters"));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the optional field `variables`
      if (jsonObj.get("variables") != null && !jsonObj.get("variables").isJsonNull()) {
        RouteVariables.validateJsonObject(jsonObj.getAsJsonObject("variables"));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      // validate the optional field `route`
      if (jsonObj.get("route") != null && !jsonObj.get("route").isJsonNull()) {
        ServiceRoute.validateJsonObject(jsonObj.getAsJsonObject("route"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookComet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookComet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookComet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookComet.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookComet>() {
           @Override
           public void write(JsonWriter out, WebhookComet value) throws IOException {
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
           public WebhookComet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookComet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookComet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookComet
  * @throws IOException if the JSON string is invalid with respect to WebhookComet
  */
  public static WebhookComet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookComet.class);
  }

 /**
  * Convert an instance of WebhookComet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

