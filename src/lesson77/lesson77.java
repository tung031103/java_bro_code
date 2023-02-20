package lesson77;

public class lesson77 {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();

        // thread1.join(3000); // calling thread (ex.main) wait until the specified
        // thread dies or for x of
        // millisecond, and throws InterruptedException mới ko bị lỗi nữa
        thread2.start();

        System.out.println(1 / 0);
    }
}
