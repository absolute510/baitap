/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyende9;

import java.util.Scanner;

public class Manager {
    BatDongSan[] listHouse = new BatDongSan[1000];
    BatDongSan[] listLand = new BatDongSan[1000];
    int n = 0, i = 0, j = 0, m = 0;
    public void nhap(int c){
        if(c==1){
            listHouse[n] = new House("","",0,0,0,"");
            listHouse[n].inputInfo();
            listHouse[n].calcCash();
            n++;
        }
        else{
            listLand[m] = new Land("","",0,0,0,"");
            listLand[m].inputInfo();
            listLand[m].calcCash();
            m++;
        }
    }
    
    public void xuat(){
        System.out.println("danh sach nha: ");
        for(i=0;i<n;i++){
            System.out.println("thong tin nha thu "+i+" ");
            listHouse[i].outputInfo();
        }
        System.out.println("danh sach dat: ");
        for(i=0;i<m;i++){
            System.out.println("thong tin dat thu "+i+" ");
            listLand[i].outputInfo();
        }
    }

    void xuat(int rep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
