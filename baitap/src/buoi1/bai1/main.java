/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

public class main {
    public static int searchDays(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentDay, currentMonth, currentYear;
        int nextDay, nextMonth, nextYear;
        System.out.print("Nhập ngày: ");
        currentDay = sc.nextInt();
        System.out.print("Nhập tháng: ");
        currentMonth = sc.nextInt();
        System.out.print("Nhập năm: ");
        currentYear = sc.nextInt();
        if (currentMonth!=2) {
            if ((currentDay < (searchDays(currentMonth))) && (currentMonth != 12)) {
                nextDay = currentDay + 1;
                nextMonth = currentMonth;
                nextYear = currentYear;
            } else {
                nextDay = 1;
                nextMonth = currentMonth + 1;
                nextYear = currentYear;
            }
            if ((currentDay == 31) && (currentMonth == 12)) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = currentYear + 1;
            }
        }
        else{
            if(((currentYear % 4 == 0) && (currentYear % 100 != 0)) || (currentYear % 400 == 0)){
                if (currentDay<29){
                    nextDay = currentDay + 1;
                    nextMonth = currentMonth;
                    nextYear = currentYear;
                }
                else{
                    nextDay = 1;
                    nextMonth = currentMonth + 1;
                    nextYear = currentYear;
                }
            }
            else{
                if (currentDay<28){
                    nextDay = currentDay + 1;
                    nextMonth = currentMonth;
                    nextYear = currentYear;
                }
                else{
                    nextDay = 1;
                    nextMonth = currentMonth + 1;
                    nextYear = currentYear;
                }
            }
        }
        System.out.println("Ngày hôm sau: "+nextDay+"/"+nextMonth+"/"+nextYear);
    }
}
