/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interface_rmi extends Remote {
    public  boolean check(int a) throws RemoteException, Exception;
}