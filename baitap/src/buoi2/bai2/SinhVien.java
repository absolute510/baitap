/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai2;

import java.util.Scanner;

public class SinhVien {
    
    private String ID;
    private String name;
    private float theoryScore;
    private float practiceScore;

    private Scanner sc = new Scanner(System.in);

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void nhapSV(){
        System.out.println("Nhập mã sinh viên: ");
        this.ID = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        this.theoryScore = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        this.practiceScore = sc.nextFloat();
    }

    public float calcAverage(){
        return (this.theoryScore+this.practiceScore)/2;
    }

    @Override
    public String toString(){
        return this.ID+"\t"+this.name+"\t"+this.theoryScore+"\t"+this.practiceScore+"\t"+calcAverage();
    }
}
