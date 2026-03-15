package com.microservice.orderservice.web.controller;

import com.microservice.orderservice.web.controller.RabbitMQDemoController.MyPayload;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener {

    @RabbitListener(queues = "${orders.new-orders-queue}")
    public void handleNewOrder(MyPayload payload) {
        System.out.println("📦 New Order received: " + payload.content());
    }

    @RabbitListener(queues = "${orders.delivered-orders-queue}")
    public void handleDeliveredOrder(MyPayload payload) {
        System.out.println("✅ Delivered Order received: " + payload.content());
    }

    @RabbitListener(queues = "${orders.cancelled-orders-queue}")
    public void handleCancelledOrder(MyPayload payload) {
        System.out.println("❌ Cancelled Order received: " + payload.content());
    }

    @RabbitListener(queues = "${orders.error-orders-queue}")
    public void handleErrorOrder(MyPayload payload) {
        System.out.println("⚠️ Error Order received: " + payload.content());
    }
}
