/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai6;

import java.util.Scanner;

public class HSHocSinh {
    
    private String lop;
    private int khoaHoc,kyHoc;
    private Nguoi hs = new Nguoi();

    public HSHocSinh() {
    }

    public HSHocSinh(String lop, int khoaHoc, int kyHoc, Nguoi hs) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
        this.hs = hs;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        setHs(new Nguoi());
        System.out.println("Nhap lop: ");
        setLop(sc.nextLine());
        System.out.println("Nhap khoa hoc:");
        setKhoaHoc(sc.nextInt());
        System.out.println("Nhap ky hoc:");
        setKyHoc(sc.nextInt());
    }
    
    public void xuat(){
        getHs().xuat();
        System.out.println("lop:" + getLop());
        System.out.println("khoa hoc:" + getKhoaHoc());
        System.out.println("ky hoc:" + getKyHoc());
    }
    
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public Nguoi getHs() {
        return hs;
    }

    public void setHs(Nguoi hs) {
        hs.nhap();
        this.hs = hs;
    }
}
