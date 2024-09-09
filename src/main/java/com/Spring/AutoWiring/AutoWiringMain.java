package com.Spring.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("AutoWiringConfig.xml");
        Employee emp = (Employee) ac.getBean("employeeBean");
        System.out.println(emp);
    }
}

