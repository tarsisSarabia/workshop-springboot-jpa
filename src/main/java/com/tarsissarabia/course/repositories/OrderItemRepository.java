package com.tarsissarabia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsissarabia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
