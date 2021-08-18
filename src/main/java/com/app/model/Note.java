package com.app.model;

import java.sql.Date;
import java.time.LocalDate;

public class Note {
    private long id;
    private String title;
    private String text;
    private User author;
    private String category;
    private LocalDate localDate;
    private String status;


    public Note(String title, String text, User author, String category, LocalDate localDate, String status) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.category = category;
        this.localDate = localDate;
        this.status = status;
    }

    public Note() {
    }

    public Note(String title, String text, User user, Category category) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getLocalDate(LocalDate localDate) {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    }
