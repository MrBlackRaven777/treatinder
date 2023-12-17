package com.treat.treatinder.dto.treatinder.response;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BreedsResponse extends CommonResponse {
    private List<String> breeds;
}
