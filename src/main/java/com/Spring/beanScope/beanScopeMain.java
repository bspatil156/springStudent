package com.Spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeMain {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanScopeConfig.xml");
        Books book1 = (Books) ac.getBean("beanOfBook");
//        Same hashCode for Singleton scope.
//        Different hashCode of objects for prototype scope.
        System.out.println(book1.hashCode());
        Books book2 = ac.getBean("beanOfBook",Books.class);
        System.out.println(book2.hashCode());
//      'Magazine' configuration using XML. 'scope' attribute is used for specifying the bean Scope.
        Magazine mgz1 = (Magazine) ac.getBean("beanOfMagazine");
        System.out.println(mgz1.hashCode());
        Magazine mgz2 = ac.getBean("beanOfMagazine",Magazine.class);
        System.out.println(mgz2.hashCode());
    }
}
