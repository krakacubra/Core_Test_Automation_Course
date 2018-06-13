package main.java.mapProp;

import main.java.mapProp.exception.ReadJustOnceException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        MapProperties map  = new MapProperties();
        MapProperties map2 = new MapProperties();
        MapProperties map3 = new MapProperties();
        try{
            map.fillMap("05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");

        } catch (IOException e){
            e.printStackTrace();
        } catch (ReadJustOnceException e){
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(map.getValue("key2"));
        try{
            map2.fillMap("05_JavaFundamentals_practice\\src\\main\\resources\\propNew.properties");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ReadJustOnceException e){
            e.printStackTrace();
        }
        try{
            map3.fillMap("05_JavaFundamentals_practice\\src\\main\\resources\\propertiesNew.properties");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ReadJustOnceException e){
            e.printStackTrace();
            System.exit(0);
        }

    }
}
