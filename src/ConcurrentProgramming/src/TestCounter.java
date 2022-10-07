package ConcurrentProgramming.src;

public class TestCounter {

    public static void main(String[] args) {
        Runnable r = new CounterThread(1,10);
        Thread t = new Thread(r);
       // t.start();

        // create an array of threads to see the
        // interleaving effect
        Thread[] threads = {
                new Thread(new CounterThread(1,10)) ,
                new Thread(new CounterThread(11,20)) ,
                new Thread(new CounterThread(21,30)) ,

        };

        // start up the threads
        for(Thread thread : threads){
            thread.start();
        }
    }

}
