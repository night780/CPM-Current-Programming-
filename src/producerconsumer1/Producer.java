package producerconsumer1;
import java.util.*;

public class Producer implements Runnable{
    // Store a reference to the shared queue as a field
    private SharedQueue queue;

    public Producer(SharedQueue queue){
        this.queue = queue;
    }
    public void run(){
        long start = System.currentTimeMillis();

        // Run for a second adding orders to the shared queue
        while(System.currentTimeMillis() - start < 2000){
            Order order = new Order("Milk", new Random().nextInt(4) + 1);
            queue.addOrder(order);
        }

    }
}
