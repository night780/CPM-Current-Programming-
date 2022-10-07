package CPM;

public class MyThread  implements Runnable{

    public MyThread(){
        super(); // calls Thread's default constructor
    }
    @Override
    public void run(){
        System.out.println("I am in the run method: " + Thread.currentThread().getName());
    }

    @Override
    public String toString(){
        return "";
    }

    // Anytime you run a main method it is placed into a main thread
    public static void main(String[] args) {
        //construct a Thread by passing in a object from a class that implements runnable
        Thread t = new Thread(new MyThread());
        // You do not want to do this ever!!!
        //t.run(); // ^^^^^^
        //always want ot call start() to spin up a separate thread(not one running in the main threads' context)
        t.start();
        System.out.println(t);

        Thread t2 = new Thread(new MyThread());
        t2.start();

        //create an array of threads and start them up
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(), "MyFavorite " + i);
            threads[i].setName("AnotherName"+i);
            threads[i].start();
        }
    }
}
