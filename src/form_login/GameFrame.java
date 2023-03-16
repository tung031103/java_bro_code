package form_login;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GameFrame extends JFrame {

    GamePanel panel = new GamePanel();

    GameFrame(String user_id) {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
