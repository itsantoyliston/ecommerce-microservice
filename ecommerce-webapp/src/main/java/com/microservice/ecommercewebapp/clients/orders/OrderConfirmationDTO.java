package com.microservice.ecommercewebapp.clients.orders;

public record OrderConfirmationDTO(String orderNumber, OrderStatus status) {}