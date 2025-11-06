package io.github.gh0stinthesh311.book;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.github.gh0stinthesh311.author.Author;
import io.github.gh0stinthesh311.order.Order;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private long id;

    @Column
    private String title;

    @Column
    private int price;

//    @ManyToOne
//    @JoinTable(name = "BOOK_CATEGORY_MAPPING",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id"))
//    private Category category;

    @ManyToMany
//    @JsonIgnore
    @JsonBackReference // This is to avoid infinite loop. This is backward part of reference.
    @JoinTable(
            name = "AUTHOR_BOOK_MAPPING",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;

    @ManyToMany
    @JoinTable(
            name = "ORDER_BOOK_MAPPING",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orders; // Hibernate uses its own specific implementations of collection types. No need to explicitly mention one here.


    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}