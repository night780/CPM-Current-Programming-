package producerconsumer1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedQueue {

    private static BlockingQueue<Order> queue
            = new LinkedBlockingQueue<>();

    public void addOrder(Order order){
        try {
            queue.put(order);
        }catch (InterruptedException e){

        }
    }

    public Order removeOrder(){
        Order removed = null;
        try {
            removed = queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return removed;
    }

    public int getQueueSize(){
        return queue.size();
    }

}
