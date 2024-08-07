package CheckFileExists;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/CheckFileExists/exits.txt");
        boolean exists = Files.exists(path);
        System.out.println(path + ": is exist:\t" + exists);
    }
}
