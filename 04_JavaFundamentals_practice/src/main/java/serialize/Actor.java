package main.java.serialize;

import java.io.Serializable;

public class Actor implements Serializable{
    private String name;
    private String surname;
    private int age;

    public Actor(){

    }

    public Actor(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
