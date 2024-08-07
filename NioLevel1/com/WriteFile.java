package NioLevel1.com;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("src/NioLevel1/com/loreum1.txt");

         Files.write(path,"HEyy  Dipanshu".getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE);

    }
}
