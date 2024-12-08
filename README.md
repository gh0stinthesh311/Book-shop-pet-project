# Bookstore Backend

This is a simple Spring Boot application for managing books in a bookstore.

## Features

- **CRUD Operations**: Provides endpoints for creating, reading, updating, and deleting books.
- **Database Integration**: Uses Spring Data JPA to interact with H2 database.
- **RESTful API**: Implements a RESTful API to expose book-related endpoints.

## Getting Started

To run this application locally, follow these steps:

**Access the API**:

   The application will start on http://localhost:8080. You can use tools like Postman or curl to interact with the API endpoints.

## API Documentation

API is fairly standard across the entities:   
Author:
- `GET /api/author/all`: Get all authors
- `GET /api/author/{id}`: Get an author by ID
- `POST /api/author/save`: Create a new author
- `PUT /api/author/{id}`: Update an existing author  
- `DELETE /api/author/{id}`: Delete an author
- `POST /api/author/{authorId}/book/{bookId}`: Add a book to an author  
Book:
- `GET /api/book/all`: Get all books  
- `GET /api/book/{id}`: Get a book by ID  
- `POST /api/book`: Create a new book  
- `PUT /api/book/{id}`: Update an existing book  
- `DELETE /api/book/{id}`: Delete a book  

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Comments

H2 database used for simplicity.  
Database schema created using Jakarta in-built mechanism of @Entiry classes creation,
instead of explicit usage of schema.sql. Wait a sec. No. In fact the opposite is true. Scheme.sql does the creation,
and hiber updates the tables according to entities.
