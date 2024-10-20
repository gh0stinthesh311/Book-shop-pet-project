package io.github.soydivision.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/all")
    private List<Author> getAllBooks()
    {
        return authorService.getAllBooks();
    }

    @GetMapping("/{id}")
    private Author getBook(@PathVariable Long id)
    {
        return authorService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable Long id)
    {
        authorService.delete(id);
    }

    @PostMapping
    private long saveAuthor(@RequestBody Author author)
    {
        authorService.saveOrUpdate(author);
        return author.getId();
    }

    @PutMapping("/{id}")
    private Author updateAuthor(@PathVariable Long id, @RequestBody Author author)
    {
        author.setId(id); // Ensure the ID matches the path variable, otherwise you can pass arbitrary Id in request body.
        authorService.saveOrUpdate(author);
        return author;
    }
}


