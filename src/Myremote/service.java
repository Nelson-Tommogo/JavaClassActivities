package Myremote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface service extends Remote {
	
	public String echo(String input) throws RemoteException;
	
}