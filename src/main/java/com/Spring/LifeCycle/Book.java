package com.Spring.LifeCycle;

public class Book {
    private String author;
    private String title;
    private int price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("Setting author");
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Setting title");
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Book() {
        super();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

//    This is the 'init()' method.
    public void Beginning(){
        System.out.println("This is 'init()' method of 'Book' without using 'InitializingBean' interface");
    }

//    This is the 'destroy()' method.
    public void Closure(){
        System.out.println("This is 'destroy()' method of 'Book' without using 'DisposableBean' interface");
    }
}
