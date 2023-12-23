package com.example.book.services;

import com.example.book.services.dtos.BookDTO;

public interface BookManager {
    public BookDTO getBookByTitle(String title);
    public BookDTO getBookByPublisherAmdPrice(String publisher, Float price);
    public BookDTO saveBook(BookDTO bookDTO);
    public BookDTO deleteBook(BookDTO bookDTO);

}
