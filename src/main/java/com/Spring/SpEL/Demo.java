package com.Spring.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoBean")
public class Demo {
//    SpEL evaluates the expression and return it's result.
    @Value("#{10 + 10}")
    private int x;
    @Value("#{20 * 20}")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
