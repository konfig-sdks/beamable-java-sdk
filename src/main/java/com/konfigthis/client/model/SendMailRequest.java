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
import com.konfigthis.client.model.AttachmentRequest;
import com.konfigthis.client.model.MailRewards;
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
 * SendMailRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SendMailRequest {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public static final String SERIALIZED_NAME_RECEIVER_GAMER_TAG = "receiverGamerTag";
  @SerializedName(SERIALIZED_NAME_RECEIVER_GAMER_TAG)
  private Integer receiverGamerTag;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SENDER_GAMER_TAG = "senderGamerTag";
  @SerializedName(SERIALIZED_NAME_SENDER_GAMER_TAG)
  private Integer senderGamerTag;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_BODY_REF = "bodyRef";
  @SerializedName(SERIALIZED_NAME_BODY_REF)
  private Integer bodyRef;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentRequest> attachments = null;

  public static final String SERIALIZED_NAME_REWARDS = "rewards";
  @SerializedName(SERIALIZED_NAME_REWARDS)
  private MailRewards rewards;

  public SendMailRequest() {
  }

  public SendMailRequest body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public SendMailRequest expires(String expires) {
    
    
    
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    
    
    
    this.expires = expires;
  }


  public SendMailRequest receiverGamerTag(Integer receiverGamerTag) {
    
    
    
    
    this.receiverGamerTag = receiverGamerTag;
    return this;
  }

   /**
   * Get receiverGamerTag
   * @return receiverGamerTag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReceiverGamerTag() {
    return receiverGamerTag;
  }


  public void setReceiverGamerTag(Integer receiverGamerTag) {
    
    
    
    this.receiverGamerTag = receiverGamerTag;
  }


  public SendMailRequest subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public SendMailRequest id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public SendMailRequest senderGamerTag(Integer senderGamerTag) {
    
    
    
    
    this.senderGamerTag = senderGamerTag;
    return this;
  }

   /**
   * Get senderGamerTag
   * @return senderGamerTag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSenderGamerTag() {
    return senderGamerTag;
  }


  public void setSenderGamerTag(Integer senderGamerTag) {
    
    
    
    this.senderGamerTag = senderGamerTag;
  }


  public SendMailRequest category(String category) {
    
    
    
    
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


  public SendMailRequest bodyRef(Integer bodyRef) {
    
    
    
    
    this.bodyRef = bodyRef;
    return this;
  }

   /**
   * Get bodyRef
   * @return bodyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBodyRef() {
    return bodyRef;
  }


  public void setBodyRef(Integer bodyRef) {
    
    
    
    this.bodyRef = bodyRef;
  }


  public SendMailRequest attachments(List<AttachmentRequest> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public SendMailRequest addAttachmentsItem(AttachmentRequest attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AttachmentRequest> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentRequest> attachments) {
    
    
    
    this.attachments = attachments;
  }


  public SendMailRequest rewards(MailRewards rewards) {
    
    
    
    
    this.rewards = rewards;
    return this;
  }

   /**
   * Get rewards
   * @return rewards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MailRewards getRewards() {
    return rewards;
  }


  public void setRewards(MailRewards rewards) {
    
    
    
    this.rewards = rewards;
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
   * @return the SendMailRequest instance itself
   */
  public SendMailRequest putAdditionalProperty(String key, Object value) {
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
    SendMailRequest sendMailRequest = (SendMailRequest) o;
    return Objects.equals(this.body, sendMailRequest.body) &&
        Objects.equals(this.expires, sendMailRequest.expires) &&
        Objects.equals(this.receiverGamerTag, sendMailRequest.receiverGamerTag) &&
        Objects.equals(this.subject, sendMailRequest.subject) &&
        Objects.equals(this.id, sendMailRequest.id) &&
        Objects.equals(this.senderGamerTag, sendMailRequest.senderGamerTag) &&
        Objects.equals(this.category, sendMailRequest.category) &&
        Objects.equals(this.bodyRef, sendMailRequest.bodyRef) &&
        Objects.equals(this.attachments, sendMailRequest.attachments) &&
        Objects.equals(this.rewards, sendMailRequest.rewards)&&
        Objects.equals(this.additionalProperties, sendMailRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, expires, receiverGamerTag, subject, id, senderGamerTag, category, bodyRef, attachments, rewards, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMailRequest {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    receiverGamerTag: ").append(toIndentedString(receiverGamerTag)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    senderGamerTag: ").append(toIndentedString(senderGamerTag)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    bodyRef: ").append(toIndentedString(bodyRef)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("expires");
    openapiFields.add("receiverGamerTag");
    openapiFields.add("subject");
    openapiFields.add("id");
    openapiFields.add("senderGamerTag");
    openapiFields.add("category");
    openapiFields.add("bodyRef");
    openapiFields.add("attachments");
    openapiFields.add("rewards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("receiverGamerTag");
    openapiRequiredFields.add("senderGamerTag");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendMailRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SendMailRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendMailRequest is not found in the empty JSON string", SendMailRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendMailRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("expires") != null && !jsonObj.get("expires").isJsonNull()) && !jsonObj.get("expires").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentRequest.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `rewards`
      if (jsonObj.get("rewards") != null && !jsonObj.get("rewards").isJsonNull()) {
        MailRewards.validateJsonObject(jsonObj.getAsJsonObject("rewards"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendMailRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendMailRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendMailRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendMailRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SendMailRequest>() {
           @Override
           public void write(JsonWriter out, SendMailRequest value) throws IOException {
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
           public SendMailRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SendMailRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SendMailRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendMailRequest
  * @throws IOException if the JSON string is invalid with respect to SendMailRequest
  */
  public static SendMailRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendMailRequest.class);
  }

 /**
  * Convert an instance of SendMailRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

