/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

public class main { 
    public static int nhap(int[] a){
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Nhâp số phần tử: ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+i+" : ");
            a[i] = sc.nextInt();
        }
        return n;
    }
    public static void xuat(int[] a, int n){
        int i;
        System.out.println("Dãy số: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    public static void sapxep(int[] a, int n){
        int i,j,t;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++){
                if (a[i]<a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        int n=nhap(a);
        int i;
        for(i=0;i<n;i++){
            b[i]=a[i];
        }
        xuat(a,n);
        sapxep(b,n);
        xuat(b,n);
        for(i=0;i<n;i++){
            if(a[i]==b[n-1]) break;
        }
        System.out.println("Số lớn nhất: "+b[n-1]);
        System.out.println("Vị trí: "+i);
        for(i=0;i<n;i++){
            if(a[i]==b[n-2]) break;
        }
        System.out.println("Số lớn thứ hai: "+b[n-2]);
        System.out.println("Vị trí: "+i);
        System.out.println("Nhập số cần chèn: ");
        b[n]= sc.nextInt();
        a[n]=b[n];
        sapxep(b,n+1);
        xuat(b,n+1);
    }
}
