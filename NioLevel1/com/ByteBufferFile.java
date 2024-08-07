package NioLevel1.com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferFile {
    public static void main(String[] args) {
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        String data="HEy Hello Dipanshu";
        buffer.put(data.getBytes());
        buffer.flip();

        try (FileOutputStream fos=new FileOutputStream("ByteExample.txt");
             FileChannel fileChannel=fos.getChannel()){

            while (buffer.hasRemaining()){
                fileChannel.write(buffer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
