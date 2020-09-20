/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi implements Comparable<SinhVien>{
    protected String ID;
    protected float avr;

    public SinhVien(String name, int bornyear) {
        super(name, bornyear);
    }

    public SinhVien() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getAvr() {
        return avr;
    }

    public void setAvr(float avr) {
        this.avr = avr;
    }

    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        this.ID = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        this.avr = sc.nextFloat();
    }

    public void outputInfo(){
        super.outputInfo();
        System.out.println("Mã sinh viên: "+this.ID);
        System.out.println("Điểm trung bình: "+this.avr);
    }
    public int compareTo(SinhVien SV) {
        if (this.avr == SV.avr)
            return 0;
        else if (this.avr > SV.avr)
            return -1;
        else
            return 1;
    }
}
