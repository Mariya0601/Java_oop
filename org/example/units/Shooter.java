package org.example.units;

import java.util.ArrayList;

public abstract class  Shooter extends BaseHero {
    int arrows;
    int accuracy;

    public Shooter(float hp, String name, boolean team, int armor, int[] damage) {
        super(hp, name, team, armor, damage);
        this.armor = arrows;
        this.accuracy = accuracy;
    }
    protected void shoot(BaseHero enemy){
//
    }

    public void step(ArrayList<BaseHero> enemyTeam){
        if (hp <= 0 || arrows <= 0) return;
        shoot(findClosestEnemy(enemyTeam));
    }

}
