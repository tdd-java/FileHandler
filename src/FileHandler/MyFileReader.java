package FileHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static String read(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String content="";
        String line = bufferedReader.readLine();
        while(line!=null){
            content += line;
            line=bufferedReader.readLine();
        }
        return content;
    }
}
