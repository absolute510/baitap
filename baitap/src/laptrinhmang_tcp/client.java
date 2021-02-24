/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class client {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Socket client = new Socket("127.0.0.1", 7);
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so kiem tra: ");
        String input = sc.nextLine();
        dos.writeUTF(input);
        System.out.println(dis.readUTF());
    }
}
