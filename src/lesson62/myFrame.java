package lesson62;

import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class myFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon dizzy;
    ImageIcon bad;

    /**
     * 
     */
    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        label = new JLabel();
        label.addMouseListener(this);
        // label.setBounds(0, 0, 100, 100);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        // label.addMouseListener(this);

        // this.add(label);

        smile = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson62\\smile1.png");
        nervous = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson62\\nervous.png");
        dizzy = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson62\\dizzy.png");
        bad = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson62\\bad.png");
        label.setIcon(smile);
        // label.setIcon(nervous);
        // label.setIcon(dizzy);
        // label.setIcon(bad);

        this.add(label);
        this.setLocationRelativeTo(null); // frame in center
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a
        // component
        // System.out.println("You clicked the mouse"); // cả hai thành phần đó là:
        // pressed và released
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        // System.out.println("You pressed the mouse");
        // label.setBackground(Color.yellow);
        label.setIcon(bad);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        // System.out.println("You released the mouse");
        // label.setBackground(Color.green);

        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        // System.out.println("You entered the component");
        // label.setBackground(Color.blue);

        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        // System.out.println("You exited the component");
        // label.setBackground(Color.red);
        label.setIcon(smile);

    }

}
