package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "serial")
    private int id;

    @Column(name ="category_name")
    private String name;

    @Column(name = "category_description")
    private String description;

    @ManyToMany(mappedBy = "categoryList", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}
