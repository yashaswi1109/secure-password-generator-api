package com.password.passwordgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point of the application.
 * Interviewer note: No business logic here.
 */
@SpringBootApplication
public class PasswordGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordGeneratorApplication.class, args);
    }
}
