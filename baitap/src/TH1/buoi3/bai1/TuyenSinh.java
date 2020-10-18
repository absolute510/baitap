/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai1;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    ArrayList<ThiSinh> ts = new ArrayList();
    int i;
    public void nhap(String c){
        if(c.equals("A")){
            khoiA kA = new khoiA();
            kA.nhap();
            ts.add(kA);
        } else {
            if(c.equals("B")){
                khoiB kB = new khoiB();
                kB.nhap();
                ts.add(kB);
            }
            if(c.equals("C")){
                khoiC kC = new khoiC();
                kC.nhap();
                ts.add(kC);
            }
        }
    }
    
    public void xuat(){
        System.out.println("Danh sach thi sinh: ");
        for(i=0;i<=ts.size();i++){
            ts.get(i).xuat();
        }
    }
    
    public void LuuFile(){
        try{
            FileOutputStream fos = new FileOutputStream("ThiSinh.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for(ThiSinh t : ts ){
                bw.write(t.toString());
            }
            bw.close();
            osw.close();
            fos.close();
        }
        catch(HeadlessException | IOException e){
            
        }
    }
    
    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        String s;
        int check = 0;
        System.out.println("Nhap SBD can tim: ");
        s = sc.nextLine();
        for(ThiSinh t : ts){
            if(ts.get(i).equals(t)){
                ts.get(i).toString();
                check = 1;
            }
        }
        if (check == 0) 
            System.out.println("khong tim thay sbd!");         
    }
}
