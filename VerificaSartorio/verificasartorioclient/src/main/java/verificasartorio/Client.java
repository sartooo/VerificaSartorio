package verificasartorio;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client 
{
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner keyboard = new Scanner(System.in);
    private String userString;
    private String serverString;

    public Socket connect() throws IOException {
        this.socket = new Socket(InetAddress.getLocalHost(), 6789);
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
        return socket;
    }

    public void send() throws IOException {

    Messaggio prova = new Messaggio(biglietti);

        for (;;) {
            serverString = in.readLine();
            
            this.userString = this.keyboard.next();

            if (userString.equals("FINE")) {
                socket.close();
                return;
            }
           
            out.writeBytes(userString + '\n'); 
            if (userString.equals("SPEGNI")) {
                return;
            }
            System.out.print("Risposta dal server: " + serverString + '\n');

        }

    }
}
