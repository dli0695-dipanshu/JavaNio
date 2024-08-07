package NioLevel1.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MergeMultipleToSingleFile {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("src/NioLevel1/com/loreum.txt");
       Stream<String> str=Files.lines(path);
        str.forEach(System.out::println);
    }
}
