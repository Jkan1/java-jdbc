package com.sourcecode.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBOperations {

    private static Connection connection;

    public static void getConnection() throws SQLException {

        if (connection == null) {
            // protocol : subprotocol(type of db) : (host:port) : database_name
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "user", "pass");
        }
    }

    public static List<Book> getBooks() throws SQLException {

        getConnection();

        List<Book> booksResult = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet result = statement.executeQuery("SELECT * FROM books");

        while (result.next()) {

            String book_name = result.getString(2);
            String book_author = result.getString(3);
            float book_cost = result.getFloat(4);

            Book book = new Book(book_name, book_author, book_cost);
            booksResult.add(book);
        }

        return booksResult;

    }

    public static void createTable(String tableName) throws SQLException {
        getConnection();

        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE tb_books ( id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, name VARCHAR(30) NOT NULL, author VARCHAR(30) NOT NULL, cost DECIMAL, updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP )");
    }

}
