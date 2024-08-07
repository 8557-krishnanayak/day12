package ReadFileIntoString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/Main.java");

        try {
            String string = Files.readString(path);
            System.out.println(string);
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
