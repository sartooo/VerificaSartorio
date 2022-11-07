package verifica_server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class MioThread extends Thread {
    
    Socket cli;
    ArrayList<Socket> S;
    ServerSocket server;

    public MioThread(Socket client, ArrayList<Socket> S, ServerSocket server) {
        this.cli = client;
        this.S = S;
        this.server = server;

    }

    public void run() {
        while (Server.serverAttivo) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(cli.getInputStream()));
                DataOutputStream out = new DataOutputStream(cli.getOutputStream());
                String recv = in.readLine();
                } catch (IOException e) {
                System.out.println("Errore");
                }
        }

    }
}