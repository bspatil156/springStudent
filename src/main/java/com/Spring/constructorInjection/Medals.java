package com.Spring.constructorInjection;

public class Medals {
    private String medalName;

    public Medals(String medalName) {
        this.medalName = medalName;
    }

    @Override
    public String toString() {
        return this.medalName;
    }
}
