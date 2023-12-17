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

import java.util.ArrayList;
import java.util.List;
/**
 * AnimalTypesResponse
 */

import javax.annotation.processing.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T13:31:36.545254300+02:00[Asia/Jerusalem]")

public class AnimalTypesResponse {
  @SerializedName("types")
  private List<AnimalType> types = null;

  public AnimalTypesResponse types(List<AnimalType> types) {
    this.types = types;
    return this;
  }

  public AnimalTypesResponse addTypesItem(AnimalType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<AnimalType>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public List<AnimalType> getTypes() {
    return types;
  }

  public void setTypes(List<AnimalType> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalTypesResponse animalTypesResponse = (AnimalTypesResponse) o;
    return Objects.equals(this.types, animalTypesResponse.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalTypesResponse {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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