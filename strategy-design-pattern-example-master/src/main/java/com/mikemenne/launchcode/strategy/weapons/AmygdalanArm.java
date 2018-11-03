/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mikemenne.launchcode.strategy.weapons;

import com.mikemenne.launchcode.strategy.Weapon;

/**
 *
 * @author jojstepersan
 */
public class AmygdalanArm implements Weapon {

    private String name;
    private String sound;

    public AmygdalanArm(String name) {
        this.name = name;
        this.sound = "wqafwfsfa";
    }

    public void strike() {
        System.out.println(String.format("%s ... %s", sound, sound));
    }

    public String getName() {
        return name;
    }

}
