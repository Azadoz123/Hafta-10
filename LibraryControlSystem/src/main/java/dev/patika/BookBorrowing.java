package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book_borrowings")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id",columnDefinition = "serial")
    private int id;

    @Column(name ="book_borrowing_borrower_name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_borrowing_date")
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_return_date", nullable = true)
    private LocalDate returnDate;

    @OneToMany(mappedBy = "bookBorrowing", fetch = FetchType.LAZY)
    private List<Book> bookList;
}
