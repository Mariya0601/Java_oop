package org.example.units;

import java.util.Random;

public class BaseHero implements GameInterface {
    float hp, maxHp;
    String name;
    String class_name;
    int x, y;
    int armor;
    int [] damage;

    @Override
    public String toString(){
        return name + " " + hp+ " " + armor+ " " + class_name;
    }

    public BaseHero(float hp, String name, int x, int y,int armor,int [] damage, String class_name){
        this.hp = this.maxHp = hp;
        this.name = getName() ;
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }
//    @Override
//    public void step(){}

    @Override
    public String getInfo(){return "я";
    }
    public String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}
