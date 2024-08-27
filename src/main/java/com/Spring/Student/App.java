package com.Spring.Student;

import com.Spring.collections.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 App.java
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

//        Creating object of type 'ApplicationContext' which is an interface
//        by using it's implementation class i.e. 'ClassPathXmlApplicationContext'.
//        'ApplicationContext' : Interface.
//        'ClassPathXmlApplicationContext' : Implementation class of 'ApplicationContext'.
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
//        Student std = (Student) ac.getBean("MyStudent");
//                      OR
        Student std1 = ac.getBean("MyStudent1",Student.class);
        Student std2 = (Student) ac.getBean("MyStudent2");
//        studentCollection stdcoll = (studentCollection) ac.getBean("stdCollection");
        System.out.println( "Hello World!" );
        System.out.println(std1);
        System.out.println(std2);
//        System.out.println(stdcoll);
    }
}
