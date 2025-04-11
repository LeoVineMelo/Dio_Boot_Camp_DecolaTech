package com.example.customerfeedback.domain.repository;

import com.example.customerfeedback.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
