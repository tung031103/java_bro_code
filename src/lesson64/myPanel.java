package lesson64;

import java.awt.*;
import javax.swing.JPanel;

public class myPanel extends JPanel {
    myPanel() {
        this.setPreferredSize(new Dimension(500, 500));

    }

    public void paint(Graphics g) { // là 1 phương thức của thư viện awt
        Graphics2D g2D = (Graphics2D) g;

        // g2D.setPaint(Color.GREEN);
        g2D.setPaint(Color.BLUE);

        // g2D.setStroke(new BasicStroke(5)); // set kích thước cho border

        // g2D.drawLine(0, 0, 500, 500); // vẽ 1 đường
        // g2D.fillRect(0, 0, 100, 200); // tô màu bên trong hình chữ nhật
        // g2D.drawRect(0, 0, 100, 200); vẽ hình chữ nhật or hình vuông
        // g2D.drawOval(0, 0, 100, 100); // vẽ hình tròn
        // g2D.setPaint(Color.orange);
        // g2D.fillOval(0, 0, 100, 100);

        // g2D.drawArc(0, 0, 100, 100, 0, 180); // vẽ nửa vòng tròn trên
        // g2D.drawArc(0, 0, 100, 100, 180, 180); // vẽ nửa vòng tròn dưới

        // vẽ pokemon
        // g2D.setPaint(Color.red);
        // g2D.fillArc(0, 0, 100, 100, 0, 180);
        // g2D.setPaint(Color.white);
        // g2D.fillArc(0, 0, 100, 100, 180, 180);

        // vẽ tam giác
        int[] xPoint = { 150, 250, 350 };
        int[] yPoint = { 300, 150, 300 };
        g2D.setPaint(Color.pink);
        g2D.drawPolygon(xPoint, yPoint, 3);
        g2D.fillPolygon(xPoint, yPoint, 3);

        // viết chữ
        g2D.setPaint(Color.red);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 40));
        g2D.drawString("You are a champion :D", 50, 50);

    }
}
