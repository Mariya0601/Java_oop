package org.example;

import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
//        heroes.forEach(n -> System.out.println(n));


        ArrayList<BaseHero> randomHeroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)){
                case 0:
                    heroes.add(new Sniper("Алексей"));
                    break;
                case 1:
                    heroes.add(new Crossbowman("Елизавета"));
                    break;
                case 2:
                    heroes.add(new Mag("Олег"));
                    break;
                case 3:
                    heroes.add(new Monk("Виктория"));
                    break;
                case 4:
                    heroes.add(new Spearman("Борис"));
                    break;
                case 5:
                    heroes.add(new Thief("Роман"));
                    break;
                default:
                    heroes.add(new Peasant("Ваня"));
                    break;
             }
        }
        heroes.forEach((n)->System.out.println(n.getName() + " " + n.getInfo()));
    }

}



