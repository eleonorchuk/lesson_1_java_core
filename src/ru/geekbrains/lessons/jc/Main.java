package ru.geekbrains.lessons.jc;

public class Main {

    public static void main(String[] args) {
		Course c = new Course(3); // Создаем полосу препятствий
		Team team = new Team("Red"); // Создаем команду
		c.doIt(team); // Просим команду пройти полосу
		team.showResults(); // Показываем результаты
    }
}
