package com.treat.treatinder.configurations;

import com.petfinder.client.model.*;
import com.treat.treatinder.domain.entities.Dog;
import com.treat.treatinder.domain.entities.Sources;
import com.treat.treatinder.dto.treatinder.DogDto;
import com.treat.treatinder.dto.treatinder.OrganizationDto;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MapperConfiguration {

    @Bean
    public ModelMapper getMapper() {
        ModelMapper modelMapper = new ModelMapper();
        Map<String, Converter<?, String>> converters = initConverters();
        modelMapper.getConfiguration().setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setFieldMatchingEnabled(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        modelMapper.typeMap(Animal.class, DogDto.class).addMappings(mapper -> {
            mapper.skip(Animal::getId, DogDto::setId);
            mapper.map(Animal::getId, DogDto::setSourceId);
            mapper.map(src -> Sources.PETFINDER, DogDto::setSource);
            mapper.using(converters.get("breeds")).map(Animal::getBreeds, DogDto::setBreeds);
            mapper.using(converters.get("colors")).map(Animal::getColors, DogDto::setColors);
            mapper.using(converters.get("photo")).map(Animal::getPhotos, DogDto::setPhoto);
        });

//        modelMapper.typeMap(Organization.class, OrganizationDto.class).addMappings(mapper -> {
//            mapper.skip(Organization::getId, OrganizationDto::setId);
//            mapper.map(Organization::getId, OrganizationDto::setSourceId);
//            mapper.map(src -> Sources.PETFINDER, OrganizationDto::setSource);
//            mapper.using(converters.get("breeds")).map(Organization::getBreeds, DogDto::setBreeds);
//            mapper.using(converters.get("colors")).map(Organization::getColors, DogDto::setColors);
//            mapper.using(converters.get("photo")).map(Organization::getPhotos, DogDto::setPhoto);
//        });
        return modelMapper;
    }

    private Map<String, Converter<?, String>> initConverters() {
        Map<String, Converter<?, String>> map = new HashMap<>();
        map.put("breeds", ctx -> "Primary: " + ((AnimalBreeds)ctx.getSource()).getPrimary() + "; Secondary: " + ((AnimalBreeds)ctx.getSource()).getSecondary());
        map.put("colors", ctx -> String.join(", ", ((AnimalColors)ctx.getSource()).getPrimary(), ((AnimalColors)ctx.getSource()).getSecondary(), ((AnimalColors)ctx.getSource()).getTertiary()));
        map.put("photo", ctx -> ((ArrayList<Photo>) ctx.getSource()).isEmpty() ? null : ((ArrayList<Photo>)ctx.getSource()).get(0).getFull());
//        map.put("address", ctx -> String.join(", ", ((OrganizationA)ctx.getSource()).get(), ((AnimalColors)ctx.getSource()).getSecondary(), ((AnimalColors)ctx.getSource()).getTertiary()));

        return map;
    }


}
