# Job Portal System #

A **RESTful Job Portal System** built with **Spring Boot, MySQL, JPA, and Swagger UI**.  
This project simulates a mini job portal where jobs can be posted, applicants can register, and applications can be tracked.

---

## Features ##
- CRUD APIs for Jobs, Applicants, Applications
- **MySQL database** integration with JPA
- **Swagger UI** for interactive documentation
- Tested using **Postman**

---

## Tech Stack ##
- **Backend:** Java 24, Spring Boot 3.x
- **Database:** MySQL 8
- **API Docs:** Swagger / Springdoc OpenAPI
- **Testing:** Postman

---

## Screenshots ##

### Application Running
![Running Check](../Screenshots%20job-portal-system/job-portal%20running%20check.png)

### Swagger UI
![Swagger UI](../Screenshots%20job-portal-system/job-portal%20Swagger%20UI.png)

### GET /api/jobs
![GET Jobs](../Screenshots%20job-portal-system/job-portal%20GET%20api%20jobs.png)

### POST /api/applications
![POST Applications](../Screenshots%20job-portal-system/job-portal%20POST%20api%20applications.png)

### POST /api/jobs
![POST Jobs](../Screenshots%20job-portal-system/job-portal%20POST%20jobs.png)

### Database
![Database](../Screenshots%20job-portal-system/job-portal%20Database.png)

### Postman Testing
![Postman POST request](../Screenshots%20job-portal-system/job-portal%20POSTMAN%20POST%20request.png)

---

## How to Run ##
Move into the project folder
```bash
cd job-portal-system
```

# Build the project #
```bash
mvn clean install
```

# Run the project #
```bash
mvn spring-boot:run
```

# Access the app: #

Swagger UI → http://localhost:8080/swagger-ui/index.html

# Outcomes #

- Built a full-stack style backend system with MySQL
- Implemented Job, Applicant & Application management APIs
- Used Swagger & Postman for API testing and validation
