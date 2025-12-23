Secure Password Generator Service

A stateless Spring Boot REST service that generates secure passwords based on configurable constraints and evaluates password strength.
Designed to demonstrate backend service design, security-aware logic, and clean API architecture, similar to production microservices.

Overview

This service exposes a REST endpoint that accepts password constraints (length, character sets) and returns a securely generated password along with a computed strength classification.

The project emphasizes:
API-first design
Stateless processing
Separation of concerns
Defensive input handling

Key Features

Secure password generation using configurable rules

Password strength evaluation (WEAK, MEDIUM, STRONG)

Stateless REST API (no sessions, no persistence)

Clean layered architecture

JSON-based request/response contract

Tech Stack

Language: Java 21 (LTS)

Framework: Spring Boot 3

Build Tool: Maven

API Style: REST (JSON over HTTP)

Server: Embedded Tomcat

Architecture
Controller → Service → Utility


Controller: HTTP request handling and validation

Service: Core business logic

Utility: Password generation and strength evaluation

Models: Request/response contracts

Exception Layer: Centralized error handling

API Specification
Generate Password

POST /api/password/generate

Request
{
  "length": 10,
  "upper": true,
  "digits": true,
  "symbols": true
}

Response
{
  "password": "vM_nP<Qx2y",
  "strength": "MEDIUM"
}

Running Locally
Prerequisites

Java 21+

Maven

Run
mvn spring-boot:run


Service starts on:

http://localhost:8080

Testing the API
PowerShell
Invoke-RestMethod `
  -Uri http://localhost:8080/api/password/generate `
  -Method POST `
  -ContentType "application/json" `
  -Body '{"length":10,"upper":true,"digits":true,"symbols":true}'

Design Principles

Statelessness: Each request is independent

Separation of concerns: Clear responsibility per layer

Security awareness: Secure random generation

Maintainability: Modular and extensible design
