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
    @Value("#{T(java.lang.Math).sqrt(4)}")
    private int z;
    @Value("#{T(java.lang.Math).E}")
    private double epsilon;
    @Value("#{new java.lang.String('Stay Hungry Stay Foolish')}")
    private String message;
    @Value("#{12>2}")
    private boolean condition;
//    @Value("#{new com.Spring.SpEL.Demo()}")
//    private Demo obj;

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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
    }

//    public Demo getObj() {
//        return obj;
//    }
//
//    public void setObj(Demo obj) {
//        this.obj = obj;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", epsilon=" + epsilon +
                ", message='" + message + '\'' +
                ", condition=" + condition +
                '}';
    }
}
