package lesson44;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class lesson44 {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson44\\wave.png");

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(100, 100, 75, 75);
        // JPanel
        JPanel GreenPanel = new JPanel();
        // block green
        GreenPanel.setBackground(Color.green);
        GreenPanel.setBounds(0, 0, 250, 250);
        // block Blue
        JPanel BluePanel = new JPanel();
        BluePanel.setBackground(Color.blue);
        BluePanel.setBounds(250, 0, 250, 250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 250, 500, 250);

        BluePanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        // add label in panel
        BluePanel.add(label);

        // add panel blocks
        frame.add(GreenPanel);
        frame.add(BluePanel);
        frame.add(redPanel);
    }
}
