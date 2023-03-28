package org.example.units;

public class Sniper extends BaseHero{
    int arrows;
    int accuracy;
    public Sniper(String name) {
        super(7, name, 1, 2, 50, new int[] {6,12},"Снайпер");
        arrows =10;
        accuracy = 70;
    }
}


