package ru.geekbrains.lessons.jc;

import java.util.Random;

public class Participant {
    static int id_generator = 0;
    public int id;
    public boolean passDist;
    public int skill;
    Participant() {
        id = id_generator++;
        Random rnd = new Random();
        skill = rnd.nextInt(100);
        passDist = false;
        System.out.println("Участник :" + id + " skill = " + skill);
    }
}
