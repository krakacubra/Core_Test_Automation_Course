package main.java.generics.exception;

public class NoSuchStudentException extends Exception {
    public NoSuchStudentException(){
        super("Group has no such student!");
    }
}

