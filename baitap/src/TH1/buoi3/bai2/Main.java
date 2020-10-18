/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai2;

import java.util.Scanner;

public class Main {
    
    public static void Menu(){
        System.out.println("1.Nhap danh sach\n2.Xuat danh sach\3.Ghi danh sach vao file\n4.Doc danh sach tu file\n5.Thoat");
        System.out.println("Nhap lua chon: ");
    }
    
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        String c;
        int rep = 0;
        while(rep!=5){
            Menu();
            rep = sc.nextInt();
            switch(rep){
                case 1:
                    ql.nhap();
                    break;
                case 2:
                    ql.xuat();
                    break;
                case 3:
                    ql.GhiFile();
                    break;
                case 4:
                    ql.DocFile();
                    break;
            }
        }
    }
}
