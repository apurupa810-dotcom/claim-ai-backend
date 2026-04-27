# ClaimAI Backend

Java Spring Boot Microservice for the ClaimAI Multi-Agent Platform.

## Features

- REST APIs for claim processing
- Integration with Python AI Multi-Agent Service
- Layered Architecture (Controller, Service, DTO)
- Docker & docker-compose support
- Swagger UI Documentation

## Tech Stack

- Java 17 + Spring Boot 3
- Spring Security + CORS
- REST + DTO Pattern
- Docker

## API Endpoints

- `POST /api/claims/analyze` → Multi-Agent Analysis
- `GET /api/claims/health`

## Run Locally

```bash
docker-compose up --build

---

### 3. `claim-ai-ai-service` README.md

```markdown
# ClaimAI AI Service (Python)

Python-based Multi-Agent AI Microservice for intelligent claim analysis.

## Features

- Multi-Agent Architecture (4 specialized agents)
- Intake Agent, Fraud Agent, Policy Agent, Validation Agent
- FastAPI backend
- Easy integration with Java Spring Boot

## Tech Stack

- Python 3.11
- FastAPI
- Pydantic
- Docker

## Endpoints

- `POST /orchestra/analyze` → Multi-Agent Analysis
- `GET /health`

## Run Locally

```bash
pip install -r requirements.txt
uvicorn main:app --reload
##Or with Docker:
docker build -t claim-ai-ai-service .
docker run -p 8000:8000 claim-ai-ai-service
