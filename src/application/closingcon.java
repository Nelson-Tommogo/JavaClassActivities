package application;
import java.net.*;

import javax.swing.JOptionPane;

import java.io.*;

public class closingcon
{
	private Socket          socket   = null;
	private ServerSocket    server   = null;
	private DataInputStream in       =  null;

  public closingcon(int port)
 {
     try
     {
         server = new ServerSocket(port);
         JOptionPane.showMessageDialog(null, "server has been started");
         JOptionPane.showMessageDialog(null, "please connect client!");

         socket = server.accept();
         JOptionPane.showMessageDialog(null, "Accepted");
         in = new DataInputStream(
             new BufferedInputStream(socket.getInputStream()));

         String line = "";

         while (!line.equals("Over"))
         {
             try
             {
                 line = in.readUTF();
                 JOptionPane.showInputDialog(line);

             }
             catch(IOException i)
             {
                 JOptionPane.showInputDialog(i);
             }
         }
         JOptionPane.showMessageDialog(null, "Connection shutting down.......");
         socket.close();
         in.close();
     }
     catch(IOException i)
     {
         JOptionPane.showInputDialog(i);
         System.out.println(i);
     }
 }

 public static void main(String args[])
 {
	 closingcon server = new closingcon(8000);
 }
}
