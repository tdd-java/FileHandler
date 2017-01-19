package FileHandler;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileWriter {
    private FileOutputStream fileOutputStream;

    public MyFileWriter(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public void write(String toBeWritten) throws IOException {
        for (int i = 0; i < toBeWritten.length(); i++) {
            fileOutputStream.write(toBeWritten.charAt(i));
        }
    }
}
