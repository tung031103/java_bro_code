package quan_ly_nhan_vien.QuanlyNhanVienModel;

import java.io.Serializable;

import java.util.Date; // instead of import java.sql.Date;

public class NhanVien implements Serializable {
    private String maNhanVien;
    private String tenNhanVien;
    private Date ngayVaoLamViec;
    private Date namSinh;
    private PhongBan phong;

    public NhanVien(String maNhanVien, String tenNhanVien, Date ngayVaoLamViec, Date namSinh) {
        super();
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngayVaoLamViec = ngayVaoLamViec;
        this.namSinh = namSinh;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public Date getNgayVaoLamViec() {
        return ngayVaoLamViec;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public PhongBan getPhong() {
        return phong;
    }

    public void setPhong(PhongBan phong) {
        this.phong = phong;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setNgayVaoLamViec(Date ngayVaoLAmViec) {
        this.ngayVaoLamViec = ngayVaoLAmViec;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.tenNhanVien;
    }
}
