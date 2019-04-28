package ru.geekbrains.lesson1.Marathon.course;

import ru.geekbrains.lesson1.Marathon.competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
