package NioLevel1.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("src/NioLevel1/com/lore1.txt");
        Files.delete(path);
    }
}
