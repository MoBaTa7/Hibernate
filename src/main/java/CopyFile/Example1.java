package CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example1 {
    public static void main(String[] args) throws Exception {

        String source = "eip.pdf";
        String destination = "eip_copy2.pdf";

        long before = System.currentTimeMillis();

        InputStream in=new FileInputStream(source);
        OutputStream out=new FileOutputStream(destination);

        int len;
        byte[] block=new byte[8*1024];
        while ((len=in.read(block))!=-1)
            out.write(block,0,len);

        in.close();
        out.close();
        long after = System.currentTimeMillis();

        System.out.println("Time: " + (after-before));
    }
}
