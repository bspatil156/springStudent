package com.Spring.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Class 'NewsPaper' implements Interfaces 'InitializingBean' and 'DisposableBean'.
//'InitializingBean' contains 'init()' method of tge bean lifecycle.
//'DisposableBean' contains 'destroy()' method of tge bean lifecycle.
public class NewsPaper implements InitializingBean, DisposableBean {
    private String Name;
    private String language;
    private int price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public NewsPaper() {
        super();
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "Name='" + Name + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                '}';
    }

    public void afterPropertiesSet(){
        System.out.println("This is the 'init()' method of NewsPaper present in 'InitializingBean' Interface");
    }

    public void destroy(){
        System.out.println("This is the destroy method of NewsPaper present in 'DisposableBean' Interface");
    }
}
