package topica.lesson5;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;
import java.awt.*;

public class menuBar extends JFrame {

    JMenuBar menuBar; // nơi chứa các Jmenu
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;

    JMenuItem menuFileNew;
    JMenuItem menuFileOpen;
    JMenuItem menuFileExit;

    JMenuItem menuEditCopy;
    JMenuItem menuEditPaste;
    JMenuItem menuEditDelete;

    JMenuItem menuHelpGui;
    JMenuItem menuHelpAbout;

    public menuBar(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);

        menuFileNew = new JMenuItem("New");
        menuFileNew.setIcon(new ImageIcon(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\topica\\lesson5\\image\\new.png"));
        menuFile.add(menuFileNew);
        menuFileOpen = new JMenuItem("Open");
        menuFileOpen.setIcon(new ImageIcon(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\topica\\lesson5\\image\\open.png"));
        menuFile.addSeparator();
        menuFile.add(menuFileOpen);
        menuFileExit = new JMenuItem("Exit");
        menuFileExit.setIcon(new ImageIcon(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\topica\\lesson5\\image\\exit.png"));
        menuFile.addSeparator();
        menuFile.add(menuFileExit);

        menuEditCopy = new JMenuItem("Copy");
        menuEdit.add(menuEditCopy);

        menuEditPaste = new JMenuItem("Paste");
        menuEdit.addSeparator();
        menuEdit.add(menuEditPaste);

        menuEditDelete = new JMenuItem("Delete");
        menuEdit.addSeparator();
        menuEdit.add(menuEditDelete);

        menuHelpGui = new JMenuItem("Gui");
        menuHelp.add(menuHelpGui);

        menuHelpAbout = new JMenuItem("About");
        menuHelp.addSeparator();
        menuHelp.add(menuHelpAbout);

    }

    private void addEvents() {
        menuFileExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

    }

    public void showWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
