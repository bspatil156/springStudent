package com.Spring.AutoWiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("AnnotationAutoWiringConfig.xml");
        Employee emp = (Employee) ac.getBean("employeeBean");
        System.out.println(emp);
    }
}

