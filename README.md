# Secure Password Generator API

A Spring Boot REST API that generates secure passwords based on configurable constraints and returns a strength classification.

This project demonstrates backend API design, stateless services, and clean separation of concerns.

---

## Tech Stack

- Java 21 (LTS)
- Spring Boot 3
- Maven
- REST (JSON over HTTP)

---

## API

### Generate Password

**Endpoint:** `POST /api/password/generate`

**Request:**
```json
{
  "length": 10,
  "upper": true,
  "digits": true,
  "symbols": true
}
```

**Response:**
```json
{
  "password": "vM_nP<Qx2y",
  "strength": "MEDIUM"
}
```

---

## Architecture
```
controller/
service/
util/
model/
exception/
```

- **Controller** handles HTTP and validation
- **Service** contains business logic
- **Utility** handles password generation and strength evaluation
- **Models** define request/response contracts
- **Centralized exception handling**

---

## Run Locally

### Requirements

- Java 21+
- Maven

### Start
```bash
mvn spring-boot:run
```

Service runs on:
```
http://localhost:8080
```

---

## Test

**PowerShell:**
```powershell
Invoke-RestMethod `
  -Uri http://localhost:8080/api/password/generate `
  -Method POST `
  -ContentType "application/json" `
  -Body '{"length":10,"upper":true,"digits":true,"symbols":true}'
```

---

## Design Notes

- Stateless API (no persistence)
- Secure random password generation
- Clean layered architecture
- Easy to extend (rate limiting, entropy scoring, auth)

---

## Author

**Yashaswi Nagpurkar**  
GitHub: [https://github.com/yashaswi1109](https://github.com/yashaswi1109)
