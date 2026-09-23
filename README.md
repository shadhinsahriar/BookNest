# BookNest

BookNest is a **Spring Boot learning project** created to apply and practice the Spring Boot concepts I have learned so far.

> **Important:** This project is **ONLY for applying and practicing concepts**.
> The main focus of this repository is **basic CRUD operations**.
> It is **not intended to be a complete or production-ready book management system**.

## 🎯 Purpose

The purpose of BookNest is to understand how different parts of a Spring Boot backend work together by building a simple CRUD application.

This project focuses on:

* Understanding the Spring Boot project structure
* Practicing Entity
* Practicing Repository
* Practicing Service
* Practicing Controller
* Understanding Dependency Injection
* Practicing DTO
* Connecting Spring Boot with PostgreSQL
* Implementing basic REST APIs
* Understanding CRUD operations

## 🛠️ Technologies

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* REST API

## 🏗️ Project Structure

```text
BookNest
│
├── entity
│   └── Book
│
├── repository
│   └── BookRepository
│
├── service
│   └── BookService
│
├── controller
│   └── BookController
│
└── dto
    └── BookDTO
```

## 🔄 Architecture

```text
Client
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
JPA / Hibernate
   ↓
PostgreSQL
```

## 📚 CRUD Operations

The main goal of this project is to practice the four basic database operations:

| Operation | HTTP Method | Endpoint      |
| --------- | ----------- | ------------- |
| Create    | POST        | `/addbook`    |
| Read All  | GET         | `/books`      |
| Read One  | GET         | `/books/{id}` |
| Update    | PUT         | `/books/{id}` |
| Delete    | DELETE      | `/books/{id}` |

## 🚧 Project Scope

This repository intentionally keeps the project simple.

### Included

* Basic Spring Boot backend
* Basic REST API
* Book Entity
* Repository
* Service layer
* Controller layer
* DTO
* PostgreSQL connection
* Basic CRUD operations

### Not Included

This project does **NOT** focus on advanced backend features such as:

* Authentication & Authorization
* JWT
* Role-based access control
* Advanced validation
* Exception handling system
* Global error handling
* Pagination
* Sorting and filtering
* Advanced DTO mapping
* Caching
* Testing architecture
* Microservices
* Docker
* CI/CD
* Production deployment
* Advanced security
* Other advanced Spring Boot features

These features may be explored in **future projects** as my Spring Boot knowledge grows.

## 📌 Learning Goal

The goal of BookNest is not to build a complete application.

The goal is:

> **Learn a concept → understand it → apply it in code.**

This repository represents my current level of Spring Boot learning and serves as a practical project for strengthening my backend fundamentals.

## 👨‍💻 Status

**Completed — Basic CRUD Practice**

This project will remain intentionally simple because its purpose is to practice the concepts I have learned rather than to cover every Spring Boot feature.
