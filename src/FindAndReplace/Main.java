package FindAndReplace;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path sourcePath = Paths.get("src/FindAndReplace/story.txt");
        Path destinationPath = Paths.get("src/FindAndReplace/temporary.txt");

        String find = "?";
        String replace = ",";
        try (BufferedReader bufferedReader = Files.newBufferedReader(sourcePath);) {
            String lines = "";
            Files.createFile(destinationPath);
            while ((lines = bufferedReader.readLine()) != null) {
                String replace_string = lines.replace(find, replace);
                Files.write(destinationPath, List.of(replace_string), StandardOpenOption.APPEND);
            }


            Files.delete(sourcePath);
            Files.copy(destinationPath, sourcePath, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(destinationPath);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
