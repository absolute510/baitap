/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai2;

import java.util.Scanner;

public class GiaoVien extends NhanVien{
    private int luongCB;
    private int luong;
    private int thuong;
    private int phat;

    public GiaoVien() {
        super();
    }

    public GiaoVien(int luongCB, int luong, int thuong, int phat, String HoTen, String NamSinh, String QueQuan) {
        super(HoTen, NamSinh, QueQuan);
        this.luongCB = luongCB;
        this.luong = luong;
        this.thuong = thuong;
        this.phat = phat;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public int getLuong() {
        return luong;
    }

    public int getThuong() {
        return thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap luong co ban: ");
        setLuongCB(new Scanner(System.in).nextInt());
        System.out.println("Nhap thuong: ");
        setLuong(new Scanner(System.in).nextInt());
        System.out.println("Nhap phat: ");
        setPhat(new Scanner(System.in).nextInt());
        this.luong = this.luongCB + this.thuong - this.phat;
        setLuong(this.luong);
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Luong: "+getLuong());
    }

    @Override
    public String toString() {
        return "GiaoVien{" +super.toString()+ "luongCB=" + luongCB + ", luong=" + luong + ", thuong=" + thuong + ", phat=" + phat + '}';
    }    
}
