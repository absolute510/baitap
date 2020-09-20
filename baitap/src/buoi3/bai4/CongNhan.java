/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai4;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
        super();
    }

    public CongNhan(int bac, String hoten, String gioiTinh, String diaChi, int namSinh) {
        super(hoten, gioiTinh, diaChi, namSinh);
        this.bac = bac;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap bac cong nhan: ");
        while(!setBac(new Scanner(System.in).nextInt())){}
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println(" bac: " + getBac());
    }
    
    public String getBac() {
        return (this.bac + "/9");
    }

    public boolean setBac(int bac) {
        if(bac > 0 && bac <= 9){
            this.bac = bac;
            return true;
        } else { 
            System.out.println("Sai thong tin ( 0 < bac < 9 )");
            return false;
        }
    }
}
