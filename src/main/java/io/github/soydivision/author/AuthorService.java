package io.github.soydivision.author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService

{
    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllBooks()
    {
        List<Author> author = new ArrayList<>();
        authorRepository.findAll().forEach(author::add);
        return author;
    }

    public Author getAuthorById(Long id)
    {
        return authorRepository.findById(id).get();
    }

    public void saveOrUpdate(Author author)
    {
        authorRepository.save(author);
    }

    public void delete(Long id)
    {
        authorRepository.deleteById(id);
    }
}