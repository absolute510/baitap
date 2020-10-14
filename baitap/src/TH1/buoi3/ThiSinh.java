/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3;

import java.util.Scanner;

public class ThiSinh {
    private String SBD;
    private String HoTen;
    private String DiaChi;
    private String UuTien;

    public ThiSinh() {
    }

    public ThiSinh(String SBD, String HoTen, String DiaChi, String UuTien) {
        this.SBD = SBD;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.UuTien = UuTien;
    }

    public String getSBD() {
        return SBD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getUuTien() {
        return UuTien;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setUuTien(String UuTien) {
        this.UuTien = UuTien;
    }
    
    public void nhap(){
        System.out.println("Nhap SBD: ");
        setSBD(new Scanner(System.in).nextLine());
        System.out.println("Nhap ho ten: ");
        setHoTen(new Scanner(System.in).nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(new Scanner(System.in).nextLine());
        System.out.println("Nhap vung uu tien: ");
        setUuTien(new Scanner(System.in).nextLine());
    }
    
    public void xuat(){
        System.out.println("Thi sinh: SBD: "+getSBD()+"Ho ten: "+getHoTen()+"Dia chi: "+getDiaChi()+"Uu tien: "+getUuTien());
    }

    @Override
    public String toString() {
        return "SBD=" + SBD + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", UuTien=" + UuTien; 
    }
    
}
