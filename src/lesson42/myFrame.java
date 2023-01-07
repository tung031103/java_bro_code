package lesson42;

import java.awt.Color;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

public class myFrame extends JFrame {
    myFrame() {
        // create a frame
        this.setTitle("GUI JFrame"); // set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exist out of application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420, 420); // set the x-dimension, and y dimension
        this.setVisible(true); // make framme visible

        ImageIcon img = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson42\\tung.png");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(255, 255, 0));
    }
}
