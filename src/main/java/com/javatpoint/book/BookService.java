package com.javatpoint.book;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
    EntityManager entityManager;

    @Autowired
    BooksRepository booksRepository;

    public List<Book> getAllBooks()
    {
        List<Book> books = new ArrayList<Book>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBooksById(int id)
    {
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Book books)
    {
        booksRepository.save(books);
    }

    public void delete(int id)
    {
        booksRepository.deleteById(id);
    }
}
