package StandardIO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws IOException {

        System.out.println("hello"); //program to display

        System.err.println("error"); //program to display as error

        InputStream in = System.in;  //console to program
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();

        byte teamName[] = new byte[200];
        int size = System.in.read(teamName); //console to program
        System.out.write(teamName,0,size);
        //write ( array, start index, number of byte)
    }
}
