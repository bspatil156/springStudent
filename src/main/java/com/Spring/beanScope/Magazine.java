package com.Spring.beanScope;

public class Magazine {
    private String Name;
    private String founder;
    private int price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "Name='" + Name + '\'' +
                ", founder='" + founder + '\'' +
                ", price=" + price +
                '}';
    }
}
