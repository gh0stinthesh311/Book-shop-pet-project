package io.github.soydivision.order;

import io.github.soydivision.book.Book;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column
    private int quantity;

    @ManyToMany
    @JoinTable(
            name = "ORDER_BOOK_MAPPING", // Name of the join table
            joinColumns = @JoinColumn(name = "order_id"), // Foreign key to the Order entity
            inverseJoinColumns = @JoinColumn(name = "book_id") // Foreign key to the Book entity
    )
    private List<Book> books;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Order> orders;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
