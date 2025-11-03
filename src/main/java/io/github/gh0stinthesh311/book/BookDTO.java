package io.github.gh0stinthesh311.book;

import io.github.gh0stinthesh311.author.AuthorDTO;

import java.util.List;

public class BookDTO {
    private Long id;
    private String title;
    private int price;
    private List<AuthorDTO> authors;

    public BookDTO() {
    }
//
//    public BookDTO(long id, String title, int price) {
//        this.id = id;
//        this.title = title;
//        this.price = price;
//    }

    public BookDTO(Long id, String title, int price, List<AuthorDTO> authors) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public BookDTO(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        this.authors = authors;
    }
}
