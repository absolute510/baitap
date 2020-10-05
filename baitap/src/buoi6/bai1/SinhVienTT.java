/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6.bai1;

import java.util.Date;

/**
 *
 * @author ic3burG
 */
public class SinhVienTT extends SinhVien{
    private float hocphi;

    public SinhVienTT() {
        super();
    }

    public SinhVienTT(float hocphi, String maSV, String hoten, String gioitinh, Date ngaysinh, float diemTB) {
        super(maSV, hoten, gioitinh, ngaysinh, diemTB);
        this.hocphi = hocphi;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }
    
    @Override
    public String toString(){
        return "sinh vien TT; "+super.toString()+"\thoc phi: "+hocphi;
    }
}
