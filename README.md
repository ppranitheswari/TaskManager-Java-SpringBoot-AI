# Task Manager Application  
Java-Based Application using OOP, Spring Boot, Database & AI Integration

## 📌 Project Overview
The Task Manager Application is a Java-based backend system designed to manage tasks efficiently.  
It allows users to create, update, delete, and track tasks using RESTful APIs.

This project demonstrates:
- Core Java & OOP principles
- Spring Boot REST API development
- Database integration using Spring Data JPA
- AI-based task analysis (mocked AI response)

The project is organized into separate parts for clarity and evaluation.

---

## 🛠️ Technology Stack
- Java (JDK 17)
- Spring Boot
- Spring Data JPA (Hibernate)
- H2 In-Memory Database
- Maven
- Postman / Thunder Client
- AI Integration (OpenAI – Mock Response)
- IDE: Visual Studio Code

---

## 📂 Project Structure
TaskManager-Java-SpringBoot-AI/
│
├── Part-A-Core-Java-OOP/
│ └── (Core Java OOP implementation)
│
├── Part-B-C-SpringBoot-AI/
│ └── (Spring Boot + Database + AI integration)
│
├── Documentation/
│ └── TaskManager-Documentation.pdf
│
│
└── README.md




---

## ⚙️ How to Run the Spring Boot Project
1. Open the Spring Boot project folder  
2. Run `TaskmanagerApplication.java`  
3. Application starts on port `8080`

---

## 🔗 REST API Endpoints

### Task APIs
- `POST /tasks` – Create a task  
- `GET /tasks` – Get all tasks  
- `GET /tasks/{id}` – Get task by ID  
- `PUT /tasks/{id}` – Update task  
- `DELETE /tasks/{id}` – Delete task  

### AI API
- `POST /ai/suggest` – Get AI-based task suggestions

---

## 🤖 AI Integration
The application includes an AI service layer that analyzes task data and provides suggestions.

- AI integration is implemented using a dedicated service class.
- API keys are stored securely in `application.properties`.
- Due to API quota limitations, a **mock AI response** is used for demonstration.
- The design allows easy switching between mock and live AI APIs.

---

## 🗄️ Database
- H2 in-memory database is used for development and testing.
- Database schema is auto-generated using JPA annotations.

---

## 📸 Screenshots
Screenshots of working APIs and database are available in the `Screenshots/` folder:
- Task creation API
- Task retrieval API
- AI suggestion API


---

## 🔐 Security Note
Sensitive information such as API keys has been removed from the repository for security reasons.

---

## ✅ Conclusion
This project demonstrates a complete Java backend application with clean architecture, REST APIs, database integration, and AI capabilities.  
It reflects readiness for real-world Java backend development.
