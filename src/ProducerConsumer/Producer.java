package ProducerConsumer;

import java.util.*;

public class Producer implements Runnable{
    // Store a reference to the shared queue as a field
    private SharedQueue queue;

    public Producer(SharedQueue queue){
        this.queue = queue;
    }

    public void run(){
        long start = System.currentTimeMillis();
        //Run for allmost 2 second adding orders from the shared queue
        while(System.currentTimeMillis() - start < 2000){
            Order order = new Order("Milk", new Random().nextInt(4)+1);
            //adding output to the console so we can see whats going on
//            System.out.println(Thread.currentThread().getName() + " adds " + order.toString());
            queue.addOrder(order);
        }

    }
}
