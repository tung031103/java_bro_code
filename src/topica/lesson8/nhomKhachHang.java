package topica.lesson8;

import java.util.Vector;

public class nhomKhachHang {
    private String ma;
    private String ten;
    private Vector<khachHang> khachHangs;

    public void themKhachHang(khachHang kh) {
        this.khachHangs.add(kh);
        kh.setNhom(this);
    }

    public nhomKhachHang() {
        super();
        this.khachHangs = new Vector<khachHang>();
    }

    public nhomKhachHang(String ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.khachHangs = new Vector<khachHang>();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Vector<khachHang> getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(Vector<khachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }

    @Override
    public String toString() {
        return this.ten;
    }

}
