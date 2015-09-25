/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author minh
 */
public class Converter extends UnicastRemoteObject implements ConverterRemote {

    public Converter() throws RemoteException {
        super();
    }
    
    @Override
    public double convert(double cm) throws RemoteException {
        return cm * 0.393701;
    }
    
}
