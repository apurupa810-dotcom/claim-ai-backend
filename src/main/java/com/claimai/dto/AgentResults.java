package com.claimai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentResults {

    private String intakeAgent;
    private String fraudAgent;
    private String policyAgent;
    private String validationAgent;
}
