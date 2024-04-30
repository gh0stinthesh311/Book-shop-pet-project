package com.javatpoint.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController
{
    @Autowired
    BookService booksService;
    @GetMapping("/books")
    private List<Book> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/books/{bookid}")
    private Book getBooks(@PathVariable("bookid") int bookid)
    {
        return booksService.getBooksById(bookid);
    }

    @DeleteMapping("/books/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid)
    {
        booksService.delete(bookid);
    }

    @PostMapping("/books")
    private long saveBook(@RequestBody Book books)
    {
        booksService.saveOrUpdate(books);
        return books.getId();
    }

    @PutMapping("/books")
    private Book update(@RequestBody Book books)
    {
        booksService.saveOrUpdate(books);
        return books;
    }
}