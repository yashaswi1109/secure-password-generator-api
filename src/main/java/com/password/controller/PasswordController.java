package com.password.passwordgenerator.controller;

import com.password.passwordgenerator.model.PasswordRequest;
import com.password.passwordgenerator.model.PasswordResponse;
import com.password.passwordgenerator.service.PasswordService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller exposing password APIs.
 */
@RestController
@RequestMapping("/api/password")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    /**
     * POST /api/password/generate
     */
    @PostMapping("/generate")
    public PasswordResponse generatePassword(
            @Valid @RequestBody PasswordRequest request
    ) {
        return passwordService.generatePassword(request);
    }
}
