package ru.geekbrains.lesson1.Marathon.competitors;

import ru.geekbrains.lesson1.Marathon.competitors.Competitor;

import java.util.Random;

public class Human implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    Random random = new Random();

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;

        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;

        this.onDistance = true;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " хорошо справился с кроссом");
        } else {
            System.out.println(name + " не справился с кроссом");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        if(!onDistance){
            System.out.println( name + " - looser");
        } else System.out.println( name + " - winner");
    }
}