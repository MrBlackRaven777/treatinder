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

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;
/**
 * AnimalBreedsResponse
 */

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T17:44:26.261741900+02:00[Asia/Jerusalem]")

public class AnimalBreedsResponse {
  @SerializedName("breeds")
  private List<AnimalBreed> breeds = null;

  public AnimalBreedsResponse breeds(List<AnimalBreed> breeds) {
    this.breeds = breeds;
    return this;
  }

  public AnimalBreedsResponse addBreedsItem(AnimalBreed breedsItem) {
    if (this.breeds == null) {
      this.breeds = new ArrayList<AnimalBreed>();
    }
    this.breeds.add(breedsItem);
    return this;
  }

  /**
   * Get breeds
   * @return breeds
   **/
  @Schema(description = "")
  public List<AnimalBreed> getBreeds() {
    return breeds;
  }

  public void setBreeds(List<AnimalBreed> breeds) {
    this.breeds = breeds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalBreedsResponse AnimalBreedsResponse = (AnimalBreedsResponse) o;
    return Objects.equals(this.breeds, AnimalBreedsResponse.breeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breeds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalBreedsResponse {\n");

    sb.append("    breeds: ").append(toIndentedString(breeds)).append("\n");
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
