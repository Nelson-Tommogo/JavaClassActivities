package Myremote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class client {
	
	public static void main(String[]args) throws MalformedURLException, RemoteException, NotBoundException {
		service Service1 = (service) Naming.lookup("rmi://localhost:3306/JavaFx");
		System.out.println("----"+Service1.echo("Hey There server"));
	}
}
