package com.Spring.beanScope;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beanOfBook")
@Scope("prototype")
public class Books {

//    Bean Scope :
//    1)Singleton
//    2)prototype
//    3)request
//    4)session
//    5)globalsession
//1)Singleton : It is the default bean Scope. The object creation by springIOC container takes place only once.
//              Same object is used multiple times. If we create two objects, both object variables refer to the
//              same object created by Spring IOC Container. Hence, the hashCode is same for every object variable
//              created by us.
//2)Prototype : Scopes a single bean definition to any number of object instances.
//3)Request : Scopes a single bean definition to the lifecycle of a single HTTP request; that is, each HTTP request
//            has its own instance of a bean created off the back of a single bean definition. Only valid in the
//            context of a web-aware Spring 'ApplicationContext'.
//Session : Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of
//          web-aware Spring ApplicationContext.
//Global Session : Scopes a single bean definition to the lifecycle of a global HTTP Session. Typically only valid
//                 when used in a portlet context. Only valid in the context of a web-aware Spring
//                 'ApplicationContext'.
    @Value("Around the world in 80 context of a web-aware Spring\n" +
            "ApplicationContext.days")
    private String Title;
    @Value("Jules Verne")
    private String author;
    @Value("175")
    private int price;
    @Value("#{ranks}") //Spring Expression Language Syntax
    private Map<String, Double> rankings;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Map<String, Double> getRankings() {
        return rankings;
    }

    public void setRankings(Map<String, Double> rankings) {
        this.rankings = rankings;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Title='" + Title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", rankings=" + rankings +
                '}';
    }
}
