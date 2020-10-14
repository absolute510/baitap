/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3;

import java.util.Scanner;

public class khoiB extends ThiSinh{
    private String diemToan;
    private String diemHoa;
    private String diemSinh;

    public khoiB() {
        super();
    }

    public khoiB(String diemToan, String diemHoa, String diemSinh, String SBD, String HoTen, String DiaChi, String UuTien) {
        super(SBD, HoTen, DiaChi, UuTien);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemSinh = diemSinh;
    }

    public String getDiemToan() {
        return diemToan;
    }

    public String getDiemHoa() {
        return diemHoa;
    }

    public String getDiemSinh() {
        return diemSinh;
    }

    public void setDiemToan(String diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemHoa(String diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setDiemSinh(String diemSinh) {
        this.diemSinh = diemSinh;
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap diem toan: ");
        setDiemToan(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem hoa:");
        setDiemHoa(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem sinh: ");
        setDiemSinh(new Scanner(System.in).nextLine());
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Diem Toan: "+getDiemToan()+"Diem Hoa: "+getDiemHoa()+"Diem Sinh: "+getDiemSinh());
    }

    @Override
    public String toString() {
        return "khoiB{" +super.toString() + "diemToan=" + diemToan + ", diemHoa=" + diemHoa + ", diemSinh=" + diemSinh + '}';
    }
}
