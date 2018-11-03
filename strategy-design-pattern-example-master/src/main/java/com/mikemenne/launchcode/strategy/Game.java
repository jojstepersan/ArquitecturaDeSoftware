package com.mikemenne.launchcode.strategy;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mpmenne Date: 5/21/14 Time: 11:28 PM
 */
public class Game {

    private Arsenal arsenal;

    static List<Warrior> warriors = new ArrayList<Warrior>();

    public void start() {
        Warrior archer = new Warrior("archer", arsenal.bowAndArrow("arco dorado"));
        Warrior longBow = new Warrior("long-bow", arsenal.bowAndArrow("felacha fugaz"));
        Warrior soldier = new Warrior("soldier", arsenal.sword("excalibur"));
        Warrior amygdalanArm = new Warrior("AmygdalanArm", arsenal.amygdalanArm("jajajajajajaja"));
        Warrior beasthunterSaif = new Warrior("BeasthunterSaif", arsenal.beasthunterSaif("BeasthunterSaif atack"));
        Warrior beastCutter = new Warrior("BeastCutter", arsenal.beastCutter("BeastCutter atack"));
        Warrior Bloodletter = new Warrior("Bloodletter", arsenal.bloodletter("Bloodletter atack"));
        Warrior BoomHammer = new Warrior("BoomHammer", arsenal.boomHammer("BoomHammer atack"));
        Warrior ChurchPick = new Warrior("ChurchPick", arsenal.churchPick("ChurchPick atack"));
        Warrior HolyMoonlightSword = new Warrior("HolyMoonlightSword", arsenal.holyMoonlightSword("HolyMoonlightSword atack"));
        Warrior KosParasite = new Warrior("KosParasite", arsenal.kosParasite("KosParasite atack"));

        warriors.add(archer);
        warriors.add(soldier);
        warriors.add(longBow);
        warriors.add(amygdalanArm);
        warriors.add(beasthunterSaif);
        warriors.add(beastCutter);
        warriors.add(Bloodletter);
        warriors.add(BoomHammer);
        warriors.add(ChurchPick);
        warriors.add(HolyMoonlightSword);
        warriors.add(KosParasite);
        for (Warrior warrior : warriors) {
            System.out.println("*************WEAPON*******************************");
            System.out.println(warrior);
            warrior.strike();
        }
        System.out.println(archer);
    }

    public Game(Arsenal arsenal) {
        this.arsenal = arsenal;
    }

    public static void main(String[] varArgs) {
        System.out.println("Welcome to the warrior game");

        ApplicationContext context
                = new ClassPathXmlApplicationContext("application.xml");

        Game obj = (Game) context.getBean("game1");
        obj.start();
    }

}
