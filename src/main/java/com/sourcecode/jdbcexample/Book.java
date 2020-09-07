package com.sourcecode.jdbcexample;

public class Book {

    private int id;
    private String name;
    private String author;
    private float cost;

    public Book(int id, String name, String author, float cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
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

    @Override()
    public String toString() {
        return "Book : " + this.name + " " + this.author + " " + this.cost;
    }
}
