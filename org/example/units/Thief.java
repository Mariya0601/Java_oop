package org.example.units;

public class Thief extends BaseHero{
    public Thief(String name) {
        super(100, name, 1, 6, 50, new int[]{8,15},"Разбойник");
    }
    @Override
    public String getInfo(){return "я разбойник";}
}
