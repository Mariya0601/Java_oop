package org.example;

import org.example.units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Sniper("Алексей"));
        heroes.add(new Crossbowman( "Елизавета"));
        heroes.add(new Mag( "Олег"));
        heroes.add(new Monk( "Виктория"));
        heroes.add(new Spearman( "Борис"));
        heroes.add(new Thief( "Роман"));
        heroes.add(new Peasant( "Ваня"));


        heroes.forEach(n-> System.out.println(n));
    }


}