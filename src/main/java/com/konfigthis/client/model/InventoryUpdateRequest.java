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
import com.konfigthis.client.model.CurrencyProperty;
import com.konfigthis.client.model.ItemCreateRequest;
import com.konfigthis.client.model.ItemDeleteRequest;
import com.konfigthis.client.model.ItemUpdateRequest;
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
 * InventoryUpdateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InventoryUpdateRequest {
  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private Map<String, Long> currencies = null;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  private Boolean empty;

  public static final String SERIALIZED_NAME_CURRENCY_PROPERTIES = "currencyProperties";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PROPERTIES)
  private Map<String, List<CurrencyProperty>> currencyProperties = null;

  public static final String SERIALIZED_NAME_CURRENCY_CONTENT_IDS = "currencyContentIds";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONTENT_IDS)
  private List<String> currencyContentIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLY_VIP_BONUS = "applyVipBonus";
  @SerializedName(SERIALIZED_NAME_APPLY_VIP_BONUS)
  private Boolean applyVipBonus;

  public static final String SERIALIZED_NAME_ITEM_CONTENT_IDS = "itemContentIds";
  @SerializedName(SERIALIZED_NAME_ITEM_CONTENT_IDS)
  private List<String> itemContentIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATE_ITEMS = "updateItems";
  @SerializedName(SERIALIZED_NAME_UPDATE_ITEMS)
  private List<ItemUpdateRequest> updateItems = null;

  public static final String SERIALIZED_NAME_NEW_ITEMS = "newItems";
  @SerializedName(SERIALIZED_NAME_NEW_ITEMS)
  private List<ItemCreateRequest> newItems = null;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_DELETE_ITEMS = "deleteItems";
  @SerializedName(SERIALIZED_NAME_DELETE_ITEMS)
  private List<ItemDeleteRequest> deleteItems = null;

  public InventoryUpdateRequest() {
  }

  public InventoryUpdateRequest currencies(Map<String, Long> currencies) {
    
    
    
    
    this.currencies = currencies;
    return this;
  }

  public InventoryUpdateRequest putCurrenciesItem(String key, Long currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new HashMap<>();
    }
    this.currencies.put(key, currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Long> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(Map<String, Long> currencies) {
    
    
    
    this.currencies = currencies;
  }


  public InventoryUpdateRequest empty(Boolean empty) {
    
    
    
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEmpty() {
    return empty;
  }


  public void setEmpty(Boolean empty) {
    
    
    
    this.empty = empty;
  }


  public InventoryUpdateRequest currencyProperties(Map<String, List<CurrencyProperty>> currencyProperties) {
    
    
    
    
    this.currencyProperties = currencyProperties;
    return this;
  }

  public InventoryUpdateRequest putCurrencyPropertiesItem(String key, List<CurrencyProperty> currencyPropertiesItem) {
    if (this.currencyProperties == null) {
      this.currencyProperties = new HashMap<>();
    }
    this.currencyProperties.put(key, currencyPropertiesItem);
    return this;
  }

   /**
   * Get currencyProperties
   * @return currencyProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<CurrencyProperty>> getCurrencyProperties() {
    return currencyProperties;
  }


  public void setCurrencyProperties(Map<String, List<CurrencyProperty>> currencyProperties) {
    
    
    
    this.currencyProperties = currencyProperties;
  }


  public InventoryUpdateRequest currencyContentIds(List<String> currencyContentIds) {
    
    
    
    
    this.currencyContentIds = currencyContentIds;
    return this;
  }

  public InventoryUpdateRequest addCurrencyContentIdsItem(String currencyContentIdsItem) {
    this.currencyContentIds.add(currencyContentIdsItem);
    return this;
  }

   /**
   * Get currencyContentIds
   * @return currencyContentIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCurrencyContentIds() {
    return currencyContentIds;
  }


  public void setCurrencyContentIds(List<String> currencyContentIds) {
    
    
    
    this.currencyContentIds = currencyContentIds;
  }


  public InventoryUpdateRequest applyVipBonus(Boolean applyVipBonus) {
    
    
    
    
    this.applyVipBonus = applyVipBonus;
    return this;
  }

   /**
   * Get applyVipBonus
   * @return applyVipBonus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApplyVipBonus() {
    return applyVipBonus;
  }


  public void setApplyVipBonus(Boolean applyVipBonus) {
    
    
    
    this.applyVipBonus = applyVipBonus;
  }


  public InventoryUpdateRequest itemContentIds(List<String> itemContentIds) {
    
    
    
    
    this.itemContentIds = itemContentIds;
    return this;
  }

  public InventoryUpdateRequest addItemContentIdsItem(String itemContentIdsItem) {
    this.itemContentIds.add(itemContentIdsItem);
    return this;
  }

   /**
   * Get itemContentIds
   * @return itemContentIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getItemContentIds() {
    return itemContentIds;
  }


  public void setItemContentIds(List<String> itemContentIds) {
    
    
    
    this.itemContentIds = itemContentIds;
  }


  public InventoryUpdateRequest updateItems(List<ItemUpdateRequest> updateItems) {
    
    
    
    
    this.updateItems = updateItems;
    return this;
  }

  public InventoryUpdateRequest addUpdateItemsItem(ItemUpdateRequest updateItemsItem) {
    if (this.updateItems == null) {
      this.updateItems = new ArrayList<>();
    }
    this.updateItems.add(updateItemsItem);
    return this;
  }

   /**
   * Get updateItems
   * @return updateItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemUpdateRequest> getUpdateItems() {
    return updateItems;
  }


  public void setUpdateItems(List<ItemUpdateRequest> updateItems) {
    
    
    
    this.updateItems = updateItems;
  }


  public InventoryUpdateRequest newItems(List<ItemCreateRequest> newItems) {
    
    
    
    
    this.newItems = newItems;
    return this;
  }

  public InventoryUpdateRequest addNewItemsItem(ItemCreateRequest newItemsItem) {
    if (this.newItems == null) {
      this.newItems = new ArrayList<>();
    }
    this.newItems.add(newItemsItem);
    return this;
  }

   /**
   * Get newItems
   * @return newItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemCreateRequest> getNewItems() {
    return newItems;
  }


  public void setNewItems(List<ItemCreateRequest> newItems) {
    
    
    
    this.newItems = newItems;
  }


  public InventoryUpdateRequest transaction(String transaction) {
    
    
    
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    
    
    
    this.transaction = transaction;
  }


  public InventoryUpdateRequest deleteItems(List<ItemDeleteRequest> deleteItems) {
    
    
    
    
    this.deleteItems = deleteItems;
    return this;
  }

  public InventoryUpdateRequest addDeleteItemsItem(ItemDeleteRequest deleteItemsItem) {
    if (this.deleteItems == null) {
      this.deleteItems = new ArrayList<>();
    }
    this.deleteItems.add(deleteItemsItem);
    return this;
  }

   /**
   * Get deleteItems
   * @return deleteItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemDeleteRequest> getDeleteItems() {
    return deleteItems;
  }


  public void setDeleteItems(List<ItemDeleteRequest> deleteItems) {
    
    
    
    this.deleteItems = deleteItems;
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
   * @return the InventoryUpdateRequest instance itself
   */
  public InventoryUpdateRequest putAdditionalProperty(String key, Object value) {
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
    InventoryUpdateRequest inventoryUpdateRequest = (InventoryUpdateRequest) o;
    return Objects.equals(this.currencies, inventoryUpdateRequest.currencies) &&
        Objects.equals(this.empty, inventoryUpdateRequest.empty) &&
        Objects.equals(this.currencyProperties, inventoryUpdateRequest.currencyProperties) &&
        Objects.equals(this.currencyContentIds, inventoryUpdateRequest.currencyContentIds) &&
        Objects.equals(this.applyVipBonus, inventoryUpdateRequest.applyVipBonus) &&
        Objects.equals(this.itemContentIds, inventoryUpdateRequest.itemContentIds) &&
        Objects.equals(this.updateItems, inventoryUpdateRequest.updateItems) &&
        Objects.equals(this.newItems, inventoryUpdateRequest.newItems) &&
        Objects.equals(this.transaction, inventoryUpdateRequest.transaction) &&
        Objects.equals(this.deleteItems, inventoryUpdateRequest.deleteItems)&&
        Objects.equals(this.additionalProperties, inventoryUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies, empty, currencyProperties, currencyContentIds, applyVipBonus, itemContentIds, updateItems, newItems, transaction, deleteItems, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryUpdateRequest {\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    currencyProperties: ").append(toIndentedString(currencyProperties)).append("\n");
    sb.append("    currencyContentIds: ").append(toIndentedString(currencyContentIds)).append("\n");
    sb.append("    applyVipBonus: ").append(toIndentedString(applyVipBonus)).append("\n");
    sb.append("    itemContentIds: ").append(toIndentedString(itemContentIds)).append("\n");
    sb.append("    updateItems: ").append(toIndentedString(updateItems)).append("\n");
    sb.append("    newItems: ").append(toIndentedString(newItems)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    deleteItems: ").append(toIndentedString(deleteItems)).append("\n");
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
    openapiFields.add("currencies");
    openapiFields.add("empty");
    openapiFields.add("currencyProperties");
    openapiFields.add("currencyContentIds");
    openapiFields.add("applyVipBonus");
    openapiFields.add("itemContentIds");
    openapiFields.add("updateItems");
    openapiFields.add("newItems");
    openapiFields.add("transaction");
    openapiFields.add("deleteItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("empty");
    openapiRequiredFields.add("currencyContentIds");
    openapiRequiredFields.add("itemContentIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InventoryUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InventoryUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InventoryUpdateRequest is not found in the empty JSON string", InventoryUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InventoryUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("currencyContentIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("currencyContentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyContentIds` to be an array in the JSON string but got `%s`", jsonObj.get("currencyContentIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("itemContentIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("itemContentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemContentIds` to be an array in the JSON string but got `%s`", jsonObj.get("itemContentIds").toString()));
      }
      if (jsonObj.get("updateItems") != null && !jsonObj.get("updateItems").isJsonNull()) {
        JsonArray jsonArrayupdateItems = jsonObj.getAsJsonArray("updateItems");
        if (jsonArrayupdateItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("updateItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `updateItems` to be an array in the JSON string but got `%s`", jsonObj.get("updateItems").toString()));
          }

          // validate the optional field `updateItems` (array)
          for (int i = 0; i < jsonArrayupdateItems.size(); i++) {
            ItemUpdateRequest.validateJsonObject(jsonArrayupdateItems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("newItems") != null && !jsonObj.get("newItems").isJsonNull()) {
        JsonArray jsonArraynewItems = jsonObj.getAsJsonArray("newItems");
        if (jsonArraynewItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("newItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `newItems` to be an array in the JSON string but got `%s`", jsonObj.get("newItems").toString()));
          }

          // validate the optional field `newItems` (array)
          for (int i = 0; i < jsonArraynewItems.size(); i++) {
            ItemCreateRequest.validateJsonObject(jsonArraynewItems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
      if (jsonObj.get("deleteItems") != null && !jsonObj.get("deleteItems").isJsonNull()) {
        JsonArray jsonArraydeleteItems = jsonObj.getAsJsonArray("deleteItems");
        if (jsonArraydeleteItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deleteItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deleteItems` to be an array in the JSON string but got `%s`", jsonObj.get("deleteItems").toString()));
          }

          // validate the optional field `deleteItems` (array)
          for (int i = 0; i < jsonArraydeleteItems.size(); i++) {
            ItemDeleteRequest.validateJsonObject(jsonArraydeleteItems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InventoryUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InventoryUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InventoryUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InventoryUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InventoryUpdateRequest>() {
           @Override
           public void write(JsonWriter out, InventoryUpdateRequest value) throws IOException {
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
           public InventoryUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InventoryUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InventoryUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InventoryUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to InventoryUpdateRequest
  */
  public static InventoryUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InventoryUpdateRequest.class);
  }

 /**
  * Convert an instance of InventoryUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

