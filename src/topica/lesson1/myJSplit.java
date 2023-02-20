package topica.lesson1;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class myJSplit extends JFrame {
    public myJSplit(String title) {
        super(title);
        addControls();
        showWindow();
    }

    private void addControls() {
        Container con = getContentPane();
        JPanel pnLeft = new JPanel();
        pnLeft.setPreferredSize(new Dimension(200, 0));
        JPanel pnRight = new JPanel();
        pnRight.setLayout(new BorderLayout());
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
        sp.setOneTouchExpandable(true); // hiện lên mũi tên để đóng mở
        con.add(sp);
        JPanel panelRight1 = new JPanel();
        JPanel panelRight2 = new JPanel();
        JSplitPane spRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelRight1, panelRight2);
        spRight.setOneTouchExpandable(true);
        panelRight1.setPreferredSize(new Dimension(0, 200));
        pnRight.add(spRight, BorderLayout.CENTER);

    }

    public void addEvent() {

    }

    public void showWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
