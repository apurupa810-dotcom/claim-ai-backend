# ClaimAI Backend

Spring Boot backend for the **AI-Powered Intelligent Claims Platform**.

This backend is designed to work with the [ClaimAI Frontend](https://github.com/apurupa810-dotcom/claim-ai-platform).

## Features
- RESTful APIs for claim submission, retrieval and processing
- AI integration layer for claim analysis and fraud detection
- Event-driven architecture using RabbitMQ/Kafka
- Secure authentication with JWT + OAuth2
- Docker-ready for deployment on Azure Kubernetes Service (AKS)
- OpenAPI documentation

## Technology Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA + Hibernate**
- **Spring Security + JWT**
- **RabbitMQ / Kafka**
- **Docker**
- **OpenAPI / Swagger**

## Project Structure
src/main/java/com/claimai/
├── ClaimAiApplication.java
├── controller/
├── service/
├── repository/
├── model/
├── config/
├── dto/
├── exception/
└── util/
