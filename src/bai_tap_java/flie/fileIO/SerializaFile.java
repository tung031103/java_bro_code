package bai_tap_java.flie.fileIO;

import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import bai_tap_java.flie.fileModel.KhachHang;

public class SerializaFile {
    public static boolean LuuFile(ArrayList<KhachHang> dsKH, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsKH);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<KhachHang> docFile(String path) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            dsKH = (ArrayList<KhachHang>) data;
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsKH;
    }
}
