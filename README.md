# 📝 Notes Backend  
Spring Boot RESTful API

This project is a **Notes Backend (REST API)** application developed using **Spring Boot**.  
The application provides services for note management, user operations, notification handling, weather information, and **MySQL database integration**.

A **layered architecture (Controller – Service – Repository)** is used, and the system is designed to serve as a backend for mobile or web applications.

This project is suitable for **academic and portfolio purposes**.

---

## 🚀 Features

- CRUD operations for notes (Create, Read, Update, Delete)
- User registration service
- Notification simulation when a note is created
- External weather API integration
- MySQL database integration with Spring Data JPA
- RESTful endpoint design
- DTO (Data Transfer Object) usage
- Clean and modular code architecture

---

## 🧱 Architecture

Controller → Service → Repository → Database (MySQL)

- **Controller:** Handles HTTP requests  
- **Service:** Contains business logic  
- **Repository:** Manages database operations using Spring Data JPA  
- **Database:** MySQL  
- **DTO:** Transfers data between layers  

---

## 🗄 Database

- **Database:** MySQL  
- **ORM:** Spring Data JPA (Hibernate)  
- Entities are mapped to database tables using JPA annotations  
- Repository layer extends `JpaRepository` for CRUD operations  

---

## 📌 API Endpoints

### Notes API  
Base URL: `/api/notes`

- GET `/all` → Retrieve all notes  
- GET `/{id}` → Retrieve a note by ID  
- POST `/create` → Create a new note  
- PUT `/{id}` → Update an existing note  
- DELETE `/{id}` → Delete a note  

---

### Users API  
Base URL: `/api/users`

- POST `/save` → Save a new user  

---

### Notifications API  
Base URL: `/notifications`

- POST `/note-created` → Send a notification when a note is created  

---

### Weather API  
Base URL: `/api/weather`

- GET `/description?city={city}` → Get weather description for a given city  

---

## 🛠 Tech Stack

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- RESTful API  
- Maven  

---

## ▶️ Running the Project

### Requirements
- Java 17+
- Maven
- MySQL
