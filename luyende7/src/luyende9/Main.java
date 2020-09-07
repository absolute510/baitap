package luyende9;

import java.util.Scanner;

public class Main {
    static Manager m = new Manager();
    public static void menu(){
        System.out.println("--------Menu-------");
        System.out.println("1.Nhap thong tin nha");
        System.out.println("2.nhap thong tin dat");
        System.out.println("3.xuat danh sach");
        System.out.println("4.ket thuc");
        System.out.println("nhap lua chon cua ban: ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rep =0;
        while(rep!=4){
            menu();
            rep = sc.nextInt();
            switch(rep){
                case 1:
                    m.nhap(rep);
                    break;
                case 2:
                    m.nhap(rep);
                    break;
                case 3:
                    m.xuat();
                    break;
            }
        }
    }
}
