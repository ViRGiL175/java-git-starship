/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.ships.StarShip;
import rape.brutal.gitstarship.stuff.Loot;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class OpenSpace extends Location {

    private ArrayList<StarShip> enemyShips;

    public OpenSpace(ArrayList<StarShip> enemyShips) {
        this.enemyShips = enemyShips;
        generateLoot(getLootVariants());
    }

    @Override
    protected void generateLoot(ArrayList<Loot> lootVariantsArrayList) {

    }

    @Override
    protected ArrayList<Loot> getLootVariants() {
        return null;
    }
}
