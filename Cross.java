package ru.geekbrains.lesson1.Marathon.course;

import ru.geekbrains.lesson1.Marathon.competitors.Competitor;
import ru.geekbrains.lesson1.Marathon.course.Obstacle;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}

