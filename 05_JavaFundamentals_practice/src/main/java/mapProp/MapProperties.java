package main.java.mapProp;

import main.java.mapProp.exception.NoKeyException;
import main.java.mapProp.exception.NoKeyInFile;
import main.java.mapProp.exception.ReadJustOnceException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapProperties {
    private Map<String, String> mapProp;

    public void fillMap(String path) throws IOException, ReadJustOnceException{
        if (mapProp != null){
            throw new ReadJustOnceException();
        }
        mapProp = new LinkedHashMap<>();
        try(
                BufferedReader reader = new BufferedReader(new FileReader(path))
                ){
            String s;
            while ((s = reader.readLine()) != null) {
                if (!s.equals("")) {
                    Pattern pattern = Pattern.compile("(\\w*) ?[:=] ?(.+)");
                    Matcher match = pattern.matcher(s);
                    match.find();
                    if (match.group(1).equals("")){
                        throw new NoKeyInFile();
                    }
                    mapProp.put(match.group(1), match.group(2));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Please write right path to file!");
//            System.exit(0);
        } catch (NoKeyInFile e){
            System.out.println("Check your *.properties file! It has no key, but has value");
//            System.exit(0);
        }
    }

    public Map<String, String> getMapProp() {
        return mapProp;
    }

    public String getValue(String key) throws NoKeyException{
        String value = mapProp.get(key);
        if (value == null){
            throw new NoKeyException();
        }
        return value;
    }
}
