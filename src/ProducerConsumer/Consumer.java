package ProducerConsumer;

import java.util.concurrent.BlockingDeque;

/**
 * The consumer thread will remove orders from the blocking queue
 */
public class Consumer implements Runnable{
    // Store a reference to the shared queue as a field
    private SharedQueue queue;

    public Consumer(SharedQueue queue){
        this.queue = queue;
    }
    public void run() {
        long start = System.currentTimeMillis();
        //Run for one second removing orders from the shared queue
        while(System.currentTimeMillis() - start < 1000){
            System.out.println(Thread.currentThread().getName() + " removes " +queue.removeOrder());
//            System.out.println(queue.removeOrder());
        }

    }
}
