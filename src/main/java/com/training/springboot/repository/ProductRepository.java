package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
