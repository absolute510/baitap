/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyende9;

import java.util.Scanner;

public class Land extends BatDongSan{
    protected String kindLand;
    
    public Land(String DiaChi, String NgayGiaoDich,int DonGia,float DienTich, float ThanhTien){
        super(DiaChi,NgayGiaoDich,DonGia,DienTich,ThanhTien);
    }
    
    public Land(String DiaChi, String NgayGiaoDich,int DonGia,float DienTich, float ThanhTien, String kindLand){
        super(DiaChi,NgayGiaoDich,DonGia,DienTich,ThanhTien);
        this.kindLand = kindLand;      
    }
    
    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap loai dat: ");
        this.kindLand = sc.nextLine();
    }
    
    @Override
    public void calcCash(){
        if(this.kindLand.equals("A")) this.ThanhTien = this.DienTich*this.DonGia*15;
        else this.ThanhTien = this.DienTich*this.DonGia;
    }
    
    @Override
    public void outputInfo(){
        super.outputInfo();
        System.out.println("loai nha: "+this.kindLand);
    }
    
    @Override
    public int isHouse(){return 0;}
    public int isLand(){return 1;}

    public String getKindLand() {
        return kindLand;
    }
}
