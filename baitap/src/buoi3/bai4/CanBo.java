/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai4;

import java.util.Scanner;

public class CanBo {
    
    private String hoten, gioiTinh, diaChi;
    private int namSinh;

    public CanBo() {
    }

    public CanBo(String hoten, String gioiTinh, String diaChi, int namSinh) {
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void nhap(){
        System.out.println("Nhap ho ten: ");
        setHoten(new Scanner(System.in).nextLine());
        System.out.println("Nhap nam sinh: ");
        setNamSinh(new Scanner(System.in).nextInt());
        System.out.println("Nhap gioi tinh: ");
        setGioiTinh(new Scanner(System.in).nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(new Scanner(System.in).nextLine());
    }
    
    public void xuat(){
        System.out.print("Ho ten: " + getHoten() + " gioi tinh: " + getGioiTinh() + 
                " nam sinh: " + getNamSinh() + " dia chi: " + getDiaChi());
    }

    void nhapDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void xuatDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void timKiem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
