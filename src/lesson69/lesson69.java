package lesson69;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;

public class lesson69 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("anonymous object");
        ArrayList<JLabel> deck = new ArrayList<>();
        ImageIcon AC = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson69\\1_nhep.png");
        JLabel AClabel = new JLabel(AC);
        deck.add(AClabel);

        frame.add(deck.get(0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
