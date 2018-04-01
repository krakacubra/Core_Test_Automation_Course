package main.java.utf8ToUtf16;


import java.io.*;

public class Utf8ToUtf16 {
    public static void Utf8ToUtf16(String src, String dst) throws IOException {
        Writer out = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(dst), "UTF16"));
        BufferedReader in = new BufferedReader(
                new FileReader(src)
        );
        String s;
        while ((s = in.readLine()) != null) {
            out.write(s);
        }
        out.close();
    }

    public static void main(String[] args) {

        try {
            Utf8ToUtf16("04_JavaFundamentals_practice\\src\\main\\java\\utf8ToUtf16\\CirilicText.txt",
                    "04_JavaFundamentals_practice\\src\\main\\java\\utf8ToUtf16\\CirilicTextOutput.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
