/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_tcp3;

import buoi2.bai8.Main;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class client {
    public static void menu(){
        System.out.println("1. tu dien anh - viet");
        System.out.println("2. tu dien viet - anh");
        System.out.println("3. thoat");
        System.out.println("lua chon: ");
    }
    
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("127.0.0.1", 10); 
        while(true){
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String input;
            menu();
            String temp = sc.nextLine();
            dos.writeUTF(temp);
            
            
                switch(temp){   
                    case "1":
                        System.out.println("Write the word: ");
                        input = sc.nextLine();
                        dos.writeUTF(input);
                        System.out.println(dis.readUTF());
                        break;
                
                    case "2":
                        System.out.println("nhap tu: ");
                        input = sc.nextLine();
                        dos.writeUTF(input);
                        dis.readUTF();
                        System.out.println(dis.readUTF());
                        break;
                }
            }
        }
    }

