package com.gadomska.bookshelfapp;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String title;
    private String author;
    private LocalDate publishmentYear;

    public Book() {
    }

    public Book(Long id, String title, String author, LocalDate publishmentYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishmentYear = publishmentYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getPublishmentYear() {
        return publishmentYear;
    }

    public void setPublishmentYear(LocalDate publishmentYear) {
        this.publishmentYear = publishmentYear;
    }
}
