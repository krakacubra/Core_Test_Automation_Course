package main.java.charFiles;

import main.java.KeyWords;

import java.io.*;

public class IOChar {
    private int []countKeyWord = new int[KeyWords.KEYWORDS.size()];
    private String path;

    public IOChar(String path){
        this.path = path;
    }


    public void readChar() throws IOException {
        String s;
        try(
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                ){
            while ((s = reader.readLine()) != null){
                for (int i = 0; i < KeyWords.KEYWORDS.size(); i++){
                    if (s.contains(" " + KeyWords.KEYWORDS.get(i)) || s.contains(KeyWords.KEYWORDS.get(i) + " ")){
                        countKeyWord[i]++;
                    }
                }
            }
        }
    }

    public void writeChar(String path) throws IOException {
        try(
                FileWriter fileWriter = new FileWriter(path);
        ){
            String s;
            for (int i = 0; i < KeyWords.KEYWORDS.size(); i++) {
                if (countKeyWord[i] > 0) {
                    s = KeyWords.KEYWORDS.get(i) + " - " + countKeyWord[i] + "\r\n";
                    fileWriter.write(s);
                }
            }
        }
    }

    public int[] getCountKeyWord() {
        return countKeyWord;
    }
}
