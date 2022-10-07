package ConcurrentProgramming.src;

public class CounterThread implements Runnable{

    private int low;
    private int high;

    public CounterThread(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public void run() {
        for (int i = low; i <= high ; i++) {
            System.out.println(i);
        }
    }
}
