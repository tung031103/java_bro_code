package lesson43;

import java.awt.*;
import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
    public static void main(String[] args) {
        // jlabel
        ImageIcon img = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson43\\pokemon.png");

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("GUI, world!"); // set text of label
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center, bottom imageIcon
        label.setForeground(new Color(0x00FF00)); // set color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 60)); // set font of text
        label.setIconTextGap(-5);
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of iconIMG + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set Horizontal position of icon + text within label
        label.setBounds(100, 100, 250, 250); // set x and y position within frame as
        // well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
