/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai4;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CustomDate {
    
    private int day;
    private int month;
    private int year;

    public CustomDate() {
    }

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int searchDays(int month){
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

    public void nextDay() {
        int nextDay, nextMonth, nextYear;
        if (this.month!=2) {
            if ((this.day < (searchDays(this.month) )) && (this.month != 12)) {
                nextDay = this.day + 1;
                nextMonth = this.month;
                nextYear = this.year;
            } else {
                nextDay = 1;
                nextMonth = this.month + 1;
                nextYear = this.year;
            }
            if ((this.day == 31) && (this.month == 12)) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = this.year + 1;
            }
        }
        else{
            if(((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0)){
                if (this.day<29){
                    nextDay = this.day + 1;
                    nextMonth = this.month;
                    nextYear = this.year;
                }
                else{
                    nextDay = 1;
                    nextMonth = this.month + 1;
                    nextYear = this.year;
                }
            }
            else{
                if (this.day<28){
                    nextDay = this.day + 1;
                    nextMonth = this.month;
                    nextYear = this.year;
                }
                else{
                    nextDay = 1;
                    nextMonth = this.month + 1;
                    nextYear = this.year;
                }
            }
        }
        System.out.println("Ngày hôm sau: "+nextDay+"/"+nextMonth+"/"+nextYear);
    }
    
    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        this.day = sc.nextInt();
        System.out.println("Nhập tháng: ");
        this.month = sc.nextInt();
        System.out.println("Nhập năm: ");
        this.year = sc.nextInt();
    }

    public void praseDate() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập định dạng muốn chuẩn hoá: ");
        SimpleDateFormat sourceformat = new SimpleDateFormat("dd/mm/yyyy");
        Date source = sourceformat.parse(this.day+"/"+this.month+"/"+this.year);
        String prase;
        prase = sc.nextLine();
        SimpleDateFormat praseformat = new SimpleDateFormat(prase);
        try {
            System.out.println("Kết quả: " + praseformat.format(source));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void outputDate(){
        System.out.println("Ngày đã nhập: "+this.day+"/"+this.month+"/"+this.year);
    }
}
