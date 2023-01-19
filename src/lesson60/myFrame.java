package lesson60;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("this is some text!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color... i guess", Color.black);
            // label.setForeground(color);
            label.setBackground(color);

        }
    }
}
