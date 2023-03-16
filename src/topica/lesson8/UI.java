package topica.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class UI extends JFrame {

    DefaultMutableTreeNode root = null;
    JTree treeNhom;
    DefaultTableModel tableModel;
    JTable tableKhach;

    JTextField txtMa, txtTen, txtPhone, txtEmail;

    JButton btnLuu, btnXoa;

    ArrayList<nhomKhachHang> dsNhom;
    ArrayList<khachHang> dsKhach;
    nhomKhachHang nhomSelected = null;

    public UI(String title) {
        super(title);
        addControls();
        addEvents();
        fakeData();
    }

    private void addEvents() {
        treeNhom.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultMutableTreeNode nodeSelected = (DefaultMutableTreeNode) treeNhom.getLastSelectedPathComponent();
                if (nodeSelected != null && nodeSelected.getLevel() == 1) {
                    nhomSelected = (nhomKhachHang) nodeSelected.getUserObject();
                    hienThiKhachHangTheoNhom();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        tableKhach.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected = tableKhach.getSelectedRow();
                if (rowSelected == -1)
                    return;
                String ma = tableKhach.getValueAt(rowSelected, 0) + "";
                String ten = tableKhach.getValueAt(rowSelected, 1) + "";
                String phone = tableKhach.getValueAt(rowSelected, 2) + "";
                String email = tableKhach.getValueAt(rowSelected, 3) + "";
                txtMa.setText(ma);
                txtTen.setText(ten);
                txtPhone.setText(phone);
                txtEmail.setText(email);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
    }

    protected void hienThiKhachHangTheoNhom() {
        tableModel.setRowCount(0);
        for (khachHang kh : nhomSelected.getKhachHangs()) {
            Vector<String> vec = new Vector<>();
            vec.add(kh.getMa());
            vec.add(kh.getTen());
            vec.add(kh.getPhone());
            vec.add(kh.getEmail());
            tableModel.addRow(vec);

        }
    }

    private void addControls() {
        java.awt.Container con = getContentPane();
        JPanel pnLeft = new JPanel();
        pnLeft.setPreferredSize(new Dimension(300, 0));
        JPanel pnRight = new JPanel();
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                pnLeft, pnRight);
        con.setLayout(new BorderLayout());
        con.add(sp, BorderLayout.CENTER);

        pnRight.setLayout(new BorderLayout());

        JPanel pnTopRight = new JPanel();
        pnTopRight.setPreferredSize(new Dimension(0, 350));
        JPanel pnBottomRight = new JPanel();
        JSplitPane spRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                pnTopRight, pnBottomRight);
        pnRight.add(spRight, BorderLayout.CENTER);

        pnLeft.setLayout(new BorderLayout());
        root = new DefaultMutableTreeNode("Công ty Go Live");
        treeNhom = new JTree(root);
        JScrollPane scTree = new JScrollPane(treeNhom,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnLeft.add(scTree, BorderLayout.CENTER);

        pnTopRight.setLayout(new BorderLayout());
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Mã Khách hàng");
        tableModel.addColumn("Tên Khách hàng");
        tableModel.addColumn("Số điện thoại Khách hàng");
        tableModel.addColumn("Thư điện tử");
        tableKhach = new JTable(tableModel);
        JScrollPane scTable = new JScrollPane(tableKhach,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnTopRight.add(scTable, BorderLayout.CENTER);

        pnBottomRight.setLayout(new BoxLayout(pnBottomRight,
                BoxLayout.Y_AXIS));

        JPanel pnMa = new JPanel();
        JLabel labelMa = new JLabel("Mã khách hàng");
        pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
        txtMa = new JTextField(20);
        pnMa.add(labelMa);
        pnMa.add(txtMa);
        pnBottomRight.add(pnMa);

        JPanel pnTen = new JPanel();
        JLabel labelTen = new JLabel("Tên khách hàng");
        pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
        txtTen = new JTextField(20);
        pnTen.add(labelTen);
        pnTen.add(txtTen);
        pnBottomRight.add(pnTen);

        JPanel pnPhone = new JPanel();
        JLabel labelPhone = new JLabel("Phone khách hàng");
        pnPhone.setLayout(new FlowLayout(FlowLayout.LEFT));
        txtPhone = new JTextField(20);
        pnPhone.add(labelPhone);
        pnPhone.add(txtPhone);
        pnBottomRight.add(pnPhone);

        JPanel pnEmail = new JPanel();
        JLabel labelEmail = new JLabel("Email khách hàng");
        pnEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
        txtEmail = new JTextField(20);
        pnEmail.add(labelEmail);
        pnEmail.add(txtEmail);
        pnBottomRight.add(pnEmail);

        JPanel pnButton = new JPanel();
        pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        btnLuu = new JButton("Lưu Khách hàng");
        btnXoa = new JButton("Xóa khách hàng");
        pnButton.add(btnLuu);
        pnButton.add(btnXoa);

        pnBottomRight.add(pnButton);

        labelMa.setPreferredSize(labelPhone.getPreferredSize());
        labelTen.setPreferredSize(labelPhone.getPreferredSize());
        labelEmail.setPreferredSize(labelPhone.getPreferredSize());
    }

    public void fakeData() {
        dsNhom = new ArrayList<nhomKhachHang>();
        nhomKhachHang vip = new nhomKhachHang("N1", "Khách hang VIP");
        nhomKhachHang TiemNang = new nhomKhachHang("N2", "Khách hang Tiềm năng");
        nhomKhachHang khoTinh = new nhomKhachHang("N3", "Khách hang khó tính");
        dsNhom.add(vip);
        dsNhom.add(TiemNang);
        dsNhom.add(khoTinh);

        vip.getKhachHangs().add(new khachHang("k1", "Hoàng Đình Tùng", "0915649920", "hoangtung240603@gmail.com"));
        vip.getKhachHangs().add(new khachHang("k2", "Trịnh Đức Lương", "0123456789", "luong1234@gmail.com"));
        vip.getKhachHangs().add(new khachHang("k3", "Trịnh Quang Dương", "0123480305", "quangduong@gmail.com"));
        vip.getKhachHangs().add(new khachHang("k4", "Nguyễn Phú Thiện Nhân", "0333245635", "nhan@gmail.com"));
        for (nhomKhachHang nhom : dsNhom) {
            DefaultMutableTreeNode nodeNhom = new DefaultMutableTreeNode(nhom);
            root.add(nodeNhom);
            for (khachHang khachHang : nhom.getKhachHangs()) {
                DefaultMutableTreeNode nodeKhach = new DefaultMutableTreeNode(khachHang);
                nodeNhom.add(nodeKhach);
            }
        }
        treeNhom.expandRow(0);

    }

    public void showWindow() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
