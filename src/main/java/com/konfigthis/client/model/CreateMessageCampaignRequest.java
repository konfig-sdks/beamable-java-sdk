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
 * CreateMessageCampaignRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateMessageCampaignRequest {
  public static final String SERIALIZED_NAME_MTYPE = "mtype";
  @SerializedName(SERIALIZED_NAME_MTYPE)
  private String mtype;

  public static final String SERIALIZED_NAME_MB_STORE = "mb_store";
  @SerializedName(SERIALIZED_NAME_MB_STORE)
  private String mbStore;

  public static final String SERIALIZED_NAME_MB_EXPIRATION = "mb_expiration";
  @SerializedName(SERIALIZED_NAME_MB_EXPIRATION)
  private String mbExpiration;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MB_ENT_SPEC = "mb_ent_spec";
  @SerializedName(SERIALIZED_NAME_MB_ENT_SPEC)
  private String mbEntSpec;

  public static final String SERIALIZED_NAME_MB_ENT_QUANT = "mb_ent_quant";
  @SerializedName(SERIALIZED_NAME_MB_ENT_QUANT)
  private Integer mbEntQuant;

  public static final String SERIALIZED_NAME_RESEND_TO_PAST_RECIPIENTS = "resend_to_past_recipients";
  @SerializedName(SERIALIZED_NAME_RESEND_TO_PAST_RECIPIENTS)
  private Boolean resendToPastRecipients;

  public static final String SERIALIZED_NAME_DATEPOINT = "datepoint";
  @SerializedName(SERIALIZED_NAME_DATEPOINT)
  private String datepoint;

  public static final String SERIALIZED_NAME_MB_ATTACHMENTS = "mb_attachments";
  @SerializedName(SERIALIZED_NAME_MB_ATTACHMENTS)
  private List<AttachmentRequest> mbAttachments = null;

  public static final String SERIALIZED_NAME_RECUR = "recur";
  @SerializedName(SERIALIZED_NAME_RECUR)
  private String recur;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Integer sent;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<String> rules = null;

  public static final String SERIALIZED_NAME_MB_ENT = "mb_ent";
  @SerializedName(SERIALIZED_NAME_MB_ENT)
  private String mbEnt;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private String days;

  public CreateMessageCampaignRequest() {
  }

  public CreateMessageCampaignRequest mtype(String mtype) {
    
    
    
    
    this.mtype = mtype;
    return this;
  }

   /**
   * Get mtype
   * @return mtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMtype() {
    return mtype;
  }


  public void setMtype(String mtype) {
    
    
    
    this.mtype = mtype;
  }


  public CreateMessageCampaignRequest mbStore(String mbStore) {
    
    
    
    
    this.mbStore = mbStore;
    return this;
  }

   /**
   * Get mbStore
   * @return mbStore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMbStore() {
    return mbStore;
  }


  public void setMbStore(String mbStore) {
    
    
    
    this.mbStore = mbStore;
  }


  public CreateMessageCampaignRequest mbExpiration(String mbExpiration) {
    
    
    
    
    this.mbExpiration = mbExpiration;
    return this;
  }

   /**
   * Get mbExpiration
   * @return mbExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMbExpiration() {
    return mbExpiration;
  }


  public void setMbExpiration(String mbExpiration) {
    
    
    
    this.mbExpiration = mbExpiration;
  }


  public CreateMessageCampaignRequest name(String name) {
    
    
    
    
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


  public CreateMessageCampaignRequest subject(String subject) {
    
    
    
    
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


  public CreateMessageCampaignRequest mbEntSpec(String mbEntSpec) {
    
    
    
    
    this.mbEntSpec = mbEntSpec;
    return this;
  }

   /**
   * Get mbEntSpec
   * @return mbEntSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMbEntSpec() {
    return mbEntSpec;
  }


  public void setMbEntSpec(String mbEntSpec) {
    
    
    
    this.mbEntSpec = mbEntSpec;
  }


  public CreateMessageCampaignRequest mbEntQuant(Integer mbEntQuant) {
    
    
    
    
    this.mbEntQuant = mbEntQuant;
    return this;
  }

   /**
   * Get mbEntQuant
   * @return mbEntQuant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMbEntQuant() {
    return mbEntQuant;
  }


  public void setMbEntQuant(Integer mbEntQuant) {
    
    
    
    this.mbEntQuant = mbEntQuant;
  }


  public CreateMessageCampaignRequest resendToPastRecipients(Boolean resendToPastRecipients) {
    
    
    
    
    this.resendToPastRecipients = resendToPastRecipients;
    return this;
  }

   /**
   * Get resendToPastRecipients
   * @return resendToPastRecipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getResendToPastRecipients() {
    return resendToPastRecipients;
  }


  public void setResendToPastRecipients(Boolean resendToPastRecipients) {
    
    
    
    this.resendToPastRecipients = resendToPastRecipients;
  }


  public CreateMessageCampaignRequest datepoint(String datepoint) {
    
    
    
    
    this.datepoint = datepoint;
    return this;
  }

   /**
   * Get datepoint
   * @return datepoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatepoint() {
    return datepoint;
  }


  public void setDatepoint(String datepoint) {
    
    
    
    this.datepoint = datepoint;
  }


  public CreateMessageCampaignRequest mbAttachments(List<AttachmentRequest> mbAttachments) {
    
    
    
    
    this.mbAttachments = mbAttachments;
    return this;
  }

  public CreateMessageCampaignRequest addMbAttachmentsItem(AttachmentRequest mbAttachmentsItem) {
    if (this.mbAttachments == null) {
      this.mbAttachments = new ArrayList<>();
    }
    this.mbAttachments.add(mbAttachmentsItem);
    return this;
  }

   /**
   * Get mbAttachments
   * @return mbAttachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AttachmentRequest> getMbAttachments() {
    return mbAttachments;
  }


  public void setMbAttachments(List<AttachmentRequest> mbAttachments) {
    
    
    
    this.mbAttachments = mbAttachments;
  }


  public CreateMessageCampaignRequest recur(String recur) {
    
    
    
    
    this.recur = recur;
    return this;
  }

   /**
   * Get recur
   * @return recur
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecur() {
    return recur;
  }


  public void setRecur(String recur) {
    
    
    
    this.recur = recur;
  }


  public CreateMessageCampaignRequest sent(Integer sent) {
    
    
    
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSent() {
    return sent;
  }


  public void setSent(Integer sent) {
    
    
    
    this.sent = sent;
  }


  public CreateMessageCampaignRequest msg(String msg) {
    
    
    
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    
    
    
    this.msg = msg;
  }


  public CreateMessageCampaignRequest rules(List<String> rules) {
    
    
    
    
    this.rules = rules;
    return this;
  }

  public CreateMessageCampaignRequest addRulesItem(String rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRules() {
    return rules;
  }


  public void setRules(List<String> rules) {
    
    
    
    this.rules = rules;
  }


  public CreateMessageCampaignRequest mbEnt(String mbEnt) {
    
    
    
    
    this.mbEnt = mbEnt;
    return this;
  }

   /**
   * Get mbEnt
   * @return mbEnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMbEnt() {
    return mbEnt;
  }


  public void setMbEnt(String mbEnt) {
    
    
    
    this.mbEnt = mbEnt;
  }


  public CreateMessageCampaignRequest start(String start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    
    
    
    this.start = start;
  }


  public CreateMessageCampaignRequest days(String days) {
    
    
    
    
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDays() {
    return days;
  }


  public void setDays(String days) {
    
    
    
    this.days = days;
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
   * @return the CreateMessageCampaignRequest instance itself
   */
  public CreateMessageCampaignRequest putAdditionalProperty(String key, Object value) {
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
    CreateMessageCampaignRequest createMessageCampaignRequest = (CreateMessageCampaignRequest) o;
    return Objects.equals(this.mtype, createMessageCampaignRequest.mtype) &&
        Objects.equals(this.mbStore, createMessageCampaignRequest.mbStore) &&
        Objects.equals(this.mbExpiration, createMessageCampaignRequest.mbExpiration) &&
        Objects.equals(this.name, createMessageCampaignRequest.name) &&
        Objects.equals(this.subject, createMessageCampaignRequest.subject) &&
        Objects.equals(this.mbEntSpec, createMessageCampaignRequest.mbEntSpec) &&
        Objects.equals(this.mbEntQuant, createMessageCampaignRequest.mbEntQuant) &&
        Objects.equals(this.resendToPastRecipients, createMessageCampaignRequest.resendToPastRecipients) &&
        Objects.equals(this.datepoint, createMessageCampaignRequest.datepoint) &&
        Objects.equals(this.mbAttachments, createMessageCampaignRequest.mbAttachments) &&
        Objects.equals(this.recur, createMessageCampaignRequest.recur) &&
        Objects.equals(this.sent, createMessageCampaignRequest.sent) &&
        Objects.equals(this.msg, createMessageCampaignRequest.msg) &&
        Objects.equals(this.rules, createMessageCampaignRequest.rules) &&
        Objects.equals(this.mbEnt, createMessageCampaignRequest.mbEnt) &&
        Objects.equals(this.start, createMessageCampaignRequest.start) &&
        Objects.equals(this.days, createMessageCampaignRequest.days)&&
        Objects.equals(this.additionalProperties, createMessageCampaignRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtype, mbStore, mbExpiration, name, subject, mbEntSpec, mbEntQuant, resendToPastRecipients, datepoint, mbAttachments, recur, sent, msg, rules, mbEnt, start, days, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMessageCampaignRequest {\n");
    sb.append("    mtype: ").append(toIndentedString(mtype)).append("\n");
    sb.append("    mbStore: ").append(toIndentedString(mbStore)).append("\n");
    sb.append("    mbExpiration: ").append(toIndentedString(mbExpiration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    mbEntSpec: ").append(toIndentedString(mbEntSpec)).append("\n");
    sb.append("    mbEntQuant: ").append(toIndentedString(mbEntQuant)).append("\n");
    sb.append("    resendToPastRecipients: ").append(toIndentedString(resendToPastRecipients)).append("\n");
    sb.append("    datepoint: ").append(toIndentedString(datepoint)).append("\n");
    sb.append("    mbAttachments: ").append(toIndentedString(mbAttachments)).append("\n");
    sb.append("    recur: ").append(toIndentedString(recur)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    mbEnt: ").append(toIndentedString(mbEnt)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("mtype");
    openapiFields.add("mb_store");
    openapiFields.add("mb_expiration");
    openapiFields.add("name");
    openapiFields.add("subject");
    openapiFields.add("mb_ent_spec");
    openapiFields.add("mb_ent_quant");
    openapiFields.add("resend_to_past_recipients");
    openapiFields.add("datepoint");
    openapiFields.add("mb_attachments");
    openapiFields.add("recur");
    openapiFields.add("sent");
    openapiFields.add("msg");
    openapiFields.add("rules");
    openapiFields.add("mb_ent");
    openapiFields.add("start");
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resend_to_past_recipients");
    openapiRequiredFields.add("sent");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMessageCampaignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateMessageCampaignRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMessageCampaignRequest is not found in the empty JSON string", CreateMessageCampaignRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMessageCampaignRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("mtype") != null && !jsonObj.get("mtype").isJsonNull()) && !jsonObj.get("mtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mtype").toString()));
      }
      if ((jsonObj.get("mb_store") != null && !jsonObj.get("mb_store").isJsonNull()) && !jsonObj.get("mb_store").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mb_store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mb_store").toString()));
      }
      if ((jsonObj.get("mb_expiration") != null && !jsonObj.get("mb_expiration").isJsonNull()) && !jsonObj.get("mb_expiration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mb_expiration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mb_expiration").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("mb_ent_spec") != null && !jsonObj.get("mb_ent_spec").isJsonNull()) && !jsonObj.get("mb_ent_spec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mb_ent_spec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mb_ent_spec").toString()));
      }
      if ((jsonObj.get("datepoint") != null && !jsonObj.get("datepoint").isJsonNull()) && !jsonObj.get("datepoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datepoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datepoint").toString()));
      }
      if (jsonObj.get("mb_attachments") != null && !jsonObj.get("mb_attachments").isJsonNull()) {
        JsonArray jsonArraymbAttachments = jsonObj.getAsJsonArray("mb_attachments");
        if (jsonArraymbAttachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mb_attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mb_attachments` to be an array in the JSON string but got `%s`", jsonObj.get("mb_attachments").toString()));
          }

          // validate the optional field `mb_attachments` (array)
          for (int i = 0; i < jsonArraymbAttachments.size(); i++) {
            AttachmentRequest.validateJsonObject(jsonArraymbAttachments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("recur") != null && !jsonObj.get("recur").isJsonNull()) && !jsonObj.get("recur").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recur` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recur").toString()));
      }
      if ((jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonNull()) && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }
      if ((jsonObj.get("mb_ent") != null && !jsonObj.get("mb_ent").isJsonNull()) && !jsonObj.get("mb_ent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mb_ent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mb_ent").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if ((jsonObj.get("days") != null && !jsonObj.get("days").isJsonNull()) && !jsonObj.get("days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMessageCampaignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMessageCampaignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMessageCampaignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMessageCampaignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMessageCampaignRequest>() {
           @Override
           public void write(JsonWriter out, CreateMessageCampaignRequest value) throws IOException {
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
           public CreateMessageCampaignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateMessageCampaignRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateMessageCampaignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMessageCampaignRequest
  * @throws IOException if the JSON string is invalid with respect to CreateMessageCampaignRequest
  */
  public static CreateMessageCampaignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMessageCampaignRequest.class);
  }

 /**
  * Convert an instance of CreateMessageCampaignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
