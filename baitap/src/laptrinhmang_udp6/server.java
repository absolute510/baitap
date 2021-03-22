/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_udp6;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 *
 * @author ic3burG
 */
public class server {
    public static void main(String[] args) throws IOException{
        byte[] buffer = new byte[2048];
        ArrayList<word> tudien = new ArrayList<>();
        DatagramSocket server = new DatagramSocket(10);
        
        DatagramPacket request = new DatagramPacket(buffer, buffer.length);
        server.receive(request);
        String temp = new String(request.getData(),0,request.getLength());
        System.out.println(temp);
        try{
                FileReader fr = new FileReader("tu_dien.txt");
                BufferedReader br = new BufferedReader(fr);
                String current;
                    while((current=br.readLine())!=null){
                        word Word = new word();
                        String[] result = current.split("\\$");
                        Word.setVN(result[1]);
                        Word.setEN(result[0]);
                        tudien.add(Word);
                        String currentItem = tudien.toString();
                        System.out.println(currentItem);
                }
                br.close();
                fr.close();
                System.out.println("read ok");
        }
        catch(IOException e){
        }
        while (true) {            
            if(temp.equals("1")){
                buffer = new byte[2048];
                DatagramPacket askWord = new DatagramPacket(buffer, buffer.length);
                server.receive(askWord);
                String keyWord = new String(askWord.getData(),0,askWord.getLength());
                
                System.out.println(keyWord);
                for (int i = 0; i < tudien.size(); i++) {
                    if (tudien.get(i).getEN().equals(keyWord)) {
                        String a = tudien.get(i).getVN().toString();
                        System.out.println(a);
                        buffer = new byte[2048];
                        buffer = a.getBytes();
                        DatagramPacket sendWord = new DatagramPacket(buffer,buffer.length,request.getAddress(),request.getPort());
                        server.send(sendWord);
                    }
                }
            }            
            if(temp.equals("2")){
                buffer = new byte[2048];
                DatagramPacket askWord = new DatagramPacket(buffer, buffer.length);
                server.receive(askWord);
                String keyWord = new String(askWord.getData(),0,askWord.getLength());
                
                System.out.println(keyWord);
                for (int i = 0; i < tudien.size(); i++) {
                    if (tudien.get(i).getVN().equals(keyWord)) {
                        String a = tudien.get(i).getEN().toString();
                        System.out.println(a);
                        buffer = new byte[2048];
                        buffer = a.getBytes();
                        DatagramPacket sendWord = new DatagramPacket(buffer,buffer.length,request.getAddress(),request.getPort());
                        server.send(sendWord);
                    }
                }
            }
        }
    }
}
