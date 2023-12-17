package com.treat.treatinder.dto.treatinder.response;

import com.treat.treatinder.dto.treatinder.DogDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DogsResponse extends CommonResponse {
    private List<DogDto> dogs;
}
