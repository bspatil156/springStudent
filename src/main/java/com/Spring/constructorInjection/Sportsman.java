package com.Spring.constructorInjection;

public class Sportsman {
    private String stmName;
    private int age;
    private String sport;
    private Medals medal;
    public Sportsman(String stmName,int age,String sport, Medals medal){
        this.stmName = stmName;
        this.age = age;
        this.sport = sport;
        this.medal = medal;
    }

    @Override
    public String toString(){
        return this.stmName+" : "+this.age+" : "+this.sport+" : "+this.medal;
    }
}
