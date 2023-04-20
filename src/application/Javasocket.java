package application;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class Javasocket {
 
 private Socket socket = null;
 private DataInputStream input = null;
 private DataOutputStream out = null;
 public Javasocket(String address, int port)
 {
     try {
         socket = new Socket(address, port);
         JOptionPane.showMessageDialog(null, "Connected");
         input = new DataInputStream(System.in);

         out = new DataOutputStream(
             socket.getOutputStream());
     }
     catch (UnknownHostException u) {
    	 JOptionPane.showInputDialog(u);
         return;
     }
     catch (IOException i) {
    	 JOptionPane.showInputDialog(i);
         return;
     }

     String line = "";

     while (!line.equals("Over")) {
         try {
             line = input.readLine();
             out.writeUTF(line);
         }
         catch (IOException i) {
        	 JOptionPane.showInputDialog(i);
         }
     }

     try {
         input.close();
         out.close();
         socket.close();
     }
     catch (IOException i) {
    	 JOptionPane.showInputDialog(i);
     }
 }

 public static void main(String args[])
 {
	 Javasocket client = new Javasocket("127.0.0.1", 8000);
 }
}