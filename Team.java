package ru.geekbrains.lesson1.Marathon.competitors;

public class Team {
    private String nameTeam;
    private Competitor [] players;

    public Team(String nameTeam, Competitor... players) {
        this.nameTeam = nameTeam;
        this.players = players;
    }

    public Competitor[] getPlayers(){
        return players;
    }

    public void showResult(){
        for (Competitor c: players){
            if(c.isOnDistance()){
                c.info();
            }
        }
    }



}
