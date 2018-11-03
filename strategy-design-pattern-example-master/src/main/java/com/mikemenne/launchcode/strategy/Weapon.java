package com.mikemenne.launchcode.strategy;

/**
 * User: mpmenne
 * Date: 5/21/14
 * Time: 11:29 PM
 */
public interface Weapon {

    public void strike() throws WarriorException;

    public String getName();
}
