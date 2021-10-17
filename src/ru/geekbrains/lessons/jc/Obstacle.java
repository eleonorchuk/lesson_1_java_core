package ru.geekbrains.lessons.jc;

import java.util.Random;

public class Obstacle {
    public int skill;
    Obstacle() {
        Random rnd = new Random();
        skill = rnd.nextInt(100);
        System.out.println("Препятствие : skill = " + skill);
    }
}
