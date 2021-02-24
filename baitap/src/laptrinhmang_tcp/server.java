/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class server {
    public static void main(String[] args)throws IOException{
        ServerSocket server = new ServerSocket(7);
        Socket my_client=server.accept();
        DataInputStream dis = new DataInputStream(my_client.getInputStream());
        DataOutputStream dos = new DataOutputStream(my_client.getOutputStream());
        String input = dis.readUTF();
        int n = Integer.parseInt(input);
        if (n%2==0){
            dos.writeUTF(n + " la so chan");
        }
        else dos.writeUTF(n + " la so le");
    }
}
