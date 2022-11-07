package verifica_server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {

    static boolean serverAttivo = true;

    public void avvia() throws IOException {
        ServerSocket server = new ServerSocket(6789);
        ArrayList<Socket> S = new ArrayList<>();

        Biglietto prova1 = new Biglietto(1,"alaEst-1");
        Biglietto prova2 = new Biglietto(2,"alaOvest-1");
        Biglietto prova3 = new Biglietto(3,"alaNord-1");
        Biglietto prova4 = new Biglietto(4,"alaSud-1");

        ArrayList <Biglietto> bigliettiServer = new ArrayList<>();
        
        bigliettiServer.add(prova1);
        bigliettiServer.add(prova2);
        bigliettiServer.add(prova3);
        bigliettiServer.add(prova4);

        Messaggio listaBiglietti = new Messaggio(bigliettiServer);

        while (serverAttivo) {
            try {
                Socket client = server.accept();
                S.add(client);
                MioThread t1 = new MioThread(client, S, server,listaBiglietti);
                t1.start();

            } catch (Exception e) {
                /// mi  sto per spegnere
            }
        }
    }
}

