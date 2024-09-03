package com.Spring.constructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constructorInjectionApp {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("constructorConfig.xml");
        Medals mdl = (Medals) ac.getBean("beanOfMedals",Medals.class);
        Sportsman stm = ac.getBean("constrInjecBean",Sportsman.class);
        Addition add = ac.getBean("additionBean",Addition.class);
        System.out.println(stm);
        System.out.println(mdl);
        add.Add();
    }
}
