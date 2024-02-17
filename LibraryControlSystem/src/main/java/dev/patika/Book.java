package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "serial")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "publication_year")
    private int publicationYear;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToMany
    @JoinTable(
        name = "books2categories",
        joinColumns = {@JoinColumn(name =  "books2categories_book_id")},
        inverseJoinColumns = {@JoinColumn(name = "books2categories_category_id")}
    )
    private List<Category> categoryList;

    @ManyToOne
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "book_book_borrowing_id", referencedColumnName = "book_borrowing_id")
    private BookBorrowing bookBorrowing;
}
