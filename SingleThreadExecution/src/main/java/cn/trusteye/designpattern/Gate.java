package cn.trusteye.designpattern;

import java.util.concurrent.TimeUnit;

/**
 * @author
 * @create 2017-12-16
 **/

public class Gate {
    private int userCount = 0;
    private String username = "nobody";
    private String address = "nowhere";

    public  void cross(String username, String address) {
        try {
            TimeUnit.MICROSECONDS.sleep(1);
            this.username = username;
            TimeUnit.MICROSECONDS.sleep(1);
            this.address = address;
            TimeUnit.MICROSECONDS.sleep(1);
            userCount ++;
        }catch (Exception e){

        }
        check();
    }

    private void check() {
        if (username.charAt(0) != address.charAt(0)) {
            System.out.println("******BROKEN******"+toString());
        }
    }

    @Override
    public  String toString() {
        return "Gate{" +
                "userCount=" + userCount +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
