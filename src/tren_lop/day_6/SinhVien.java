package tren_lop.day_6;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private double Diem;

    public SinhVien() {

    }

    public SinhVien(String hoTen, double Diem) {
        this.hoTen = hoTen;
        this.Diem = Diem;
    }

    public SinhVien(String hoTen, String diaChi, String gioiTinh, double Diem) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.Diem = Diem;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.printf("nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.printf("nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.printf("nhap diem: ");
        Diem = Double.valueOf(sc.nextDouble());
        // sc.nextLine();
        // sc.close();
    }

    public void xuat() {
        System.out.println("ho ten: " + hoTen);
        System.out.println("dia chi: " + diaChi);
        System.out.println("gioi tinh: " + gioiTinh);
        System.out.println("Diem: " + Diem);
    }

}
