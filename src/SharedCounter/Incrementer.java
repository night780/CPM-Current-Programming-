package SharedCounter;

public class Incrementer implements Runnable {
    private static final int MAX = 1000;
    private SharedData data;

    public Incrementer(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 1; i <= MAX && !Thread.interrupted(); i++) {
            data.increment();
        }
    }
}
