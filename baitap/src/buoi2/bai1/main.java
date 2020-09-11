/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN x = new HCN();
        System.out.println("Nhập chiều dài: ");
        x.setChieudai(sc.nextDouble());
        System.out.println("Nhập chiều rộng: ");
        x.setChieurong(sc.nextDouble());
        System.out.println(x.toString());
    }
}
