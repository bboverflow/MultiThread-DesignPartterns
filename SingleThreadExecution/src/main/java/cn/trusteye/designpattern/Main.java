package cn.trusteye.designpattern;

/**
 * @author
 * @create 2017-12-16
 **/

public class Main {
    public static void main(String[] args) {
        Gate gate = new Gate();
        UserThread user1 = new UserThread(gate, "上海人", "上海");
        UserThread user2 = new UserThread(gate, "北京人", "北京");
        UserThread user3 = new UserThread(gate, "深圳人", "深圳");

        user1.start();
        user2.start();
        user3.start();
    }
}
