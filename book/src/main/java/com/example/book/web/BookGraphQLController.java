package com.example.book.web;

import com.example.book.services.BookManager;
import com.example.book.services.dtos.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

public class BookGraphQLController {
    BookManager bookManager;
    @QueryMapping
    public BookDTO getPersonByTitle(@Argument String title) {
        return bookManager.getBookByTitle(title);
    }
    public BookDTO getBookByPublisherAmdPrice(@Argument String publisher, Float price) {
        return bookManager.getBookByPublisherAmdPrice(publisher,price);
    }
    @MutationMapping
    public BookDTO saveBook(BookDTO bookDTO) {
        return bookManager.saveBook(bookDTO);
    }
    public BookDTO deleteBook(BookDTO bookDTO) {
        return bookManager.deleteBook(bookDTO);
    }

}
