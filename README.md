🎓 Student Management System – Spring Boot

A simple Student Management System built using Spring Boot that demonstrates the MVC (Model–View–Controller) architecture.
This project allows users to add students and view a list of students using Thymeleaf as the view layer and Spring Data JPA for database operations.


📌 Project Overview

This application is designed to understand how a Spring Boot MVC application works end-to-end.
It covers:

Handling HTTP requests

Form submission

Data binding

Database interaction using JPA

Rendering dynamic HTML pages using Thymeleaf


🛠️ Technologies Used

Java 21

Spring Boot

Spring MVC

Spring Data JPA

Thymeleaf

Hibernate

Maven

H2 / MySQL Database


🧩 Project Architecture (MVC)
Browser → Controller → Service → Repository → Database
          ↑                                       ↓
          └──────────── View (Thymeleaf) ────────┘

Layers Explained:

Controller
Handles incoming HTTP requests and returns views.

Service
Contains business logic and communicates with the repository.

Repository
Interacts with the database using JPA.

Model
Represents the Student entity.

View
HTML pages rendered using Thymeleaf.


📁 Project Structure
student-management-springboot
│── src/main/java/com/example/student
│   ├── controller
│   ├── service
│   ├── repository
│   └── model
│
│── src/main/resources
│   ├── templates
│   │   ├── students.html
│   │   └── add-student.html
│   └── application.properties
│
│── pom.xml
│── README.md
│── .gitignore


✨ Features

View list of students

Add a new student using a form

Form data binding using Spring MVC

Automatic database operations using Spring Data JPA

Clean MVC separation


🔄 Application Flow

User opens /students in the browser

Controller handles the request

Service layer fetches data

Repository interacts with the database

Data is returned and displayed using Thymeleaf

User adds a student via form

Student is saved and user is redirected back to the list


▶️ How to Run the Project

Clone the repository:

git clone https://github.com/your-username/student-management-springboot.git


Open the project in IntelliJ / Eclipse

Make sure Java 21 is installed

Run the main Spring Boot application class

Open your browser and visit:

http://localhost:8080/students


🗄️ Database Configuration

Uses H2 (in-memory) by default

Can be easily switched to MySQL

JPA handles table creation automatically
