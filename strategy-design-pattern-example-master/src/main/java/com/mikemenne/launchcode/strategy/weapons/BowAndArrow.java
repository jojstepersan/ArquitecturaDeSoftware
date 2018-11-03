package com.mikemenne.launchcode.strategy.weapons;

import com.mikemenne.launchcode.strategy.WarriorException;
import com.mikemenne.launchcode.strategy.Weapon;

/**
 * User: mpmenne Date: 5/21/14 Time: 11:54 PM
 */
public class BowAndArrow implements Weapon {

    private String name;
    private String sound;

    public BowAndArrow(String name) {
        this.name = name;
        this.sound = "Whoosh";
    }

    public void strike() throws WarriorException {
        if (outOfArrows()) {
            throw new WarriorException("I'm all out of arrows");
        }

        System.out.println(sound);
    }

    private boolean outOfArrows() {
        return false;
    }

    public String getName() {
        return name;
    }
}
