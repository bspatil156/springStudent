package com.Spring.Reference;

public class A {
    private int x;
    private B objb;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObjb() {
        return objb;
    }

    public void setObjb(B objb) {
        this.objb = objb;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", objb=" + objb +
                '}';
    }
}
