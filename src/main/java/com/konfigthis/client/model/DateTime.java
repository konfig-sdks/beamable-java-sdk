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
import com.konfigthis.client.model.Chronology;
import com.konfigthis.client.model.DateTimeZone;
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
 * DateTime
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DateTime {
  public static final String SERIALIZED_NAME_DAY_OF_YEAR = "dayOfYear";
  @SerializedName(SERIALIZED_NAME_DAY_OF_YEAR)
  private Integer dayOfYear;

  public static final String SERIALIZED_NAME_MINUTE_OF_HOUR = "minuteOfHour";
  @SerializedName(SERIALIZED_NAME_MINUTE_OF_HOUR)
  private Integer minuteOfHour;

  public static final String SERIALIZED_NAME_CHRONOLOGY = "chronology";
  @SerializedName(SERIALIZED_NAME_CHRONOLOGY)
  private Chronology chronology;

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "dayOfWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private Integer dayOfWeek;

  public static final String SERIALIZED_NAME_HOUR_OF_DAY = "hourOfDay";
  @SerializedName(SERIALIZED_NAME_HOUR_OF_DAY)
  private Integer hourOfDay;

  public static final String SERIALIZED_NAME_DAY_OF_MONTH = "dayOfMonth";
  @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
  private Integer dayOfMonth;

  public static final String SERIALIZED_NAME_YEAR_OF_ERA = "yearOfEra";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_ERA)
  private Integer yearOfEra;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_SECOND_OF_DAY = "secondOfDay";
  @SerializedName(SERIALIZED_NAME_SECOND_OF_DAY)
  private Integer secondOfDay;

  public static final String SERIALIZED_NAME_YEAR_OF_CENTURY = "yearOfCentury";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_CENTURY)
  private Integer yearOfCentury;

  public static final String SERIALIZED_NAME_EQUAL_NOW = "equalNow";
  @SerializedName(SERIALIZED_NAME_EQUAL_NOW)
  private Boolean equalNow;

  public static final String SERIALIZED_NAME_AFTER_NOW = "afterNow";
  @SerializedName(SERIALIZED_NAME_AFTER_NOW)
  private Boolean afterNow;

  public static final String SERIALIZED_NAME_SECOND_OF_MINUTE = "secondOfMinute";
  @SerializedName(SERIALIZED_NAME_SECOND_OF_MINUTE)
  private Integer secondOfMinute;

  public static final String SERIALIZED_NAME_MONTH_OF_YEAR = "monthOfYear";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_YEAR)
  private Integer monthOfYear;

  public static final String SERIALIZED_NAME_MILLIS = "millis";
  @SerializedName(SERIALIZED_NAME_MILLIS)
  private Integer millis;

  public static final String SERIALIZED_NAME_BEFORE_NOW = "beforeNow";
  @SerializedName(SERIALIZED_NAME_BEFORE_NOW)
  private Boolean beforeNow;

  public static final String SERIALIZED_NAME_CENTURY_OF_ERA = "centuryOfEra";
  @SerializedName(SERIALIZED_NAME_CENTURY_OF_ERA)
  private Integer centuryOfEra;

  public static final String SERIALIZED_NAME_MINUTE_OF_DAY = "minuteOfDay";
  @SerializedName(SERIALIZED_NAME_MINUTE_OF_DAY)
  private Integer minuteOfDay;

  public static final String SERIALIZED_NAME_ERA = "era";
  @SerializedName(SERIALIZED_NAME_ERA)
  private Integer era;

  public static final String SERIALIZED_NAME_MILLIS_OF_DAY = "millisOfDay";
  @SerializedName(SERIALIZED_NAME_MILLIS_OF_DAY)
  private Integer millisOfDay;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private DateTimeZone zone;

  public static final String SERIALIZED_NAME_MILLIS_OF_SECOND = "millisOfSecond";
  @SerializedName(SERIALIZED_NAME_MILLIS_OF_SECOND)
  private Integer millisOfSecond;

  public static final String SERIALIZED_NAME_WEEK_OF_WEEKYEAR = "weekOfWeekyear";
  @SerializedName(SERIALIZED_NAME_WEEK_OF_WEEKYEAR)
  private Integer weekOfWeekyear;

  public static final String SERIALIZED_NAME_WEEKYEAR = "weekyear";
  @SerializedName(SERIALIZED_NAME_WEEKYEAR)
  private Integer weekyear;

  public DateTime() {
  }

  public DateTime dayOfYear(Integer dayOfYear) {
    
    
    
    
    this.dayOfYear = dayOfYear;
    return this;
  }

   /**
   * Get dayOfYear
   * @return dayOfYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDayOfYear() {
    return dayOfYear;
  }


  public void setDayOfYear(Integer dayOfYear) {
    
    
    
    this.dayOfYear = dayOfYear;
  }


  public DateTime minuteOfHour(Integer minuteOfHour) {
    
    
    
    
    this.minuteOfHour = minuteOfHour;
    return this;
  }

   /**
   * Get minuteOfHour
   * @return minuteOfHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMinuteOfHour() {
    return minuteOfHour;
  }


  public void setMinuteOfHour(Integer minuteOfHour) {
    
    
    
    this.minuteOfHour = minuteOfHour;
  }


  public DateTime chronology(Chronology chronology) {
    
    
    
    
    this.chronology = chronology;
    return this;
  }

   /**
   * Get chronology
   * @return chronology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Chronology getChronology() {
    return chronology;
  }


  public void setChronology(Chronology chronology) {
    
    
    
    this.chronology = chronology;
  }


  public DateTime dayOfWeek(Integer dayOfWeek) {
    
    
    
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(Integer dayOfWeek) {
    
    
    
    this.dayOfWeek = dayOfWeek;
  }


  public DateTime hourOfDay(Integer hourOfDay) {
    
    
    
    
    this.hourOfDay = hourOfDay;
    return this;
  }

   /**
   * Get hourOfDay
   * @return hourOfDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHourOfDay() {
    return hourOfDay;
  }


  public void setHourOfDay(Integer hourOfDay) {
    
    
    
    this.hourOfDay = hourOfDay;
  }


  public DateTime dayOfMonth(Integer dayOfMonth) {
    
    
    
    
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * @return dayOfMonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  public void setDayOfMonth(Integer dayOfMonth) {
    
    
    
    this.dayOfMonth = dayOfMonth;
  }


  public DateTime yearOfEra(Integer yearOfEra) {
    
    
    
    
    this.yearOfEra = yearOfEra;
    return this;
  }

   /**
   * Get yearOfEra
   * @return yearOfEra
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getYearOfEra() {
    return yearOfEra;
  }


  public void setYearOfEra(Integer yearOfEra) {
    
    
    
    this.yearOfEra = yearOfEra;
  }


  public DateTime year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
  }


  public DateTime secondOfDay(Integer secondOfDay) {
    
    
    
    
    this.secondOfDay = secondOfDay;
    return this;
  }

   /**
   * Get secondOfDay
   * @return secondOfDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSecondOfDay() {
    return secondOfDay;
  }


  public void setSecondOfDay(Integer secondOfDay) {
    
    
    
    this.secondOfDay = secondOfDay;
  }


  public DateTime yearOfCentury(Integer yearOfCentury) {
    
    
    
    
    this.yearOfCentury = yearOfCentury;
    return this;
  }

   /**
   * Get yearOfCentury
   * @return yearOfCentury
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getYearOfCentury() {
    return yearOfCentury;
  }


  public void setYearOfCentury(Integer yearOfCentury) {
    
    
    
    this.yearOfCentury = yearOfCentury;
  }


  public DateTime equalNow(Boolean equalNow) {
    
    
    
    
    this.equalNow = equalNow;
    return this;
  }

   /**
   * Get equalNow
   * @return equalNow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEqualNow() {
    return equalNow;
  }


  public void setEqualNow(Boolean equalNow) {
    
    
    
    this.equalNow = equalNow;
  }


  public DateTime afterNow(Boolean afterNow) {
    
    
    
    
    this.afterNow = afterNow;
    return this;
  }

   /**
   * Get afterNow
   * @return afterNow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAfterNow() {
    return afterNow;
  }


  public void setAfterNow(Boolean afterNow) {
    
    
    
    this.afterNow = afterNow;
  }


  public DateTime secondOfMinute(Integer secondOfMinute) {
    
    
    
    
    this.secondOfMinute = secondOfMinute;
    return this;
  }

   /**
   * Get secondOfMinute
   * @return secondOfMinute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSecondOfMinute() {
    return secondOfMinute;
  }


  public void setSecondOfMinute(Integer secondOfMinute) {
    
    
    
    this.secondOfMinute = secondOfMinute;
  }


  public DateTime monthOfYear(Integer monthOfYear) {
    
    
    
    
    this.monthOfYear = monthOfYear;
    return this;
  }

   /**
   * Get monthOfYear
   * @return monthOfYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMonthOfYear() {
    return monthOfYear;
  }


  public void setMonthOfYear(Integer monthOfYear) {
    
    
    
    this.monthOfYear = monthOfYear;
  }


  public DateTime millis(Integer millis) {
    
    
    
    
    this.millis = millis;
    return this;
  }

   /**
   * Get millis
   * @return millis
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMillis() {
    return millis;
  }


  public void setMillis(Integer millis) {
    
    
    
    this.millis = millis;
  }


  public DateTime beforeNow(Boolean beforeNow) {
    
    
    
    
    this.beforeNow = beforeNow;
    return this;
  }

   /**
   * Get beforeNow
   * @return beforeNow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBeforeNow() {
    return beforeNow;
  }


  public void setBeforeNow(Boolean beforeNow) {
    
    
    
    this.beforeNow = beforeNow;
  }


  public DateTime centuryOfEra(Integer centuryOfEra) {
    
    
    
    
    this.centuryOfEra = centuryOfEra;
    return this;
  }

   /**
   * Get centuryOfEra
   * @return centuryOfEra
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCenturyOfEra() {
    return centuryOfEra;
  }


  public void setCenturyOfEra(Integer centuryOfEra) {
    
    
    
    this.centuryOfEra = centuryOfEra;
  }


  public DateTime minuteOfDay(Integer minuteOfDay) {
    
    
    
    
    this.minuteOfDay = minuteOfDay;
    return this;
  }

   /**
   * Get minuteOfDay
   * @return minuteOfDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMinuteOfDay() {
    return minuteOfDay;
  }


  public void setMinuteOfDay(Integer minuteOfDay) {
    
    
    
    this.minuteOfDay = minuteOfDay;
  }


  public DateTime era(Integer era) {
    
    
    
    
    this.era = era;
    return this;
  }

   /**
   * Get era
   * @return era
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getEra() {
    return era;
  }


  public void setEra(Integer era) {
    
    
    
    this.era = era;
  }


  public DateTime millisOfDay(Integer millisOfDay) {
    
    
    
    
    this.millisOfDay = millisOfDay;
    return this;
  }

   /**
   * Get millisOfDay
   * @return millisOfDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMillisOfDay() {
    return millisOfDay;
  }


  public void setMillisOfDay(Integer millisOfDay) {
    
    
    
    this.millisOfDay = millisOfDay;
  }


  public DateTime zone(DateTimeZone zone) {
    
    
    
    
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeZone getZone() {
    return zone;
  }


  public void setZone(DateTimeZone zone) {
    
    
    
    this.zone = zone;
  }


  public DateTime millisOfSecond(Integer millisOfSecond) {
    
    
    
    
    this.millisOfSecond = millisOfSecond;
    return this;
  }

   /**
   * Get millisOfSecond
   * @return millisOfSecond
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMillisOfSecond() {
    return millisOfSecond;
  }


  public void setMillisOfSecond(Integer millisOfSecond) {
    
    
    
    this.millisOfSecond = millisOfSecond;
  }


  public DateTime weekOfWeekyear(Integer weekOfWeekyear) {
    
    
    
    
    this.weekOfWeekyear = weekOfWeekyear;
    return this;
  }

   /**
   * Get weekOfWeekyear
   * @return weekOfWeekyear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getWeekOfWeekyear() {
    return weekOfWeekyear;
  }


  public void setWeekOfWeekyear(Integer weekOfWeekyear) {
    
    
    
    this.weekOfWeekyear = weekOfWeekyear;
  }


  public DateTime weekyear(Integer weekyear) {
    
    
    
    
    this.weekyear = weekyear;
    return this;
  }

   /**
   * Get weekyear
   * @return weekyear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getWeekyear() {
    return weekyear;
  }


  public void setWeekyear(Integer weekyear) {
    
    
    
    this.weekyear = weekyear;
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
   * @return the DateTime instance itself
   */
  public DateTime putAdditionalProperty(String key, Object value) {
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
    DateTime dateTime = (DateTime) o;
    return Objects.equals(this.dayOfYear, dateTime.dayOfYear) &&
        Objects.equals(this.minuteOfHour, dateTime.minuteOfHour) &&
        Objects.equals(this.chronology, dateTime.chronology) &&
        Objects.equals(this.dayOfWeek, dateTime.dayOfWeek) &&
        Objects.equals(this.hourOfDay, dateTime.hourOfDay) &&
        Objects.equals(this.dayOfMonth, dateTime.dayOfMonth) &&
        Objects.equals(this.yearOfEra, dateTime.yearOfEra) &&
        Objects.equals(this.year, dateTime.year) &&
        Objects.equals(this.secondOfDay, dateTime.secondOfDay) &&
        Objects.equals(this.yearOfCentury, dateTime.yearOfCentury) &&
        Objects.equals(this.equalNow, dateTime.equalNow) &&
        Objects.equals(this.afterNow, dateTime.afterNow) &&
        Objects.equals(this.secondOfMinute, dateTime.secondOfMinute) &&
        Objects.equals(this.monthOfYear, dateTime.monthOfYear) &&
        Objects.equals(this.millis, dateTime.millis) &&
        Objects.equals(this.beforeNow, dateTime.beforeNow) &&
        Objects.equals(this.centuryOfEra, dateTime.centuryOfEra) &&
        Objects.equals(this.minuteOfDay, dateTime.minuteOfDay) &&
        Objects.equals(this.era, dateTime.era) &&
        Objects.equals(this.millisOfDay, dateTime.millisOfDay) &&
        Objects.equals(this.zone, dateTime.zone) &&
        Objects.equals(this.millisOfSecond, dateTime.millisOfSecond) &&
        Objects.equals(this.weekOfWeekyear, dateTime.weekOfWeekyear) &&
        Objects.equals(this.weekyear, dateTime.weekyear)&&
        Objects.equals(this.additionalProperties, dateTime.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfYear, minuteOfHour, chronology, dayOfWeek, hourOfDay, dayOfMonth, yearOfEra, year, secondOfDay, yearOfCentury, equalNow, afterNow, secondOfMinute, monthOfYear, millis, beforeNow, centuryOfEra, minuteOfDay, era, millisOfDay, zone, millisOfSecond, weekOfWeekyear, weekyear, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTime {\n");
    sb.append("    dayOfYear: ").append(toIndentedString(dayOfYear)).append("\n");
    sb.append("    minuteOfHour: ").append(toIndentedString(minuteOfHour)).append("\n");
    sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    yearOfEra: ").append(toIndentedString(yearOfEra)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    secondOfDay: ").append(toIndentedString(secondOfDay)).append("\n");
    sb.append("    yearOfCentury: ").append(toIndentedString(yearOfCentury)).append("\n");
    sb.append("    equalNow: ").append(toIndentedString(equalNow)).append("\n");
    sb.append("    afterNow: ").append(toIndentedString(afterNow)).append("\n");
    sb.append("    secondOfMinute: ").append(toIndentedString(secondOfMinute)).append("\n");
    sb.append("    monthOfYear: ").append(toIndentedString(monthOfYear)).append("\n");
    sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
    sb.append("    beforeNow: ").append(toIndentedString(beforeNow)).append("\n");
    sb.append("    centuryOfEra: ").append(toIndentedString(centuryOfEra)).append("\n");
    sb.append("    minuteOfDay: ").append(toIndentedString(minuteOfDay)).append("\n");
    sb.append("    era: ").append(toIndentedString(era)).append("\n");
    sb.append("    millisOfDay: ").append(toIndentedString(millisOfDay)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    millisOfSecond: ").append(toIndentedString(millisOfSecond)).append("\n");
    sb.append("    weekOfWeekyear: ").append(toIndentedString(weekOfWeekyear)).append("\n");
    sb.append("    weekyear: ").append(toIndentedString(weekyear)).append("\n");
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
    openapiFields.add("dayOfYear");
    openapiFields.add("minuteOfHour");
    openapiFields.add("chronology");
    openapiFields.add("dayOfWeek");
    openapiFields.add("hourOfDay");
    openapiFields.add("dayOfMonth");
    openapiFields.add("yearOfEra");
    openapiFields.add("year");
    openapiFields.add("secondOfDay");
    openapiFields.add("yearOfCentury");
    openapiFields.add("equalNow");
    openapiFields.add("afterNow");
    openapiFields.add("secondOfMinute");
    openapiFields.add("monthOfYear");
    openapiFields.add("millis");
    openapiFields.add("beforeNow");
    openapiFields.add("centuryOfEra");
    openapiFields.add("minuteOfDay");
    openapiFields.add("era");
    openapiFields.add("millisOfDay");
    openapiFields.add("zone");
    openapiFields.add("millisOfSecond");
    openapiFields.add("weekOfWeekyear");
    openapiFields.add("weekyear");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dayOfYear");
    openapiRequiredFields.add("minuteOfHour");
    openapiRequiredFields.add("dayOfWeek");
    openapiRequiredFields.add("hourOfDay");
    openapiRequiredFields.add("dayOfMonth");
    openapiRequiredFields.add("yearOfEra");
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("secondOfDay");
    openapiRequiredFields.add("yearOfCentury");
    openapiRequiredFields.add("equalNow");
    openapiRequiredFields.add("afterNow");
    openapiRequiredFields.add("secondOfMinute");
    openapiRequiredFields.add("monthOfYear");
    openapiRequiredFields.add("millis");
    openapiRequiredFields.add("beforeNow");
    openapiRequiredFields.add("centuryOfEra");
    openapiRequiredFields.add("minuteOfDay");
    openapiRequiredFields.add("era");
    openapiRequiredFields.add("millisOfDay");
    openapiRequiredFields.add("millisOfSecond");
    openapiRequiredFields.add("weekOfWeekyear");
    openapiRequiredFields.add("weekyear");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DateTime
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DateTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DateTime is not found in the empty JSON string", DateTime.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DateTime.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `chronology`
      if (jsonObj.get("chronology") != null && !jsonObj.get("chronology").isJsonNull()) {
        Chronology.validateJsonObject(jsonObj.getAsJsonObject("chronology"));
      }
      // validate the optional field `zone`
      if (jsonObj.get("zone") != null && !jsonObj.get("zone").isJsonNull()) {
        DateTimeZone.validateJsonObject(jsonObj.getAsJsonObject("zone"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DateTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DateTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DateTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DateTime.class));

       return (TypeAdapter<T>) new TypeAdapter<DateTime>() {
           @Override
           public void write(JsonWriter out, DateTime value) throws IOException {
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
           public DateTime read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DateTime instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DateTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateTime
  * @throws IOException if the JSON string is invalid with respect to DateTime
  */
  public static DateTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateTime.class);
  }

 /**
  * Convert an instance of DateTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
