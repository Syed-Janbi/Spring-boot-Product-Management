# Spring-boot-Product-Management

A simple Product Management system built with Spring Boot. This project demonstrates how to build a RESTful API for managing products, including CRUD operations, using Java and Spring Boot.

## Features

- Create, read, update, and delete products
- RESTful API endpoints
- In-memory H2 database (easy to switch to other databases)
- Spring Data JPA integration
- Exception handling
- Easy to extend and customize

## How It Works

The application exposes RESTful endpoints for managing products. Each product has attributes like ID, name, description, price, and quantity. Users can interact with the application via HTTP requests (using tools like Postman, curl, or any frontend).

Typical workflow:
1. **Add a product:** Send a POST request to `/products` with product details.
2. **Get all products:** Send a GET request to `/products`.
3. **Get a product by ID:** Send a GET request to `/products/{id}`.
4. **Update a product:** Send a PUT request to `/products/{id}` with updated info.
5. **Delete a product:** Send a DELETE request to `/products/{id}`.

The application uses Spring Data JPA for data persistence and an H2 in-memory database by default.

## Getting Started

### Prerequisites

- Java 17 or above
- Maven

### Setup & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Syed-Janbi/Spring-boot-Product-Management.git
   cd Spring-boot-Product-Management

2. **Build and run application :**
```bash
mvn spring-boot:run
Access the API:
3. **Access the API :**
Open http://localhost:8080/products in your browser or API client.
## Technologies Used
Java
Spring Boot
Spring Data JPA
H2 Database
