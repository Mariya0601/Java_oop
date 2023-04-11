package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends BaseHero{
    int arrows;
    int accuracy;


    public Crossbowman(String name, boolean firstTeam) {
        super("Арбалетчик", 50, name, firstTeam, 10, new int[]{10, 20}, 10);
    }

    @Override
    public String getInfo() {
        return className + " " + name;
    }

}
