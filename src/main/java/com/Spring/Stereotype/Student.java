package com.Spring.Stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//'@Component' annotation is used to create bean without using XML.
//'@Component'
@Component("objNamedByMe")
//If the object name provided above does not match with the one in 'getBean()' method, the following exception is raised.
//NoSuchBeanDefinitionException
public class Student {
//    @Value annotation is used to set the value of the variable.
    @Value("Bhavesh Patil")
    private String Name;
    @Value("Pune")
    private String City;
//    '@Value()' with collections.
    @Value("#{books}")
    private List<String> Books;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public List<String> getBooks() {
        return Books;
    }

    public void setBooks(List<String> books) {
        Books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", Books=" + Books +
                '}';
    }
}
