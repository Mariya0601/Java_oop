package org.example.units;

import java.util.ArrayList;

public class Mag extends BaseHero {
    int mana;
    protected ArrayList<Spells> spells_books;

    public Mag(String name) {
        super(100, name, 1, 6, 20, new int[]{3,5}, "Маг");
        mana = 100 ;
//        spells_books.add(new Spells("Фаербол"));
//        spells_books.add(new Spells("Увеличение брони"));
//        spells_books.add(new Spells("Увеличение урона"));
    }
}

