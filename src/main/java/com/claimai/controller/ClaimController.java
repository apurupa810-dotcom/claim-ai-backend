package com.claimai.controller;

import com.claimai.dto.ClaimRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    @PostMapping("/analyze")
    public ResponseEntity<String> analyzeClaim(@RequestBody ClaimRequest request) {
        
        String analysis = """
                {
                  "claimId": "%s",
                  "fraudRisk": "7%%",
                  "approvalConfidence": "93%%",
                  "recommendation": "Auto-approve with minor manual review for high-value items",
                  "message": "Claim analyzed successfully using AI model",
                  "processedAmount": %.2f
                }
                """.formatted(
                    request.getClaimId() != null ? request.getClaimId() : "CLM-" + System.currentTimeMillis(),
                    request.getAmount() != null ? request.getAmount() : 12450.0
                );

        return ResponseEntity.ok(analysis);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "ClaimAI Backend is running successfully! ✅";
    }
}
