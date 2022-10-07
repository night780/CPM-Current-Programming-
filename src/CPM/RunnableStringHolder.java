package CPM;

public class RunnableStringHolder implements Runnable {
    private String data;
    @Override
    public void run(){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Printed from Thread: As I expected: " + data);
        }

    public void StringHolder(String data){this.data = data;}

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data;
        }
    }

