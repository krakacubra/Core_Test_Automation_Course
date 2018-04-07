package main.java.bunlde.exception;

public class NoSuchQuestionException extends Exception {
    public NoSuchQuestionException(){
        super("There is no such question");
    }
}

