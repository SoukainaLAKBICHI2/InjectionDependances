package org.example;

import org.example.Dao.DaoImpl;
import org.example.Dao.IDao;
import org.example.Metier.IMetier;
import org.example.Metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        IDao dao = new DaoImpl(); // instanciation statique
        IMetier metier = new MetierImpl(dao); // Injection des dépendances
        System.out.println("Resultat: " + metier.calcul());
    }
}