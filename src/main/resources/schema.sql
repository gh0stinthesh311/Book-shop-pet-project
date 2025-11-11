CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author_id VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);


CREATE TABLE authors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(255) NOT NULL
);

--CREATE TABLE AUTHOR_BOOK_MAPPING (
--    author_id INT,
--    book_id INT,
--    PRIMARY KEY (author_id, book_id),
--    FOREIGN KEY (author_id) REFERENCES authors(id),
--    FOREIGN KEY (book_id) REFERENCES books(id)
--);