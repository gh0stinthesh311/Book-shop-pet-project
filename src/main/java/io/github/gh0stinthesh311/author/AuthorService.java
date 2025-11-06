package io.github.gh0stinthesh311.author;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public List<AuthorDTO> getAllAuthors() {
        List<Author> allAuthors = authorRepository.findAll();
        AuthorMapper authorMapper = new AuthorMapper();
        return authorMapper.toDtoList(allAuthors);
    }

    public AuthorDTO getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such data"));
        return new AuthorDTO(author.getName());
    }

    public AuthorDTO getAuthorBooksById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such data"));
        return new AuthorDTO(author.getName());
    }

    public void saveOrUpdate(Author author) {
        authorRepository.save(author);
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}