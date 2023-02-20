package lesson75;

import java.util.*;

public class lesson75 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 10;

            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count + " seconds");
                    count--;
                } else {
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, 3000);
        // timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}
