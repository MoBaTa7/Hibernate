package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

    public static void main(String[] args) throws IOException {

        InputStream ney = System.in;
        BufferedReader bf = new BufferedReader(new InputStreamReader(ney));

        System.out.println( bf.readLine());
    }
}
