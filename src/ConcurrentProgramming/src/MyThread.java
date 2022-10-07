package ConcurrentProgramming.src;

public class MyThread implements Runnable{

    // java adds this functionality to our class for us
    public MyThread(){
        super(); // calls Thread's default constructor
    }

    @Override
    public void run() {
        System.out.println("I am in the run method: " + Thread.currentThread().getName());
    }

    @Override
    public String toString(){
        return "MyThread " + this.toString();
    }

    // Anytime you run a main method it is placed in a thread named 'main'
    public static void main(String[] args) {
        //  construct a Thread by passing in an object from a class that implements
        // Runnable
        Runnable r = new MyThread();
        Thread t = new Thread(r);
        // You do not want to do this ever!!!!!
        t.run(); // I am in the run method main

        // You always want to call start() to spin up a separate thread
        // (not use the main thread's context to call the run method)
        t.start();
        System.out.println(t);

        Thread t2 = new Thread(new MyThread());
        t2.start();

        // create an array of threads and start them up
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(),"MyFavorite" + i);
            threads[i].start();
        }


    }
}
