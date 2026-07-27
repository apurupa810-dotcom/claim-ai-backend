package com.claimai.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClaimRequest {

    private String claimId;

    @NotBlank(message = "Description is required")
    @Size(
        max = 2000,
        message = "Description cannot exceed 2000 characters"
    )
    private String description;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be greater than zero")
    private Double amount;

    @NotBlank(message = "Patient name is required")
    private String patientName;

    @NotBlank(message = "Policy number is required")
    private String policyNumber;

    @NotNull(message = "Claim type is required")
    private ClaimType claimType;
}
