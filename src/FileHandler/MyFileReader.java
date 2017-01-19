package FileHandler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    FileInputStream fileInputStream;

    public MyFileReader(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String read() throws IOException {
        String content="";
        int charRead;
        while ((charRead = fileInputStream.read()) != -1) {
            content+=(char)charRead;
        }
        return content;
    }
}
