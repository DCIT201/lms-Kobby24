package org.example;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean available;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.yearPublished = year;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYear(int year) {
        this.yearPublished = year;

    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Available: " + available);

    }

}

