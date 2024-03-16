package com.example.library.service;
import com.example.library.dao.BookDao;
import com.example.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    @Autowired
    BookDao bookDao; // 取得Dao物件

    public Iterable<Book> getBooks () {
        return bookDao.findAll();
    }
}
