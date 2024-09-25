package com.Spring.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class standaloneCollectionsMain {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("standAloneCollectionConfig.xml");
        Author ath1 = ac.getBean("authorBean1",Author.class);
        Author ath2 = ac.getBean("authorBean2",Author.class);
        Author ath3 = ac.getBean("authorBean3",Author.class);
//        List :
        System.out.println(ath1);
//        Returns the class name of 'bookList'.
        System.out.println(ath1.getBooks().getClass().getName());

//        Map :
        System.out.println(ath2);
//        Returns the class name of 'NamePriceUtil'.
        System.out.println(ath2.getNamePrice().getClass().getName());

//        Properties :
        System.out.println(ath3);
        System.out.println(ath3.getRankCategory().getClass().getName());
    }
}
