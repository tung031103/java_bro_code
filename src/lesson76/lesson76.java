package lesson76;

public class lesson76 {
    public static void main(String[] args) throws InterruptedException {

        // System.out.println(Thread.activeCount());
        // Thread.currentThread().setName("Main");
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10); // sét mức độ ưu tiên
        // System.out.println(Thread.currentThread().getPriority()); // Priority(sự ưu
        // tiên)
        // System.out.println(Thread.currentThread().isAlive()); // luồng hiện tại của
        // Thread
        // for (int i = 3; i > 0; i--) {
        // System.out.println(i);
        // Thread.sleep(1000); // luồng ngủ

        // }

        // System.out.println("You are done :)");
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.start(); // bắt đầu một luồng chạy mới
        // System.out.println(thread2.isAlive()); // có start sẽ biến thành true, nếu ko
        // sẽ false

        // thread2.setName("2nd thread");
        // System.out.println(thread2.getName());

        // thread2.setPriority(1);
        // System.out.println(thread2.getPriority());

        // System.out.println(Thread.activeCount());
    }
}
