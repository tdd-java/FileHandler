package FileHandler;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FileReaderTest {
    @Test
    public void checkIfFileReaderReadsTheFile() throws Exception {
        String expected = "Hello world!";
        FileInputStream fileInputStream= new FileInputStream("Resources/Hello.txt");
        String actual= new MyFileReader(fileInputStream).read();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfReadLineIsCalledOnBufferedReader() throws Exception {
        FileInputStream fileInputStream= mock(FileInputStream.class);
        MyFileReader myFileReader = new MyFileReader(fileInputStream);
        when(fileInputStream.read()).thenReturn(72).thenReturn(-1);
        myFileReader.read();
        verify(fileInputStream, times(2)).read();
    }


}
