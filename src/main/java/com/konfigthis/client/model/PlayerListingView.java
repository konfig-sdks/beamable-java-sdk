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
import com.konfigthis.client.model.ClientDataEntry;
import com.konfigthis.client.model.PlayerOfferView;
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
 * PlayerListingView
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PlayerListingView {
  public static final String SERIALIZED_NAME_CLIENT_DATA_LIST = "clientDataList";
  @SerializedName(SERIALIZED_NAME_CLIENT_DATA_LIST)
  private List<ClientDataEntry> clientDataList = null;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_CLIENT_DATA = "clientData";
  @SerializedName(SERIALIZED_NAME_CLIENT_DATA)
  private Map<String, Object> clientData = null;

  public static final String SERIALIZED_NAME_COOLDOWN = "cooldown";
  @SerializedName(SERIALIZED_NAME_COOLDOWN)
  private Integer cooldown;

  public static final String SERIALIZED_NAME_SECONDS_ACTIVE = "secondsActive";
  @SerializedName(SERIALIZED_NAME_SECONDS_ACTIVE)
  private Integer secondsActive;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private PlayerOfferView offer;

  public static final String SERIALIZED_NAME_QUERY_AFTER_PURCHASE = "queryAfterPurchase";
  @SerializedName(SERIALIZED_NAME_QUERY_AFTER_PURCHASE)
  private Boolean queryAfterPurchase;

  public static final String SERIALIZED_NAME_PURCHASES_REMAIN = "purchasesRemain";
  @SerializedName(SERIALIZED_NAME_PURCHASES_REMAIN)
  private Integer purchasesRemain;

  public static final String SERIALIZED_NAME_SECONDS_REMAIN = "secondsRemain";
  @SerializedName(SERIALIZED_NAME_SECONDS_REMAIN)
  private Integer secondsRemain;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public PlayerListingView() {
  }

  public PlayerListingView clientDataList(List<ClientDataEntry> clientDataList) {
    
    
    
    
    this.clientDataList = clientDataList;
    return this;
  }

  public PlayerListingView addClientDataListItem(ClientDataEntry clientDataListItem) {
    if (this.clientDataList == null) {
      this.clientDataList = new ArrayList<>();
    }
    this.clientDataList.add(clientDataListItem);
    return this;
  }

   /**
   * Get clientDataList
   * @return clientDataList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientDataEntry> getClientDataList() {
    return clientDataList;
  }


  public void setClientDataList(List<ClientDataEntry> clientDataList) {
    
    
    
    this.clientDataList = clientDataList;
  }


  public PlayerListingView symbol(String symbol) {
    
    
    
    
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


  public PlayerListingView clientData(Map<String, Object> clientData) {
    
    
    
    
    this.clientData = clientData;
    return this;
  }

  public PlayerListingView putClientDataItem(String key, Object clientDataItem) {
    if (this.clientData == null) {
      this.clientData = new HashMap<>();
    }
    this.clientData.put(key, clientDataItem);
    return this;
  }

   /**
   * Get clientData
   * @return clientData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getClientData() {
    return clientData;
  }


  public void setClientData(Map<String, Object> clientData) {
    
    
    
    this.clientData = clientData;
  }


  public PlayerListingView cooldown(Integer cooldown) {
    
    
    
    
    this.cooldown = cooldown;
    return this;
  }

   /**
   * Get cooldown
   * @return cooldown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCooldown() {
    return cooldown;
  }


  public void setCooldown(Integer cooldown) {
    
    
    
    this.cooldown = cooldown;
  }


  public PlayerListingView secondsActive(Integer secondsActive) {
    
    
    
    
    this.secondsActive = secondsActive;
    return this;
  }

   /**
   * Get secondsActive
   * @return secondsActive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSecondsActive() {
    return secondsActive;
  }


  public void setSecondsActive(Integer secondsActive) {
    
    
    
    this.secondsActive = secondsActive;
  }


  public PlayerListingView offer(PlayerOfferView offer) {
    
    
    
    
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlayerOfferView getOffer() {
    return offer;
  }


  public void setOffer(PlayerOfferView offer) {
    
    
    
    this.offer = offer;
  }


  public PlayerListingView queryAfterPurchase(Boolean queryAfterPurchase) {
    
    
    
    
    this.queryAfterPurchase = queryAfterPurchase;
    return this;
  }

   /**
   * Get queryAfterPurchase
   * @return queryAfterPurchase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getQueryAfterPurchase() {
    return queryAfterPurchase;
  }


  public void setQueryAfterPurchase(Boolean queryAfterPurchase) {
    
    
    
    this.queryAfterPurchase = queryAfterPurchase;
  }


  public PlayerListingView purchasesRemain(Integer purchasesRemain) {
    
    
    
    
    this.purchasesRemain = purchasesRemain;
    return this;
  }

   /**
   * Get purchasesRemain
   * @return purchasesRemain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPurchasesRemain() {
    return purchasesRemain;
  }


  public void setPurchasesRemain(Integer purchasesRemain) {
    
    
    
    this.purchasesRemain = purchasesRemain;
  }


  public PlayerListingView secondsRemain(Integer secondsRemain) {
    
    
    
    
    this.secondsRemain = secondsRemain;
    return this;
  }

   /**
   * Get secondsRemain
   * @return secondsRemain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSecondsRemain() {
    return secondsRemain;
  }


  public void setSecondsRemain(Integer secondsRemain) {
    
    
    
    this.secondsRemain = secondsRemain;
  }


  public PlayerListingView active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
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
   * @return the PlayerListingView instance itself
   */
  public PlayerListingView putAdditionalProperty(String key, Object value) {
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
    PlayerListingView playerListingView = (PlayerListingView) o;
    return Objects.equals(this.clientDataList, playerListingView.clientDataList) &&
        Objects.equals(this.symbol, playerListingView.symbol) &&
        Objects.equals(this.clientData, playerListingView.clientData) &&
        Objects.equals(this.cooldown, playerListingView.cooldown) &&
        Objects.equals(this.secondsActive, playerListingView.secondsActive) &&
        Objects.equals(this.offer, playerListingView.offer) &&
        Objects.equals(this.queryAfterPurchase, playerListingView.queryAfterPurchase) &&
        Objects.equals(this.purchasesRemain, playerListingView.purchasesRemain) &&
        Objects.equals(this.secondsRemain, playerListingView.secondsRemain) &&
        Objects.equals(this.active, playerListingView.active)&&
        Objects.equals(this.additionalProperties, playerListingView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDataList, symbol, clientData, cooldown, secondsActive, offer, queryAfterPurchase, purchasesRemain, secondsRemain, active, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerListingView {\n");
    sb.append("    clientDataList: ").append(toIndentedString(clientDataList)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    clientData: ").append(toIndentedString(clientData)).append("\n");
    sb.append("    cooldown: ").append(toIndentedString(cooldown)).append("\n");
    sb.append("    secondsActive: ").append(toIndentedString(secondsActive)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    queryAfterPurchase: ").append(toIndentedString(queryAfterPurchase)).append("\n");
    sb.append("    purchasesRemain: ").append(toIndentedString(purchasesRemain)).append("\n");
    sb.append("    secondsRemain: ").append(toIndentedString(secondsRemain)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("clientDataList");
    openapiFields.add("symbol");
    openapiFields.add("clientData");
    openapiFields.add("cooldown");
    openapiFields.add("secondsActive");
    openapiFields.add("offer");
    openapiFields.add("queryAfterPurchase");
    openapiFields.add("purchasesRemain");
    openapiFields.add("secondsRemain");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secondsActive");
    openapiRequiredFields.add("queryAfterPurchase");
    openapiRequiredFields.add("active");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlayerListingView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlayerListingView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerListingView is not found in the empty JSON string", PlayerListingView.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayerListingView.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("clientDataList") != null && !jsonObj.get("clientDataList").isJsonNull()) {
        JsonArray jsonArrayclientDataList = jsonObj.getAsJsonArray("clientDataList");
        if (jsonArrayclientDataList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientDataList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientDataList` to be an array in the JSON string but got `%s`", jsonObj.get("clientDataList").toString()));
          }

          // validate the optional field `clientDataList` (array)
          for (int i = 0; i < jsonArrayclientDataList.size(); i++) {
            ClientDataEntry.validateJsonObject(jsonArrayclientDataList.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      // validate the optional field `offer`
      if (jsonObj.get("offer") != null && !jsonObj.get("offer").isJsonNull()) {
        PlayerOfferView.validateJsonObject(jsonObj.getAsJsonObject("offer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerListingView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerListingView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerListingView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerListingView.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerListingView>() {
           @Override
           public void write(JsonWriter out, PlayerListingView value) throws IOException {
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
           public PlayerListingView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlayerListingView instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayerListingView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerListingView
  * @throws IOException if the JSON string is invalid with respect to PlayerListingView
  */
  public static PlayerListingView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerListingView.class);
  }

 /**
  * Convert an instance of PlayerListingView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

