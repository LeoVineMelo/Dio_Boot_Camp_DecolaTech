package com.example.customerfeedback.domain.repository;

import com.example.customerfeedback.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
