/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author ic3burG
 */
public class client {
    public final static String SERVER_ID = "127.0.0.1";
    public final static int SERVER_PORT = 7;
    public final static byte[] BUFFER = new byte[2048];
    
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try{
            Scanner sc = new Scanner(System.in);
            ds = new DatagramSocket();
            System.out.println("Started");
            InetAddress server = InetAddress.getByName(SERVER_ID);
            while (true) {                
                System.out.println("nhap so can kiem tra");
                String a = sc.nextLine();
                byte[] data = a.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length,server,SERVER_PORT);
                ds.send(dp);
                DatagramPacket incoming = new DatagramPacket(BUFFER, BUFFER.length);
                ds.receive(incoming);
                System.out.println("received: "+ new String(incoming.getData(),0,incoming.getLength()));
            }
        }
        catch(IOException e){
            System.err.println(e);
        }
        finally{
            if(ds != null){
                ds.close();
            }
        }
    }
    
}
