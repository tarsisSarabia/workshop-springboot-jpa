package com.tarsissarabia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsissarabia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
