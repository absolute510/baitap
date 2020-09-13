/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai8;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        System.out.println("5.Thoát");
        System.out.println("Lựa chọn: ");
    }
    public static void main(String[] args) {
        Fact ps = new Fact();
        Fact ps2 = new Fact();
        System.out.println("Nhập phân số thứ nhất");
        ps.nhapPs();
        System.out.println("Nhập phân số thứ hai");
        ps2.nhapPs();
        int rep=0;
        while (rep!=5){
            menu();
            rep = sc.nextInt();
            switch (rep){
                case 1 :
                    ps.congPs(ps2.getTs(), ps2.getMs());
                    break;
                case 2 :
                    ps.truPs(ps2.getTs(), ps2.getMs());
                    break;
                case 3 :
                    ps.nhanPs(ps2.getTs(),ps2.getMs());
                    break;
                case 4 :
                    ps.chiaPs(ps2.getTs(), ps2.getMs());
                    break;
            }
        }
    }
}
