package bai_tap_java.flie.fileIO;

import java.io.*;
import java.util.ArrayList;

import bai_tap_java.flie.fileModel.KhachHang;

public class TextFileFactory {
    public static boolean LuuFile(ArrayList<KhachHang> dsKhachHang, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (KhachHang khachHang : dsKhachHang) {
                String line = khachHang.getMa() + "; " + khachHang.getTen();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<KhachHang> docFile(String path) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                String[] arr = line.split("; ");
                if (arr.length == 2) {
                    KhachHang kh = new KhachHang(arr[0], arr[1]);
                    dsKH.add(kh);
                }
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return dsKH;
    }
}
