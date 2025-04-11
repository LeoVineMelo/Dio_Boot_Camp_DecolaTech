package com.example.customerfeedback.domain.service;

import com.example.customerfeedback.domain.entity.Purchase;
import com.example.customerfeedback.domain.repository.PurchaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase create(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> findAll() {
        return purchaseRepository.findAll();
    }

    public Purchase findById(Long id) {
        return purchaseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Compra não encontrada com ID: " + id));
    }

    public List<Purchase> findByCustomerId(Long customerId) {
        return purchaseRepository.findByCustomerId(customerId);
    }

    public void delete(Long id) {
        Purchase existing = findById(id);
        purchaseRepository.delete(existing);
    }
}
