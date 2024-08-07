package DataFromByteBufferToFile;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/DataFromByteBufferToFile/source.txt");
        try (FileOutputStream outputStream = new FileOutputStream(file);) {
            FileChannel fileChannel = outputStream.getChannel();

            String str = "Why don’t scientists trust atoms?\nBecause they make up everything! \uD83D\uDE04";

            int length = fileChannel.write(ByteBuffer.wrap(str.getBytes()));

            System.out.println("Print the length of memory allocation:\t" + length);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found:\t" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
