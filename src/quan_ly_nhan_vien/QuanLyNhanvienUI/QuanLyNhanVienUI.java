package quan_ly_nhan_vien.QuanLyNhanvienUI;

import java.awt.*;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import quan_ly_nhan_vien.QuanlyNhanVienModel.NhanVien;
import quan_ly_nhan_vien.QuanlyNhanVienModel.PhongBan;

public class QuanLyNhanVienUI extends JFrame {

    JComboBox<PhongBan> cbPhongBan;

    JList<NhanVien> ListNhanVien;

    JTextField txtMa, txtTen, txtNgayVaoLam, txtNamSinh;

    JButton btnLuu, btnXoa, btnThoat;

    ArrayList<PhongBan> dsPhongBan;
    ArrayList<NhanVien> dsNhanVienTheoPhongBan;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    PhongBan pbSelected = null;
    NhanVien nvSelected = null;

    public QuanLyNhanVienUI(String title) {
        super(title);
        addControls();
        addEvent();
        fakeData();
    }

    public void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);
        JPanel pnPhongBan = new JPanel();
        pnPhongBan.setLayout(new FlowLayout());
        pnMain.add(pnPhongBan);
        JLabel lbPhongBan = new JLabel("Chọn phòng ban:");
        cbPhongBan = new JComboBox<PhongBan>();
        cbPhongBan.setPreferredSize(new Dimension(200, 25));
        pnPhongBan.add(lbPhongBan);
        pnPhongBan.add(cbPhongBan);

        JPanel pnDanhSachVaChiTiet = new JPanel();
        pnMain.add(pnDanhSachVaChiTiet);
        pnDanhSachVaChiTiet.setLayout(new GridLayout(1, 2));
        JPanel pnDanhSach = new JPanel();
        pnDanhSach.setLayout(new BorderLayout());

        Border borderDanhSach = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorderDanhSach = new TitledBorder(borderDanhSach, "Danh Sách");
        titledBorderDanhSach.setTitleJustification(TitledBorder.CENTER);
        titledBorderDanhSach.setTitleColor(Color.red);
        pnDanhSach.setBorder(titledBorderDanhSach);

        ListNhanVien = new JList<NhanVien>();
        JScrollPane sc = new JScrollPane(ListNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnDanhSach.add(sc, BorderLayout.CENTER);
        pnDanhSachVaChiTiet.add(pnDanhSach);

        JPanel pnChiTiet = new JPanel();
        pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
        pnDanhSachVaChiTiet.add(pnChiTiet);

        Border borderChiTiet = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorderChiTiet = new TitledBorder(borderChiTiet, "Thông tin chi tiết");
        titledBorderChiTiet.setTitleJustification(TitledBorder.CENTER);
        titledBorderChiTiet.setTitleColor(Color.red);
        pnChiTiet.setBorder(titledBorderChiTiet);

        JPanel pnMa = new JPanel();
        pnMa.setLayout(new FlowLayout());
        JLabel lbMa = new JLabel("Mã: ");
        txtMa = new JTextField(15);
        pnMa.add(lbMa);
        pnMa.add(txtMa);
        pnChiTiet.add(pnMa);

        JPanel pnTen = new JPanel();
        pnTen.setLayout(new FlowLayout());
        JLabel lbTen = new JLabel("Tên: ");
        txtTen = new JTextField(15);
        pnTen.add(lbTen);
        pnTen.add(txtTen);
        pnChiTiet.add(pnTen);

        JPanel pnNgayVao = new JPanel();
        pnNgayVao.setLayout(new FlowLayout());
        JLabel lbNgayVao = new JLabel("Ngày vào: ");
        txtNgayVaoLam = new JTextField(15);
        pnNgayVao.add(lbNgayVao);
        pnNgayVao.add(txtNgayVaoLam);
        pnChiTiet.add(pnNgayVao);

        JPanel pnNamSinh = new JPanel();
        pnNamSinh.setLayout(new FlowLayout());
        JLabel lbNamSinh = new JLabel("Năm sinh: ");
        txtNamSinh = new JTextField(15);
        pnNamSinh.add(lbNamSinh);
        pnNamSinh.add(txtNamSinh);
        pnChiTiet.add(pnNamSinh);

        JPanel pnButton = new JPanel();

        Border borderButton = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorderButton = new TitledBorder(borderButton, "chọn chức năng");
        titledBorderButton.setTitleJustification(TitledBorder.CENTER);
        titledBorderButton.setTitleColor(Color.red);
        pnButton.setBorder(titledBorderButton);

        pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnLuu = new JButton("Lưu");
        btnXoa = new JButton("Xóa");
        btnThoat = new JButton("Thoát");

        pnButton.add(btnLuu);
        pnButton.add(btnXoa);
        pnButton.add(btnThoat);
        pnMain.add(pnButton);

        lbMa.setPreferredSize(lbNamSinh.getPreferredSize());
        lbTen.setPreferredSize(lbNamSinh.getPreferredSize());
        lbNgayVao.setPreferredSize(lbNamSinh.getPreferredSize());
        lbNamSinh.setPreferredSize(lbNamSinh.getPreferredSize());
        // lbPhongBan.setPreferredSize(lbNamSinh.getPreferredSize());

    }

    public void fakeData() {
        dsPhongBan = new ArrayList<PhongBan>();
        PhongBan phongHopTacGiangVien = new PhongBan();
        phongHopTacGiangVien.setMaPB("p1");
        phongHopTacGiangVien.setTenPB("Phòng hợp tác giảng viên");

        PhongBan phongKinhDoanh = new PhongBan();
        phongKinhDoanh.setMaPB("p2");
        phongKinhDoanh.setTenPB("Phòng kinh doanh");

        PhongBan phongKeToan = new PhongBan();
        phongKeToan.setMaPB("p3");
        phongKeToan.setTenPB("Phòng kế toán");

        dsPhongBan.add(phongHopTacGiangVien);
        dsPhongBan.add(phongKinhDoanh);
        dsPhongBan.add(phongKeToan);

        phongHopTacGiangVien.themNhanVien(
                new NhanVien("NV1", "Nguyễn Thị An", new Date(2016 - 1900, 1, 1), new Date(1990 - 1900, 1, 1)));
        phongHopTacGiangVien.themNhanVien(
                new NhanVien("NV2", "Trần Văn Binh", new Date(2015 - 1900, 1, 1), new Date(1992 - 1900, 1, 1)));
        phongKinhDoanh.themNhanVien(
                new NhanVien("NV3", "Hồ Thị Giải", new Date(2013 - 1900, 1, 1), new Date(1989 - 1900, 1, 1)));
        phongKinhDoanh.themNhanVien(
                new NhanVien("NV4", "Trần Đình Thoát", new Date(2014 - 1900, 1, 1), new Date(1988 - 1900, 1, 1)));
        for (PhongBan phongBan : dsPhongBan) {
            cbPhongBan.addItem(phongBan);
        }
    }

    public void addEvent() {
        cbPhongBan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbPhongBan.getSelectedIndex() == -1)
                    return;
                pbSelected = (PhongBan) cbPhongBan.getSelectedItem();
                ListNhanVien.setListData(pbSelected.getNhanVien());

            }
        });

        ListNhanVien.addMouseListener(new MouseListener() {

            public void mouseReleased(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseClicked(MouseEvent e) {
                if (ListNhanVien.getSelectedIndex() == -1)
                    return;
                nvSelected = ListNhanVien.getSelectedValue();
                txtMa.setText(nvSelected.getMaNhanVien());
                txtTen.setText(nvSelected.getTenNhanVien());
                txtNamSinh.setText(sdf.format(nvSelected.getNamSinh()));
                txtNgayVaoLam.setText(sdf.format(nvSelected.getNgayVaoLamViec()));
            }
        });
        btnLuu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                xuLyLuu();
            }

        });

        btnXoa.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                xuLyXoa();
            }

        });

        btnThoat.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
    }

    protected void xuLyLuu() {
        try {
            NhanVien nv = new NhanVien(txtMa.getText(), txtTen.getText(), sdf.parse(txtNgayVaoLam.getText()),
                    sdf.parse(txtNamSinh.getText()));
            if (pbSelected != null) {
                pbSelected.themNhanVien(nv);
                ListNhanVien.setListData(pbSelected.getNhanVien());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    protected void xuLyXoa() {
        if (nvSelected != null) {
            pbSelected.getNhanVien().remove(nvSelected);
            nvSelected = null;
            ListNhanVien.setListData(pbSelected.getNhanVien());
        }
    }

    public void showWindow() {
        this.setSize(550, 380);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
