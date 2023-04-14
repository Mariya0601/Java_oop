package org.example.units;

import org.example.teams.Team;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public abstract class Infantry extends BaseHero {

    public Infantry(String className, int hp, String name, boolean team, int armor, int[] damage, int initiative) {
        super(className, hp, name, team, armor, damage, initiative);
    }
    public void attack(BaseHero enemy){
        enemy.getDamage(new Random().nextInt(damage[0], damage[1]));
        
    }

    @Override
    public void step() {
//        super.step();
        if (Objects.equals(state, "Dead")) return;
        Team<BaseHero> enemyTeam = filterVisibleTeam(getEnemyTeam());
        if(enemyTeam.isEmpty()) return;
        BaseHero closestEnemy = findClosestEnemy();
        Coords enemyPosition = closestEnemy.getPosition();
        double distance = Coords.getDistance(position, closestEnemy.position);
        if (distance < 2) {
            attack(closestEnemy);
            return;
        }

        int x_diff = enemyPosition.getX() - this.getPosition().getX();
        int y_diff = enemyPosition.getY() - this.getPosition().getY();

        int move_x = 0;
        int move_y = 0;

        if (Math.abs(x_diff) > Math.abs(y_diff)) {
            move_x += (int) Math.signum(x_diff);
        } else move_y += (int) Math.signum(y_diff);
        if (!checkPosition(position.x + move_x, position.y + move_y)){
            if (checkPosition(position.x + move_x, position.y + move_y -1))
                move_y -= 1;
            else if (checkPosition(position.x + move_x, position.y + move_y +1))
                move_y += 1;
        }
        position.x += move_x;
        position.y += move_y;
    }
}
