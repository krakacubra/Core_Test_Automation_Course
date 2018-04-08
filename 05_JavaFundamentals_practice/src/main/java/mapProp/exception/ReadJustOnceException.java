package main.java.mapProp.exception;

public class ReadJustOnceException extends Exception {
    public ReadJustOnceException(){
        super("Read from property just once");
    }
}
