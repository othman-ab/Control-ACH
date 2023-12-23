package com.example.book.services.dtos;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDTO {
    private String titre;
    private String publisher;

    private Date date_publication;

    private Float price;
}
