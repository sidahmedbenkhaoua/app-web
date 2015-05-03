package dz.sbenkhaoua.roadtraffic.module.config;

/**
 * Created by sbenkhaoua on 26/04/15.
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread
{
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
       /// serverSocket.setSoTimeout(10000);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to "
                        + server.getRemoteSocketAddress());
             /*   DataInputStream in =
                        new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                */
                DataOutputStream out =
                        new DataOutputStream(server.getOutputStream());
                while(true)
                {
                    out.writeUTF("error "
                            + server.getLocalSocketAddress() );
                    System.out.println("send it");
                }

               // server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = 7777;
        try
        {
            Thread t = new GreetingServer(port);
            t.start();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}