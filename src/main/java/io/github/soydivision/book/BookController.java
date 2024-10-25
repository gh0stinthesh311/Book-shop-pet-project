package io.github.soydivision.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController
{
    @Autowired
    BookService booksService;

    @GetMapping("/all")
    public List<Book> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id)
    {
        return booksService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        booksService.delete(id);
    }

    @PostMapping
    public long saveBook(@RequestBody Book book)
    {
        booksService.saveOrUpdate(book);
        return book.getId();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id); // Ensure the ID matches the path variable, otherwise you can pass arbitrary Id in request body.
        booksService.saveOrUpdate(book);
        return book;
    }

}