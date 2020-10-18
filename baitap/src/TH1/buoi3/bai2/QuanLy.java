/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai2;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<GiaoVien> nv = new ArrayList<>();    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String c = "y";
        while(c.equals("y")){ 
            GiaoVien gv = new GiaoVien();
            gv.nhap();
            nv.add(gv);
            System.out.println("Nhap tiep Y/N?");
            c = sc.nextLine();
        }
    }
    
    public void xuat(){
        for (int i=0;i<=nv.size();i++){
            nv.get(i).xuat();
        }
    }
    
    public void GhiFile(){
        try{
            FileOutputStream fos = new FileOutputStream("GiaoVien.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for(GiaoVien t : nv ){
                String target;
                target = t.getHoTen() + "$"
                        +t.getNamSinh() + "$"
                        +t.getQueQuan() + "$"
                        +t.getLuongCB() + "$"
                        +t.getThuong() + "$"
                        +t.getPhat()+ "$"
                        +t.getLuong();
                bw.write(t.toString());
            }
            bw.close();
            osw.close();
            fos.close();
        }
        catch(HeadlessException | IOException e){
            
        }
    }
    
    public void DocFile(){
        nv = DocTuTextFile.docFile("GiaoVien.txt");
        System.out.println("xong!");
    }
}
