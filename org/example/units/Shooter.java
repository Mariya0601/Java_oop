package org.example.units;

public abstract class  Shooter extends BaseHero {
    int accurance;
    int ammoReserve;

    public Shooter(String name) {
        super(80, name, 1, 6, 50, new int[]{3,5}, "Стрелок");
        accurance = 50;
        ammoReserve = 50;
    }
}
