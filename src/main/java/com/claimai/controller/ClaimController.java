package com.claimai.controller;

import com.claimai.dto.ClaimRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String pythonAiUrl = "http://localhost:8000/analyze";   // Change to real URL later

    @PostMapping("/analyze")
    public ResponseEntity<String> analyzeClaim(@RequestBody ClaimRequest request) {
        
        try {
            // Call Python AI Service
            String aiResponse = restTemplate.postForObject(pythonAiUrl, request, String.class);
            return ResponseEntity.ok(aiResponse);
        } catch (Exception e) {
            // Fallback response if Python service is down
            return ResponseEntity.ok("""
                {
                  "fraudRisk": "8%",
                  "approvalConfidence": "91%",
                  "recommendation": "Manual review recommended",
                  "message": "AI Service temporarily unavailable. Using fallback analysis."
                }
                """);
        }
    }
}
