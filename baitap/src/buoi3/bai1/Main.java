/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    enum rank{
        yeu(2),trungbinh(5), kha(7) ,gioi(10);
        private int value;
        private rank(int value){
            this.value=value;
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>(100);
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Nhập số thí sinh: ");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            SinhVien t = new SinhVien();
            t.inputInfo();
            list.add(t);
        }
        for(i=0;i<n;i++) {
            SinhVien t = new SinhVien();
            list.get(i).outputInfo();
            for(rank r:rank.values()){
                if (list.get(i).getAvr()<r.value){
                    System.out.println("Xếp loại: "+r);
                    break;
                }
            }

        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv.getID() + " " + sv.getName() + " " + sv.getAvr());
        }
    }
}
