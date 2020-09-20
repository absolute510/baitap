/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai4;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
        super();
    }

    public NhanVien(String congViec, String hoten, String gioiTinh, String diaChi, int namSinh) {
        super(hoten, gioiTinh, diaChi, namSinh);
        this.congViec = congViec;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap cong viec: ");
        setCongViec(new Scanner(System.in).nextLine());
    }
    
    public void xuat(){
        super.xuat();
        System.out.println(" cong viec: " + getCongViec());
    }
    
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
