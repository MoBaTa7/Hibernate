package CopyFile.nIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class Example1 {
    public static void main(String[] args) throws Exception {

        String source = "eip.pdf";
        String destination = "eip_copy5.pdf";

        long before = System.currentTimeMillis();
        FileInputStream in=new FileInputStream(source);
        FileOutputStream out=new FileOutputStream(destination);

        FileChannel f1 = in.getChannel();
        FileChannel f2 = out.getChannel();

        f1.transferTo(0,f1.size(),f2);

        f2.close();
        f1.close();
        long after = System.currentTimeMillis();

        System.out.println("Time: " + (after-before));

    }
}
