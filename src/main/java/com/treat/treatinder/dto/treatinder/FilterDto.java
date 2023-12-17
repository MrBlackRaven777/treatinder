package com.treat.treatinder.dto.treatinder;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Data
public class FilterDto {
    private String type = "dog"; //as defined in assessment, we need dogs only
    private List<String> orgName;
    private List<String> gender;
    private List<String> breed;
    private String location;
    @EqualsAndHashCode.Exclude
    private int batchSize;

    public FilterDto(String orgName, String gender, String breed, String location, Integer batchSize) {
        this.orgName = orgName == null ? null : List.of(orgName.split(","));
        this.gender = gender == null ? null : List.of(gender.split(","));
        this.breed = breed == null ? null : List.of(breed.split(","));
        this.location = location;
        this.batchSize = batchSize;
    }
}
