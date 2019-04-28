package ru.geekbrains.lesson1.Marathon.course;

import ru.geekbrains.lesson1.Marathon.competitors.Competitor;
import ru.geekbrains.lesson1.Marathon.competitors.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt (Team team){
        for (Competitor c: team.getPlayers()){
            for(Obstacle o: obstacles ){
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }
    }


}
