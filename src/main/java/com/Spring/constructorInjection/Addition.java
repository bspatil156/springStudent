package com.Spring.constructorInjection;

public class Addition {
    int a;
    int b;
    public Addition(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor : double, double");
    }

    public Addition(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor : int, int");
    }

    public Addition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(a);
        System.out.println("Constructor : String, String");
    }

    public void Add(){
        System.out.println("Addition : "+(this.a+this.b));
    }
}
