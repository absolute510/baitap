/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDanPho {
    private String tenTDP;
    private int soHoDan;
    private ArrayList<HoDan> dshd = new ArrayList<>();

    public ToDanPho(){}

    public ToDanPho(String tenTDP, int soHoDan, ArrayList<HoDan> dshd) {
        this.tenTDP = tenTDP;
        this.soHoDan = soHoDan;
        this.dshd = dshd;
    }

    public String getTenTDP() {
        return tenTDP;
    }

    public void setTenTDP(String tenTDP) {
        this.tenTDP = tenTDP;
    }

    public int getSoHoDan() {
        return soHoDan;
    }

    public void setSoHoDan(int soHoDan) {
        this.soHoDan = soHoDan;
    }

    public ArrayList<HoDan> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<HoDan> dshd) {
        this.dshd = dshd;
    }

    public void nhap(){
        System.out.println("Nhap ten to dan pho: ");
        setTenTDP(new Scanner(System.in).nextLine());
        System.out.println("So ho dan: ");
        setSoHoDan(new Scanner(System.in).nextInt());
        for(int i=0; i<getSoHoDan(); i++){
            System.out.println("Ho dan thu " + (i+1));
            HoDan hd = new HoDan();
            hd.nhap();
            dshd.add(hd);
        }
    }

    public void xuat(){
        System.out.println("Ten to dan pho: " + getTenTDP() + "\tco so ho dan: " + getSoHoDan());
        for (HoDan hd: dshd) {
            hd.xuat();
        }
    }
}
