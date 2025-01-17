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
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.MailRewards;
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
 * Message
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Message {
  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_GAMER_TAG = "gamerTag";
  @SerializedName(SERIALIZED_NAME_GAMER_TAG)
  private Integer gamerTag;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Map<String, Object> reactions = null;

  public static final String SERIALIZED_NAME_TIMESTAMP_MILLIS = "timestampMillis";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_MILLIS)
  private Integer timestampMillis;

  public static final String SERIALIZED_NAME_CENSORED_CONTENT = "censoredContent";
  @SerializedName(SERIALIZED_NAME_CENSORED_CONTENT)
  private String censoredContent;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private Integer expires;

  public static final String SERIALIZED_NAME_RECEIVER_GAMER_TAG = "receiverGamerTag";
  @SerializedName(SERIALIZED_NAME_RECEIVER_GAMER_TAG)
  private Integer receiverGamerTag;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SENDER_GAMER_TAG = "senderGamerTag";
  @SerializedName(SERIALIZED_NAME_SENDER_GAMER_TAG)
  private Integer senderGamerTag;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Integer sent;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_BODY_REF = "bodyRef";
  @SerializedName(SERIALIZED_NAME_BODY_REF)
  private Integer bodyRef;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_REWARDS = "rewards";
  @SerializedName(SERIALIZED_NAME_REWARDS)
  private MailRewards rewards;

  public static final String SERIALIZED_NAME_CLAIMED_TIME_MS = "claimedTimeMs";
  @SerializedName(SERIALIZED_NAME_CLAIMED_TIME_MS)
  private Integer claimedTimeMs;

  public Message() {
  }

  public Message roomId(String roomId) {
    
    
    
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    
    
    
    this.roomId = roomId;
  }


  public Message gamerTag(Integer gamerTag) {
    
    
    
    
    this.gamerTag = gamerTag;
    return this;
  }

   /**
   * Get gamerTag
   * @return gamerTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGamerTag() {
    return gamerTag;
  }


  public void setGamerTag(Integer gamerTag) {
    
    
    
    this.gamerTag = gamerTag;
  }


  public Message reactions(Map<String, Object> reactions) {
    
    
    
    
    this.reactions = reactions;
    return this;
  }

  public Message putReactionsItem(String key, Object reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new HashMap<>();
    }
    this.reactions.put(key, reactionsItem);
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getReactions() {
    return reactions;
  }


  public void setReactions(Map<String, Object> reactions) {
    
    
    
    this.reactions = reactions;
  }


  public Message timestampMillis(Integer timestampMillis) {
    
    
    
    
    this.timestampMillis = timestampMillis;
    return this;
  }

   /**
   * Get timestampMillis
   * @return timestampMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimestampMillis() {
    return timestampMillis;
  }


  public void setTimestampMillis(Integer timestampMillis) {
    
    
    
    this.timestampMillis = timestampMillis;
  }


  public Message censoredContent(String censoredContent) {
    
    
    
    
    this.censoredContent = censoredContent;
    return this;
  }

   /**
   * Get censoredContent
   * @return censoredContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCensoredContent() {
    return censoredContent;
  }


  public void setCensoredContent(String censoredContent) {
    
    
    
    this.censoredContent = censoredContent;
  }


  public Message messageId(String messageId) {
    
    
    
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    
    
    
    this.messageId = messageId;
  }


  public Message content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public Message body(String body) {
    
    
    
    
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


  public Message expires(Integer expires) {
    
    
    
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpires() {
    return expires;
  }


  public void setExpires(Integer expires) {
    
    
    
    this.expires = expires;
  }


  public Message receiverGamerTag(Integer receiverGamerTag) {
    
    
    
    
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


  public Message subject(String subject) {
    
    
    
    
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


  public Message state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public Message id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public Message senderGamerTag(Integer senderGamerTag) {
    
    
    
    
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


  public Message sent(Integer sent) {
    
    
    
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSent() {
    return sent;
  }


  public void setSent(Integer sent) {
    
    
    
    this.sent = sent;
  }


  public Message category(String category) {
    
    
    
    
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


  public Message bodyRef(Integer bodyRef) {
    
    
    
    
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


  public Message attachments(List<Attachment> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public Message addAttachmentsItem(Attachment attachmentsItem) {
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

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    
    
    
    this.attachments = attachments;
  }


  public Message rewards(MailRewards rewards) {
    
    
    
    
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


  public Message claimedTimeMs(Integer claimedTimeMs) {
    
    
    
    
    this.claimedTimeMs = claimedTimeMs;
    return this;
  }

   /**
   * Get claimedTimeMs
   * @return claimedTimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClaimedTimeMs() {
    return claimedTimeMs;
  }


  public void setClaimedTimeMs(Integer claimedTimeMs) {
    
    
    
    this.claimedTimeMs = claimedTimeMs;
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
   * @return the Message instance itself
   */
  public Message putAdditionalProperty(String key, Object value) {
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
    Message message = (Message) o;
    return Objects.equals(this.roomId, message.roomId) &&
        Objects.equals(this.gamerTag, message.gamerTag) &&
        Objects.equals(this.reactions, message.reactions) &&
        Objects.equals(this.timestampMillis, message.timestampMillis) &&
        Objects.equals(this.censoredContent, message.censoredContent) &&
        Objects.equals(this.messageId, message.messageId) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.body, message.body) &&
        Objects.equals(this.expires, message.expires) &&
        Objects.equals(this.receiverGamerTag, message.receiverGamerTag) &&
        Objects.equals(this.subject, message.subject) &&
        Objects.equals(this.state, message.state) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.senderGamerTag, message.senderGamerTag) &&
        Objects.equals(this.sent, message.sent) &&
        Objects.equals(this.category, message.category) &&
        Objects.equals(this.bodyRef, message.bodyRef) &&
        Objects.equals(this.attachments, message.attachments) &&
        Objects.equals(this.rewards, message.rewards) &&
        Objects.equals(this.claimedTimeMs, message.claimedTimeMs)&&
        Objects.equals(this.additionalProperties, message.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, gamerTag, reactions, timestampMillis, censoredContent, messageId, content, body, expires, receiverGamerTag, subject, state, id, senderGamerTag, sent, category, bodyRef, attachments, rewards, claimedTimeMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    gamerTag: ").append(toIndentedString(gamerTag)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    censoredContent: ").append(toIndentedString(censoredContent)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    receiverGamerTag: ").append(toIndentedString(receiverGamerTag)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    senderGamerTag: ").append(toIndentedString(senderGamerTag)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    bodyRef: ").append(toIndentedString(bodyRef)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    claimedTimeMs: ").append(toIndentedString(claimedTimeMs)).append("\n");
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
    openapiFields.add("roomId");
    openapiFields.add("gamerTag");
    openapiFields.add("reactions");
    openapiFields.add("timestampMillis");
    openapiFields.add("censoredContent");
    openapiFields.add("messageId");
    openapiFields.add("content");
    openapiFields.add("body");
    openapiFields.add("expires");
    openapiFields.add("receiverGamerTag");
    openapiFields.add("subject");
    openapiFields.add("state");
    openapiFields.add("id");
    openapiFields.add("senderGamerTag");
    openapiFields.add("sent");
    openapiFields.add("category");
    openapiFields.add("bodyRef");
    openapiFields.add("attachments");
    openapiFields.add("rewards");
    openapiFields.add("claimedTimeMs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("receiverGamerTag");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("senderGamerTag");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Message
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Message.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Message is not found in the empty JSON string", Message.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Message.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("roomId") != null && !jsonObj.get("roomId").isJsonNull()) && !jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
      if ((jsonObj.get("censoredContent") != null && !jsonObj.get("censoredContent").isJsonNull()) && !jsonObj.get("censoredContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `censoredContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("censoredContent").toString()));
      }
      if ((jsonObj.get("messageId") != null && !jsonObj.get("messageId").isJsonNull()) && !jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
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
            Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
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
       if (!Message.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Message' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Message> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Message.class));

       return (TypeAdapter<T>) new TypeAdapter<Message>() {
           @Override
           public void write(JsonWriter out, Message value) throws IOException {
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
           public Message read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Message instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Message given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Message
  * @throws IOException if the JSON string is invalid with respect to Message
  */
  public static Message fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Message.class);
  }

 /**
  * Convert an instance of Message to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

