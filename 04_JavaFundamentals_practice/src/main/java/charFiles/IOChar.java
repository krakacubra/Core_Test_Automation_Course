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
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String s;
        while ((s = reader.readLine()) != null){
            for (int i = 0; i < KeyWords.KEYWORDS.size(); i++){
                if (s.contains(" " + KeyWords.KEYWORDS.get(i)) || s.contains(KeyWords.KEYWORDS.get(i) + " ")){
                    countKeyWord[i]++;
                }
            }
        }
        fileReader.close();
    }

    public void writeChar(String path) throws IOException{
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String s;
        for (int i = 0; i < KeyWords.KEYWORDS.size(); i++){
            s = KeyWords.KEYWORDS.get(i) + " - " + countKeyWord[i];
            writer.write(s);
        }
        fileWriter.close();
    }

    public int[] getCountKeyWord() {
        return countKeyWord;
    }
}
