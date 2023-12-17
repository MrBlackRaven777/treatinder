package com.treat.treatinder.dto.treatinder.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrgsResponse extends CommonResponse {
    private Map<String, String> organizations;
}
