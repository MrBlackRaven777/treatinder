package com.treat.treatinder.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long sourceId;
    @Enumerated(EnumType.STRING)
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
