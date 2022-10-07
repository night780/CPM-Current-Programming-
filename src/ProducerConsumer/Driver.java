package ProducerConsumer;

public class Driver {

    public static void main(String[] args) throws InterruptedException {
        //construct the shared queue
        SharedQueue orderQueue = new SharedQueue();
        Thread[] producer = new Thread[10];
        Thread[] consumers = new Thread[5];
        //construct consumer and producer threads (pass Shared Queue) then start them
//        for (int i = 0; i < 10; i++) {
//            producer[i] = new Thread(new Producer(orderQueue));
//            producer[i].start();
////            producer[i].join();
//            consumers[i] = new Thread(new Consumer(orderQueue));
//            consumers[i].start();
////            consumers[i].join();
//        }
        for (int i = 0; i < 1; i++) {
            producer[i] = new Thread (new Producer(orderQueue), "P"+i);
            producer[i].start();
        }
        for (int i = 0; i < 1; i++) {
            consumers[i] = new Thread (new Consumer(orderQueue), "C"+i);
            consumers[i].join();
        }
        for (int i = 0; i < 5; i++) {
//            consumers[i].join();
        }

        //have main join when all threads are complete
        //check to see what is in the Shared queue, any orders left?
        System.out.println(orderQueue.getQueueSize());

    }
}
