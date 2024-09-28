import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileOperationsTest {

    @Test
    public void testReadFromFile() throws IOException {
        String expectedContent = "Hello! Привет! ສະບາຍດີ";
        String actualContent = FileOperations.readFromFile("file2.txt");
        assertEquals(expectedContent, actualContent);
    }


    @Test
    public void testReadLinesFromFile() throws IOException {
        List<String> lines = FileOperations.readLinesFromFile("file3.txt");

        for (String line : lines) {
            System.out.println("Строка: " + line);
        }

        int expectedNumberOfLines = 5;
        assertEquals(expectedNumberOfLines, lines.size());
    }
}
