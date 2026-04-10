package org.example.ss06.model;

public class Book {
    private int id;
    private String name;
    private String actor;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String actor, double price) {
        this.id = id;
        this.name = name;
        this.actor = actor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
