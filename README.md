🍽 Smart Restaurant Management System

A Smart Restaurant Management System is a full-stack web application designed to streamline restaurant operations such as order management, menu handling, billing, and customer service.
The system provides an efficient digital platform for restaurant staff and administrators to manage daily activities.

🚀 Features
👨‍🍳 Admin Features

Add, update, and delete menu items

Manage restaurant categories and food items

View all customer orders

Update order status (Preparing, Completed, Delivered)

Manage restaurant staff and users

🧑‍💻 Customer Features

Browse restaurant menu

Add food items to cart

Place orders online

View order history

Secure login and registration

📊 System Features

Real-time order tracking

REST API based backend

Responsive UI for desktop and mobile

Secure authentication system

🛠 Tech Stack
Frontend

React.js

HTML5

CSS3

JavaScript


Backend

Java

Spring Boot

Spring Data JPA

Hibernate

REST APIs

Database

MySQL

Tools

Git & GitHub

Postman

Maven

VS Code / Eclipse IDE

Smart-Restaurant-Management-System
│
├── frontend (React)
│   ├── components
│   ├── pages
│   ├── services
│   └── App.js
│
├── backend (Spring Boot)
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   └── application.properties
│
└── database
    └── MySQL schema

    Update application.properties 
    spring.datasource.url=jdbc:mysql://localhost:3306/restaurant_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Frontend Setup (React)
cd frontend
npm install
npm start

Frontend will run on:
http://localhost:3000

Backend will run on:
http://localhost:8080

API Endpoints (Sample)
| Method | Endpoint         | Description         |
| ------ | ---------------- | ------------------- |
| GET    | /api/menu        | Get all menu items  |
| POST   | /api/menu        | Add new food item   |
| GET    | /api/orders      | Get all orders      |
| POST   | /api/orders      | Place order         |
| PUT    | /api/orders/{id} | Update order status |
