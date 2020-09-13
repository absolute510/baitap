/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<ThiSinh> list = new ArrayList<>(100);
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Nhập số thí sinh: ");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            ThiSinh t = new ThiSinh();
            t.nhapTS();
            list.add(t);

        }
        float max = list.get(0).calcSum();
        int indexMax = 0;
        for(i=1;i<list.size();i++){
            if (list.get(i).calcSum()>max) {
                max = list.get(i).calcSum();
                indexMax = i;
            }
        }
        System.out.println("Thông tin của thí sinh có tổng điểm cao nhất: ");
        list.get(indexMax).xuatTS();
        Collections.sort(list, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("MTS\tTÊN\tĐIỂM TOÁN\tĐIỂM LÝ\tĐIỂM HOÁ\t ĐIỂM TỔNG");
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
