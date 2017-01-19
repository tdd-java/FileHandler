package FileHandler;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {
    public static String read(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        String content="";
        int charRead;
        while((charRead=fileInputStream.read()) !=-1){
            content += (char)charRead;
        }
        return content;
    }
}
