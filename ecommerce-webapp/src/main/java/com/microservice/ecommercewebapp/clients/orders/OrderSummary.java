package com.microservice.ecommercewebapp.clients.orders;

public record OrderSummary(String orderNumber, OrderStatus status) {}