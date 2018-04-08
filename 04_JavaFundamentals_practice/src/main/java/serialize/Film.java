package main.java.serialize;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Film implements Serializable{
    private String title;
    private String date;
    private List<Actor> leadActors = new LinkedList<>();

    public Film(){

    }

    public Film(String title, String date){
        this.title = title;
        this.date = date;
    }

    public Film(String title, List<Actor> actors, String date){
        this.title = title;
        this.leadActors = actors;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getLeadActors() {
        return leadActors;
    }

    public void setLeadActors(List<Actor> actors) {
        this.leadActors = actors;
    }

    public void addLeadActor(Actor actor){
        leadActors.add(actor);
    }
}
