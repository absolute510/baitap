/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi1;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = sc.nextInt();
    }

    public void outputInfo(){
        System.out.println("Tên: "+this.name);
        System.out.println("Tuổi: "+this.age);
    }
}
