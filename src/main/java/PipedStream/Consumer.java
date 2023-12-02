package PipedStream;

import java.io.IOException;
import java.io.InputStream;

class Consumer extends Thread
{

    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }
    @Override
    public void run() {
        int x;
        while (true)
        {
            try {
                x=is.read();
                System.out.println("Consumer :"+x);
                System.out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
