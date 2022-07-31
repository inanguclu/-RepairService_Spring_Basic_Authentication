package com.example.springsecurityrepairservicerestapi.repositories;

import com.example.springsecurityrepairservicerestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}