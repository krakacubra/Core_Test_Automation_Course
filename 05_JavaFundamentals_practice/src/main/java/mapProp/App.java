package main.java.mapProp;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        MapProperties map = new MapProperties();
        try{
            map.fillMap("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\" +
                    "05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(map.getMapProp());

    }
}
