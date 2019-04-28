package ru.geekbrains.lesson1.Marathon.competitors;

import ru.geekbrains.lesson1.Marathon.competitors.Animal;

public class Dog extends Animal {
    public Dog(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        super("Dog", name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }
}