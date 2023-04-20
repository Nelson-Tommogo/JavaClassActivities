package Myremote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject {

	protected server() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String echo(String input) throws RemoteException {
		return "From server"+input;
	}

	private static final long serialVersionUID = 1L;

}
