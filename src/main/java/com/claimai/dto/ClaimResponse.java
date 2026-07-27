package com.claimai.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClaimResponse {

    private String claimId;
    private String fraudRisk;
    private String approvalConfidence;
    private String recommendation;
    private String message;
    private Double processedAmount;
    private boolean fallback;
    private AgentResults agents;
}
