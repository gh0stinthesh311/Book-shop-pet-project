package io.github.gh0stinthesh311.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService
{
    @Autowired
    BooksRepository booksRepository;

    public List<Book> getAllBooks()
    {
        List<Book> books = new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBookById(Long id)
    {
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Book books)
    {
        booksRepository.save(books);
    }

    public void delete(Long id)
    {
        booksRepository.deleteById(id);
    }
}
