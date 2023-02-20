package topica.lesson2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class myJTable extends JFrame {
    public myJTable(String title) {
        super(title);
        addControls();
        addEvents();
    }

    DefaultTableModel dtm;
    JTable tbSinhVien;
    JButton btnThem;
    JButton btnXoa;

    public void addControls() {
        Container con = getContentPane();
        JPanel pnLeft = new JPanel();
        JPanel pnRight = new JPanel();
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
        con.add(sp);

        dtm = new DefaultTableModel();
        dtm.addColumn("Mã");
        dtm.addColumn("Tên");
        dtm.addColumn("Quê quán");

        // thêm dòng bằng mảng hoặc bằng vector
        // thêm dòng bằng mảng
        String row1[] = { "SV1", "Nguyễn Văn Tèo", "Hà Nội" };
        dtm.addRow(row1);
        String row2[] = { "SV2", "Trần Thị Giải", "Hải Dương" };
        dtm.addRow(row2);
        String row3[] = { "SV3", "Lý Nam Cường", "Nam Định" };
        dtm.addRow(row3);
        String row4[] = { "SV4", "Nguyễn Hồng Nhung", "Lạng Sơn" };
        dtm.addRow(row4);

        // thêm dòng bằng vector
        Vector<String> vec5 = new Vector<String>();
        vec5.add("SV5");
        vec5.add("Dương Văn Cam");
        vec5.add("Hồ Chí Minh");
        dtm.addRow(vec5);

        tbSinhVien = new JTable(dtm);
        JScrollPane scTable = new JScrollPane(tbSinhVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        pnLeft.setLayout(new BorderLayout());
        pnLeft.setPreferredSize(new Dimension(300, 0));
        pnLeft.add(scTable, BorderLayout.CENTER);

        JPanel pnBtn = new JPanel();
        pnBtn.setLayout(new FlowLayout());
        btnThem = new JButton("Thêm");
        btnXoa = new JButton("Xóa");
        pnBtn.add(btnThem);
        pnBtn.add(btnXoa);
        pnLeft.add(pnBtn, BorderLayout.SOUTH);

    }

    public void addEvents() {
        // thêm hàng theo kiểu động
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vector<String> vec = new Vector<String>();
                vec.add("Mã abc");
                vec.add("Tên abc");
                vec.add("Quê quán abc");
                dtm.addRow(vec);
            }
        });
        // xóa hàng
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = tbSinhVien.getSelectedRow();
                if (row == -1)
                    return;

                dtm.removeRow(row); // xóa đi dòng mình chọn
            }
        });
        tbSinhVien.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseClicked(MouseEvent e) {
                int row = tbSinhVien.getSelectedRow();
                if (row == -1) {
                    return;
                }
                String ma = tbSinhVien.getValueAt(row, 0) + "";
                String ten = tbSinhVien.getValueAt(row, 1) + "";
                String queQuan = tbSinhVien.getValueAt(row, 2) + "";
                JOptionPane.showMessageDialog(null, "mã: " + ma + "\nTên: " + ten + "\nQuê Quán: " + queQuan);

            }

        });

    }

    public void showWindow() {
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
