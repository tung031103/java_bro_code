package lesson57;

import java.awt.*;
import javax.swing.*;

public class progressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    progressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 500, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("progress bar");
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50); // increase counter each 1s
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done! :)");

        // bar.setValue(10);
    }
}
