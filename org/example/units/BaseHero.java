package org.example.units;

public class BaseHero {
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
        this.name = name;
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;



    }

}
