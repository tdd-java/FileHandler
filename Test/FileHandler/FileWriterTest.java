package FileHandler;

import org.junit.Test;

import java.io.FileOutputStream;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class FileWriterTest {
    @Test
    public void checkIfWriteIsCalledOnFileOutputStream() throws Exception {
        FileOutputStream fileOutputStream = mock(FileOutputStream.class);
        MyFileWriter fileWriter = new MyFileWriter(fileOutputStream);
        fileWriter.write("Hello");
        verify(fileOutputStream, times(5)).write(anyInt());
    }
}
