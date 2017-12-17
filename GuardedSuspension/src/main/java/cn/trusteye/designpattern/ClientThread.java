package cn.trusteye.designpattern;

import java.util.Random;

/**
 * @author
 * @create 2017-12-17
 **/

public class ClientThread extends Thread {
    private Random random;
    private RequestQueue requestQueue;

    public ClientThread(String name, long seed, RequestQueue requestQueue) {
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName()
                    + " requests " + request);
            requestQueue.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (Exception e) {

            }
        }
    }
}
