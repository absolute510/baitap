/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyende9;

import java.util.Scanner;

public class House extends BatDongSan{
    protected String kindHouse;
    
    public House(String DiaChi, String NgayGiaoDich,int DonGia,float DienTich, float ThanhTien){
        super(DiaChi,NgayGiaoDich,DonGia,DienTich,ThanhTien);
    }
    
    public House(String DiaChi, String NgayGiaoDich,int DonGia,float DienTich, float ThanhTien, String kindHouse){
        super(DiaChi,NgayGiaoDich,DonGia,DienTich,ThanhTien);
        this.kindHouse = kindHouse;      
    }
    
    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap loai nha: ");
        this.kindHouse = sc.nextLine();
    }
    
    @Override
    public void calcCash(){
        if(this.kindHouse.equals("chung cu")){
            this.ThanhTien = this.DienTich*this.DonGia*9;
        }
        else this.ThanhTien = this.DienTich*this.DonGia;
    }
    
    @Override
    public void outputInfo(){
        super.outputInfo();
        System.out.println("loai nha: "+this.kindHouse);
    }
    
    @Override
    public int isHouse(){return 1;}
    public int isLand(){return 0;}

    public String getKindHouse() {
        return kindHouse;
    }
}
