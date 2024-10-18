//package io.github.soydivision.order_item;
//
//import io.github.soydivision.book.Book;
//import io.github.soydivision.order.Order;
//import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "order_items")
//public class OrderItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @ManyToOne
//    @JoinColumn(name = "book_id")
//    private Book book;
//
//    private int quantity; // Quantity of the specific book in this order
//
//    public OrderItem(){}
//}
//
//
