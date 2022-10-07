package producerconsumer1;

public class Driver {

    public static void main(String[] args) throws InterruptedException{
        // construct Shared Queue
        // any ideas
        SharedQueue orderQueue = new SharedQueue();

        Thread[] producers = new Thread[10];
        Thread[] consumers = new Thread[10];

        // construct Consumer and Producer Threads (pass Shared Queue)
        // start up the threads
        for (int i = 0; i < 10 ; i++) {
            producers[i] = new Thread(new Producer(orderQueue));
            producers[i].start();
            producers[i].join();
            consumers[i] = new Thread(new Consumer(orderQueue));
            consumers[i].start();
            consumers[i].join();
        }



        // have main join when all threads are complete
        // check to see what is in the Shared Queue
        // any orders left?
        System.out.println(orderQueue.getQueueSize());



    }
}
