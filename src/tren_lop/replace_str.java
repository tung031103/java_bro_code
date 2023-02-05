package tren_lop;

import java.util.Scanner;

public class replace_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sv[] = { "Hoang Van A", "Trinh Duc Luong", "Le Hieu" };
        System.out.println("Nhap tu can tim: ");
        String find = sc.nextLine();
        System.out.println("Nhap tu can thay the: ");
        String replace = sc.nextLine();
        System.out.println("---danh sach sau khi thay the-----");

        for (String string : sv) {
            System.out.println(string.replace(find, replace));
        }

        for (int i = 0; i < sv.length; i++) {
            sv[i] = sv[i].replace(find, replace);
        }

    }

}
