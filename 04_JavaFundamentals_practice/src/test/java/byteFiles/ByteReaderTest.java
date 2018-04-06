package test.java.byteFiles;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import main.java.KeyWords;
import main.java.byteFiles.IOByte;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ByteReaderTest {
    private static int []countKeyWord = new int[KeyWords.KEYWORDS.size()];
    IOByte test;
    @Before
    public void setUp(){
        test = new IOByte("C:\\Users\\ADMIN\\EPAM\\Core_Test_Automation_Course\\04_JavaFundamentals_practice\\" +
                "src\\test\\java\\HelloWorld.java");
    }
    @Test
    public void readBinaryTest() throws IOException{
        test.readBinary();
        countKeyWord[KeyWords.KEYWORDS.indexOf("package")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("public")] = 2;
        countKeyWord[KeyWords.KEYWORDS.indexOf("class")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("static")] = 1;
        countKeyWord[KeyWords.KEYWORDS.indexOf("void")] = 1;
        assertArrayEquals(countKeyWord,test.getCountKeyWord());
    }
}
