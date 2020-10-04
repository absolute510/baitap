/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi1;

/**
 *
 * @author ic3burG
 */
public class Main {
    public static void main(String[] args) {
        processStudent.createList();
        processStudent.write("sinhvien.dat");
        System.out.println("Đọc file");
        processStudent.read("sinhvien.dat");
        processStudent.outputList();
    }
}
