package io.github.soydivision.author;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.github.soydivision.book.Book;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column
    private String name;

    @ManyToMany
//    @JsonIgnore
    @JsonManagedReference // This is to avoid infinite loop. This is forward part of reference.
    @JoinTable(
            name = "AUTHOR_BOOK_MAPPING",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books;// no need to specify implementation, Hibernate will use its own

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }

    public void setBook(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (!this.books.contains(book)) {
            this.books.add(book);
        }
    }
}

