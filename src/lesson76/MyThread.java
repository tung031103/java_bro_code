package lesson76;

public class MyThread extends Thread {

    @Override
    public void run() {

        if (this.isDaemon()) {
            System.out.println("This is a daemon Thread that is running!");
        } else {
            System.out.println("this is a user thread that is running");
        }
    }

}
