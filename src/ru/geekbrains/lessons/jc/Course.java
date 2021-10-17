package ru.geekbrains.lessons.jc;

import java.util.Random;

/*
3. Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;
метод, который будет просить команду пройти всю полосу.
 */
public class Course {

    public Obstacle[] obstacles;

    public Course(int numOfObstacle){
        System.out.println("Полосы препятствий");
        obstacles = new Obstacle[numOfObstacle];
        for(int i = 0; i<numOfObstacle; ++i)
        {
            obstacles[i] = new Obstacle();
        }

    }

    public void doIt(Team team){
        for(int i =0; i< team.numOfParticipants; ++i)
        {
            team.participants[i].passDist = true;
        }
        for(int i =0; i< team.numOfParticipants; ++i)
        {
            for(int j =0; j < obstacles.length; j++) {
                if (team.participants[i].skill < obstacles[j].skill)
                    team.participants[i].passDist = false;
            }
        }
    }
}

