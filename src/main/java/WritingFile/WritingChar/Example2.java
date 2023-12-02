package WritingFile.WritingChar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Example2 {

    public static void main(String[] args) throws IOException {

        String str = "hello Java2";

        PrintWriter pw = new PrintWriter(
                "C:\\Users\\mms\\Desktop\\JavaIO\\src\\main\\resources\\File3.txt");

        pw.print(str);
        pw.close();


    }
}
