package DeleteFile;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path targetPath = Paths.get("src/DeleteFile/delete.txt");
        try {
            Files.delete(targetPath);
            System.out.println("File is Delete:\t" + targetPath);
        } catch (NoSuchFileException e) {
            System.err.println("No Such File Found:\t" + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: \t" + e);
        }
    }
}
