package com.example.customerfeedback.domain.repository;

import com.example.customerfeedback.domain.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByCustomerId(Long customerId); // buscar feedbacks de um cliente específico
}
