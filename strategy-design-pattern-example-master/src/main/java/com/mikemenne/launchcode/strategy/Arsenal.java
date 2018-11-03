package com.mikemenne.launchcode.strategy;

import com.mikemenne.launchcode.strategy.weapons.AmygdalanArm;
import com.mikemenne.launchcode.strategy.weapons.BowAndArrow;
import com.mikemenne.launchcode.strategy.weapons.*;

/**
 * User: mpmenne Date: 6/6/14 Time: 8:43 PM
 */
public class Arsenal {

    private Arsenal(int bows, int swords) {

    }

    public Weapon bowAndArrow(String name) {
        return new BowAndArrow(name);
    }

    public Weapon sword(String name) {
        return new Sword(name);
    }

    public Weapon amygdalanArm(String name) {
        return new AmygdalanArm(name);
    }

    public Weapon beasthunterSaif(String name) {
        return new BeasthunterSaif(name);
    }

    public Weapon beastCutter(String name) {
        return new BeastCutter(name);
    }

    public Weapon bloodletter(String name) {
        return new Bloodletter(name);
    }

    public Weapon boomHammer(String name) {
        return new BoomHammer(name);
    }

    public Weapon churchPick(String name) {
        return new ChurchPick(name);
    }

    public Weapon holyMoonlightSword(String name) {
        return new HolyMoonlightSword(name);
    }

    public Weapon kosParasite(String name) {
        return new KosParasite(name);
    }

}
