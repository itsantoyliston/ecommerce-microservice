package com.microservice.catalog_service.domain;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String s) {
    super(s);
    }

    public static ProductNotFoundException forCode(String code)
    {
        return new ProductNotFoundException("Product  with code"+ code+" not found");
    }
}
