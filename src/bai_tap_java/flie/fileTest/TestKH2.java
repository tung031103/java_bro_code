package bai_tap_java.flie.fileTest;

import java.io.*;
import java.util.*;
import bai_tap_java.flie.fileIO.*;
import bai_tap_java.flie.fileModel.*;

public class TestKH2 {
    public static void testLuuFile() {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        dsKH.add(new KhachHang("KH01", "Nguyen Van An"));
        dsKH.add(new KhachHang("KH02", "Tran Tha Binh"));
        dsKH.add(new KhachHang("KH03", "Ho Đuc Chinh"));
        dsKH.add(new KhachHang("KH03", "Hoang Ngoc khai"));

        boolean kt = SerializaFile.LuuFile(dsKH, "C:\\DanhSachKH\\khachhang2.txt");
        if (kt == true) {
            System.out.println("da luu file thanh cong");
        } else {
            System.out.println("luu file khong thanh cong");
        }
    }

    public static void main(String[] args) {
        testLuuFile();
        ArrayList<KhachHang> dsKh = SerializaFile.docFile("C:\\DanhSachKH\\khachhang2.txt");
        System.out.println("danh sach khach hang nap vao may tinh la");
        System.out.println("Ma\tTen");
        for (KhachHang khachHang : dsKh) {
            System.out.println(khachHang);
        }
    }

}
