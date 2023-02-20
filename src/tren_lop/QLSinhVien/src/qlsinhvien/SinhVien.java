/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsinhvien;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private int tuoi;
    private String queQuan;
    private double diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    
    public SinhVien(){
        
    }


    
    public SinhVien(String maSV, String tenSV, int tuoi, String queQuan,  double diemTB){
        super();
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "ma sinh vien: "+this.getMaSV()+ "\nten sinh vien: "+
                this.getTenSV()+"\ntuoi: "+this.getTuoi()+"\nque quan: "+this.getQueQuan()+
                "\ndiem tb: "+this.getDiemTB(); 
    }
    
    
    
}
