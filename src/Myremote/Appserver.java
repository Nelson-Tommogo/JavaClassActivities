package Myremote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Appserver {
	public static void main(String[]args) throws RemoteException {
		LocateRegistry.createRegistry(3306);
		Registry registry = null;
		registry.rebind("Hello", new server());
	}

}
