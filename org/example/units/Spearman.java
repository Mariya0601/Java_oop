package org.example.units;

import java.util.ArrayList;

public  class Spearman extends BaseHero{
    public Spearman(String name, boolean firstTeam) {
        super(200, name,firstTeam, 80,new int[]{10,20});
    }

    @Override
    public String getInfo(){return "я Копьеносец";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}
