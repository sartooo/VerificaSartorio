package verifica_server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {

    static boolean serverAttivo = true;

    public void avvia() throws IOException {
        ServerSocket server = new ServerSocket(6789);
        ArrayList<Socket> S = new ArrayList<>();
        while (serverAttivo) {
            try {
                Socket client = server.accept();
                S.add(client);
                MioThread t1 = new MioThread(client, S, server);
                t1.start();
                Socket client2 = server.accept();
                S.add(client2);
                MioThread t2 = new MioThread(client2, S, server);
                t1.start();
            } catch (Exception e) {
                /// mi  sto per spegnere
            }
        }
    }
}

