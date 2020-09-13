/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai3;

import java.util.Scanner;
import static  java.lang.Math.sqrt;

public class TamGiac {
     private double a;
    private double b;
    private double c;

    public TamGiac() {
    }

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        this.a = sc.nextDouble();
        System.out.println("Nhập cạnh b: ");
        this.b = sc.nextDouble();
        System.out.println("Nhập cạnh c: ");
        this.c = sc.nextDouble();
    }

    public int checkTriangleType(){
        int kq=0;
        if (((this.a + this.b) > this.c) && ((this.a + this.c) > this.b) && ((this.b + this.c) > this.a)) {


            if ((this.a == this.b) && (this.b == this.c)) {
                kq=4;
            }
            else {
                if ((this.a == this.b) || (this.b == this.c) || (this.c == this.a)) {
                    kq = kq + 3;
                }

                if ((this.a == this.b) || (this.b == this.c) || (this.c == this.a)) {
                    if ( (this.a == this.b * sqrt(2.0)) || (this.b == this.c * sqrt(2.0)) ||(this.c == this.a * sqrt(2.0)) )
                        kq = kq + 2;
                }

                if ((this.a * this.a == (this.b * this.b + this.c * this.c)) || (this.b * this.b == (this.a * this.a + this.c * this.c)) || (this.c * this.c == (this.b * this.b + this.a * this.a))) {
                    kq = kq + 2;
                }
                else {
                    if ((this.a != this.b) && (this.b != this.c) && (this.c != this.a)) {
                        kq = 1;
                    }
                }
            }
        }


        if (kq==4){
            System.out.println("Đây là tam giác đều !");
        }
        if (kq==3){
            System.out.println("Đây là tam giác cân !");
        }
        if (kq==2){
            System.out.println("Đây là tam giác vuông !");
        }
        if (kq==5){
            System.out.println("Đây là tam giác vuông cân !");
        }
        if (kq==1){
            System.out.println("Đây là tam giác thường !");
        }
        if (kq==0){
            System.out.println("Đây không là tam giác !");
        }
        return kq;
    }

    public double calcPerimeter(){
        return this.a + this.b + this.c;
    }

    public double calcArea(){
        double p=calcPerimeter()/2;
        return sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    public void outputInfo(){
        System.out.println("Cạnh thứ nhất: "+this.a);
        System.out.println("Cạnh thứ hai: "+this.b);
        System.out.println("Cạnh thứ ba: "+this.c);
        int n = checkTriangleType();
        if (n != 0) {
            System.out.println("Chu vi: " + calcPerimeter());
            System.out.println("Diện tích: " + calcArea());
        }
    }
}
