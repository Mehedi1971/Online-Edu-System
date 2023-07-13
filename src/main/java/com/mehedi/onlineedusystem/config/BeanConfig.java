package com.mehedi.onlineedusystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public BeanConfig modelMapper() {
        return new BeanConfig();
    }

}
