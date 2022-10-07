package CPM;

public class WorkerThread implements Runnable{
    private int sum;

    public void run(){
        //1+2+3+4+5=sum(15)
        for (int i = 0; i <= 10000; i++) {
            sum+=i;
        }
    }

    public int getSum() {
        return sum;
    }
}
