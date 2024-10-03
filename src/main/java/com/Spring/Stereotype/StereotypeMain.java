package com.Spring.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("StereotypeConfig.xml");
//        The object bean name below should match the name in '@Component()'.
        Student std = ac.getBean("objNamedByMe",Student.class);
//        std.setName("Bhavesh Patil");
//        std.setCity("Pune");
//        System.out.println(std);
//        System.out.println(std.getBooks());
//        System.out.println(std.getBooks().getClass());
//        System.out.println(std.getBooks().getClass().getName());
        System.out.println(std.hashCode());
        Student std2 = ac.getBean("objNamedByMe",Student.class);
        System.out.println(std2.hashCode());
    }
}
