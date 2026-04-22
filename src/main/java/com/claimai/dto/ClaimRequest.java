package com.claimai.dto;

import lombok.Data;

@Data
public class ClaimRequest {
    
    private String claimId;
    private String description;
    private Double amount;
    private String patientName;
    private String policyNumber;
    private String claimType;  // MEDICAL, AUTO, DISPUTE, etc.
    private String status;
}
