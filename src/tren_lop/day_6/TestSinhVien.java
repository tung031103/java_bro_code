package tren_lop.day_6;

import java.util.Scanner;

public class TestSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("nhap so luong sinh vien: ");
        n = sc.nextInt();
        // sc.nextLine();

        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < sv.length; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap();
        }

    }
}
