package com.treat.treatinder.dto.treatinder.request;

import lombok.Data;

@Data
public class RegisterRequest {
    String name;
    int passwordHash;
}
