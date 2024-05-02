package io.github.soydivision.book;

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
    private Book getBook(@PathVariable("bookid") int bookid)
    {
        return booksService.getBookById(bookid);
    }

    @DeleteMapping("/books/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid)
    {
        booksService.delete(bookid);
    }

    @PostMapping("/books")
    private long saveBook(@RequestBody Book book)
    {
        booksService.saveOrUpdate(book);
        return book.getId();
    }

    @PutMapping("/books")
    private Book updateBook(@RequestBody Book book)
    {
        booksService.saveOrUpdate(book);
        return book;
    }
}