/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai5;

import java.util.Scanner;

public class ThiSinh {
    
    private String ID;
    private String name;
    private float mathScore;
    private float physicScore;
    private float chemicalScore;

    private Scanner sc = new Scanner(System.in);

    public ThiSinh() {
    }

    public ThiSinh(String ID, String name, float mathScore, float physicScore, float chemicalScore, Scanner sc) {
        this.ID = ID;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemicalScore = chemicalScore;
        this.sc = sc;
    }

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

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(float physicScore) {
        this.physicScore = physicScore;
    }

    public float getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(float chemicalScore) {
        this.chemicalScore = chemicalScore;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void nhapTS(){
        System.out.println("Nhập mã thí sinh: ");
        this.ID = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm toán: ");
        this.mathScore = sc.nextFloat();
        System.out.println("Nhập điểm lý: ");
        this.physicScore = sc.nextFloat();
        System.out.println("Nhập điểm hoá: ");
        this.chemicalScore = sc.nextFloat();
    }

    public float calcSum(){
        return (this.mathScore+this.physicScore+this.chemicalScore);
    }

    public void xuatTS(){
        System.out.println("Mã: "+this.ID);
        System.out.println("Tên: "+this.name);
        System.out.println("Điểm toán: "+this.mathScore);
        System.out.println("Điểm lý: "+this.physicScore);
        System.out.println("Điểm hoá: "+this.chemicalScore);
        System.out.println("Điểm tổng: "+calcSum());
    }

    @Override
    public String toString(){
        return this.ID+"\t"+this.name+"\t"+this.mathScore+"\t"+this.physicScore+"\t"+this.chemicalScore+"\t"+calcSum();
    }
}
