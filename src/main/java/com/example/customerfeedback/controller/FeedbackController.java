package com.example.customerfeedback.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    @GetMapping
    public String hello() {
        return "Customer Feedback API is running!";
    }
}