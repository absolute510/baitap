package buoi6.bai1;

import java.io.Serializable;
import java.util.Date;

public class SinhVien implements Serializable{
    protected String maSV;
    protected String hoten;
    protected String gioitinh;
    protected Date ngaysinh;
    protected float diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoten, String gioitinh, Date ngaysinh, float diemTB) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diemTB = diemTB;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getMaSV() {
        return maSV;
    }
    
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }
    
    @Override
    public String toString(){
        return "SinhVien: ma sinh vien "+maSV+"\tho ten: "+hoten+"\tgioi tinh: "+gioitinh+"\tngay sinh: "+ngaysinh+"\tdiem trung binh: "+diemTB;
    }
}
