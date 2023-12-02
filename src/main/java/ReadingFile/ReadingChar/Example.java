package ReadingFile.ReadingChar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {


        //Reading Character Data from a File
        FileReader fileReader = new FileReader(
                "F:\\Java\\Document\\Java SE\\JavaIO\\src\\main\\resources\\File5.txt");

        int d;

        while ((d=fileReader.read())!=-1){

            System.out.format("%c",d);
        }


    }
}
