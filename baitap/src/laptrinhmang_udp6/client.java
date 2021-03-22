/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_udp6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class client {
    public static void menu(){
        System.out.println("1.tu dien anh-viet");
        System.out.println("2.tu dien viet-anh");
        System.out.println("3.thoat");
        System.out.println("lua chon: ");
    }
    
    public static void main(String[] args) {
        byte[] buffer = new byte[2048];
        Scanner sc = new Scanner(System.in);
        try{
            DatagramSocket client = new DatagramSocket();
            InetAddress IP = InetAddress.getByName("localhost");
            menu();
            int a = sc.nextInt();
            sc.nextLine();
            String b = a +"";
            buffer = b.getBytes();
            DatagramPacket request = new DatagramPacket(buffer, buffer.length,IP,10);
            client.send(request);
            while (a!=3) {                
                switch(a){
                case 1:
                    buffer = new byte[2048];
                    System.out.println("nhap tu can tra: ");
                    String keyWord = sc.nextLine();
                    buffer = keyWord.getBytes();
                    DatagramPacket sendWord = new DatagramPacket(buffer, buffer.length,IP,10);
                    client.send(sendWord);
                    
                    DatagramPacket anwser = new DatagramPacket(buffer,buffer.length);
                    client.receive(anwser);
                    System.out.println(new String(anwser.getData(),0,anwser.getLength()));
                    break;
                case 2:
                    buffer = new byte[2048];
                    System.out.println("nhap tu can tra: ");
                    keyWord = sc.nextLine();
                    buffer = keyWord.getBytes();
                    sendWord = new DatagramPacket(buffer, buffer.length,IP,10);
                    client.send(sendWord);
                    
                    anwser = new DatagramPacket(buffer,buffer.length);
                    client.receive(anwser);
                    System.out.println(new String(anwser.getData(),0,anwser.getLength()));
                    break;
                }
                
            }
        }
        catch(IOException e){
            
        }
    }
}
