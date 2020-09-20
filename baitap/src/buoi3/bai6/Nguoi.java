/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai6;

import java.util.Scanner;

public class Nguoi {
    
    private String hoten, ngaySinh, queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoten, String ngaySinh, String queQuan) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        setHoten(sc.nextLine());
        System.out.println("Nhap nam sinh: ");
        setNgaySinh(sc.nextLine());
        System.out.println("Nhap que quan: ");
        setQueQuan(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println("Ho ten: " + getHoten() + " | nam sinh: " + getNgaySinh() + " | que quan: " + getQueQuan());
    }
    
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
