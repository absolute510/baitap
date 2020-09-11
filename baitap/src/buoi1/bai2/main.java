/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

public class main {
    public static int ktnt(int a, int i){
        if(a==i) return 1;
        if(a%i==0) return 0;
        return ktnt(a,i+1);
    }
    
    public static int printNT(int a){
        if(a<2) return 0;
        if(ktnt(a,2)==1) System.out.println(a+" ");
        return printNT(a-1);
    }
    
    public static int kthh(int a){
        int sum = 0;
        int i;
        for (i=1;i<a;i++){
            if (a%i==0) sum+=i;
        }
        if(sum==a) return 1;
        else return 0;
    }
    
    public static int printHH(int a){
        if(a<6) return 0;
        if(kthh(a)==1) System.out.println(a+" ");
        return printHH(a-1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhap vao so a: ");
        a = sc.nextInt();
        if(ktnt(a,2)==1) System.out.println(a+" la so nguyen to");
        else System.out.println(a+" khong la so nguyen to");
        System.out.println("cac so nguyen to nho hon a: ");
        printNT(a-1);
        if(kthh(a)==1) System.out.println(a+" la so hoan hao");
        else System.out.println(a+" khong la so hoan hao");
        System.out.println("cac so hoan hao nho hon a: ");
        printHH(a-1);
    }
}
