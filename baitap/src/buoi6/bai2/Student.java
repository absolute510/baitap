/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6.bai2;

import java.util.Date;

/**
 *
 * @author ic3burG
 */
public class Student extends person{
    private String MaSV;
    protected String Mail;
    private float Diem;

    public Student() {
    }

    public Student(String MaSV, String Mail, float Diem, String HoTen, String DiaChi, String GioiTinh, Date NgaySinh) {
        super(HoTen, DiaChi, GioiTinh, NgaySinh);
        this.MaSV = MaSV;
        this.Mail = Mail;
        this.Diem = Diem;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getMail() {
        return Mail;
    }

    public float getDiem() {
        return Diem;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    @Override
    public String toString() {
        return "student{" + super.toString() + "MaSV=" + MaSV + ", Mail=" + Mail + ", Diem=" + Diem + '}';
    }
}
