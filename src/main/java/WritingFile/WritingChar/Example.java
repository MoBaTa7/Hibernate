package WritingFile.WritingChar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Example {

    public static void main(String[] args) throws IOException {

        String str = "hello Java";

        Writer w = new FileWriter(
                "C:\\Users\\mms\\Desktop\\JavaIO\\src\\main\\resources\\File2.txt");

        w.write(str);
        w.close();

        PrintWriter pw = new PrintWriter(w);
        pw.print(str+" wow");
        pw.close();
    }
}
