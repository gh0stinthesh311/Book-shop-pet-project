package io.github.gh0stinthesh311.author;

import io.github.gh0stinthesh311.book.BookDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMapper {
    public AuthorDTO toDto(Author author) {
//        List<BookDTO> bookDTOs = author.getBooks().stream()
//                .map(book -> new BookDTO(book.getId(), book.getTitle(), book.getPrice()))
//                .toList();
//        return new AuthorDTO(author.getId(), author.getName());
        return new AuthorDTO(author.getName());
    }

    public List<AuthorDTO> toDtoList(List<Author> authors) {
        return authors.stream().map(this::toDto).toList();
    }
}
