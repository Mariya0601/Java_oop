package org.example.units;

import java.util.ArrayList;

public class Monk extends BaseHero{
    int mana;
    protected ArrayList<Spells> spells_books;

    public Monk(String name, boolean firstTeam) {
        super(150, name,firstTeam, 30, new int[]{5, 8});
    }

    @Override
    public String getInfo(){return "я монах";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}
