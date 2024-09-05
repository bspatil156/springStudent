package com.Spring.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String args[]){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
        Book bk = (Book) ac.getBean("bookBean");
        System.out.println(bk);
//      'registerShutdownHook()' is used to call the 'int()' and 'destroy()' methods.
        ac.registerShutdownHook();
        System.out.println("**************************************************************************************");
        NewsPaper np = ac.getBean("NewsBean", NewsPaper.class);
        System.out.println(np);
        System.out.println("**************************************************************************************");
        Magazine mg = ac.getBean("magazineBean",Magazine.class);
        System.out.println(mg);
    }
}
