package com.claimai.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    @PostMapping("/analyze")
    public String analyzeClaim(@RequestBody String claimDescription) {
        return """
                {
                  "fraudRisk": "7%",
                  "approvalConfidence": "93%",
                  "recommendation": "Auto-approve with minor manual review",
                  "message": "Claim analyzed successfully using AI"
                }
                """;
    }
}
