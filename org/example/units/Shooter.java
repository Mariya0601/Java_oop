package org.example.units;

import org.example.teams.Team;

import java.util.Objects;
import java.util.Random;

public abstract class  Shooter extends BaseHero {
    protected int arrows;
    protected int accuracy;

    public Shooter(String className, int hp, String name, boolean team, int armor, int[] damage, int arrows, int accuracy) {
        super(className, hp, name, team, armor, damage, 10);
        this.armor = arrows;
        this.accuracy = accuracy;
    }
    protected void shoot(BaseHero enemy){
        this.arrows--;
        int dmg = new Random().nextInt(damage[0], damage[1]);
//        System.out.println(this.getInfo() + " стреляет в " + enemy.getInfo());
        enemy.getDamage(dmg);
    }
    protected boolean hasLiveStandPeasant(Team<BaseHero> allyTeam) {
        for (BaseHero hero : allyTeam) {
            if (Objects.equals(hero.className, "Фермер") && Objects.equals(hero.state, "Stand")) {
                return true;
            }
        }
        return false;
    }
    protected BaseHero getLivePeasant(Team<BaseHero> allyTeam) {
        for (BaseHero hero : allyTeam) {
            if (Objects.equals(hero.className, "Фермер") && Objects.equals(hero.state, "Stand")) {
                return hero;
            }
        }
        return this;
    }

    public void step(){
        if (Objects.equals(state, "Dead")) return;
        Team<BaseHero> allyTeam = getAllyTeam();
        Team<BaseHero> enemyTeam = filterVisibleTeam(getEnemyTeam());
        if (enemyTeam.isEmpty()) return;
        if (hasLiveStandPeasant(allyTeam)) {
            this.arrows++;
            BaseHero peasant = getLiveAlly("Фермер");
            peasant.state = "Busy";
//            System.out.println(getInfo() + " берёт стрелу от " + peasant.getInfo());
        }
        if (this.arrows <= 0) return;
        BaseHero closestEnemy = findClosestEnemy();
        shoot(closestEnemy);
    }
    @Override
    public String toString() {
        return super.toString().replace("Статус", "➶: " + arrows + " Статус");
    }

}
