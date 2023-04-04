package org.example.units;

import java.util.ArrayList;

public class Sniper extends BaseHero{
    int arrows;
    int accuracy;
    public Sniper(String name,boolean firstTeam) {
        super(7, name, firstTeam, 2, new int[] {6,12});
        arrows =10;
        accuracy = 70;
    }
    @Override
    public String getInfo(){return "я снайпер";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}


