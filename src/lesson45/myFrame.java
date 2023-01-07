package lesson45;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame { // or intead implements ActionListener
    JButton button;

    myFrame() {

        // ImageIcon icon = new
        // ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson45\\like.png");

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("I'm a button!");
        button.setFocusable(false);
        // button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // if (e.getSource() == button) {
    // System.out.println("poo");
    // }
    // }
}
