/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai2;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
     public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>(3);
        String rep="y";
        Scanner sc = new Scanner(System.in);
        int i;
        while (rep.equals("y")) {
            SinhVien t = new SinhVien();
            t.nhapSV();
            list.add(t);
            System.out.println("Nhập tiếp?(y/n)");
            rep = sc.nextLine();
        }
        System.out.println("MSV\tTÊN\tĐIỂM LT\tĐIỂM TH\tĐIỂM TB");
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
