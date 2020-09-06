package com.sourcecode.jdbcexample;

import java.sql.SQLException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() throws SQLException {
        return DBOperations.getBooks();
    }

    @PostMapping("/book")
    public boolean insetBook(@RequestBody Book book) {
        return false;
    }

    @GetMapping("/book")
    public Book getBook(@RequestParam(value = "id") String id) {
        return null;
    }

}
