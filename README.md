# 🎓 Student Management System

A **production-style Student Management System** built using **Spring Boot** and **PostgreSQL**, designed to demonstrate real-world backend development concepts such as RESTful APIs, layered architecture, validation, search, and database integration.

This project was upgraded from a basic CRUD system into an **internship-ready backend application**.

---

## 🛠 Tech Stack

### Backend
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Maven**

### Frontend
- **React**
- **HTML, CSS, JavaScript**

---

## ✨ Features

- ➕ Add student records  
- ✏️ Update student details  
- ❌ Delete student records  
- 🔍 Search students  
- 📄 Fetch all students  
- 📄 Fetch student by ID  
- ✅ Input validation (email, phone, etc.)
- ⚠️ Global exception handling
- 🛢️ PostgreSQL persistent database
- 🌐 RESTful APIs
- ⚛️ Improved React-based UI

---

## 📚 Student Fields

Each student record contains:
- Name  
- Email  
- Phone Number  
- Age  
- Enrollment Year  

---
## 🚀 Getting Started

### ▶️ Run the Backend

1. Clone the repository  
2. Open the backend project in IntelliJ 
3. Configure PostgreSQL (see below)
4. Update application.properties:
5.   
spring.datasource.url=jdbc:postgresql://localhost:5432/database_name
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

6. Run:
   ```bash
   mvn spring-boot:run
7. Backend will start at: http://localhost:8080

8. The database schema is automatically created and updated using Hibernate JPA.

## REST API Endpoints

| Method | Endpoint                                | Description                        | Status Codes  |
| ------ | --------------------------------------- | ---------------------------------- | ------------- |
| GET    | `/api/students`                         | Get all students (with pagination) | 200           |
| GET    | `/api/students/{id}`                    | Get student by ID                  | 200, 404      |
| POST   | `/api/students`                         | Create a new student               | 201, 400, 409 |
| PUT    | `/api/students/{id}`                    | Update student details             | 200, 400, 404 |
| DELETE | `/api/students/{id}`                    | Delete a student                   | 200, 404      |
| GET    | `/api/students/search`                  | Search students by keyword         | 200           |
| GET    | `/api/students/course/{course}`         | Get students by course             | 200           |
| GET    | `/api/students/department/{department}` | Get students by department         | 200           |
| GET    | `/api/students/check-email`             | Check if email already exists      | 200           |

## 💻 Run the Frontend
open in VScode in terminal
cd frontend
npm install
npm start

Frontend runs at: http://localhost:3000
