/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai2;

import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class NhanVien {
    private String HoTen;
    private String NamSinh;
    private String QueQuan;

    public NhanVien() {
    }

    public NhanVien(String HoTen, String NamSinh, String QueQuan) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.QueQuan = QueQuan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }
    
    public void nhap(){
        System.out.println("Nhap ten: ");
        setHoTen(new Scanner(System.in).nextLine());
        System.out.println("Nhap nam sinh: ");
        setNamSinh(new Scanner(System.in).nextLine());
        System.out.println("Nhap que quan: ");
        setQueQuan(new Scanner(System.in).nextLine());
    }
    
    public void xuat(){
        System.out.println("Nhan vien: Ho ten: "+getHoTen()+"Nam sinh: "+getNamSinh()+"Que quan: "+getQueQuan());
    }

    @Override
    public String toString() {
        return "NhanVien{" + "HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", QueQuan=" + QueQuan + '}';
    }
    
}
