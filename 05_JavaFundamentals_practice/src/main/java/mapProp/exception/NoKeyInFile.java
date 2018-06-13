package main.java.mapProp.exception;

public class NoKeyInFile extends Exception{
    public NoKeyInFile(){
        super("Invalid form of line in properties file");
    }
}
