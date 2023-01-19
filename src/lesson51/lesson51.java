package lesson51;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class lesson51 {
    public static void main(String[] args) {
        // JOptionPane

        // JOptionPane.showMessageDialog(null, "this is some useless info", "title",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "here is more useless info", "title",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "really",
        // "title",JOptionPane.QUESTION_MESSAGE);
        // while (true) {
        // JOptionPane.showMessageDialog(null, "this is some useless info", "title",
        // JOptionPane.WARNING_MESSAGE);
        // } lặp cho đến khi sai
        // JOptionPane.showMessageDialog(null, "call tech support new ỏ else!!!",
        // "title",
        // JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "bro do you event code?",
        // "this is my title",
        // JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("what is your name?");
        // System.out.println("hello " + name);
        String[] responses = { "No, you're awesome!", "Thank you", "*Blush*" };

        ImageIcon icon = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson51\\smile.png");

        JOptionPane.showOptionDialog(null,
                "you are awesome!",
                "secret message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses,
                0);
    }
}
