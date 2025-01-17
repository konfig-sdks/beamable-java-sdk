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
import com.konfigthis.client.model.CurrencyChange;
import com.konfigthis.client.model.ItemCreateRequest;
import com.konfigthis.client.model.Price;
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
 * PlayerOfferView
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PlayerOfferView {
  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private Integer coupons;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Price price;

  public static final String SERIALIZED_NAME_BUTTON_TEXT = "buttonText";
  @SerializedName(SERIALIZED_NAME_BUTTON_TEXT)
  private String buttonText;

  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = null;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_OBTAIN_ITEMS = "obtainItems";
  @SerializedName(SERIALIZED_NAME_OBTAIN_ITEMS)
  private List<ItemCreateRequest> obtainItems = null;

  public static final String SERIALIZED_NAME_OBTAIN_CURRENCY = "obtainCurrency";
  @SerializedName(SERIALIZED_NAME_OBTAIN_CURRENCY)
  private List<CurrencyChange> obtainCurrency = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images = null;

  public static final String SERIALIZED_NAME_DESCRIPTIONS = "descriptions";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
  private List<String> descriptions = null;

  public static final String SERIALIZED_NAME_OBTAIN = "obtain";
  @SerializedName(SERIALIZED_NAME_OBTAIN)
  private List<String> obtain = null;

  public PlayerOfferView() {
  }

  public PlayerOfferView coupons(Integer coupons) {
    
    
    
    
    this.coupons = coupons;
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCoupons() {
    return coupons;
  }


  public void setCoupons(Integer coupons) {
    
    
    
    this.coupons = coupons;
  }


  public PlayerOfferView price(Price price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Price getPrice() {
    return price;
  }


  public void setPrice(Price price) {
    
    
    
    this.price = price;
  }


  public PlayerOfferView buttonText(String buttonText) {
    
    
    
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getButtonText() {
    return buttonText;
  }


  public void setButtonText(String buttonText) {
    
    
    
    this.buttonText = buttonText;
  }


  public PlayerOfferView titles(List<String> titles) {
    
    
    
    
    this.titles = titles;
    return this;
  }

  public PlayerOfferView addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * Get titles
   * @return titles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTitles() {
    return titles;
  }


  public void setTitles(List<String> titles) {
    
    
    
    this.titles = titles;
  }


  public PlayerOfferView symbol(String symbol) {
    
    
    
    
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


  public PlayerOfferView obtainItems(List<ItemCreateRequest> obtainItems) {
    
    
    
    
    this.obtainItems = obtainItems;
    return this;
  }

  public PlayerOfferView addObtainItemsItem(ItemCreateRequest obtainItemsItem) {
    if (this.obtainItems == null) {
      this.obtainItems = new ArrayList<>();
    }
    this.obtainItems.add(obtainItemsItem);
    return this;
  }

   /**
   * Get obtainItems
   * @return obtainItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemCreateRequest> getObtainItems() {
    return obtainItems;
  }


  public void setObtainItems(List<ItemCreateRequest> obtainItems) {
    
    
    
    this.obtainItems = obtainItems;
  }


  public PlayerOfferView obtainCurrency(List<CurrencyChange> obtainCurrency) {
    
    
    
    
    this.obtainCurrency = obtainCurrency;
    return this;
  }

  public PlayerOfferView addObtainCurrencyItem(CurrencyChange obtainCurrencyItem) {
    if (this.obtainCurrency == null) {
      this.obtainCurrency = new ArrayList<>();
    }
    this.obtainCurrency.add(obtainCurrencyItem);
    return this;
  }

   /**
   * Get obtainCurrency
   * @return obtainCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CurrencyChange> getObtainCurrency() {
    return obtainCurrency;
  }


  public void setObtainCurrency(List<CurrencyChange> obtainCurrency) {
    
    
    
    this.obtainCurrency = obtainCurrency;
  }


  public PlayerOfferView images(List<String> images) {
    
    
    
    
    this.images = images;
    return this;
  }

  public PlayerOfferView addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getImages() {
    return images;
  }


  public void setImages(List<String> images) {
    
    
    
    this.images = images;
  }


  public PlayerOfferView descriptions(List<String> descriptions) {
    
    
    
    
    this.descriptions = descriptions;
    return this;
  }

  public PlayerOfferView addDescriptionsItem(String descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptions() {
    return descriptions;
  }


  public void setDescriptions(List<String> descriptions) {
    
    
    
    this.descriptions = descriptions;
  }


  public PlayerOfferView obtain(List<String> obtain) {
    
    
    
    
    this.obtain = obtain;
    return this;
  }

  public PlayerOfferView addObtainItem(String obtainItem) {
    if (this.obtain == null) {
      this.obtain = new ArrayList<>();
    }
    this.obtain.add(obtainItem);
    return this;
  }

   /**
   * Get obtain
   * @return obtain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getObtain() {
    return obtain;
  }


  public void setObtain(List<String> obtain) {
    
    
    
    this.obtain = obtain;
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
   * @return the PlayerOfferView instance itself
   */
  public PlayerOfferView putAdditionalProperty(String key, Object value) {
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
    PlayerOfferView playerOfferView = (PlayerOfferView) o;
    return Objects.equals(this.coupons, playerOfferView.coupons) &&
        Objects.equals(this.price, playerOfferView.price) &&
        Objects.equals(this.buttonText, playerOfferView.buttonText) &&
        Objects.equals(this.titles, playerOfferView.titles) &&
        Objects.equals(this.symbol, playerOfferView.symbol) &&
        Objects.equals(this.obtainItems, playerOfferView.obtainItems) &&
        Objects.equals(this.obtainCurrency, playerOfferView.obtainCurrency) &&
        Objects.equals(this.images, playerOfferView.images) &&
        Objects.equals(this.descriptions, playerOfferView.descriptions) &&
        Objects.equals(this.obtain, playerOfferView.obtain)&&
        Objects.equals(this.additionalProperties, playerOfferView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coupons, price, buttonText, titles, symbol, obtainItems, obtainCurrency, images, descriptions, obtain, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerOfferView {\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    obtainItems: ").append(toIndentedString(obtainItems)).append("\n");
    sb.append("    obtainCurrency: ").append(toIndentedString(obtainCurrency)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    obtain: ").append(toIndentedString(obtain)).append("\n");
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
    openapiFields.add("coupons");
    openapiFields.add("price");
    openapiFields.add("buttonText");
    openapiFields.add("titles");
    openapiFields.add("symbol");
    openapiFields.add("obtainItems");
    openapiFields.add("obtainCurrency");
    openapiFields.add("images");
    openapiFields.add("descriptions");
    openapiFields.add("obtain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("coupons");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlayerOfferView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlayerOfferView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerOfferView is not found in the empty JSON string", PlayerOfferView.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayerOfferView.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        Price.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      if ((jsonObj.get("buttonText") != null && !jsonObj.get("buttonText").isJsonNull()) && !jsonObj.get("buttonText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buttonText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buttonText").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("titles") != null && !jsonObj.get("titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `titles` to be an array in the JSON string but got `%s`", jsonObj.get("titles").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if (jsonObj.get("obtainItems") != null && !jsonObj.get("obtainItems").isJsonNull()) {
        JsonArray jsonArrayobtainItems = jsonObj.getAsJsonArray("obtainItems");
        if (jsonArrayobtainItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("obtainItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `obtainItems` to be an array in the JSON string but got `%s`", jsonObj.get("obtainItems").toString()));
          }

          // validate the optional field `obtainItems` (array)
          for (int i = 0; i < jsonArrayobtainItems.size(); i++) {
            ItemCreateRequest.validateJsonObject(jsonArrayobtainItems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("obtainCurrency") != null && !jsonObj.get("obtainCurrency").isJsonNull()) {
        JsonArray jsonArrayobtainCurrency = jsonObj.getAsJsonArray("obtainCurrency");
        if (jsonArrayobtainCurrency != null) {
          // ensure the json data is an array
          if (!jsonObj.get("obtainCurrency").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `obtainCurrency` to be an array in the JSON string but got `%s`", jsonObj.get("obtainCurrency").toString()));
          }

          // validate the optional field `obtainCurrency` (array)
          for (int i = 0; i < jsonArrayobtainCurrency.size(); i++) {
            CurrencyChange.validateJsonObject(jsonArrayobtainCurrency.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("descriptions") != null && !jsonObj.get("descriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptions` to be an array in the JSON string but got `%s`", jsonObj.get("descriptions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("obtain") != null && !jsonObj.get("obtain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `obtain` to be an array in the JSON string but got `%s`", jsonObj.get("obtain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerOfferView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerOfferView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerOfferView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerOfferView.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerOfferView>() {
           @Override
           public void write(JsonWriter out, PlayerOfferView value) throws IOException {
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
           public PlayerOfferView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlayerOfferView instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayerOfferView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerOfferView
  * @throws IOException if the JSON string is invalid with respect to PlayerOfferView
  */
  public static PlayerOfferView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerOfferView.class);
  }

 /**
  * Convert an instance of PlayerOfferView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

