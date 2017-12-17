package cn.trusteye.designpattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @author
 * @create 2017-12-17
 **/

public class RequestQueue {
    private final List<Request> requests = new LinkedList<>();
    public synchronized Request getRequest(){
        while(requests.size() <=0 ){
            try{
                wait();
            }catch (Exception e){

            }
        }
        return requests.remove(0);
    }

    public synchronized void putRequest(Request request){
        requests.add(request);
        notifyAll();
    }
}
