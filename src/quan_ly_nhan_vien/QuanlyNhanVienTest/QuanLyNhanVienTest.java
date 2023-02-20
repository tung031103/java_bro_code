package quan_ly_nhan_vien.QuanlyNhanVienTest;

import java.io.IOException;
import java.util.*;
import javax.swing.*;
import quan_ly_nhan_vien.SerializeFile.*;
import quan_ly_nhan_vien.QuanLyNhanvienUI.*;
import quan_ly_nhan_vien.QuanlyNhanVienModel.*;
import java.text.SimpleDateFormat;

public class QuanLyNhanVienTest {
    JTextField txtMa, txtTen, txtNgayVaoLam, txtNamSinh;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void testLuuFile() {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        for (NhanVien nhanVien : dsNV) {
            dsNV.add(nhanVien);
        }
        boolean kt = SerializeFile.LuuFile(dsNV, "C:\\DanhSachKH\\khachhang3.txt");
        if (kt == true) {
            System.out.println("da luu file thanh cong");
        } else {
            System.out.println("luu file khong thanh cong");
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVienUI ui = new QuanLyNhanVienUI("Quản lý nhân viên");
        ui.showWindow();

        testLuuFile();
        ArrayList<NhanVien> dsNV = SerializeFile.docFile("C:\\DanhSachKH\\khachhang3.txt");
        System.out.println("danh sach khach hang nap vao may tinh la");
        System.out.println("Ma\tTen");
        for (NhanVien nhanVien : dsNV) {
            System.out.println(nhanVien);
        }
    }
}
