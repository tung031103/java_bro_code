package tren_lop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diemToan = 0;
        while (true) {
            System.out.println("moi nhap diem: ");
            diemToan = scanner.nextInt();
            if (diemToan >= 0 && diemToan <= 10) {
                break;
            }
            System.out.println("diem phai tu 0 den 10!");
        }
        System.out.println("diem toan cua ban la: " + diemToan);
    }
}
