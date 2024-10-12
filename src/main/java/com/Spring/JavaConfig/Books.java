package com.Spring.JavaConfig;

import org.springframework.stereotype.Component;

//When using '@Component' annotation, the package of the class must be specified in the configuration file.
//@Component("bookBean")
public class Books {
    private bookAuthor author;

    public Books(bookAuthor author) {
        this.author = author;
    }

    public void Name(){
        author.Author();
        System.out.println("Around the world in 80 days!!!");
    }
}
