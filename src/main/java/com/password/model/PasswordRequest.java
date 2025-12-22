package com.password.passwordgenerator.model;

import jakarta.validation.constraints.Min;

/**
 * DTO representing incoming password generation request.
 */
public class PasswordRequest {

    @Min(value = 8, message = "Password length must be at least 8")
    private int length;

    private boolean upper;
    private boolean digits;
    private boolean symbols;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isUpper() {
        return upper;
    }

    public void setUpper(boolean upper) {
        this.upper = upper;
    }

    public boolean isDigits() {
        return digits;
    }

    public void setDigits(boolean digits) {
        this.digits = digits;
    }

    public boolean isSymbols() {
        return symbols;
    }

    public void setSymbols(boolean symbols) {
        this.symbols = symbols;
    }
}
