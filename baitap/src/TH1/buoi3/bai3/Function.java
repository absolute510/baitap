/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai3;

/**
 *
 * @author ic3burG
 */
public class Function {
    Matrix mt1 = new Matrix();
    Matrix mt2 = new Matrix();
    Matrix mtc = new Matrix();

    public void tinh_tong_hieu() {
        int flag = 0;
        System.out.println("Nhập thông số ma trận 1: ");
        mt1.Nhap();

        System.out.println("Nhập thông số ma trận 2: ");
        mt2.Nhap();
        
        if (mt1.dong == mt2.dong) {
            if (mt1.cot == mt2.cot) {

                for (int i = 0; i < mt1.dong; i++, mtc.dong = mt1.dong) {
                    for (int j = 0; j < mt1.cot; j++, mtc.cot = mt1.cot) {
                        mtc.a[i][j] = mt1.a[i][j] + mt2.a[i][j];
                        flag = flag + 1;
                    }
                }
            }
        }
        if (flag != 0) {
            System.out.println("Tổng của hai ma trận vừa nhập là: ");
            mtc.Xuat();
        } else System.out.println("Kích thước ma trận không giống nhau!");

 if (mt1.dong == mt2.dong) {
            if (mt1.cot == mt2.cot) {

                for (int i = 0; i < mt1.dong; i++, mtc.dong = mt1.dong) {
                    for (int j = 0; j < mt1.cot; j++, mtc.cot = mt1.cot) {
                        mtc.a[i][j] = mt1.a[i][j] - mt2.a[i][j];
                        flag = flag + 1;
                    }
                }
            }
        }
        if (flag != 0) {
            System.out.println("Hiệu của hai ma trận vừa nhập là: ");
            mtc.Xuat();
        } else System.out.println("Kích thước ma trận không giống nhau!");
    }

    
}
