package com.treat.treatinder.configurations;

import com.treat.treatinder.api.petfinder.PFWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrapperConfiguration {

    @Value("${source.petfinder.apiKey}")
    private String apiKey;

    @Value("${source.petfinder.secret}")
    private String secret;

    @Bean
    public PFWrapper getWrapper() {
        return new PFWrapper(apiKey, secret);
    }
}
