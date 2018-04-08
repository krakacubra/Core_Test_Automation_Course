package main.java.serialize;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FilmsCollection implements Serializable{
    private List<Film> films = new LinkedList<>();

    public FilmsCollection(List<Film> films){
        this.films = films;
    }

    public FilmsCollection(){

    }

    public void addFilm(Film film){
        films.add(film);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }


}
