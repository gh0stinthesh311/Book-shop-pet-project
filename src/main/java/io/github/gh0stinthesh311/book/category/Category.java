package io.github.gh0stinthesh311.book.category;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String category;

    public Category() {}

    public Category(Long id, String name) {
        this.id = id;
        this.category = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return category;
    }

    public void setName(String name) {
        this.category = name;
    }
}
