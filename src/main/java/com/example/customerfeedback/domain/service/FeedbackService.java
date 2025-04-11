package com.example.customerfeedback.domain.service;

import com.example.customerfeedback.domain.entity.Feedback;
import com.example.customerfeedback.domain.repository.FeedbackRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository repository;

    public FeedbackService(FeedbackRepository repository) {
        this.repository = repository;
    }

    public Feedback create(Feedback feedback) {
        return repository.save(feedback);
    }

    public List<Feedback> findAll() {
        return repository.findAll();
    }

    public Feedback findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Feedback não encontrado com ID: " + id));
    }

    public Feedback update(Long id, Feedback updatedFeedback) {
        Feedback existing = findById(id);
        existing.setMessage(updatedFeedback.getMessage());
        // adicione outros campos se quiser
        return repository.save(existing);
    }

    public void delete(Long id) {
        Feedback existing = findById(id);
        repository.delete(existing);
    }
}
