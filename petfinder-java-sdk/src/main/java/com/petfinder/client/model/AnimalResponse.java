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
 * AnimalResponse
 */

import javax.annotation.processing.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T13:31:36.545254300+02:00[Asia/Jerusalem]")

public class AnimalResponse {
  @SerializedName("animal")
  private Animal animal = null;

  public AnimalResponse animal(Animal animal) {
    this.animal = animal;
    return this;
  }

   /**
   * Get animal
   * @return animal
  **/
  @Schema(description = "")
  public Animal getAnimal() {
    return animal;
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalResponse animalResponse = (AnimalResponse) o;
    return Objects.equals(this.animal, animalResponse.animal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalResponse {\n");
    
    sb.append("    animal: ").append(toIndentedString(animal)).append("\n");
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