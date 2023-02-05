package lesson71;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame {
    JButton myButton = new JButton("My Button");
    JButton myButton2 = new JButton("My Button 2");

    myFrame() {

        myButton.setBounds(100, 100, 150, 100);
        myButton2.setBounds(250, 100, 150, 100);
        // myButton.addActionListener(new ActionListener() {

        // // @Override
        // // public void actionPerformed(ActionEvent e) {
        // // System.out.println("you clicked a button!");
        // // }

        // });

        // lamda expression
        myButton.addActionListener(
                (e) -> System.out.println("you clicked button #1"));
        myButton2.addActionListener(
                (e) -> System.out.println("you clicked button #2"));

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
