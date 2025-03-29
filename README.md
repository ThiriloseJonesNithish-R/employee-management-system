# Employee Management System (Spring Boot + MySQL)

## Overview
The Employee Management System is a simple RESTful API built using Spring Boot, Hibernate, and MySQL. It allows performing CRUD operations on employee records, including searching based on salary.

## Features
- **Employee CRUD Operations**: Create, Read, Update, Delete employees
- **Search by Max Salary**: Retrieve employees earning less than or equal to a given salary
- **Spring Boot 3.4.4** with Java 21
- **Spring Data JPA** for database interaction
- **MySQL** as the database
- **Lombok** to reduce boilerplate code
- **Maven** for dependency management

## Technologies Used
- Java 21
- Spring Boot 3.4.4
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Git/GitHub

## API Endpoints

### 1. Get All Employees
**Request:**

GET /employees

**Response:**

[
  {
    "id": 1,
    "name": "John Doe",
    "email": "johndoe@example.com",
    "department": "IT",
    "salary": 75000.50
  }
]


### 2. Get Employee by ID
**Request:**

GET /employees/{id}

**Response (200 OK):**

{
  "id": 1,
  "name": "John Doe",
  "email": "johndoe@example.com",
  "department": "IT",
  "salary": 75000.50
}

**Response (404 Not Found):**

{
  "timestamp": "2025-03-29T17:44:48.232+00:00",
  "status": 404,
  "error": "Not Found",
  "path": "/employees/{id}"
}


### 3. Create Employee
**Request:**

POST /employees
Content-Type: application/json

**Body:**

{
  "name": "Emma Watson",
  "email": "emma.watson@wipro.com",
  "department": "Engineering",
  "salary": 85000.75
}

**Response (201 Created):**

{
  "id": 2,
  "name": "Emma Watson",
  "email": "emma.watson@wipro.com",
  "department": "Engineering",
  "salary": 85000.75
}


### 4. Update Employee
**Request:**

PUT /employees/{id}
Content-Type: application/json

**Body:**

{
  "name": "Emma Watson",
  "email": "emma.watson@wipro.com",
  "department": "Software Engineering",
  "salary": 90000.00
}

**Response (200 OK):**

{
  "id": 2,
  "name": "Emma Watson",
  "email": "emma.watson@wipro.com",
  "department": "Software Engineering",
  "salary": 90000.00
}


### 5. Delete Employee
**Request:**

DELETE /employees/{id}

**Response (204 No Content):**

### 6. Search Employees by Max Salary
**Request:**

GET /employees/search?maxSalary=85000

**Response:**

[
  {
    "id": 1,
    "name": "John Doe",
    "email": "johndoe@example.com",
    "department": "IT",
    "salary": 75000.50
  }
]


## Setup Instructions
1. Clone the repository:
   
   git clone https://github.com/ThiriloseJonesNithish-R/employee-management-system.git
   
2. Navigate to the project directory:
   
   cd employee-management-system
   
3. Configure MySQL database settings in `application.properties`.
4. Build and run the application:
   
   mvn spring-boot:run
   
