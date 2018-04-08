package main.java.mapProp;

import main.java.mapProp.exception.ReadJustOnceException;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        MapProperties map = new MapProperties();
        try{
            map.fillMap("05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");
            //map.fillMap("05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ReadJustOnceException e){
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(map.getMapProp());

    }
}
