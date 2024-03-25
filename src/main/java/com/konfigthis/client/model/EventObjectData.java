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
import com.konfigthis.client.model.ClientPermission;
import com.konfigthis.client.model.Event;
import com.konfigthis.client.model.EventPhaseRuntime;
import com.konfigthis.client.model.InFlightMessage;
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
 * EventObjectData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventObjectData {
  public static final String SERIALIZED_NAME_IN_FLIGHT = "inFlight";
  @SerializedName(SERIALIZED_NAME_IN_FLIGHT)
  private List<InFlightMessage> inFlight = null;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Integer startTime;

  public static final String SERIALIZED_NAME_ROOT_EVENT_ID = "rootEventId";
  @SerializedName(SERIALIZED_NAME_ROOT_EVENT_ID)
  private String rootEventId;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
 public enum StateEnum {
    NOT_AVAILABLE("not-available");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private EventPhaseRuntime phase;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private ClientPermission permissions;

  public static final String SERIALIZED_NAME_LAST_CHILD_EVENT_ID = "lastChildEventId";
  @SerializedName(SERIALIZED_NAME_LAST_CHILD_EVENT_ID)
  private String lastChildEventId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Event content;

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public static final String SERIALIZED_NAME_LEADERBOARD_ID = "leaderboardId";
  @SerializedName(SERIALIZED_NAME_LEADERBOARD_ID)
  private String leaderboardId;

  public EventObjectData() {
  }

  public EventObjectData inFlight(List<InFlightMessage> inFlight) {
    
    
    
    
    this.inFlight = inFlight;
    return this;
  }

  public EventObjectData addInFlightItem(InFlightMessage inFlightItem) {
    if (this.inFlight == null) {
      this.inFlight = new ArrayList<>();
    }
    this.inFlight.add(inFlightItem);
    return this;
  }

   /**
   * Get inFlight
   * @return inFlight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InFlightMessage> getInFlight() {
    return inFlight;
  }


  public void setInFlight(List<InFlightMessage> inFlight) {
    
    
    
    this.inFlight = inFlight;
  }


  public EventObjectData startTime(Integer startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartTime() {
    return startTime;
  }


  public void setStartTime(Integer startTime) {
    
    
    
    this.startTime = startTime;
  }


  public EventObjectData rootEventId(String rootEventId) {
    
    
    
    
    this.rootEventId = rootEventId;
    return this;
  }

   /**
   * Get rootEventId
   * @return rootEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRootEventId() {
    return rootEventId;
  }


  public void setRootEventId(String rootEventId) {
    
    
    
    this.rootEventId = rootEventId;
  }


  public EventObjectData state(StateEnum state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    
    
    
    this.state = state;
  }


  public EventObjectData running(Boolean running) {
    
    
    
    
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRunning() {
    return running;
  }


  public void setRunning(Boolean running) {
    
    
    
    this.running = running;
  }


  public EventObjectData phase(EventPhaseRuntime phase) {
    
    
    
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventPhaseRuntime getPhase() {
    return phase;
  }


  public void setPhase(EventPhaseRuntime phase) {
    
    
    
    this.phase = phase;
  }


  public EventObjectData permissions(ClientPermission permissions) {
    
    
    
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientPermission getPermissions() {
    return permissions;
  }


  public void setPermissions(ClientPermission permissions) {
    
    
    
    this.permissions = permissions;
  }


  public EventObjectData lastChildEventId(String lastChildEventId) {
    
    
    
    
    this.lastChildEventId = lastChildEventId;
    return this;
  }

   /**
   * Get lastChildEventId
   * @return lastChildEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastChildEventId() {
    return lastChildEventId;
  }


  public void setLastChildEventId(String lastChildEventId) {
    
    
    
    this.lastChildEventId = lastChildEventId;
  }


  public EventObjectData id(String id) {
    
    
    
    
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


  public EventObjectData origin(String origin) {
    
    
    
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    
    
    
    this.origin = origin;
  }


  public EventObjectData content(Event content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Event getContent() {
    return content;
  }


  public void setContent(Event content) {
    
    
    
    this.content = content;
  }


  public EventObjectData done(Boolean done) {
    
    
    
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDone() {
    return done;
  }


  public void setDone(Boolean done) {
    
    
    
    this.done = done;
  }


  public EventObjectData leaderboardId(String leaderboardId) {
    
    
    
    
    this.leaderboardId = leaderboardId;
    return this;
  }

   /**
   * Get leaderboardId
   * @return leaderboardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLeaderboardId() {
    return leaderboardId;
  }


  public void setLeaderboardId(String leaderboardId) {
    
    
    
    this.leaderboardId = leaderboardId;
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
   * @return the EventObjectData instance itself
   */
  public EventObjectData putAdditionalProperty(String key, Object value) {
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
    EventObjectData eventObjectData = (EventObjectData) o;
    return Objects.equals(this.inFlight, eventObjectData.inFlight) &&
        Objects.equals(this.startTime, eventObjectData.startTime) &&
        Objects.equals(this.rootEventId, eventObjectData.rootEventId) &&
        Objects.equals(this.state, eventObjectData.state) &&
        Objects.equals(this.running, eventObjectData.running) &&
        Objects.equals(this.phase, eventObjectData.phase) &&
        Objects.equals(this.permissions, eventObjectData.permissions) &&
        Objects.equals(this.lastChildEventId, eventObjectData.lastChildEventId) &&
        Objects.equals(this.id, eventObjectData.id) &&
        Objects.equals(this.origin, eventObjectData.origin) &&
        Objects.equals(this.content, eventObjectData.content) &&
        Objects.equals(this.done, eventObjectData.done) &&
        Objects.equals(this.leaderboardId, eventObjectData.leaderboardId)&&
        Objects.equals(this.additionalProperties, eventObjectData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inFlight, startTime, rootEventId, state, running, phase, permissions, lastChildEventId, id, origin, content, done, leaderboardId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventObjectData {\n");
    sb.append("    inFlight: ").append(toIndentedString(inFlight)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    rootEventId: ").append(toIndentedString(rootEventId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    lastChildEventId: ").append(toIndentedString(lastChildEventId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    leaderboardId: ").append(toIndentedString(leaderboardId)).append("\n");
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
    openapiFields.add("inFlight");
    openapiFields.add("startTime");
    openapiFields.add("rootEventId");
    openapiFields.add("state");
    openapiFields.add("running");
    openapiFields.add("phase");
    openapiFields.add("permissions");
    openapiFields.add("lastChildEventId");
    openapiFields.add("id");
    openapiFields.add("origin");
    openapiFields.add("content");
    openapiFields.add("done");
    openapiFields.add("leaderboardId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("running");
    openapiRequiredFields.add("done");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventObjectData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventObjectData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventObjectData is not found in the empty JSON string", EventObjectData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventObjectData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("inFlight") != null && !jsonObj.get("inFlight").isJsonNull()) {
        JsonArray jsonArrayinFlight = jsonObj.getAsJsonArray("inFlight");
        if (jsonArrayinFlight != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inFlight").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inFlight` to be an array in the JSON string but got `%s`", jsonObj.get("inFlight").toString()));
          }

          // validate the optional field `inFlight` (array)
          for (int i = 0; i < jsonArrayinFlight.size(); i++) {
            InFlightMessage.validateJsonObject(jsonArrayinFlight.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("rootEventId") != null && !jsonObj.get("rootEventId").isJsonNull()) && !jsonObj.get("rootEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rootEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rootEventId").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `phase`
      if (jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) {
        EventPhaseRuntime.validateJsonObject(jsonObj.getAsJsonObject("phase"));
      }
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        ClientPermission.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
      }
      if ((jsonObj.get("lastChildEventId") != null && !jsonObj.get("lastChildEventId").isJsonNull()) && !jsonObj.get("lastChildEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastChildEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastChildEventId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        Event.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if ((jsonObj.get("leaderboardId") != null && !jsonObj.get("leaderboardId").isJsonNull()) && !jsonObj.get("leaderboardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaderboardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaderboardId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventObjectData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventObjectData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventObjectData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventObjectData.class));

       return (TypeAdapter<T>) new TypeAdapter<EventObjectData>() {
           @Override
           public void write(JsonWriter out, EventObjectData value) throws IOException {
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
           public EventObjectData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventObjectData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventObjectData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventObjectData
  * @throws IOException if the JSON string is invalid with respect to EventObjectData
  */
  public static EventObjectData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventObjectData.class);
  }

 /**
  * Convert an instance of EventObjectData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

