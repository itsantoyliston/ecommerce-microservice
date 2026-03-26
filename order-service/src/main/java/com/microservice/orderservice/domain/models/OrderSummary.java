package com.microservice.orderservice.domain.models;

public record OrderSummary(
        String orderNumber, OrderStatus status
) {
}
