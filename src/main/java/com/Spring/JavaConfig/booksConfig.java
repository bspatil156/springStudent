package com.Spring.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//The 'booksConfig.java' class acts as aConfiguration file.

//The '@Configuration' annotation helps Spring to recognize the java class as a Configuration File.
@Configuration
//The package of the class whose object is to be created is specified through '@ComponentScan' annotation using
//the 'basePackages' parameter.
//'@ComponentScan' is required only while using '@Component'.
//@ComponentScan(basePackages = "com.Spring.JavaConfig")
public class booksConfig {
//    '@Bean' annotation specifies that the method returns an object.
    @Bean
    public bookAuthor bookAuthorBean() {
        return new bookAuthor();
    }

//    Bean name can explicitly be specified using the 'name' parameter in '@Bean' annotation.
//    You can provide a single bean name or an array of bean name.
    @Bean(name = {"bBean","bean","MyBean"})
//    Here the bean name is the method name as the method acts as a bean.
    public Books bookBean(){
//        Books bk = new Books();
//        return bk;
        return new Books(bookAuthorBean());
    }
}
