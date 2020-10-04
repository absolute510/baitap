/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class processStudent {

    private static ArrayList<Student> list = new ArrayList<Student>(10000);
    public static void  createList(){
        String rep="y";
        Scanner sc = new Scanner(System.in);
        int i;
        while (rep.equals("y")) {
            Student t = new Student();
            t.inputInfo();
            list.add(t);
            System.out.println("Nhập tiếp?(y/n)");
            rep = sc.nextLine();
        }
    }
    public static void read(String path){
        ReadFromBinaryFile.docFile(path);
    }

    public static void write(String path){
        WriteToBinaryFile.ghiFile(list,path);
    }
    public static void outputList(){
        int i;
        for(i=0;i<list.size();i++){
            list.get(i).outputInfo();
        }
    }
}
