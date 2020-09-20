/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai4;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
        super();
    }

    public KySu(String nganhDaoTao, String hoten, String gioiTinh, String diaChi, int namSinh) {
        super(hoten, gioiTinh, diaChi, namSinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap nganh dao tao: ");
        setNganhDaoTao(new Scanner(System.in).nextLine());
    }
    
    public void xuat(){
        super.xuat();
        System.out.println(" nganh dao tao:  " + getNganhDaoTao());
    }
    
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
