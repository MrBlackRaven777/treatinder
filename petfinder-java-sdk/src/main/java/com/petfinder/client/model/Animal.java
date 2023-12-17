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
import org.threeten.bp.OffsetDateTime;
/**
 * Animal
 */

import javax.annotation.processing.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-10T13:31:36.545254300+02:00[Asia/Jerusalem]")

public class Animal {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("organization_id")
  private String organizationId = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("species")
  private String species = null;

  @SerializedName("breeds")
  private AnimalBreeds breeds = null;

  @SerializedName("colors")
  private AnimalColors colors = null;

  @SerializedName("age")
  private String age = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("coat")
  private String coat = null;

  @SerializedName("attributes")
  private AnimalAttributes attributes = null;

  @SerializedName("environment")
  private AnimalEnvironment environment = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("photos")
  private List<Photo> photos = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("published_at")
  private OffsetDateTime publishedAt = null;

  @SerializedName("contact")
  private AnimalContact contact = null;

  @SerializedName("_links")
  private AnimalLinks _links = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public Animal organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @Schema(description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public Animal url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Animal type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Animal species(String species) {
    this.species = species;
    return this;
  }

   /**
   * Get species
   * @return species
  **/
  @Schema(description = "")
  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public Animal breeds(AnimalBreeds breeds) {
    this.breeds = breeds;
    return this;
  }

   /**
   * Get breeds
   * @return breeds
  **/
  @Schema(description = "")
  public AnimalBreeds getBreeds() {
    return breeds;
  }

  public void setBreeds(AnimalBreeds breeds) {
    this.breeds = breeds;
  }

  public Animal colors(AnimalColors colors) {
    this.colors = colors;
    return this;
  }

   /**
   * Get colors
   * @return colors
  **/
  @Schema(description = "")
  public AnimalColors getColors() {
    return colors;
  }

  public void setColors(AnimalColors colors) {
    this.colors = colors;
  }

  public Animal age(String age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @Schema(description = "")
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public Animal gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(description = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Animal size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Animal coat(String coat) {
    this.coat = coat;
    return this;
  }

   /**
   * Get coat
   * @return coat
  **/
  @Schema(description = "")
  public String getCoat() {
    return coat;
  }

  public void setCoat(String coat) {
    this.coat = coat;
  }

  public Animal attributes(AnimalAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public AnimalAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AnimalAttributes attributes) {
    this.attributes = attributes;
  }

  public Animal environment(AnimalEnvironment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @Schema(description = "")
  public AnimalEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(AnimalEnvironment environment) {
    this.environment = environment;
  }

  public Animal tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Animal addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Animal name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Animal description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Animal photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  public Animal addPhotosItem(Photo photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<Photo>();
    }
    this.photos.add(photosItem);
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @Schema(description = "")
  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public Animal status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Adoption status
   * @return status
  **/
  @Schema(description = "Adoption status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Animal publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Animal contact(AnimalContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Schema(description = "")
  public AnimalContact getContact() {
    return contact;
  }

  public void setContact(AnimalContact contact) {
    this.contact = contact;
  }

  public Animal _links(AnimalLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public AnimalLinks getLinks() {
    return _links;
  }

  public void setLinks(AnimalLinks _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return Objects.equals(this.id, animal.id) &&
        Objects.equals(this.organizationId, animal.organizationId) &&
        Objects.equals(this.url, animal.url) &&
        Objects.equals(this.type, animal.type) &&
        Objects.equals(this.species, animal.species) &&
        Objects.equals(this.breeds, animal.breeds) &&
        Objects.equals(this.colors, animal.colors) &&
        Objects.equals(this.age, animal.age) &&
        Objects.equals(this.gender, animal.gender) &&
        Objects.equals(this.size, animal.size) &&
        Objects.equals(this.coat, animal.coat) &&
        Objects.equals(this.attributes, animal.attributes) &&
        Objects.equals(this.environment, animal.environment) &&
        Objects.equals(this.tags, animal.tags) &&
        Objects.equals(this.name, animal.name) &&
        Objects.equals(this.description, animal.description) &&
        Objects.equals(this.photos, animal.photos) &&
        Objects.equals(this.status, animal.status) &&
        Objects.equals(this.publishedAt, animal.publishedAt) &&
        Objects.equals(this.contact, animal.contact) &&
        Objects.equals(this._links, animal._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, url, type, species, breeds, colors, age, gender, size, coat, attributes, environment, tags, name, description, photos, status, publishedAt, contact, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    breeds: ").append(toIndentedString(breeds)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    coat: ").append(toIndentedString(coat)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
