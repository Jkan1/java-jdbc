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

    @GetMapping("/create-table")
    public String getBook() throws SQLException {
        DBOperations.createTable();
        return "Success";
    }

    @GetMapping("/books")
    public List<Book> getBooks() throws SQLException {
        return DBOperations.getBooks();
    }

    @PostMapping("/book")
    public boolean insertBook(@RequestBody Book book) throws SQLException {
        return DBOperations.insert(book);
    }

    @GetMapping("/book")
    public Book getBook(@RequestParam(value = "id") int id) throws SQLException {
        return DBOperations.getBook(id);
    }

}
