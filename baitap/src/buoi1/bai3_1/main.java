/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_1;

import java.util.Scanner;

public class main {
    public static int countUpper(String s){
        int i,d=0;
        for (i=0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))) d++;
        }
        return d;
    }

    public static int countLower(String s){
        int i,d=0;
        for (i=0;i<s.length();i++){
            if (Character.isLowerCase(s.charAt(i))) d++;
        }
        return d;
    }

    public static int countNumber(String s){
        int i,d=0;
        for (i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))) d++;
        }
        return d;
    }
    
    public static int countSpecialChar(String s){
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
        int i,d=0;
        for (i=0;i<s.length();i++){
            if (specialCharacters.contains(Character.toString(s.charAt(i)))) d++;
        }
        return d;
    }

    public static int countSpace(String s){
        int i,d=0;
        for (i=0;i<s.length();i++){
            if (Character.isSpaceChar(s.charAt(i))) d++;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập chuỗi: ");
        s = sc.nextLine();
        System.out.println("Số chữ cái in hoa: "+countUpper(s));
        System.out.println("Số chữ cái in thường: "+countLower(s));
        System.out.println("Số chữ số: "+countNumber(s));
        System.out.println("Số ký tự đặc biệt: "+countSpecialChar(s));
        System.out.println("Số khoảng trống: "+countSpace(s));
    }
}
