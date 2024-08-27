package com.Spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("collectionConfig.xml");
        studentCollection sc = ac.getBean("stdCollection",studentCollection.class);
        System.out.println(sc);
    }
}
