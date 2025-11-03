package io.github.gh0stinthesh311.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    // Field Injection (@Autowired) Should Be Avoided
    @Autowired
    AuthorService authorService;

    @GetMapping("/all")
    public List<AuthorDTO> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorDTO getAuthor(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/{id}/books")
    public AuthorDTO getAuthorBooks(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    } // redundant

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.delete(id);
    }

    @PostMapping("/save")
    public long saveAuthor(@RequestBody Author author) {
        authorService.saveOrUpdate(author);
        return author.getId();
    } //Exposes Internal Entity

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        author.setId(id); // Ensure the ID matches the path variable, otherwise you can pass arbitrary Id in request body.
        authorService.saveOrUpdate(author);
        return author;
    }

//    @PostMapping("/{authorId}/book/{bookId}") //Missing Service (bookService) in addBookToAuthor()
//    public Author addBookToAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
//        Author author = authorService.getAuthorById(authorId);
//        Book book = bookService.getBookById(bookId);
//        author.getBooks().add(book);
//        authorService.saveOrUpdate(author);
//        return author;
//    }

//    To do
//    @DeleteMapping("/{authorId}/book/{bookId}")
//    public ResponseEntity<?> removeBookFromAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
//        // Logic to remove the book from the author
//
//    }
}


