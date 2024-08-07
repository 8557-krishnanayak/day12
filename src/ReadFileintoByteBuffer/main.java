package ReadFileintoByteBuffer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        File file = new File("src/ReadFileintoByteBuffer/source.txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileChannel fileChannel = inputStream.getChannel();

            ByteBuffer buff = ByteBuffer.allocate(53);

            fileChannel.read(buff);

            String content = new String(buff.array());
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found:\t" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
