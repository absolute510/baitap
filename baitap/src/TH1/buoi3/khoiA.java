/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3;

import java.util.Scanner;

public class khoiA extends ThiSinh{
    private String diemToan;
    private String diemLy;
    private String diemHoa;

    public khoiA() {
        super();
    }

    public khoiA(String diemToan, String diemLy, String diemHoa, String SBD, String HoTen, String DiaChi, String UuTien) {
        super(SBD, HoTen, DiaChi, UuTien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getDiemToan() {
        return diemToan;
    }

    public String getDiemLy() {
        return diemLy;
    }

    public String getDiemHoa() {
        return diemHoa;
    }

    public void setDiemToan(String diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(String diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(String diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap diem toan: ");
        setDiemToan(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem ly: ");
        setDiemLy(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem hoa:");
        setDiemHoa(new Scanner(System.in).nextLine());
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Diem Toan: "+getDiemToan()+"Diem Ly: "+getDiemLy()+"Diem Hoa: "+getDiemHoa());
    }

    @Override
    public String toString() {
        return "khoiA{" +super.toString()+ "diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + '}';
    }
    
    
}
