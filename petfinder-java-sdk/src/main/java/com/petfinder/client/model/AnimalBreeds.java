/*
 * Petfinder API
 * The Petfinder API allows you to access the Petfinder database of hundreds of thousands of pets ready for adoption and over ten thousand animal welfare organizations. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@petfinder.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.petfinder.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AnimalBreeds
 */

import javax.annotation.processing.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T13:31:36.545254300+02:00[Asia/Jerusalem]")

public class AnimalBreeds {
  @SerializedName("primary")
  private String primary = null;

  @SerializedName("secondary")
  private String secondary = null;

  @SerializedName("mixed")
  private Boolean mixed = null;

  @SerializedName("unknown")
  private Boolean unknown = null;

  public AnimalBreeds primary(String primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @Schema(description = "")
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public AnimalBreeds secondary(String secondary) {
    this.secondary = secondary;
    return this;
  }

   /**
   * Get secondary
   * @return secondary
  **/
  @Schema(description = "")
  public String getSecondary() {
    return secondary;
  }

  public void setSecondary(String secondary) {
    this.secondary = secondary;
  }

  public AnimalBreeds mixed(Boolean mixed) {
    this.mixed = mixed;
    return this;
  }

   /**
   * Get mixed
   * @return mixed
  **/
  @Schema(description = "")
  public Boolean isMixed() {
    return mixed;
  }

  public void setMixed(Boolean mixed) {
    this.mixed = mixed;
  }

  public AnimalBreeds unknown(Boolean unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @Schema(description = "")
  public Boolean isUnknown() {
    return unknown;
  }

  public void setUnknown(Boolean unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalBreeds animalBreeds = (AnimalBreeds) o;
    return Objects.equals(this.primary, animalBreeds.primary) &&
        Objects.equals(this.secondary, animalBreeds.secondary) &&
        Objects.equals(this.mixed, animalBreeds.mixed) &&
        Objects.equals(this.unknown, animalBreeds.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary, mixed, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalBreeds {\n");
    
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
    sb.append("    mixed: ").append(toIndentedString(mixed)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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