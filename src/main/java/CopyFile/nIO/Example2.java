package CopyFile.nIO;

import java.io.File;
import java.nio.file.Files;

public class Example2 {

    public static void main(String[] args) throws Exception{
        String source = "eip.pdf";
        String destination = "eip_copy6.pdf";

        long before = System.currentTimeMillis();

        Files.copy(new File(source).toPath(),
                new File(destination).toPath());

        long after = System.currentTimeMillis();

        System.out.println("Time: " + (after-before));
    }
}
