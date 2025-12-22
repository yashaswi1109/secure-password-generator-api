package com.password.passwordgenerator.util;

import java.security.SecureRandom;

/**
 * Utility class for secure password generation.
 * Uses SecureRandom (cryptographically strong).
 */
public class PasswordUtil {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    private static final SecureRandom random = new SecureRandom();

    public static String generate(
            int length,
            boolean useUpper,
            boolean useDigits,
            boolean useSymbols
    ) {

        StringBuilder pool = new StringBuilder(LOWER);

        if (useUpper) pool.append(UPPER);
        if (useDigits) pool.append(DIGITS);
        if (useSymbols) pool.append(SYMBOLS);

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(pool.charAt(random.nextInt(pool.length())));
        }

        return password.toString();
    }

    /**
     * Simple strength evaluation.
     */
    public static String evaluateStrength(String password) {
        if (password.length() >= 12) return "STRONG";
        if (password.length() >= 10) return "MEDIUM";
        return "WEAK";
    }
}
