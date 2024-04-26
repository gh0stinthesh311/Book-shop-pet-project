# Bookstore Backend

This is a simple Spring Boot application for managing books in a bookstore.

## Features

- **CRUD Operations**: Provides endpoints for creating, reading, updating, and deleting books.
- **Database Integration**: Uses Spring Data JPA to interact with H2 database.
- **RESTful API**: Implements a RESTful API to expose book-related endpoints.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2

## Getting Started

To run this application locally, follow these steps:

1. **Clone the repository**:

    ```bash
    git clone https://github.com/yourusername/bookstore-backend.git
    ```

2. **Navigate to the project directory**:

    ```bash
    cd bookstore-backend
    ```

3. **Build the project**:

    ```bash
    mvn install
    ```

4. **Run the application**:

    ```bash
    mvn spring-boot:run
    ```

5. **Access the API**:

   The application will start on http://localhost:8080. You can use tools like Postman or curl to interact with the API endpoints.

## API Documentation

The API provides the following endpoints:

- `GET /api/books`: Get all books
- `GET /api/books/{id}`: Get a book by ID
- `POST /api/books`: Create a new book
- `PUT /api/books/{id}`: Update an existing book
- `DELETE /api/books/{id}`: Delete a book

For detailed documentation and examples, refer to the [API Documentation](#) (update with actual documentation link if available).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Comments

H2 database used for simplicity.  
Database schema created using Jakarta in-built mechanism of @Entiry classes creation,
instead of explicit usage of schema.sql.
