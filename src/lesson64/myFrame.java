package lesson64;

import java.awt.*;
import javax.swing.JFrame;

public class myFrame extends JFrame {

    myPanel panel;

    myFrame() {
        panel = new myPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Panel 2D");

        this.add(panel);
        this.setLocationRelativeTo(null); // để màn hình hiển thị ra giữa màn hình windown
        this.pack();
        this.setVisible(true);

    }

}
