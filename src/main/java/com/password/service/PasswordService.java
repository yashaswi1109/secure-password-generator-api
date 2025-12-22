package com.password.passwordgenerator.service;

import com.password.passwordgenerator.model.PasswordRequest;
import com.password.passwordgenerator.model.PasswordResponse;
import com.password.passwordgenerator.util.PasswordUtil;
import org.springframework.stereotype.Service;

/**
 * Service layer holds business logic.
 */
@Service
public class PasswordService {

    public PasswordResponse generatePassword(PasswordRequest request) {

        String password = PasswordUtil.generate(
                request.getLength(),
                request.isUpper(),
                request.isDigits(),
                request.isSymbols()
        );

        String strength = PasswordUtil.evaluateStrength(password);

        return new PasswordResponse(password, strength);
    }
}
