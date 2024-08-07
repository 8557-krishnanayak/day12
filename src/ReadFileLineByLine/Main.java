package ReadFileLineByLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("src/ReadFileLineByLine/source.txt");
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("IOException:\t" + e.getMessage());
        }
    }
}
