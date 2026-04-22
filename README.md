# ClaimAI Backend

Spring Boot backend for the AI-Powered Claims Processing Platform.

## Features
- REST APIs for claim CRUD operations
- AI integration endpoint for claim analysis and fraud detection
- Event-driven architecture with RabbitMQ/Kafka
- Secure JWT + OAuth2 authentication
- Docker-ready for Azure AKS deployment

## Tech Stack
- Java 17
- Spring Boot 3.x
- Spring Data JPA + Hibernate
- Spring Security + JWT
- OpenAPI / Swagger
- Docker

## Project Structure (Planned)
- `controller/` - REST controllers
- `service/` - Business logic + AI service layer
- `repository/` - JPA repositories
- `model/` - Entity classes
- `config/` - Security & Swagger config

This backend is designed to work with the [ClaimAI Frontend](https://github.com/apurupa810-dotcom/claim-ai-platform).

Built to demonstrate real enterprise patterns used in banking and insurance claims systems.
