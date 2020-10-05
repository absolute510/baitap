/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6.bai1;

import java.util.Date;
import java.util.logging.Logger;

public class SinhVienMM extends SinhVien{
    private float luong;

    public SinhVienMM() {
        super();
    }

    public SinhVienMM(float luong, String maSV, String hoten, String gioitinh, Date ngaysinh, float diemTB) {
        super(maSV, hoten, gioitinh, ngaysinh, diemTB);
        this.luong = luong;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    @Override
    public String toString(){
        return "sinh vien MM: " +super.toString()+"\tluong: "+luong;
    }
}
