package com.poc.gitactions.config;

import com.poc.gitactions.service.PersonService;
import com.poc.gitactions.service.PersonServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public PersonService getPersonService() {
        return new PersonServiceImp();
    }
}
