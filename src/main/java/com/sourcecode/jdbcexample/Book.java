package com.sourcecode.jdbcexample;

public class Book {

    private String id;
    private String name;
    private String author;
    private float cost;

    Book(String name, String author, float cost) {
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
