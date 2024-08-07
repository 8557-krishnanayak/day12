package CopyFile;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/CopyFile/source.txt");
        Path destinationPath = Paths.get("src/CopyFile/destination.txt");

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File is Copy");
        } catch (IOException e) {
            System.err.println("IOException: \t" + e.getMessage());
        }
    }
}
