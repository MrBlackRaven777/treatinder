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
 * AnimalEnvironment
 */

import javax.annotation.processing.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T13:31:36.545254300+02:00[Asia/Jerusalem]")

public class AnimalEnvironment {
  @SerializedName("children")
  private Boolean children = null;

  @SerializedName("dogs")
  private Boolean dogs = null;

  @SerializedName("cats")
  private Boolean cats = null;

  public AnimalEnvironment children(Boolean children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public Boolean isChildren() {
    return children;
  }

  public void setChildren(Boolean children) {
    this.children = children;
  }

  public AnimalEnvironment dogs(Boolean dogs) {
    this.dogs = dogs;
    return this;
  }

   /**
   * Get dogs
   * @return dogs
  **/
  @Schema(description = "")
  public Boolean isDogs() {
    return dogs;
  }

  public void setDogs(Boolean dogs) {
    this.dogs = dogs;
  }

  public AnimalEnvironment cats(Boolean cats) {
    this.cats = cats;
    return this;
  }

   /**
   * Get cats
   * @return cats
  **/
  @Schema(description = "")
  public Boolean isCats() {
    return cats;
  }

  public void setCats(Boolean cats) {
    this.cats = cats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalEnvironment animalEnvironment = (AnimalEnvironment) o;
    return Objects.equals(this.children, animalEnvironment.children) &&
        Objects.equals(this.dogs, animalEnvironment.dogs) &&
        Objects.equals(this.cats, animalEnvironment.cats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, dogs, cats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalEnvironment {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    dogs: ").append(toIndentedString(dogs)).append("\n");
    sb.append("    cats: ").append(toIndentedString(cats)).append("\n");
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
