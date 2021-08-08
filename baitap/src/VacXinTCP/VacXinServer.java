/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VacXinTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Absolute
 */
public class VacXinServer {
    static ArrayList<VacXinUDP.user> userList = new ArrayList<VacXinUDP.user>();
    
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10);
        Socket myClient = server.accept();
        
        VacXinUDP.user u1 = new VacXinUDP.user("user1","x","x");
        VacXinUDP.user u2 = new VacXinUDP.user("user2","x","x");
        userList.add(u1);
        userList.add(u2);
        
        while (true) {            
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            
            String report = dis.readUTF();
            String result[] = report.split("\\:");
            
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
                    outputString  = outputString +"\n"+ userList.get(i).getName()+" da tiem mui 2 "+userList.get(i).getM2();
                    outputString  = outputString +"\n"+ userList.get(i).getName()+" da tiem du 2 mui";
                    dos.writeUTF(outputString);
                }
                else{
                    outputString = "khong tim thay";
                    dos.writeUTF(outputString);
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
                       dos.writeUTF(outputString);
                       d=1;
                    }
                    else if ((userList.get(i).getM2().equals("x")) && d==0){
                        userList.get(i).setM2(result[1]);
                        outputString = userList.get(i).getName() + " đã tiêm 1 mũi " + userList.get(i).getM2() + "\nĐã tiêm đủ 2 mũi!";
                        dos.writeUTF(outputString);
                    }
                }
                else{
                    outputString = "khong tim thay";
                    dos.writeUTF(outputString);
                }
            }
        }
    }
}
