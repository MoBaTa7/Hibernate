package NetwokReading;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Example {

    public static void main(String[] args) throws IOException {

        InputStream ney = new URL("https://www.farsnews.ir/").openStream();
        readByte(ney);
    }

    static void readByte(InputStream in) throws IOException {
        int i;
        while ((i=in.read())!=-1){
            System.out.format("%c",i);
        }
    }
}
