/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyende7;
import java.util.Scanner;

public class Luyende7 {
    public static void menu(){
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap day so\n2. Tim phan tu nho nhat\n3. Tinh Tich cac phan tu cua day\n4. Ket thuc");
    }
    public static int Nhap(int a[], int i, int n){
        Scanner sc = new Scanner(System.in);
        if (i>=n) return 0;
        System.out.println("nhap phan tu thu"+i+" ");
        a[i] = sc.nextInt();
        return Nhap(a,i+1,n);
    }
    public static int timMin(int a[], int i, int n, int min){
        if(i>=n) return min;
        if(a[i]<min) min = a[i];
        return timMin(a,i+1,n,min);
    }
    public static int Tich(int a[],int i,int n, int mul){
        if (i>=n) return mul;
        return Tich(a,i+1,n,mul*a[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = 0;
        int n = 0;
        int a[] = new int[100];
        while(rep!=4){
            menu();
            rep = sc.nextInt();
            switch(rep){
                case 1:
                    System.out.println("nhap vao so phan tu cua day: ");
                    n = sc.nextInt();
                    Nhap(a,0,n);
                    break;
                case 2:
                    System.out.println("phan tu nho nhat: "+timMin(a,0,n,a[0]));
                    break;
                case 3:
                    System.out.println("Tich cua day Mul = "+Tich(a,0,n,1));
                    break;
            }
        }
    }
    
}
