package main.java.serialize;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Film firstFilm = new Film(
                "Roundhay Garden Scene",
                Arrays.asList(
                        new Actor("Harriet", "Harly", 88)
                ),
                "1888");
        Film secondFilm = new Film(
                "L'Arrivée d'un train en gare de la Ciotat",
                Arrays.asList(
                        new Actor("name", "surname", 23),
                        new Actor ("one", "two", 55)
                ),
                "1895");
        FilmsCollection collection = new FilmsCollection();
        collection.addFilm(firstFilm);
        collection.addFilm(secondFilm);
        FilmsCollection deserialized = new FilmsCollection();
        try{
            FilmCollectionSerializetor.serializator(
                    "04_JavaFundamentals_practice\\src\\main\\java\\serialize\\Collection.txt",
                    collection
            );
            deserialized = FilmCollectionSerializetor.deserializator(
                    "04_JavaFundamentals_practice\\src\\main\\java\\serialize\\Collection.txt"
            );
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        deserialized.addFilm(new Film(
                "Nine",
                Arrays.asList(new Actor("Nine", "Nine",9)),
                "2006"));
        for (Film film : deserialized.getFilms()){
            System.out.println(film.getTitle() + "\n");
        }

    }
}
