package main.java.mapProp.exception;

public class NoKeyException extends Exception {
    public NoKeyException(){
        super("No such key in map");
    }
}
