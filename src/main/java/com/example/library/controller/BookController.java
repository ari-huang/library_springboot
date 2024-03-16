package com.example.library.controller;
import com.example.library.entity.Book;
import com.example.library.service.BookService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService bookservice;//取得Service物件

    @GetMapping("/members")
    public Iterable<Book> getBookList () {
        Iterable<Book> bookList = bookservice.getBooks();
        return bookList;
    }
}
