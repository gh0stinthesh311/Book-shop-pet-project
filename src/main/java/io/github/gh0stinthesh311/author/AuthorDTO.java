package io.github.gh0stinthesh311.author;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorDTO {
    private Long id;
    private String name;

    public AuthorDTO() {
    }

//    public AuthorDTO(Long id, String name, List<BookDTO> books) {
//        this.id = id;
//        this.name = name;
//        this.books = books;
//    }

    public AuthorDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AuthorDTO(String name) {
        this.name = name;
    }

//    public AuthorDTO(String name) {
//        this.name = name;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<BookDTO> getBooks() {
//        return books;
//    }
//
//    public void setBooks(List<BookDTO> books) {
//        this.books = books;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

