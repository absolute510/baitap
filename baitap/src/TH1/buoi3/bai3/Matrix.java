/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai3;

import java.util.Scanner;

public class Matrix {
    protected int dong, cot;

    protected int[][] a = new int[100][100];

    public Matrix(int dong, int cot) {
        this.dong = dong;
        this.cot = cot;
    }

    public Matrix() {
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số dòng: ");
        dong = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số cột: ");
        cot = new Scanner(System.in).nextInt();
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhập phần tử ("+i+","+j+"):");
                a[i][j]=sc.nextInt();
            }
        }
    }

    public void Xuat(){
        for (int i = 0; i < dong; i++) {
            for (int j=0;j< cot;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
