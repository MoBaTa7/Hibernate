package CopyFile;

import java.io.*;

public class Example2 {

    public static void main(String[] args)throws Exception {
        String source = "eip.pdf";
        String destination = "eip_copy4.pdf";

        long before = System.currentTimeMillis();

        InputStream in = new BufferedInputStream(
                new FileInputStream(source),128*1024);

        OutputStream out = new BufferedOutputStream(
                new FileOutputStream(destination),128*1024);

        int d;
        while ((d=in.read())!=-1)
            out.write(d);

        in.close();
        out.close();
        long after = System.currentTimeMillis();

        System.out.println("Time: " + (after-before));

    }
}
