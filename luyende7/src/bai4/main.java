/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class main {
    public static void nhapMT(int a[][],int n,int m){
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("nhap vao phan tu a["+i+"]["+j+"]");
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void xuatMT(int a[][],int n, int m){
        int i,j;
        System.out.println("ma tran ban nhap vao: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void timMax(int a[][],int n,int m, int max){
        int i,j;
        int imax = 0;
        int jmax = 0;
        max = a[0][0];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if (max<a[i][j]) {
                    max = a[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("phan tu lon nhat: a["+imax+"]["+jmax+"] = "+max);
    }
    
    public static int ktnt(int a){
        if(a<2) return 0;
        int i;
        for(i=2;i<=sqrt(a);i++){
            if (a%i==0) return 0;
        }
        return 1;
    }
    
    public static void xuatMTNT(int a[][],int n,int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(ktnt(a[i][j])==1) System.out.print(a[i][j]+"\t");
                else System.out.print("0\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void sapxep(int a[][],int n,int m){
        int i,j,k,temp;
        for(j=0;j<m;j++){
            for(i=0;i<n-1;i++){
                for(k=i+1;k<n;k++){
                    if(a[i][j]>a[k][j]){
                        temp = a[i][j];
                        a[i][j] = a[k][j];
                        a[k][j] = temp;
                    }
                }
            }
        }
        System.out.println("ma tran sau sap xep:");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        int a[][];
        a = new int[100][100];
        System.out.print("nhap vao so hang: ");
        n = sc.nextInt();
        System.out.print("nhap vao so cot: ");
        m = sc.nextInt();
        nhapMT(a,n,m);
        xuatMT(a,n,m);
        timMax(a,n,m,0);
        xuatMTNT(a,n,m);
        sapxep(a,n,m);
    }
}
