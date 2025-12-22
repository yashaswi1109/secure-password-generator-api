package com.password.passwordgenerator.model;

/**
 * DTO returned to the client.
 */
public class PasswordResponse {

    private String password;
    private String strength;

    public PasswordResponse(String password, String strength) {
        this.password = password;
        this.strength = strength;
    }

    public String getPassword() {
        return password;
    }

    public String getStrength() {
        return strength;
    }
}
