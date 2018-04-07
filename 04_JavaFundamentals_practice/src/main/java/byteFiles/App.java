package main.java.byteFiles;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        IOByte ioByte = new IOByte("04_JavaFundamentals_practice\\src\\main\\java\\byteFiles\\IOByte.java");
        try{
            ioByte.readBinary();
            ioByte.writeBinary("04_JavaFundamentals_practice\\src\\main\\java\\byteFiles\\CountKeyWords.txt");
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
