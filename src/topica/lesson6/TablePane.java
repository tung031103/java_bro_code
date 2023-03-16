package topica.lesson6;

import javax.swing.*;
import java.awt.*;

public class TablePane extends JFrame {
    JTabbedPane tab;

    public TablePane(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        Container con = getContentPane();
        tab = new JTabbedPane();
        con.add(tab);

        JPanel pnTab1 = new JPanel();
        JPanel pnTab2 = new JPanel();
        JPanel pnTab3 = new JPanel();

        tab.add(pnTab1, "Cấu hình");
        tab.add(pnTab2, "Bảo mật");
        tab.add(pnTab3, "Phân quyền");

        pnTab1.setBackground(Color.red);
        pnTab2.setBackground(Color.BLUE);
        pnTab3.setBackground(Color.yellow);

        pnTab1.add(new JButton("Đây là button"));
        pnTab2.add(new JTextField(15));
    }

    private void addEvents() {

    }

    public void showWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
