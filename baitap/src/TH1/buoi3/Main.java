/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3;

import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class Main {
    static TuyenSinh TS = new TuyenSinh();
    public static void Menu(){
        System.out.println("1.Nhap thi sinh");
        System.out.println("2.Hien thi danh sach thi sinh");
        System.out.println("3.Tim kiem thi sinh bang SBD");
        System.out.println("4.Thoat");
        System.out.println("Lua chon: ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = 0;
        String c;
        while(rep!=4){
            Menu();
            rep = sc.nextInt();
            switch(rep){
                case 1:
                    System.out.println("Chon khoi: ");
                    sc.nextLine();
                    c = sc.nextLine();
                    TS.nhap(c);
                    break;
                case 2:
                    TS.xuat();
                    break;
                case 3:
                    TS.timkiem();
                    break;
            }
        }
    }
}
