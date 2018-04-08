package test.java.mapProp;

import main.java.mapProp.MapProperties;
import main.java.mapProp.exception.ReadJustOnceException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestMapProperties {
    MapProperties map = new MapProperties();
    @Before
    public void setUp() throws ReadJustOnceException, IOException{
        map.fillMap(
                "C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties"
        );
    }
    @Test
    public void fillPropertiesMustReturnMapWithRightValues(){
        Map<String,String> testMap = new LinkedHashMap<>();
        testMap.put("key1", "value1");
        testMap.put("key2", "value2");
        testMap.put("key3", "value3");
        testMap.put("key4", "value4");
        testMap.put("key5", "value5");

        assertEquals(testMap, map.getMapProp());

    }
    @Test(expected = ReadJustOnceException.class)
    public void fillPropertiesMustThrowExceprtionAfterSecondReadOfFile() throws ReadJustOnceException, IOException{
        map.fillMap("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");
        map.fillMap("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\05_JavaFundamentals_practice\\src\\main\\resources\\prop.properties");
    }
}
