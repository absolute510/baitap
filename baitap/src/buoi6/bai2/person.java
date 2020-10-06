/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6.bai2;

import java.io.Serializable;
import java.util.Date;

public class person implements Serializable{
    protected String HoTen;
    protected String DiaChi;
    protected String GioiTinh;
    protected Date NgaySinh;

    public person(String HoTen, String DiaChi, String GioiTinh, Date NgaySinh) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public person() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    @Override
    public String toString() {
        return "person{" + "HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + '}';
    }
}
