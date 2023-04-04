package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends BaseHero{
    int arrows;
    int accuracy;

    public Crossbowman(String name,boolean firstTeam ) {
        super(100, name, firstTeam, 75, new int[]{8,14});
        arrows = 10;
//      accuracy = 50;
    }

//    }
    @Override
    public String getInfo(){return "я арбалетчик";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}
