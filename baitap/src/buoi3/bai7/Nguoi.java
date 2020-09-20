/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai7;

import java.util.Scanner;

public class Nguoi {
    private String hoten;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap(){
        System.out.println("Nhap ten: ");
        setHoten(new Scanner(System.in).nextLine());
        System.out.println("Nhap tuoi: ");
        setTuoi(new Scanner(System.in).nextInt());
    }

    public void xuat(){
        System.out.println("Ho ten: " + getHoten() + "\ttuoi: " + getTuoi());
    }
}
