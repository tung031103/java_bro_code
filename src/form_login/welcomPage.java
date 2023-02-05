package form_login;

import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomPage {
    JFrame frame = new JFrame();
    JLabel welcomLabel = new JLabel("Hello!");

    welcomPage(String userID) {

        welcomLabel.setBounds(0, 0, 200, 35);
        welcomLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomLabel.setText("Hello " + userID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        // frame.setLocationRelativeTo(null);
        frame.add(welcomLabel);
        frame.setVisible(true);
    }
}
