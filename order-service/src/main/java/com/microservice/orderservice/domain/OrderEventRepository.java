package com.microservice.orderservice.domain;

import com.microservice.orderservice.domain.models.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface OrderEventRepository extends JpaRepository<OrderEventEntity,Long> {


}
