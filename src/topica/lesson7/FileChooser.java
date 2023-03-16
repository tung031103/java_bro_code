package topica.lesson7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class FileChooser extends JFrame {

    JMenuBar menuBar;
    JMenu menuFile;
    JMenuItem menuFileSave;
    JMenuItem menuFileOpen;
    JMenuItem menuFileExit;
    JTextArea txtData;

    public FileChooser(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        setupMenuBar();
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        txtData = new JTextArea(50, 50);
        txtData.setLineWrap(true);
        txtData.setWrapStyleWord(true);
        JScrollPane sc = new JScrollPane(txtData,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc, BorderLayout.CENTER);

    }

    private void setupMenuBar() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuFile = new JMenu("Hệ thống");
        menuBar.add(menuFile);
        menuFileSave = new JMenuItem("Lưu tập tin");
        menuFileOpen = new JMenuItem("Mở tập tin");
        menuFileExit = new JMenuItem("Đóng tập tin");

        menuFile.add(menuFileSave);
        menuFile.add(menuFileOpen);
        menuFile.add(menuFileExit);

    }

    private void addEvents() {
        menuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyThoatPhanMem();
            }
        });

        menuFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyMoFile();
            }
        });

        menuFileSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyLuu();
            }
        });
    }

    protected void xuLyLuu() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String data = txtData.getText();
            try {
                FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile());
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                osw.write(data);
                osw.close();
                fos.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công");
            } catch (Exception e) {

            }
        }

    }

    protected void xuLyMoFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return "Tập tin.txt";
            }

            @Override
            public boolean accept(File f) {

                return f.getAbsolutePath().endsWith(".txt");
            }
        });

        chooser.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return "Word 2003, 2007, 2010, 2013, 2016";
            }

            @Override
            public boolean accept(File f) {

                return f.getAbsolutePath().endsWith(".doc") || f.getAbsolutePath().endsWith(".docx");
            }
        });

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = chooser.getSelectedFile();
                FileInputStream fis = new FileInputStream(selectedFile);
                InputStreamReader is = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(is);
                String line = br.readLine();
                StringBuilder builder = new StringBuilder();
                while (line != null) {
                    builder.append(line);
                    line = br.readLine();
                }
                br.close();
                txtData.setText(builder.toString());
                // is.close();
                // fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void xuLyThoatPhanMem() {
        int ret = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn thoát phần mềm này không?",
                "Xác nhận thoát",
                JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void showWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
