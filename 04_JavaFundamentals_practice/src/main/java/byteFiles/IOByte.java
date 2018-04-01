package main.java.byteFiles;

import com.sun.istack.internal.NotNull;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import main.java.KeyWords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOByte {
    private int []countKeyWord = new int[KeyWords.KEYWORDS.size()];
    private String src;

    public IOByte(String src){
        this.src = src;
    }

    public int[] getCountKeyWord() {
        return countKeyWord;
    }

    public void readBinary() throws IOException{
        byte byteSymbol;
        byte[] byteWord = new byte[100];
        int index = 0;

        FileInputStream reader = new FileInputStream(src);

        while((byteSymbol = (byte)reader.read()) != -1){
            if ((byteSymbol>=65 && byteSymbol<=90) || (byteSymbol>=97 && byteSymbol<122)){
                byteWord[index] = byteSymbol;
                index++;
            } else {
                for (int i = 0; i < KeyWords.KEYWORDS.size(); i++){
                    if (Arrays.equals(KeyWords.KEYWORDS.get(i).getBytes(), getByteWord(byteWord))) {
                        countKeyWord[i]++;
                        break;
                    }
                }
                index = 0;
                Arrays.fill(byteWord,(byte)0);
            }
        }
        reader.close();
    }

    public void writeBinary(String path) throws IOException{
        FileOutputStream writer = new FileOutputStream(path);
        for (int i = 0; i < KeyWords.KEYWORDS.size(); i++){
            String line=KeyWords.KEYWORDS.get(i) + " - " + countKeyWord[i]+ "\r\n";
            writer.write(line.getBytes());
        }
        writer.close();
    }

    private static byte[] getByteWord(@NotNull byte[] byteWord){
        int i;
        for(i = 0; i < byteWord.length && byteWord[i] > 0; i++);
        byte[] tmp = new byte[i];
        System.arraycopy(byteWord, 0, tmp, 0, i);
        return tmp;
    }

}
