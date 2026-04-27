# ClaimAI Backend

**Java Spring Boot Microservice** for the ClaimAI Multi-Agent AI Claims Platform.

This is the main backend service responsible for handling claims, orchestrating AI agents, and managing business logic.

## 🚀 Features

- RESTful APIs for claim analysis
- Integration with **Python Multi-Agent AI Service**
- Layered Architecture (Controller → Service → DTO)
- Security with CORS & JWT-ready setup
- Docker + docker-compose support
- OpenAPI / Swagger Documentation
- H2 Database (for development)

## Tech Stack

- **Java 17**
- **Spring Boot 3.3**
- **Spring Data JPA**
- **Spring Security**
- **REST API + DTO Pattern**
- **Docker**
- **Swagger UI**

## Project Structure
src/main/java/com/claimai/
├── ClaimAiApplication.java
├── config/
│   ├── SecurityConfig.java
│   └── SwaggerConfig.java
├── controller/
│   └── ClaimController.java
├── dto/
│   ├── ClaimRequest.java
│   └── ClaimResponse.java
├── service/
│   └── ClaimService.java
└── ...

## How to Run Locally

### Using Docker Compose (Recommended)
docker-compose up --build
##Or Run with Maven
```bash
mvn spring-boot:run
##api endpoints
Method,Endpoint,Description
POST,/api/claims/analyze,Analyze claim with AI Agents
GET,/api/claims/health,Health check
GET,/swagger-ui.html,Swagger UI Documentation
