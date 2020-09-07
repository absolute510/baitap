/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyende9;

import java.util.Scanner;

public abstract class BatDongSan {
    protected String DiaChi;
    protected String NgayGiaoDich;
    protected int DonGia;
    protected float DienTich;
    protected float ThanhTien;
    
    public BatDongSan(String DiaChi, String NgayGiaoDich, int DonGia, float DienTich, float ThanhTien){
        this.DiaChi = DiaChi;
        this.NgayGiaoDich = NgayGiaoDich;
        this.DonGia = DonGia;
        this.DienTich = DienTich;
        this.ThanhTien = ThanhTien;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap dia chi: ");
        this.DiaChi = sc.nextLine();
        System.out.println("nhap ngay giao dich: ");
        this.NgayGiaoDich = sc.nextLine();
        System.out.println("nhap don gia: ");
        this.DonGia = sc.nextInt();
        System.out.println("nhap dien tich: ");
        this.DienTich = sc.nextFloat();
    }
    
    public void outputInfo(){
        System.out.println("Dia chi: "+this.DiaChi);
        System.out.println("Ngay giao dich: "+this.NgayGiaoDich);
        System.out.println("Thanh tien: "+this.ThanhTien);
    }
    
    public abstract void calcCash();
    public abstract int isHouse();
    public abstract int isLand();

    public String getDiaChi() {
        return DiaChi;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public int getDonGia() {
        return DonGia;
    }

    public float getDienTich() {
        return DienTich;
    }

    public float getThanhTien() {
        return ThanhTien;
    }
}
