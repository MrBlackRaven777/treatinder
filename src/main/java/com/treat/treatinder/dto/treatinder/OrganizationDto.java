package com.treat.treatinder.dto.treatinder;

import com.treat.treatinder.domain.entities.Sources;
import lombok.Data;

@Data
public class OrganizationDto {

    private long id;
    private long sourceId;
    private Sources source;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String website;
}
