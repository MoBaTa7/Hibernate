package ReadingFile.ReadingByte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {

    public static void main(String[] args) throws IOException {

        InputStream ney = new FileInputStream(
                "F:\\Java\\Document\\Java SE\\JavaIO\\src\\main\\resources\\File5.txt");
        read(ney);
    }

    static void read(InputStream in) throws IOException {
        int i;
        while ((i=in.read())!=-1){
        System.out.format("%c",i);
        }
    }
}
