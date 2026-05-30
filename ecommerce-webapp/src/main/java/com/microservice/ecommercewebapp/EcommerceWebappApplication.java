package com.microservice.ecommercewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan

public class EcommerceWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceWebappApplication.class, args);
    }

}
