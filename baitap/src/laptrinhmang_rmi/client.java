/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_rmi;

/**
 *
 * @author ic3burG
 */
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    public Client() throws Exception {
        System.out.print("Nhap vao 1 so: ");
        int a = new Scanner(System.in).nextInt();
        Registry client = LocateRegistry.getRegistry("localhost",3232 );
        interface_rmi regis = (interface_rmi) client.lookup("Server");
        if (regis.check(a)) System.out.println("Chan");
        else System.out.println("Le");
    }

    public static void main(String[] args) throws Exception , NotBoundException{
        Client c = new Client();
    }
}
