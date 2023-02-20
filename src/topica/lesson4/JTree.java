package topica.lesson4;

import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JTree extends JFrame {
    DefaultMutableTreeNode root = null;
    JTree tree;

    public JTree(String title) {
        super(title);
        // addControls();
        // showWindow();
    }

    public void addControls() {
        Container con = getContentPane();
        JPanel panelTree = new JPanel();
        panelTree.setLayout(new BorderLayout());
        root = new DefaultMutableTreeNode("Root");
        tree = new JTree("root");

    }

    public void addEvent() {

    }

    public void showWindow() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
