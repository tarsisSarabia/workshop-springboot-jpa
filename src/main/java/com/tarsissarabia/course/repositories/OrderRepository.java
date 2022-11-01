package com.tarsissarabia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsissarabia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
