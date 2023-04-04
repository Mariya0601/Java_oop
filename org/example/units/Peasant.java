package org.example.units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
    public Peasant (String name, boolean firstTeam) {
        super(100, name,firstTeam, 6, new int[]{5, 8});
    }
    @Override
    public String getInfo(){return "я крестьянин";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}
