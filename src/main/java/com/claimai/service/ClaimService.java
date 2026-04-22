package com.claimai.service;

import com.claimai.dto.ClaimRequest;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {

    /**
     * Analyzes a claim using mock AI logic.
     * In real project, this would call Azure AI / OpenAI service.
     */
    public String analyzeClaim(ClaimRequest request) {
        
        StringBuilder analysis = new StringBuilder();
        analysis.append("{\n");
        analysis.append("  \"claimId\": \"").append(request.getClaimId() != null ? request.getClaimId() : "CLM-" + System.currentTimeMillis()).append("\",\n");
        analysis.append("  \"fraudRisk\": \"7%\",\n");
        analysis.append("  \"approvalConfidence\": \"93%\",\n");
        analysis.append("  \"recommendation\": \"Auto-approve with minor manual review for high-value items\",\n");
        analysis.append("  \"message\": \"Claim analyzed successfully using AI model\",\n");
        analysis.append("  \"processedAmount\": ").append(request.getAmount() != null ? request.getAmount() : 12450.0).append("\n");
        analysis.append("}");

        return analysis.toString();
    }

    public String healthCheck() {
        return "ClaimAI Backend is healthy and running! ✅";
    }
}
