package com.Spring.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpELConfig.xml");
        Demo demo = ac.getBean("demoBean",Demo.class);
        System.out.println(demo);
//        'SpelExpressionParser' class is used to parse the expression with the help of 'parseExpression()' method.
//        SpelExpressionParser spel = new SpelExpressionParser();
//        'parseExpression()' parses the expression and  is stored in object variable of 'Expression' interface.
//        Expression exp = spel.parseExpression("1+2+3+4");
//        Here the 'Expression' interface is implemented by 'SpelExpressionParser' class.
//        To provide a String as an expression we need to enclose it in '' single inverted commas.
        Expression exp = new SpelExpressionParser().parseExpression("1+2+3+4");
//        The 'getValue()' method evaluates and returns the exprassion.
        System.out.println(exp.getValue());
    }
}
