package com.Spring.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class booksMain {
    public static void main(String args[]){
//        While using java or annotation configuration, we use the 'AnnotationConfigApplicationContext'
//        implementation class of 'ApplicationContext' interface.
        ApplicationContext ac = new AnnotationConfigApplicationContext(booksConfig.class);
//        Below line generates 'NoS.uchBeanDefinitionException'
//        Books bks = ac.getBean("bookBean",Books.class);
        Books bks = ac.getBean("bean",Books.class);
        System.out.println(bks);
//        System.out.println(bks.toString());
        bks.Name();
    }
}
