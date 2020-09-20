/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        ArrayList<HSHocSinh> danhSachHocSinh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hoc sinh: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("Thong tin hoc sinh thu" + (i+1));
            HSHocSinh hs = new HSHocSinh();
            hs.nhap();
            danhSachHocSinh.add(hs);
        }
        
        System.out.println("Cac hoc sinh sinh nam 1985 va que o Thai Nguyen:");
        int dem1 = 0;
        for (HSHocSinh hSHocSinh : danhSachHocSinh) {
            if(hSHocSinh.getHs().getNgaySinh().compareTo("1985") == 0
                    && hSHocSinh.getHs().getQueQuan().compareToIgnoreCase("thai nguyen") == 0){
                hSHocSinh.xuat();
                dem1++;
            }
        }
        if(dem1 == 0){
            System.out.println("Khong co hoc sinh sinh nam 1985 va que Thai Nguyen.");
        }
        
        System.out.println("Cac hoc sinh lop 10A1:");
        int dem2 = 0;
        for (HSHocSinh hSHocSinh : danhSachHocSinh) {
            if(hSHocSinh.getLop().compareToIgnoreCase("10A1") == 0){
                hSHocSinh.xuat();
                dem2++;
            }
        }
        if(dem2 == 0){
            System.out.println("Khong co hoc sinh lop 10A1 trong danh sach.");
        }
    }
}
