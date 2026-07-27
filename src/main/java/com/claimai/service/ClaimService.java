package com.claimai.service;

import java.util.UUID;

import com.claimai.dto.AgentResults;
import com.claimai.dto.ClaimRequest;
import com.claimai.dto.ClaimResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ClaimService {

    private static final Logger log =
        LoggerFactory.getLogger(ClaimService.class);

    private final RestTemplate restTemplate;
    private final String pythonAiUrl;

    public ClaimService(
            RestTemplate restTemplate,
            @Value("${claimai.python.url}")
            String pythonAiUrl
    ) {
        this.restTemplate = restTemplate;
        this.pythonAiUrl = pythonAiUrl;
    }

    public ClaimResponse analyzeClaim(
            ClaimRequest request
    ) {
        ensureClaimId(request);

        try {
            ClaimResponse response =
                restTemplate.postForObject(
                    pythonAiUrl,
                    request,
                    ClaimResponse.class
                );

            if (response == null) {
                return buildFallback(request);
            }

            response.setFallback(false);

            if (response.getClaimId() == null) {
                response.setClaimId(
                    request.getClaimId()
                );
            }

            return response;

        } catch (RestClientException exception) {
            log.error(
                "AI service call failed for claim {}",
                request.getClaimId(),
                exception
            );

            return buildFallback(request);
        }
    }

    public String healthCheck() {
        return "ClaimAI Backend is healthy";
    }

    private void ensureClaimId(
            ClaimRequest request
    ) {
        if (
            request.getClaimId() == null
            || request.getClaimId().isBlank()
        ) {
            request.setClaimId(
                "CLM-"
                    + UUID.randomUUID()
                        .toString()
                        .substring(0, 8)
                        .toUpperCase()
            );
        }
    }

    private ClaimResponse buildFallback(
            ClaimRequest request
    ) {
        return ClaimResponse.builder()
            .claimId(request.getClaimId())
            .fraudRisk("7%")
            .approvalConfidence("90%")
            .recommendation("MANUAL_REVIEW")
            .message(
                "AI service unavailable. "
                    + "Fallback analysis returned."
            )
            .processedAmount(request.getAmount())
            .fallback(true)
            .agents(
                AgentResults.builder()
                    .intakeAgent(
                        "Claim intake completed"
                    )
                    .fraudAgent(
                        "Fraud Risk: 7%"
                    )
                    .policyAgent(
                        "Policy Match: Not verified"
                    )
                    .validationAgent(
                        "Validation: Manual review"
                    )
                    .build()
            )
            .build();
    }
}
