package cn.trusteye.designpattern;

import java.util.Random;

/**
 * @author
 * @create 2017-12-17
 **/

public class ServerThread extends Thread{
    private RequestQueue requestQueue;
    private Random random;

    public ServerThread(String name,long seed,RequestQueue requestQueue) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName()
                    + " handles " + request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (Exception e) {

            }
        }
    }
}
