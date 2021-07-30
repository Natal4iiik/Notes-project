package com.app.model;

public enum Category {
    HOME("Homeworks, To-do list"),
    WORK("Meetings, schedule, topics, seminars"),
    SHOP("Product list"),
    KIDS("Kindergarten, school, university");

    private String category;

    Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return category;
    }
}
