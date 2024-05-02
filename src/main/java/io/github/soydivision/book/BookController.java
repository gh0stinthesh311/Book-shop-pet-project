package io.github.soydivision.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController
{
    @Autowired
    BookService booksService;

    @GetMapping
    private List<Book> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    private Book getBook(@PathVariable("id") int id)
    {
        return booksService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        booksService.delete(id);
    }

    @PostMapping
    private long saveBook(@RequestBody Book book)
    {
        booksService.saveOrUpdate(book);
        return book.getId();
    }

    @PutMapping
    private Book updateBook(@RequestBody Book book)
    {
        booksService.saveOrUpdate(book);
        return book;
    }
}