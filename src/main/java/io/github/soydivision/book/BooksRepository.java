package io.github.soydivision.book;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Long>
{
}
