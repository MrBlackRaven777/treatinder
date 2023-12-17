package com.treat.treatinder.domain.entities;

import jakarta.persistence.*;

public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long sourceId;
    @Enumerated(EnumType.STRING)
    private Sources source;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String website;
}
