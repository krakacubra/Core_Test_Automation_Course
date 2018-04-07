package main.java.logger.exception;

public class NoSuchInformation extends Exception {
    public NoSuchInformation(){
        super("There is no such info in log");
    }
}
