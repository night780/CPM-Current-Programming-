package producerconsumer1;

import java.util.concurrent.BlockingQueue;

/**
 * The Consumer threads will remove orders from the blocking Queue
 */
public class Consumer implements Runnable {
    // Store a reference to the shared queue as a field
    private SharedQueue queue;

    public Consumer(SharedQueue queue){
        this.queue = queue;
    }
    public void run(){
        long start = System.currentTimeMillis();

        // Run for a second removing orders from the shared queue
        while(System.currentTimeMillis() - start < 1000){
            System.out.println(queue.removeOrder());
        }

    }

}
