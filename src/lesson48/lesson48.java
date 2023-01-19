package lesson48;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class lesson48 {
    public static void main(String[] args) {
        // grid layout
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Grid layout");

        frame.setLayout(new GridLayout(3, 3, 10, 10));

        // JButton button1 = new JButton("1"); or below

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.setVisible(true);

    }
}
