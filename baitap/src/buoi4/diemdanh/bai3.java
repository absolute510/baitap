/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.diemdanh;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds=new ArrayList<String>(10);
        String rep="y";
        while (rep.equals("y")){
            System.out.println("Nhập chuỗi cần thêm: ");
            ds.add(sc.nextLine());
            System.out.print("Nhập tiếp?(y/n) ");
            rep=sc.nextLine();
        }
        boolean kq=WriteToTextFile.ghiFile(ds, "d:\\file.txt");
        if (kq)
            System.out.println("Thanh cong");
        else
            System.out.println("That bai");
        System.out.println("File bạn đã nhập: ");
        ArrayList<String> dsout=new ArrayList<String>(100);
        dsout = ReadFromTextFile.docFile("d:\\file.txt");
        int i;
        for (i=0;i<dsout.size();i++) {
            System.out.println(dsout.get(i));
        }
    }
}
