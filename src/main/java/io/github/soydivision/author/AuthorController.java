package io.github.soydivision.author;

import io.github.soydivision.book.Book;
import io.github.soydivision.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Author> getAllBooks() {
        return authorService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Author getBook(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        authorService.delete(id);
    }

    @PostMapping
    public long saveAuthor(@RequestBody Author author) {
        authorService.saveOrUpdate(author);
        return author.getId();
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        author.setId(id); // Ensure the ID matches the path variable, otherwise you can pass arbitrary Id in request body.
        authorService.saveOrUpdate(author);
        return author;
    }

    @PostMapping("/{authorId}/book/{bookId}")
    public ResponseEntity<?> addBookToAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
        Author author = authorService.getAuthorById(authorId);
        Book book = bookService.getBookById(bookId);
        author.getBooks().add(book);
        authorService.saveOrUpdate(author);
        return ResponseEntity.ok("Book " + book.getTitle() + " has been added to " + author.getName());
    }

    //To do
//    @DeleteMapping("/{authorId}/book/{bookId}")
//    public ResponseEntity<?> removeBookFromAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
//        // Logic to remove the book from the author
//
//    }
}


