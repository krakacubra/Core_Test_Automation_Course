package main.java.charFiles;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        IOChar ioChar = new IOChar("04_JavaFundamentals_practice\\src\\main\\java\\charFiles\\IOChar.java");
        try{
            ioChar.readChar();
            ioChar.writeChar("04_JavaFundamentals_practice\\src\\main\\java\\charFiles\\CountKeyWords.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

