package com.Spring.constructorInjection;

import java.util.List;

public class Sportsman {
    private String stmName;
    private int age;
    private String sport;
    private Medals medal;
    private List<String> list;
    public Sportsman(String stmName,int age,String sport, Medals medal, List<String> list){
        this.stmName = stmName;
        this.age = age;
        this.sport = sport;
        this.medal = medal;
        this.list = list;
    }

    @Override
    public String toString(){
        return this.stmName+" : "+this.age+" : "+this.sport+" : "+this.medal+" : "+this.list;
    }
}
