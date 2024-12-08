-- Insert authors
INSERT INTO authors (id, name) VALUES (1, 'Harper Lee');
INSERT INTO authors (id, name) VALUES (2, 'George Orwell');
INSERT INTO authors (id, name) VALUES (3, 'F. Scott Fitzgerald');
INSERT INTO authors (id, name) VALUES (4, 'J.K. Rowling');
INSERT INTO authors (id, name) VALUES (5, 'Jane Austen');

-- Insert customers
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

-- Insert books
INSERT INTO books (title, author_id, price) VALUES ('To Kill a Mockingbird', 1, 15);
INSERT INTO books (title, author_id, price) VALUES ('Go Set a Watchman', 1, 20);
INSERT INTO books (title, author_id, price) VALUES ('1984', 2, 20);
INSERT INTO books (title, author_id, price) VALUES ('Animal Farm', 2, 12);
INSERT INTO books (title, author_id, price) VALUES ('The Great Gatsby', 3, 25);
INSERT INTO books (title, author_id, price) VALUES ('Tender Is the Night', 3, 22);
INSERT INTO books (title, author_id, price) VALUES ('Harry Potter and the Sorcerer''s Stone', 4, 30);
INSERT INTO books (title, author_id, price) VALUES ('Harry Potter and the Chamber of Secrets', 4, 25);
INSERT INTO books (title, author_id, price) VALUES ('Pride and Prejudice', 5, 18);
INSERT INTO books (title, author_id, price) VALUES ('Sense and Sensibility', 5, 16);
INSERT INTO books (title, author_id, price) VALUES ('Emma', 5, 19);
INSERT INTO books (title, author_id, price) VALUES ('This Side of Paradise', 3, 18); -- Additional book for F. Scott Fitzgerald
INSERT INTO books (title, author_id, price) VALUES ('Harry Potter and the Prisoner of Azkaban', 4, 27); -- Additional book for J.K. Rowling

INSERT INTO categories (category) VALUES ('FANTASY');
INSERT INTO categories (category) VALUES ('FICTION');

-- This query populates AUTHOR_BOOK_MAPPING (which is join table) by associating authors with their corresponding books.
INSERT INTO AUTHOR_BOOK_MAPPING (author_id, book_id)
SELECT a.id, b.id
FROM authors a
JOIN books b ON a.id = b.author_id;