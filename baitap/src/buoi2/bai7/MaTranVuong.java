/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai7;

import java.util.Scanner;

public class MaTranVuong {
     private int stage;
    private int[][] value = new int[100][100];

    public MaTranVuong() {
    }

    public MaTranVuong(int stage, int[][] value) {
        this.stage = stage;
        this.value = value;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bậc của ma trận vuông: ");
        this.stage = sc.nextInt();
        System.out.println("Nhập các phần tử của ma trận: ");
        int i,j;
        for(i=0;i<this.stage;i++){
            for(j=0;j<this.stage;j++){
                System.out.println("Nhập giá trị ở toạ độ ["+i+"]["+j+"]: ");
                this.value[i][j] = sc.nextInt();
            }
        }
    }

    public int sumOfMainDiagonal(){
        int i,j,sum=0;
        for(i=0;i<this.stage;i++){
            sum += this.value[i][i];

        }
        return sum;
    }

    public int sumOfSubDiagonal(){
        int i,j,sum=0;
        for(i=0;i<this.stage;i++){
            sum += this.value[i][this.stage-i-1];
        }
        return sum;
    }

    public void outputInfo(){
        System.out.println("Bậc: "+this.stage);
        int i,j;
        System.out.println("Giá trị: ");
        for(i=0;i<this.stage;i++){
            for(j=0;j<this.stage;j++){
                System.out.print(this.value[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Tổng đường chéo chính: "+sumOfMainDiagonal());
        System.out.println("Tổng đường chéo phụ: "+sumOfSubDiagonal());
    }
}
