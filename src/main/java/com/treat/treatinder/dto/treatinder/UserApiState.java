package com.treat.treatinder.dto.treatinder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserApiState {
    private FilterDto filter;
    private AtomicInteger page;
    private int limit;
}
