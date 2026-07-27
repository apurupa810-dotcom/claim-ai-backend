package com.claimai.controller;

import com.claimai.dto.ClaimRequest;
import com.claimai.dto.ClaimResponse;
import com.claimai.service.ClaimService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(
            ClaimService claimService
    ) {
        this.claimService = claimService;
    }

    @PostMapping("/analyze")
    public ResponseEntity<ClaimResponse>
            analyzeClaim(
                @Valid
                @RequestBody
                ClaimRequest request
            ) {

        return ResponseEntity.ok(
            claimService.analyzeClaim(request)
        );
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok(
            claimService.healthCheck()
        );
    }
}
