package WritingFile.WritingByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {

        String str = "hello world2 ***";
        FileOutputStream outputStream = new FileOutputStream(
                "F:\\Java\\Document\\Java SE\\JavaIO\\src\\main\\resources\\File4.txt");

        outputStream.write(str.getBytes());
    }
}
