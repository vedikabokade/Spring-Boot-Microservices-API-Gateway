# Spring Boot Microservices API Gateway
A complete Spring Boot Microservices Architecture project demonstrating API Gateway, Service Discovery, REST APIs, and Database Integration using Spring Cloud and Netflix Eureka.
---

# Project Overview
This project is built using a microservices architecture where multiple independent services communicate through an API Gateway and register themselves with Eureka Server.

The system contains:
- Eureka Discovery Server
- API Gateway
- Employee Service
- Department Service
- MySQL Database Integration
---

# Architecture Workflow
# Modules
## 1. Eureka Server
Service registry used for service discovery.
### Features
- Registers all microservices
- Monitors active services
- Enables communication between services

### Port
```properties
8761
```

### URL
```text
http://localhost:8761
```

## 2. API Gateway
Acts as the single entry point for all client requests.
### Features
- Request Routing
- Centralized API Access
- Load Balancing Support
- Service Discovery Integration
### Port
```properties
8084
```

## 3. Employee Service
Handles employee-related operations.
### Features
- Add Employee
- Update Employee
- Delete Employee
- Get Employee Details
### Port
```properties
8021
```
### Technologies
- Spring Boot
- Spring Data JPA
- MySQL
---

## 4. Department Service
Handles department-related operations.
### Features
- Add Department
- Update Department
- Delete Department
- Get Department Details
### Port
```properties
8022
```
### Technologies
- Spring Boot
- Spring Data JPA
- MySQL
---
# Technologies Used
| Technology | Purpose |
|------------|---------|
| Java 21 | Backend Development |
| Spring Boot 3 | Application Framework |
| Spring Cloud Gateway | API Gateway |
| Netflix Eureka | Service Discovery |
| Spring Data JPA | ORM Framework |
| MySQL | Database |
| Maven | Build Tool |
| REST APIs | Communication |
---

# Project Structure
```
APIGATEWAY
│
├── Eureka_Server
│
├── api_gateway
│
├── employee_service
│
└── department_service
