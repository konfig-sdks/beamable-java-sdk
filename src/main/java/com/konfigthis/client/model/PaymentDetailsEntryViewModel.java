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
 * PaymentDetailsEntryViewModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentDetailsEntryViewModel {
  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_SUBCATEGORY = "subcategory";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORY)
  private String subcategory;

  public static final String SERIALIZED_NAME_GAMEPLACE = "gameplace";
  @SerializedName(SERIALIZED_NAME_GAMEPLACE)
  private String gameplace;

  public static final String SERIALIZED_NAME_LOCAL_PRICE = "localPrice";
  @SerializedName(SERIALIZED_NAME_LOCAL_PRICE)
  private String localPrice;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_LOCAL_CURRENCY = "localCurrency";
  @SerializedName(SERIALIZED_NAME_LOCAL_CURRENCY)
  private String localCurrency;

  public static final String SERIALIZED_NAME_PROVIDER_PRODUCT_ID = "providerProductId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_PRODUCT_ID)
  private String providerProductId;

  public PaymentDetailsEntryViewModel() {
  }

  public PaymentDetailsEntryViewModel reference(String reference) {
    
    
    
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    
    
    
    this.reference = reference;
  }


  public PaymentDetailsEntryViewModel name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PaymentDetailsEntryViewModel quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    
    
    
    this.quantity = quantity;
  }


  public PaymentDetailsEntryViewModel sku(String sku) {
    
    
    
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    
    
    
    this.sku = sku;
  }


  public PaymentDetailsEntryViewModel price(Integer price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    
    
    
    this.price = price;
  }


  public PaymentDetailsEntryViewModel subcategory(String subcategory) {
    
    
    
    
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubcategory() {
    return subcategory;
  }


  public void setSubcategory(String subcategory) {
    
    
    
    this.subcategory = subcategory;
  }


  public PaymentDetailsEntryViewModel gameplace(String gameplace) {
    
    
    
    
    this.gameplace = gameplace;
    return this;
  }

   /**
   * Get gameplace
   * @return gameplace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGameplace() {
    return gameplace;
  }


  public void setGameplace(String gameplace) {
    
    
    
    this.gameplace = gameplace;
  }


  public PaymentDetailsEntryViewModel localPrice(String localPrice) {
    
    
    
    
    this.localPrice = localPrice;
    return this;
  }

   /**
   * Get localPrice
   * @return localPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalPrice() {
    return localPrice;
  }


  public void setLocalPrice(String localPrice) {
    
    
    
    this.localPrice = localPrice;
  }


  public PaymentDetailsEntryViewModel category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public PaymentDetailsEntryViewModel localCurrency(String localCurrency) {
    
    
    
    
    this.localCurrency = localCurrency;
    return this;
  }

   /**
   * Get localCurrency
   * @return localCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCurrency() {
    return localCurrency;
  }


  public void setLocalCurrency(String localCurrency) {
    
    
    
    this.localCurrency = localCurrency;
  }


  public PaymentDetailsEntryViewModel providerProductId(String providerProductId) {
    
    
    
    
    this.providerProductId = providerProductId;
    return this;
  }

   /**
   * Get providerProductId
   * @return providerProductId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProviderProductId() {
    return providerProductId;
  }


  public void setProviderProductId(String providerProductId) {
    
    
    
    this.providerProductId = providerProductId;
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
   * @return the PaymentDetailsEntryViewModel instance itself
   */
  public PaymentDetailsEntryViewModel putAdditionalProperty(String key, Object value) {
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
    PaymentDetailsEntryViewModel paymentDetailsEntryViewModel = (PaymentDetailsEntryViewModel) o;
    return Objects.equals(this.reference, paymentDetailsEntryViewModel.reference) &&
        Objects.equals(this.name, paymentDetailsEntryViewModel.name) &&
        Objects.equals(this.quantity, paymentDetailsEntryViewModel.quantity) &&
        Objects.equals(this.sku, paymentDetailsEntryViewModel.sku) &&
        Objects.equals(this.price, paymentDetailsEntryViewModel.price) &&
        Objects.equals(this.subcategory, paymentDetailsEntryViewModel.subcategory) &&
        Objects.equals(this.gameplace, paymentDetailsEntryViewModel.gameplace) &&
        Objects.equals(this.localPrice, paymentDetailsEntryViewModel.localPrice) &&
        Objects.equals(this.category, paymentDetailsEntryViewModel.category) &&
        Objects.equals(this.localCurrency, paymentDetailsEntryViewModel.localCurrency) &&
        Objects.equals(this.providerProductId, paymentDetailsEntryViewModel.providerProductId)&&
        Objects.equals(this.additionalProperties, paymentDetailsEntryViewModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, name, quantity, sku, price, subcategory, gameplace, localPrice, category, localCurrency, providerProductId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsEntryViewModel {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    gameplace: ").append(toIndentedString(gameplace)).append("\n");
    sb.append("    localPrice: ").append(toIndentedString(localPrice)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    localCurrency: ").append(toIndentedString(localCurrency)).append("\n");
    sb.append("    providerProductId: ").append(toIndentedString(providerProductId)).append("\n");
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
    openapiFields.add("reference");
    openapiFields.add("name");
    openapiFields.add("quantity");
    openapiFields.add("sku");
    openapiFields.add("price");
    openapiFields.add("subcategory");
    openapiFields.add("gameplace");
    openapiFields.add("localPrice");
    openapiFields.add("category");
    openapiFields.add("localCurrency");
    openapiFields.add("providerProductId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("sku");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("gameplace");
    openapiRequiredFields.add("providerProductId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentDetailsEntryViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentDetailsEntryViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentDetailsEntryViewModel is not found in the empty JSON string", PaymentDetailsEntryViewModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentDetailsEntryViewModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("subcategory") != null && !jsonObj.get("subcategory").isJsonNull()) && !jsonObj.get("subcategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subcategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subcategory").toString()));
      }
      if (!jsonObj.get("gameplace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameplace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gameplace").toString()));
      }
      if ((jsonObj.get("localPrice") != null && !jsonObj.get("localPrice").isJsonNull()) && !jsonObj.get("localPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localPrice").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("localCurrency") != null && !jsonObj.get("localCurrency").isJsonNull()) && !jsonObj.get("localCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localCurrency").toString()));
      }
      if (!jsonObj.get("providerProductId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerProductId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerProductId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentDetailsEntryViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentDetailsEntryViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentDetailsEntryViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentDetailsEntryViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentDetailsEntryViewModel>() {
           @Override
           public void write(JsonWriter out, PaymentDetailsEntryViewModel value) throws IOException {
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
           public PaymentDetailsEntryViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentDetailsEntryViewModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentDetailsEntryViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentDetailsEntryViewModel
  * @throws IOException if the JSON string is invalid with respect to PaymentDetailsEntryViewModel
  */
  public static PaymentDetailsEntryViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentDetailsEntryViewModel.class);
  }

 /**
  * Convert an instance of PaymentDetailsEntryViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

