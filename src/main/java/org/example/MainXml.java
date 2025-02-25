package org.example;

import org.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Result: " + metier.calcul());
    }
}
