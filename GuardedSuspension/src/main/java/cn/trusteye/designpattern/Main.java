package cn.trusteye.designpattern;

/**
 * @author
 * @create 2017-12-17
 **/

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread("Alice",3141592L,requestQueue).start();
        new ServerThread("Bobby",6535897L,requestQueue).start();
    }
}
