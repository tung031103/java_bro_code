package quan_ly_nhan_vien.SerializeFile;

import java.io.*;
import java.util.*;

import quan_ly_nhan_vien.QuanlyNhanVienModel.NhanVien;

public class SerializeFile {
    public static boolean LuuFile(ArrayList<NhanVien> dsNV, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsNV);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<NhanVien> docFile(String path) {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            dsNV = (ArrayList<NhanVien>) data;
            ois.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return dsNV;
    }
}
