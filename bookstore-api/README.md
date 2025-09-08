# 📚 Bookstore API

A **RESTful Bookstore API** built with **Spring Boot, H2 Database, JPA, and Swagger UI**.  
This project demonstrates CRUD operations, API documentation, and database interactions, making it a strong resume-ready backend project.

---

## 🚀 Features
- Create, Read, Update, Delete (CRUD) operations for Books & Authors
- In-memory **H2 Database** with web console
- **Swagger UI** for interactive API testing
- **Postman Collection** for external testing
- Built using **Spring Boot 3, Java 24, Maven**

---

## 🛠️ Tech Stack
- **Backend:** Java 24, Spring Boot 3.x
- **Database:** H2 (in-memory)
- **API Docs:** Swagger / Springdoc OpenAPI
- **Testing:** Postman

---

## 📸 Screenshots

### ✅ Running App
![Running Check](../Screenshots%20Bookstore-api/bookstore-api%20Running%20check.png)

### 📖 Swagger UI
![Swagger UI](../Screenshots%20Bookstore-api/bookstore-api%20WholeSwaggerUI.png)

### ➕ POST /api/books
![POST Books](../Screenshots%20Bookstore-api/bookstore-api%20POST%20api%20books.png)

### 📄 GET /api/books
![GET Books](../Screenshots%20Bookstore-api/bookstore-api%20GET%20api%20books.png)

### 🗄️ H2 Console
![H2 Console](../Screenshots%20Bookstore-api/bookstore-api%20H2Console.png)

---

## ▶️ How to Run
```bash
# Move into the project folder
cd bookstore-api

# Build the project
mvn clean install

# Run the project
mvn spring-boot:run

Access the app:

Swagger UI → http://localhost:8080/swagger-ui/index.html
H2 Console → http://localhost:8080/h2-console

🌟 Outcomes

Learned building RESTful APIs with Spring Boot
Implemented database interactions using JPA + H2
Documented and tested APIs with Swagger + Postman