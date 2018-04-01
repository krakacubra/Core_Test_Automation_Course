package test.java.charFiles;

import main.java.charFiles.IOChar;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class CharReaderTest {
    private final static List<String> keyWords = Arrays.asList("abstract", "assert", "boolean", "break",
            "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short",
            "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try",
            "void", "volatile", "while");
    private static int []countKeyWord = new int[keyWords.size()];
    IOChar test;
    @Before
    public void setUp(){
        test = new IOChar("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\" +
                "04_JavaFundamentals_practice\\src\\test\\java\\HelloWorld.java");
    }
    @Test
    public void readCharTest() throws IOException {
        test.readChar();
        countKeyWord[keyWords.indexOf("package")] = 1;
        countKeyWord[keyWords.indexOf("public")] = 2;
        countKeyWord[keyWords.indexOf("class")] = 1;
        countKeyWord[keyWords.indexOf("static")] = 1;
        countKeyWord[keyWords.indexOf("void")] = 1;
        assertArrayEquals(countKeyWord, test.getCountKeyWord());
    }
}
