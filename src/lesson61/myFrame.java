package lesson61;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        icon = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson61\\rocket.png");
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        // label.setBackground(Color.green);
        // label.setOpaque(true); // để hiển thị lên cái label
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // key typed(invoked when a key is typed. Uses keyChar, char output) = kiểu phím
        // (gọi khi 1 phím được gõ, sử dụng ký tự char, (keyPressed = phụ thuộc vào khóa
        // được nhấn))
        // chỉ dùng được kí tự không dùng số
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // hàm này dùng đc cả 2 vừa getChar vừa get code được

        // key pressed(when key pressed is invoked when a physical key is pressed down
        // this uses a key code it give us an int number output) = nhấn phím
        // switch (e.getKeyChar()) {
        // // sử dụng bàn phím asdw
        // case 'a':
        // label.setLocation(label.getX() - 10, label.getY());
        // break;
        // case 'w':
        // label.setLocation(label.getX(), label.getY() - 10);
        // break;
        // case 'd':
        // label.setLocation(label.getX() + 10, label.getY());
        // break;
        // case 's':
        // label.setLocation(label.getX(), label.getY() + 10);
        // break;
        // }
        switch (e.getKeyCode()) {
            // cái này phải dùng e.keycode mới chạy đc
            // arrow key = phím mũi tên
            case 37: // trái
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: // lên
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39: // phải
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:// xuống
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased (it call whennever a button is released ) = nhả phím
        System.out.println("you released key character: " + e.getKeyChar()); // gõ được cả số và chữ
        System.out.println("you released key code: " + e.getKeyCode()); // mã ascii của chữ
    }
}
