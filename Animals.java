package ru.geekbrains.java.level1.lesson6;

public abstract class Animals {

    protected String name;
    protected float maxRunDistance, maxSwimDistance, maxJumpHigh;

    public Animals(String name, float maxRunDistance, float maxSwimDistance, float maxJumpHigh) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHigh = maxJumpHigh;
    }

    public boolean run(float marathonRunDistance){
        if (marathonRunDistance <= maxRunDistance){
            return true;
        } else return false;
    }

    public boolean swim(float marathonSwimDistance){
        if (marathonSwimDistance <= maxSwimDistance){
            return true;
        } else return false;
    }

    public boolean jump(float marathonJumpHigh){
        if (marathonJumpHigh <= maxJumpHigh){
            return true;
        } else return false;
    }
}


class Cat extends Animals{
    public Cat(String name, float maxRunDistance, float maxSwimDistance, float maxJumpHigh) {
        super(name, maxRunDistance, maxSwimDistance, maxJumpHigh);
        this.maxSwimDistance = 0;
    }

    public boolean run(float marathonRunDistance){
        if (marathonRunDistance <= maxRunDistance){
            return true;
        } else return false;
    }

    public boolean swim(float marathonSwimDistance){
        if (marathonSwimDistance <= maxSwimDistance){
            return true;
        } else return false;
    }

    public boolean jump(float marathonJumpHigh){
        if (marathonJumpHigh <= maxJumpHigh){
            return true;
        } else return false;
    }

}

class Dog extends Animals {
    public Dog(String name, float maxRunDistance, float maxSwimDistance, float maxJumpHigh) {
        super(name, maxRunDistance, maxSwimDistance, maxJumpHigh);
    }
    public boolean run(float marathonRunDistance){
        if (marathonRunDistance <= maxRunDistance){
            return true;
        } else return false;
    }

    public boolean swim(float marathonSwimDistance){
        if (marathonSwimDistance <= maxSwimDistance){
            return true;
        } else return false;
    }

    public boolean jump(float marathonJumpHigh){
        if (marathonJumpHigh <= maxJumpHigh){
            return true;
        } else return false;
    }

}