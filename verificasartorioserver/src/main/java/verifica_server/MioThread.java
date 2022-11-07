package verifica_server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class MioThread extends Thread {
    
    Socket cli;
    ArrayList<Socket> S;
    ServerSocket server;
    Messaggio listaBiglietti;

    public MioThread(Socket client, ArrayList<Socket> S, ServerSocket server,Messaggio listaBiglietti) {
        this.cli = client;
        this.S = S;
        this.server = server;
        this.listaBiglietti = listaBiglietti;

    }

    public void run() {
        while (Server.serverAttivo) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(cli.getInputStream()));
                DataOutputStream out = new DataOutputStream(cli.getOutputStream());

                XmlMapper xmlMapper = new XmlMapper();
                String messaggio =  xmlMapper.writeValueAsString(listaBiglietti);

                out.writeBytes(messaggio+"\n");

                } catch (IOException e) {
                System.out.println("Errore");
                }
        }

    }
}