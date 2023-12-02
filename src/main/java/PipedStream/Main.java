package PipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {


        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pis.connect(pos);

        Producer producer=new Producer(pos);
        Consumer consumer=new Consumer(pis);

        producer.start();
        consumer.start();

    }
}
