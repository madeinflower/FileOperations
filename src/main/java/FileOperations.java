import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileOperations {
    public static void writeToFile(String content, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, content.getBytes());
    }

    public static String readFromFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readString(path);
    }

    public static void writeFormattedTextToFile(String content, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, content.getBytes());
    }

    public static List<String> readLinesFromFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path);
    }

    public static void main(String[] args) throws IOException {
        writeToFile("A Little Bit of Something is Better than Nothing.", "file1.txt");

        writeToFile("Hello! Привет! ສະບາຍດີ", "file2.txt");

        String shakespeareText = """
                Shall I compare thee to a summer’s day?
                Thou art more lovely and more temperate:
                Rough winds do shake the darling buds of May,
                And summer’s lease hath all too short a date
                        William Shakespeare
                """;
        writeFormattedTextToFile(shakespeareText + "\n", "file3.txt");

        String file2Content = readFromFile("file2.txt");
        System.out.println(file2Content);

        List<String> lines = readLinesFromFile("file3.txt");
        lines.forEach(System.out::println);
    }
}
