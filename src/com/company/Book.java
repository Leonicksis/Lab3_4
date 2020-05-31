package com.company;

public class Book {
    private String name;
    private int pages;
    private String state;

    public String getName() {
        return name;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState()
    {
        return this.state;
    }
    public Book(String n, int p){
        this.name = n;
        this.pages = p;
        this.state = "i"; // i - на скаде, r - в чит зале, a - абонемент
    }
}