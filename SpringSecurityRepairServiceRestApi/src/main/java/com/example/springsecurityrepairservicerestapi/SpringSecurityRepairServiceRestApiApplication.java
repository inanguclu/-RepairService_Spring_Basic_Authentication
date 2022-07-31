package com.example.springsecurityrepairservicerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringSecurityRepairServiceRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityRepairServiceRestApiApplication.class, args);
    }

}
