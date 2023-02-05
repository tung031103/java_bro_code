package lesson65;

import javax.swing.JFrame;

public class myFrame extends JFrame {
    myPanel panel;

    myFrame() {

        panel = new myPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("animation 2D");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
