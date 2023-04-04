package org.example.units;

import org.example.GameInterface;
import org.example.Names;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
    float hp, maxHp;
    String name;
    protected boolean team;
    protected static int lastFirstTeamX = 0;
    protected static int lastFirstTeamY = 0;
    protected static int lastSecondTeamX = 9;
    protected static int lastSecondTeamY = 0;
    protected int x, y;
    int armor;
    int [] damage;

    @Override
    public String toString(){
        return this.getInfo() +" "+ name + " " + hp+ " " + armor+ " " +  this.GetPosition() ;
    }
    public String GetPosition(){
        return " " + "x:" + this.x + " "+ "y:" + this.y;
    }

//    @Override
//    public String getInfo(){return "я";
//    }

    public BaseHero(float hp, String name, boolean team,int armor,int [] damage){
        this.hp = this.maxHp = hp;
        this.name = getName() ;
        if (team){
            this.x = lastFirstTeamX;
            this.y = lastFirstTeamY++;
        }
        else
        {
            this.x = lastSecondTeamX;
            this.y = lastSecondTeamY++;
        }

        this.armor = armor;
        this.damage = damage;
    }
    protected int getInt(){
        return 1;
    }


//    @Override
//    public void step(){}


    public String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public void step(){
    }
    public static  ArrayList<BaseHero> createFirstTeam() {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)){
                case 0:
                    heroes.add(new Sniper("Алексей",true));
                    break;
                case 1:
                    heroes.add(new Crossbowman("Елизавета",true));
                    break;
                case 2:
                    heroes.add(new Mag("Олег",true));
                    break;
                case 3:
                    heroes.add(new Monk("Виктория",true));
                    break;
                case 4:
                    heroes.add(new Spearman("Борис",true));
                    break;
                case 5:
                    heroes.add(new Thief("Роман",true));
                    break;
                default:
                    heroes.add(new Peasant("Ваня",true));
                    break;
            }
        }
        return heroes;
//        heroes.forEach((n)->System.out.println(n.getName() + " " + n.getInfo()));
    }
    public static  ArrayList<BaseHero> createSecondTeam() {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)){
                case 0:
                    heroes.add(new Sniper("Алексей",false));
                    break;
                case 1:
                    heroes.add(new Crossbowman("Елизавета",false));
                    break;
                case 2:
                    heroes.add(new Mag("Олег",false));
                    break;
                case 3:
                    heroes.add(new Monk("Виктория",false));
                    break;
                case 4:
                    heroes.add(new Spearman("Борис",false));
                    break;
                case 5:
                    heroes.add(new Thief("Роман",false));
                    break;
                default:
                    heroes.add(new Peasant("Ваня",false));
                    break;
            }
        }
        return heroes;
    }
   public BaseHero findClosestEnemy(ArrayList<BaseHero> enemyTeam) {
        BaseHero closestEnemy = enemyTeam.get(0);
        double distance = Math.sqrt(Math.pow(enemyTeam.get(0).x - this.x,2 ) + Math.pow(enemyTeam.get(0).y - this.y,2 ));
        double minDistance = distance;
        for (BaseHero enemy : enemyTeam) {
            distance = Math.sqrt(Math.pow(enemy.x - this.x,2 ) + Math.pow(enemy.y - this.y,2 ));
            if (minDistance > distance) {
                minDistance = distance;
                closestEnemy = enemy;
            }
        }
        return closestEnemy;
    }

    public abstract void step(ArrayList<BaseHero> enemyTeam);
    public void getDamage(int damage) {
        if (this.hp - damage >0){
            this.hp-= damage;
        }
    }
}
