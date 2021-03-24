/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_tcp3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ic3burG
 */
public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(10);
        Socket myClient = server.accept();
        
        ArrayList<Word> dictionary = new ArrayList<>();
        try {
            FileReader fr = new FileReader("tu_dien.txt");
            BufferedReader br = new BufferedReader(fr);
            String current;
            while((current = br.readLine())!=null){
                Word word = new Word();
                String[] result = current.split("\\$");
                word.setEN(result[0]);
                word.setVN(result[1]);
                dictionary.add(word);
                String currentItem = dictionary.toString();
                System.out.println("read ok");
            }
        } catch (Exception e) {
        }
        
        while (true) {            
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            String temp = dis.readUTF();
            String input;
            
            if(temp.equals("1")){
                input = dis.readUTF();
                System.out.println(input);
                for(int i = 0;i<dictionary.size();i++){
                    if(dictionary.get(i).getEN().equals(input)){
                        String output = dictionary.get(i).getVN().toString();
                        dos.writeUTF(output);
                    }
                }
            }
            
            if (temp.equals("2")) {
                input = dis.readUTF();
                System.out.println(input);
                for(int i = 0;i<dictionary.size();i++){
                    if(dictionary.get(i).getVN().equals(input)){
                        String output = dictionary.get(i).getEN().toString();
                        dos.writeUTF(output);
                    }
                }
            }
        }
    }
}
