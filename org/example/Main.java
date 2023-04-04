package org.example;

import org.example.units.*;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> firstTeam = BaseHero.createFirstTeam();
        ArrayList<BaseHero> secondTeam = BaseHero.createSecondTeam();

        firstTeam.forEach(n -> System.out.println( n.getName() + n.GetPosition()));
        System.out.println("_".repeat(40));
        secondTeam.forEach(n -> System.out.println( n.getName() + n.GetPosition()));

        System.out.println(firstTeam.get(0).findClosestEnemy(secondTeam));
    }



}




