package quan_ly_nhan_vien.QuanlyNhanVienModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class PhongBan implements Serializable {
    private String maPB;
    private String tenPB;
    private Vector<NhanVien> nhanViens;

    public void themNhanVien(NhanVien nv) {
        this.nhanViens.add(nv);
        nv.setPhong(this);
    }

    public PhongBan() {
        super();
        this.nhanViens = new Vector<NhanVien>();
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public Vector<NhanVien> getNhanVien() {
        return nhanViens;
    }

    public void setNhanVien(Vector<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.tenPB;
    }

}
