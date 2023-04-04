package org.example.units;

import java.util.ArrayList;

public class Thief extends BaseHero{
    public Thief(String name, boolean firstTeam) {
        super(100, name, firstTeam, 50, new int[]{8,15});
    }
    @Override
    public String getInfo(){return "я разбойник";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}
