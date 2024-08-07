package NioLevel1.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path src= Paths.get("src/NioLevel1/com/loreum.txt");
        Path destination=Paths.get("src/NioLevel1/com/loreum1.txt");
        Files.copy(src,destination,StandardCopyOption.REPLACE_EXISTING);
    }
}
