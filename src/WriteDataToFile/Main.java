package WriteDataToFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Write Data to a File
        List<String> lines = Arrays.asList("Why did the scarecrow win an award!?", "Because he was outstanding in his field! 🌾😄");
        Path path = Paths.get("src/WriteDataToFile/source.txt");
        try {
            Files.write(path, lines, StandardOpenOption.CREATE);
            System.out.println("File is Created");
        } catch (IOException e) {
            System.err.println("IOException:\t" + e.getMessage());
        }
    }
}
