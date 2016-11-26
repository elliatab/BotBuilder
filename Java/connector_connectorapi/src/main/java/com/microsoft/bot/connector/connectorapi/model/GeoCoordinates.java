/**
 * Microsoft Bot Connector API - v3.0
 * ﻿The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector/Swagger/ConnectorAPI.json)    © 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.microsoft.bot.connector.connectorapi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GeoCoordinates (entity type: \&quot;https://schema.org/GeoCoordinates\&quot;)
 */
@ApiModel(description = "GeoCoordinates (entity type: \"https://schema.org/GeoCoordinates\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-26T13:22:14.004+09:00")
public class GeoCoordinates   {
  @SerializedName("elevation")
  private Double elevation = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  public GeoCoordinates elevation(Double elevation) {
    this.elevation = elevation;
    return this;
  }

   /**
   * Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   * @return elevation
  **/
  @ApiModelProperty(example = "null", value = "Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  public Double getElevation() {
    return elevation;
  }

  public void setElevation(Double elevation) {
    this.elevation = elevation;
  }

  public GeoCoordinates latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public GeoCoordinates longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public GeoCoordinates type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the thing
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the thing")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeoCoordinates name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the thing
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the thing")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoordinates geoCoordinates = (GeoCoordinates) o;
    return Objects.equals(this.elevation, geoCoordinates.elevation) &&
        Objects.equals(this.latitude, geoCoordinates.latitude) &&
        Objects.equals(this.longitude, geoCoordinates.longitude) &&
        Objects.equals(this.type, geoCoordinates.type) &&
        Objects.equals(this.name, geoCoordinates.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elevation, latitude, longitude, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoordinates {\n");
    
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

