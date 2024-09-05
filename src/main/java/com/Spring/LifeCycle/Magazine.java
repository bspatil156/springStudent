package com.Spring.LifeCycle;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Magazine {
    private String Name;
    private int price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Magazine() {
        super();
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("This is the 'init()' method of 'Magazine' declared using '@PostConstruct'");
    }

    @PreDestroy
    public void end(){
        System.out.println("This is the 'destroy()' method of 'Magazine' declared using '@PreDestroy'");
    }
}
