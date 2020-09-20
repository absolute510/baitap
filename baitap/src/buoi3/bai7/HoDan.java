/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private String soNha;
    private int soThanhVien;
    private ArrayList<Nguoi> dsNguoi = new ArrayList<>();

    public HoDan() {
    }

    public HoDan(String soNha, int soThanhVien, ArrayList<Nguoi> dsNguoi) {
        this.soNha = soNha;
        this.soThanhVien = soThanhVien;
        this.dsNguoi = dsNguoi;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public ArrayList<Nguoi> getDsNguoi() {
        return dsNguoi;
    }

    public void setDsNguoi(ArrayList<Nguoi> dsNguoi) {
        this.dsNguoi = dsNguoi;
    }

    public void nhap(){
        System.out.println("Nhap so nha: ");
        setSoNha(new Scanner(System.in).nextLine());
        System.out.println("So thanh vien trong ho " + getSoNha());
        setSoThanhVien(new Scanner(System.in).nextInt());
        for(int i=0; i<getSoThanhVien(); i++){
            System.out.println("Thanh vien thu " + (i+1));
            Nguoi ng= new Nguoi();
            ng.nhap();
            dsNguoi.add(ng);
        }
    }

    public void xuat(){
        System.out.println("So nha: " + getSoNha() + "\tco so thanh vien: " + getSoThanhVien());
        for (Nguoi ng: dsNguoi) {
            ng.xuat();
        }
    }
}
