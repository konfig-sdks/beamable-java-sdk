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
import com.konfigthis.client.model.Account;
import com.konfigthis.client.model.Project;
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
 * Customer
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Customer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "paymentStatus";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private String paymentStatus;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Long cid;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Long updated;

  public static final String SERIALIZED_NAME_CRM_LINK = "crm_link";
  @SerializedName(SERIALIZED_NAME_CRM_LINK)
  private String crmLink;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<Project> projects = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Account> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public Customer() {
  }

  public Customer name(String name) {
    
    
    
    
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


  public Customer paymentStatus(String paymentStatus) {
    
    
    
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(String paymentStatus) {
    
    
    
    this.paymentStatus = paymentStatus;
  }


  public Customer image(String image) {
    
    
    
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    
    
    
    this.image = image;
  }


  public Customer contact(String contact) {
    
    
    
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContact() {
    return contact;
  }


  public void setContact(String contact) {
    
    
    
    this.contact = contact;
  }


  public Customer alias(String alias) {
    
    
    
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    
    
    
    this.alias = alias;
  }


  public Customer cid(Long cid) {
    
    
    
    
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getCid() {
    return cid;
  }


  public void setCid(Long cid) {
    
    
    
    this.cid = cid;
  }


  public Customer updated(Long updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUpdated() {
    return updated;
  }


  public void setUpdated(Long updated) {
    
    
    
    this.updated = updated;
  }


  public Customer crmLink(String crmLink) {
    
    
    
    
    this.crmLink = crmLink;
    return this;
  }

   /**
   * Get crmLink
   * @return crmLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrmLink() {
    return crmLink;
  }


  public void setCrmLink(String crmLink) {
    
    
    
    this.crmLink = crmLink;
  }


  public Customer projects(List<Project> projects) {
    
    
    
    
    this.projects = projects;
    return this;
  }

  public Customer addProjectsItem(Project projectsItem) {
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Project> getProjects() {
    return projects;
  }


  public void setProjects(List<Project> projects) {
    
    
    
    this.projects = projects;
  }


  public Customer accounts(List<Account> accounts) {
    
    
    
    
    this.accounts = accounts;
    return this;
  }

  public Customer addAccountsItem(Account accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Account> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<Account> accounts) {
    
    
    
    this.accounts = accounts;
  }


  public Customer created(Long created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    
    
    
    this.created = created;
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
   * @return the Customer instance itself
   */
  public Customer putAdditionalProperty(String key, Object value) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.name, customer.name) &&
        Objects.equals(this.paymentStatus, customer.paymentStatus) &&
        Objects.equals(this.image, customer.image) &&
        Objects.equals(this.contact, customer.contact) &&
        Objects.equals(this.alias, customer.alias) &&
        Objects.equals(this.cid, customer.cid) &&
        Objects.equals(this.updated, customer.updated) &&
        Objects.equals(this.crmLink, customer.crmLink) &&
        Objects.equals(this.projects, customer.projects) &&
        Objects.equals(this.accounts, customer.accounts) &&
        Objects.equals(this.created, customer.created)&&
        Objects.equals(this.additionalProperties, customer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, paymentStatus, image, contact, alias, cid, updated, crmLink, projects, accounts, created, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    crmLink: ").append(toIndentedString(crmLink)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("paymentStatus");
    openapiFields.add("image");
    openapiFields.add("contact");
    openapiFields.add("alias");
    openapiFields.add("cid");
    openapiFields.add("updated");
    openapiFields.add("crm_link");
    openapiFields.add("projects");
    openapiFields.add("accounts");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("cid");
    openapiRequiredFields.add("projects");
    openapiRequiredFields.add("accounts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Customer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Customer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Customer is not found in the empty JSON string", Customer.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Customer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("paymentStatus") != null && !jsonObj.get("paymentStatus").isJsonNull()) && !jsonObj.get("paymentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentStatus").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) && !jsonObj.get("contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact").toString()));
      }
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
      if ((jsonObj.get("crm_link") != null && !jsonObj.get("crm_link").isJsonNull()) && !jsonObj.get("crm_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crm_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crm_link").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("projects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
      }

      JsonArray jsonArrayprojects = jsonObj.getAsJsonArray("projects");
      // validate the required field `projects` (array)
      for (int i = 0; i < jsonArrayprojects.size(); i++) {
        Project.validateJsonObject(jsonArrayprojects.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("accounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
      }

      JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
      // validate the required field `accounts` (array)
      for (int i = 0; i < jsonArrayaccounts.size(); i++) {
        Account.validateJsonObject(jsonArrayaccounts.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Customer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Customer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Customer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Customer.class));

       return (TypeAdapter<T>) new TypeAdapter<Customer>() {
           @Override
           public void write(JsonWriter out, Customer value) throws IOException {
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
           public Customer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Customer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Customer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Customer
  * @throws IOException if the JSON string is invalid with respect to Customer
  */
  public static Customer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Customer.class);
  }

 /**
  * Convert an instance of Customer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
