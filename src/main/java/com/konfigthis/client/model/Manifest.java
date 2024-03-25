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
import com.konfigthis.client.model.Reference;
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
 * Manifest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Manifest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MANIFEST = "manifest";
  @SerializedName(SERIALIZED_NAME_MANIFEST)
  private List<Reference> manifest = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_REPLACEMENT = "replacement";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT)
  private Boolean replacement;

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private List<Reference> references = null;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  public Manifest() {
  }

  public Manifest id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Manifest manifest(List<Reference> manifest) {
    
    
    
    
    this.manifest = manifest;
    return this;
  }

  public Manifest addManifestItem(Reference manifestItem) {
    if (this.manifest == null) {
      this.manifest = new ArrayList<>();
    }
    this.manifest.add(manifestItem);
    return this;
  }

   /**
   * Get manifest
   * @return manifest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Reference> getManifest() {
    return manifest;
  }


  public void setManifest(List<Reference> manifest) {
    
    
    
    this.manifest = manifest;
  }


  public Manifest created(Integer created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    
    
    
    this.created = created;
  }


  public Manifest replacement(Boolean replacement) {
    
    
    
    
    this.replacement = replacement;
    return this;
  }

   /**
   * Get replacement
   * @return replacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReplacement() {
    return replacement;
  }


  public void setReplacement(Boolean replacement) {
    
    
    
    this.replacement = replacement;
  }


  public Manifest references(List<Reference> references) {
    
    
    
    
    this.references = references;
    return this;
  }

  public Manifest addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Reference> getReferences() {
    return references;
  }


  public void setReferences(List<Reference> references) {
    
    
    
    this.references = references;
  }


  public Manifest checksum(String checksum) {
    
    
    
    
    this.checksum = checksum;
    return this;
  }

   /**
   * Get checksum
   * @return checksum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChecksum() {
    return checksum;
  }


  public void setChecksum(String checksum) {
    
    
    
    this.checksum = checksum;
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
   * @return the Manifest instance itself
   */
  public Manifest putAdditionalProperty(String key, Object value) {
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
    Manifest manifest = (Manifest) o;
    return Objects.equals(this.id, manifest.id) &&
        Objects.equals(this.manifest, manifest.manifest) &&
        Objects.equals(this.created, manifest.created) &&
        Objects.equals(this.replacement, manifest.replacement) &&
        Objects.equals(this.references, manifest.references) &&
        Objects.equals(this.checksum, manifest.checksum)&&
        Objects.equals(this.additionalProperties, manifest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, manifest, created, replacement, references, checksum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("manifest");
    openapiFields.add("created");
    openapiFields.add("replacement");
    openapiFields.add("references");
    openapiFields.add("checksum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Manifest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Manifest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Manifest is not found in the empty JSON string", Manifest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Manifest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("manifest") != null && !jsonObj.get("manifest").isJsonNull()) {
        JsonArray jsonArraymanifest = jsonObj.getAsJsonArray("manifest");
        if (jsonArraymanifest != null) {
          // ensure the json data is an array
          if (!jsonObj.get("manifest").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `manifest` to be an array in the JSON string but got `%s`", jsonObj.get("manifest").toString()));
          }

          // validate the optional field `manifest` (array)
          for (int i = 0; i < jsonArraymanifest.size(); i++) {
            Reference.validateJsonObject(jsonArraymanifest.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("references") != null && !jsonObj.get("references").isJsonNull()) {
        JsonArray jsonArrayreferences = jsonObj.getAsJsonArray("references");
        if (jsonArrayreferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("references").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `references` to be an array in the JSON string but got `%s`", jsonObj.get("references").toString()));
          }

          // validate the optional field `references` (array)
          for (int i = 0; i < jsonArrayreferences.size(); i++) {
            Reference.validateJsonObject(jsonArrayreferences.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull()) && !jsonObj.get("checksum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checksum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checksum").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Manifest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Manifest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Manifest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Manifest.class));

       return (TypeAdapter<T>) new TypeAdapter<Manifest>() {
           @Override
           public void write(JsonWriter out, Manifest value) throws IOException {
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
           public Manifest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Manifest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Manifest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Manifest
  * @throws IOException if the JSON string is invalid with respect to Manifest
  */
  public static Manifest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Manifest.class);
  }

 /**
  * Convert an instance of Manifest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
