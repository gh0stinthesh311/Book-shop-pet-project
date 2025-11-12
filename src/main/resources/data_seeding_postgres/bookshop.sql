DROP DATABASE IF EXISTS bookshop;
CREATE DATABASE bookshop;
\connect bookshop

DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS customers;

CREATE TABLE authors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO authors (id, name) VALUES (1, 'Harper Lee');
INSERT INTO authors (id, name) VALUES (2, 'George Orwell');
INSERT INTO authors (id, name) VALUES (3, 'F. Scott Fitzgerald');
INSERT INTO authors (id, name) VALUES (4, 'J.K. Rowling');
INSERT INTO authors (id, name) VALUES (5, 'Jane Austen');

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price NUMERIC(10, 2) NOT NULL
);

INSERT INTO books (title, id, price) VALUES ('To Kill a Mockingbird', 1, 15);
INSERT INTO books (title, id, price) VALUES ('Go Set a Watchman', 2, 20);
INSERT INTO books (title, id, price) VALUES ('1984',3, 20);
INSERT INTO books (title, id, price) VALUES ('Animal Farm', 4, 12);
INSERT INTO books (title, id, price) VALUES ('The Great Gatsby', 5, 25);
INSERT INTO books (title, id, price) VALUES ('Tender Is the Night', 6, 22);
INSERT INTO books (title, id, price) VALUES ('Harry Potter and the Sorcerer''s Stone', 7, 30);
INSERT INTO books (title, id, price) VALUES ('Harry Potter and the Chamber of Secrets', 8, 25);
INSERT INTO books (title, id, price) VALUES ('Pride and Prejudice', 9, 18);
INSERT INTO books (title, id, price) VALUES ('Sense and Sensibility', 10, 16);
INSERT INTO books (title, id, price) VALUES ('Emma', 11, 19);
INSERT INTO books (title, id, price) VALUES ('This Side of Paradise', 12, 18);
INSERT INTO books (title, id, price) VALUES ('Harry Potter and the Prisoner of Azkaban', 13, 27);

CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO customers (name, email) VALUES
('John Doe', 'johndoe@example.com'),
('Jane Smith', 'janesmith@example.com'),
('Robert Brown', 'robert.brown@example.net'),
('Emily Davis', 'emily.davis@example.org'),
('Michael Wilson', 'michael.wilson@example.com'),
('Sarah Johnson', 'sarah.johnson@example.co'),
('David Taylor', 'david.taylor@example.org'),
('Laura Martinez', 'laura.martinez@example.net'),
('James Anderson', 'james.anderson@example.edu'),
('Linda Thompson', 'linda.thompson@example.com');

--CREATE TABLE categories (
--    id INT AUTO_INCREMENT PRIMARY KEY,
--    category VARCHAR(255) NOT NULL
--);

--CREATE TABLE AUTHOR_BOOK_MAPPING (
--    author_id INT,
--    book_id INT,
--    PRIMARY KEY (author_id, book_id),
--    FOREIGN KEY (author_id) REFERENCES authors(id),
--    FOREIGN KEY (book_id) REFERENCES books(id)
--);



--INSERT INTO categories (category) VALUES ('FANTASY');
--INSERT INTO categories (category) VALUES ('FICTION');

-- This query populates AUTHOR_BOOK_MAPPING (which is join table) by associating authors with their corresponding books.
-- Following should be managed by JPA, meaning JPA should create join table, not this script
--INSERT INTO AUTHOR_BOOK_MAPPING (author_id, book_id)
--SELECT a.id, b.id
--FROM authors a
--JOIN books b ON a.id = b.author_id;


