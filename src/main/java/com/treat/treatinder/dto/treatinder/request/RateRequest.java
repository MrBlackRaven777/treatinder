package com.treat.treatinder.dto.treatinder.request;

import com.treat.treatinder.domain.entities.Actions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RateRequest {

    private UUID uuid;
    private long dogId;
    private Actions action;
}
