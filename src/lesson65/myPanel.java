package lesson65;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 4;
    int yVelocity = 5;
    int x = 0;
    int y = 0;

    myPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson65\\enemy.png").getImage();
        backgroundImage = new ImageIcon("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson65\\space.png")
                .getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        super.paint(g); // paint background color
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();

    }
}
