package PipedStream;

import java.io.IOException;
import java.io.OutputStream;

class Producer  extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    @Override
    public void run() {
        int count=1;
        while (true)
        {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer :"+count);
                System.out.flush();

                try{
                    Thread.sleep(9);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
                count++;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}