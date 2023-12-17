package com.treat.treatinder.dto.treatinder;

import com.treat.treatinder.domain.entities.Sources;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DogDto {

    private long id;
    private long sourceId;
    private Sources source;
    private String name;
    private String organizationId;
    private String description;
    private String age;
    private String gender;
    private String size;
    private String coat;
    private String breeds;
    private String colors;
    private String photo;
}
