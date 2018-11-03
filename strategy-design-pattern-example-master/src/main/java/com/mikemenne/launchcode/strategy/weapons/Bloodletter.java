/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mikemenne.launchcode.strategy.weapons;

import com.mikemenne.launchcode.strategy.WarriorException;
import com.mikemenne.launchcode.strategy.Weapon;

/**
 *
 * @author jojstepersan
 */
public class Bloodletter implements Weapon {

    private String name;
    private String sound;

    public Bloodletter(String name) {
        this.name = name;
        this.sound = "sangress1!!!";
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
