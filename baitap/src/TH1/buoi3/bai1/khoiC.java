/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai1;

import java.util.Scanner;

public class khoiC extends ThiSinh{
    private String diemVan;
    private String diemDia;
    private String diemSu;

    public khoiC() {
        super();
    }

    public khoiC(String diemVan, String diemDia, String diemSu, String SBD, String HoTen, String DiaChi, String UuTien) {
        super(SBD, HoTen, DiaChi, UuTien);
        this.diemVan = diemVan;
        this.diemDia = diemDia;
        this.diemSu = diemSu;
    }

    public String getDiemVan() {
        return diemVan;
    }

    public String getDiemDia() {
        return diemDia;
    }

    public String getDiemSu() {
        return diemSu;
    }

    public void setDiemVan(String diemVan) {
        this.diemVan = diemVan;
    }

    public void setDiemDia(String diemDia) {
        this.diemDia = diemDia;
    }

    public void setDiemSu(String diemSu) {
        this.diemSu = diemSu;
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap diem van: ");
        setDiemVan(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem su: ");
        setDiemSu(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem Dia: ");
        setDiemDia(new Scanner(System.in).nextLine());
        setDiemDia(new Scanner(System.in).nextLine());
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Diem Van: "+getDiemVan()+"Diem Su: "+getDiemSu()+"Diem Dia: "+getDiemDia());
    }

    @Override
    public String toString() {
        return "khoiC{" +super.toString() + "diemVan=" + diemVan + ", diemDia=" + diemDia + ", diemSu=" + diemSu + '}';
    }
}
