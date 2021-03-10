/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public  class Server extends UnicastRemoteObject implements interface_rmi {

    public boolean check(int a) throws RemoteException {
        if (a%2==0)
        return true;
        else return false;
    }
    public Server() throws RemoteException{
        Registry regis = LocateRegistry.createRegistry(3232);
        regis.rebind("Server",this);
    }

    public static void main(String[] args) throws RemoteException {
            Server server = new Server();
    }
}
