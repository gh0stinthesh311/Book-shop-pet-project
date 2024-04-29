package com.javatpoint.book;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Integer>
{
}
