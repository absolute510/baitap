/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VacXinTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Absolute
 */
public class VacXinClient {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Socket client = new Socket("127.0.0.1", 10);
        while (true) {
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap thong diep: ");
            String input = sc.nextLine();
            dos.writeUTF(input);
            System.out.println(dis.readUTF());
        }
    }
}
