package lesson55;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(500, 500); has this.pack because it's not visible
        this.setTitle("radio check box");
        this.setLayout(new FlowLayout());
        String[] animals = { "cat", "dog", "bird" };
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        // comboBox.setEditable(true); edit text in comboBox
        // System.out.println(comboBox.getItemCount()); count Item in comboBox
        // comboBox.addItem("horse"); add object in comboBOx
        // comboBox.insertItemAt("pig", 0); add on top in combboX
        // comboBox.setSelectedIndex(0); select index 0 default
        // comboBox.removeItem("cat"); same as above
        // comboBox.removeItemAt(0);
        comboBox.removeAllItems();
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            // System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
