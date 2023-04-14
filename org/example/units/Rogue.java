package org.example.units;

import java.util.ArrayList;

public class Rogue extends Infantry{
    public Rogue(String name, boolean firstTeam) {
        super("Разбойник",50, name, firstTeam, 15, new int[]{9, 28}, 7);
    }

    @Override
    public String getInfo() {
        return className + " " + name;
    }
}
