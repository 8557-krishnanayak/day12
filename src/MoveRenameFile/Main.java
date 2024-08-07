package MoveRenameFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/MoveRenameFile/source/source.txt");
        Path detinationPath = Paths.get("src/MoveRenameFile/destination/target.txt");

        try {
            Files.move(sourcePath, detinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException e) {
            System.err.println("No File found " + e.getMessage());
        } catch (IOException e) {
            System.err.println("No File " + e.getMessage());
        }
    }
}
