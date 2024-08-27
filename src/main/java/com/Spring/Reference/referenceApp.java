package com.Spring.Reference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class referenceApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("referenceConfig.xml");
        A a = ac.getBean("beanOfA",A.class);
        System.out.println(a);
    }
}
