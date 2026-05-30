package com.microservice.ecommercewebapp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ecommerce")
public record ApplicationProperties(String apiGatewayUrl) {
}
