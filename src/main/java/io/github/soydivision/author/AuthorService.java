package io.github.soydivision.author;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public List<AuthorDTO> getAllAuthors() {
        List<AuthorDTO> allAuthorsListDTO = new ArrayList<>();
         List<Author> allAuthors = authorRepository.findAll();
        for (Author author : allAuthors) {
            allAuthorsListDTO.add(new AuthorDTO(author.getName()));
        }
         return allAuthorsListDTO;
    }

    public AuthorDTO getAuthorById(Long id) {
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