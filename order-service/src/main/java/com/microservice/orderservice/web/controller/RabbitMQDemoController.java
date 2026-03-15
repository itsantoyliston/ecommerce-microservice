package com.microservice.orderservice.web.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;
import com.microservice.orderservice.web.controller.ApplicationProperties;

@RestController
@RequestMapping("/mq")
public class RabbitMQDemoController {

    private final RabbitTemplate rabbitTemplate;
    private final ApplicationProperties properties;

    public RabbitMQDemoController(RabbitTemplate rabbitTemplate, ApplicationProperties properties) {
        this.rabbitTemplate = rabbitTemplate;
        this.properties = properties;
    }

    // DTOs using Java records for simplicity
    public static record MyMessage(String routingKey, MyPayload payload) {}
    public static record MyPayload(String content) {}

    @PostMapping("/send")
    public String sendMessage(@RequestBody MyMessage message) {
        rabbitTemplate.convertAndSend(
                properties.orderEventsExchange(),   // exchange name
                message.routingKey(),               // routing key
                message.payload()                   // payload object
        );
        return "Message sent to exchange [" + properties.orderEventsExchange() +
                "] with routing key [" + message.routingKey() + "]";
    }
}