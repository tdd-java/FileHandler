package FileHandler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {
    @Test
    public void checkIfFileReaderReadsTheFile() throws Exception {
        String expected = "Hello world!";
        String actual= MyFileReader.read("Resources/Hello.txt");
        assertEquals(expected,actual);
    }

    @Test
    public void fileReaderShouldReadContentsOfTheOtherFile() throws Exception {
        String expected = "Hey world, I'm foo";
        String actual= MyFileReader.read("Resources/foo.txt");
        assertEquals(expected,actual);
    }
}
