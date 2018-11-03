package com.mikemenne.launchcode.strategy;

/**
 * User: mpmenne
 * Date: 5/21/14
 * Time: 11:28 PM
 */


public class Warrior {

    private String name;
    private Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void strike() {
        try {
            weapon.strike();
        } catch (WarriorException e) {
            System.out.println(String.format("Uh-Oh %s", e.getMessage()));
        }
    }

    @Override
    public java.lang.String toString() {
        return String.format("I am an %s using a %s", name, weapon.getName());
    }
}
