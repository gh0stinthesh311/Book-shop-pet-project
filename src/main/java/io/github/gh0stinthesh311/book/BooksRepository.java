package io.github.gh0stinthesh311.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long>
{
}
