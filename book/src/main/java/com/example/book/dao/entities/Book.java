package com.example.book.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private long id_Book;
    private String titre;
    private String publisher;
    private Date date_publication;
    private Float price;
    private String resume;
}
