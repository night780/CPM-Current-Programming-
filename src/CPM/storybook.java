package CPM;

public class storybook implements Runnable{

    public void run(){
        System.out.println("Welcome to my storybook!");
        //wait for 2 seconds
        try {
            Thread.sleep(2000);
            System.out.println("The story began long, long ago");
            for (int i = 1; i <= 10; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//end of the run method

    public static void main(String[] args) throws InterruptedException{
        // start up or spin up story book thread

        Thread story = new Thread(new storybook());
        story.start();
        //main method to wait until the run method is complete
        // is finished/terminated
        story.join();
        System.out.println("And they lived happily ever after");
    }
}
