package CPM;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
//        StringHolder sh = new StringHolder("Marry Poppins, practically perfect in every way.");
//
//        System.out.println(sh);
//        sh.start();
//        System.out.println(Thread.currentThread().getName());

        //Spin up a worker thread
        //construct and start it
        WorkerThread work = new WorkerThread();

        Thread sum = new Thread(work);
        sum.start();

//        WorkerThread wt = new WorkerThread();
//        wt.start();
        //wait until work thread is done with join() method
        sum.join();

        //putting main to sleep for a second
        Thread.sleep(1000);
        // have main report out the sum
        System.out.println(work.getSum());
    }
}
