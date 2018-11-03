package com.mikemenne.launchcode.strategy.weapons;

import com.mikemenne.launchcode.strategy.Weapon;

/**
 * User: mpmenne Date: 5/21/14 Time: 11:58 PM
 */
public class Sword implements Weapon {

    private String name;
    private String sound;

    public Sword(String name) {
        this.name = name;
        this.sound = "slice";
    }

    public void strike() {
        System.out.println(String.format("%s ... %s", sound, sound));
    }

    public String getName() {
        return name;
    }
}
