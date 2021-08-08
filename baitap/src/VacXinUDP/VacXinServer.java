/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VacXinUDP;

import com.sun.org.apache.xpath.internal.FoundIndex;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;

/**
 *
 * @author Absolute
 */
public class VacXinServer {
    static ArrayList<user> userList = new ArrayList<user>();
    
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket server = new DatagramSocket(10);
        byte[] buffer = new byte[1024];
        
        user u1 = new user("user1","x","x");
        user u2 = new user("user2","x","x");
        userList.add(u1);
        userList.add(u2);
        buffer = new byte[1024];
        
        while (true) {            
            DatagramPacket reportPacket = new DatagramPacket(buffer, buffer.length);
            server.receive(reportPacket);
            
            String report = new String(reportPacket.getData(),0,reportPacket.getLength());
            
            String result[] = report.split("\\:");
            DatagramPacket confirmPacket;
            
            if(result.length==3){
                int i;
                int found = 0;
                for(i=0;i<userList.size();i++){
                    if(result[0].equalsIgnoreCase(userList.get(i).getName())){
                        found = 1;
                        break;
                    }
                }
                
                String outputString = "";
                if(found ==1){
                    userList.get(i).setM1(result[1]);
                    userList.get(i).setM2(result[2]);
                    outputString  = outputString + userList.get(i).getName()+" da tiem mui 1 "+userList.get(i).getM1();
                    outputString  = outputString + userList.get(i).getName()+" da tiem mui 2 "+userList.get(i).getM2();
                    outputString  = outputString + userList.get(i).getName()+" da tiem du 2 mui";
                    buffer = new byte[1024];
                    buffer = outputString.getBytes();
                    confirmPacket = new DatagramPacket(buffer, buffer.length, reportPacket.getAddress(), reportPacket.getPort());
                    server.send(confirmPacket);
                }
                else{
                    outputString = "khong tim thay";
                    buffer = new byte[1024];
                    buffer = outputString.getBytes();
                    confirmPacket = new DatagramPacket(buffer, buffer.length, reportPacket.getAddress(), reportPacket.getPort());
                    server.send(confirmPacket);
                }
            }
            
            if (result.length == 2) {
                int i;
                int found = 0;
                for (i = 0; i < userList.size(); i++) {
                    if (result[0].equalsIgnoreCase(userList.get(i).getName())) {
                        found = 1;
                        break;
                    }
                }

                String outputString = "";
                if (found == 1) {
                    int d =0;
                    if (userList.get(i).getM1().equals("x")) {
                       userList.get(i).setM1(result[1]);

                        outputString = userList.get(i).getName() + " đã tiêm 1 mũi " + userList.get(i).getM1();
                        buffer = new byte[1024];
                        buffer = outputString.getBytes();
                        confirmPacket = new DatagramPacket(buffer, buffer.length, reportPacket.getAddress(), reportPacket.getPort());
                        server.send(confirmPacket);
                        d=1;
                    } else if ((userList.get(i).getM2().equals("x")) && d==0) {
                        userList.get(i).setM2(result[1]);

                        outputString = userList.get(i).getName() + " đã tiêm 1 mũi " + userList.get(i).getM2() + "\nĐã tiêm đủ 2 mũi!";
                        buffer = new byte[1024];
                        buffer = outputString.getBytes();
                        confirmPacket = new DatagramPacket(buffer, buffer.length, reportPacket.getAddress(), reportPacket.getPort());
                        server.send(confirmPacket);
                    }

                } else {
                    outputString = "Không tìm thấy";
                    buffer = new byte[1024];
                    buffer = outputString.getBytes();
                    confirmPacket = new DatagramPacket(buffer, buffer.length, reportPacket.getAddress(), reportPacket.getPort());
                    server.send(confirmPacket);
                }
            }
        }
    }
}
