package CPM;

public class StringHolder extends Thread{
    private String data;

    @Override
    public void run(){
        System.out.println(this.getName());
        System.out.println("Printed from Thread: As I expected: " + data);
    }

    public StringHolder(String data){this.data = data;}

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
