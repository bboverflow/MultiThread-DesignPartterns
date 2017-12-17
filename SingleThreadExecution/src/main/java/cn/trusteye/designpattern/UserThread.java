package cn.trusteye.designpattern;

/**
 * @author
 * @create 2017-12-16
 **/

public class UserThread extends Thread {
    Gate gate;
    String username;
    String address;

    public UserThread(Gate gate, String username, String address) {
        this.gate = gate;
        this.username = username;
        this.address = address;
    }

    @Override
    public void run(){
        System.out.println(username + "******BEGIN*******");
        while(true) {
            gate.cross(username, address);
        }
    }
}
