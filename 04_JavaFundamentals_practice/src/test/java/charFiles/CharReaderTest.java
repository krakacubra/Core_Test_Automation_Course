package test.java.charFiles;

import main.java.KeyWords;
import main.java.charFiles.IOChar;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class CharReaderTest {
    private static int []countKeyWord = new int[KeyWords.KEYWORDS.size()];
    IOChar test;
    @Before
    public void setUp(){
        test = new IOChar("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\" +
                "04_JavaFundamentals_practice\\src\\test\\java\\HelloWorld.java");
    }
    @Test
    public void readCharTest() throws IOException {
        test.readChar();
        countKeyWord[KeyWords.KEYWORDS.indexOf("package")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("public")] = 2;
        countKeyWord[KeyWords.KEYWORDS.indexOf("class")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("static")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("void")] = 1;
        assertArrayEquals(countKeyWord, test.getCountKeyWord());
    }
}
