package com.claimai.dto;

import lombok.Data;

@Data
public class ClaimResponse {
    
    private String claimId;
    private String fraudRisk;
    private String approvalConfidence;
    private String recommendation;
    private String message;
    private Double processedAmount;
    
    // Constructor for easy creation
    public ClaimResponse(String claimId, String fraudRisk, String approvalConfidence, 
                        String recommendation, String message, Double processedAmount) {
        this.claimId = claimId;
        this.fraudRisk = fraudRisk;
        this.approvalConfidence = approvalConfidence;
        this.recommendation = recommendation;
        this.message = message;
        this.processedAmount = processedAmount;
    }
}
