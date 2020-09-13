/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai6;

public class Main {
    public static void main(String[] args) {
        DaThuc p = new DaThuc();
        DaThuc q = new DaThuc();
        System.out.println("Nhập đa thức thứ nhất: ");
        p.inputInfo();
        p.outputInfo();
        System.out.println("Nhập đa thức thứ hai: ");
        q.inputInfo();
        q.outputInfo();
        System.out.println("Kết quả cộng 2 đa thức: ");
        p.addPolynomial(q.getStage(),q.getEntry());
        System.out.println("Kết quả trừ 2 đa thức: ");
        p.subtractPolynomial(q.getStage(), q.getEntry());
    }
}
