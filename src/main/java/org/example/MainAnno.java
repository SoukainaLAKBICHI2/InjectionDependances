package org.example;

import org.example.Metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnno {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result: " + metier.calcul());
    }
}
