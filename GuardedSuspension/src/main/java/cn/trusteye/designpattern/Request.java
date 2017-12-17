package cn.trusteye.designpattern;

/**
 * @author
 * @create 2017-12-17
 **/

public class Request {
    public Request(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
