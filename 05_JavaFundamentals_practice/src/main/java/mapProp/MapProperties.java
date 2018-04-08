package main.java.mapProp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapProperties {
    private Map<String, String> mapProp;

    public void fillMap(String path) throws IOException{
        if (mapProp != null){
            return;
        }
        mapProp = new HashMap<>();
        try(
                BufferedReader reader = new BufferedReader(new FileReader(path))
                ){
            String s;
            while ((s = reader.readLine()) != null) {
                if (!s.equals("")) {
                    Pattern pattern = Pattern.compile("(\\w+) ?[:=] ?(.+)");
                    Matcher match = pattern.matcher(s);
                    match.find();
                    mapProp.put(match.group(1), match.group(2));
                }
            }
        }
    }

    public Map<String, String> getMapProp() {
        return mapProp;
    }
}
