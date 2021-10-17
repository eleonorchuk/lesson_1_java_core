package ru.geekbrains.lessons.jc;

/*
2. Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.
 */
public class Team {
    private String name;
    final int numOfParticipants = 4;
    Participant[] participants;

    public Team(String name){
        this.name = name;
        System.out.println("Команда :" + name);

        participants = new Participant[numOfParticipants];
        for (int i =0;i<numOfParticipants;i++)
            participants[i] = new Participant();
    }

    void showResults()
    {
        System.out.println("Команда " + name + " состав участников прошедших дистанцию:");
        for (int i =0;i<numOfParticipants;i++)
            if (participants[i].passDist)
                System.out.println("Participant[" + i + "] id = " + participants[i].id);
    }

    void printParticipants()
    {
        System.out.println("Команда " + name + " состав участников:");
        for (int i =0;i<numOfParticipants;i++)
            System.out.println("Participant[" + i + "] id = " + participants[i].id);
    }
}
