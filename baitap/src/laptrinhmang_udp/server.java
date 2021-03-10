/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ic3burG
 */
public class server {
    public final static int SERVER_PORT = 7;
    public final static byte[] BUFFER = new byte[2048];
    
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try{
            System.out.println("bring to port"+ SERVER_PORT+",...please wait...");
            ds = new DatagramSocket(SERVER_PORT);
            
            while (true) {                
                DatagramPacket incoming = new DatagramPacket(BUFFER, BUFFER.length);
                ds.receive(incoming);
                
                String message = new String(incoming.getData(), 0, incoming.getLength());
                System.out.println("received"+message);
                int a = Integer.parseInt(message);
                if(a%2==0){
                    message = "so chan";
                }
                else{
                    message = "so le";
                }
                byte[] messageSend = message.getBytes();
                DatagramPacket outstanding = new DatagramPacket(messageSend,messageSend.length,incoming.getAddress(),incoming.getPort());
                ds.send(outstanding);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(ds!=null){
                ds.close();
            }
        }
    }
}
