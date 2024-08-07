package Problem_MergeMultipleFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Path dirPath = Paths.get("src/TextFile");
        Path source_path = Paths.get("src/Problem_MergeMultipleFiles/final_merge.txt");

        try (OutputStream outputStream = Files.newOutputStream(source_path, StandardOpenOption.TRUNCATE_EXISTING)) {
            Files.list(dirPath).forEach(filePathName -> {

                try (FileInputStream inputStream = new FileInputStream(String.valueOf(filePathName))) {

                    FileChannel fileChannel = inputStream.getChannel();

                    int bufferSize = 1024;
                    if (bufferSize > fileChannel.size()) {
                        bufferSize = (int) fileChannel.size();
                    }

                    ByteBuffer buff = ByteBuffer.allocate(bufferSize);

                    fileChannel.read(buff);

                    outputStream.write(buff.array());

                    System.out.println("File Merge:\t" + filePathName);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
