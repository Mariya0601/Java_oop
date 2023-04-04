package org.example.units;

import java.util.ArrayList;

public class Mag extends BaseHero {
    int mana;
    protected ArrayList<Spells> spells_books;

    public Mag(String name, boolean firstTeam) {
        super(100, name, firstTeam, 6, new int[]{3,5});
        mana = 100 ;

//        spells_books.add(new Spells("Фаербол"));
//        spells_books.add(new Spells("Увеличение брони"));
//        spells_books.add(new Spells("Увеличение урона"));

    }
    @Override
    public String getInfo(){return "я маг";}

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }
}

