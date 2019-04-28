package ru.geekbrains.lesson1.Marathon;

import ru.geekbrains.lesson1.Marathon.competitors.*;
import ru.geekbrains.lesson1.Marathon.course.*;

public class Main {
    public static void main(String[] args) {
                Team team = new Team("First",
                new Human("Ivan", 1000, 2, 100),
                new Dog("Dog", "Tuzik", 500,1,30),
                new Cat("Cat", "Barsik", 100,2,0));
        Course c = new Course(new Cross(100), new Wall(1), new Water(10));
        c.doIt(team);
        team.showResult();
    }
}