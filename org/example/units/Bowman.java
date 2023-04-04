package org.example.units;

public class Bowman extends Shooter{
    public Bowman(String name, boolean firstTeam) {
        super(100, name, firstTeam, 50, new int[]{6,12});
    }


//    public Bowman(String name, boolean team) {
//        super(super(80, name, team, 6,  new int[]{3,5},6););
//    }
    @Override
    public String getInfo(){
        return "Лучник";
    }
}
