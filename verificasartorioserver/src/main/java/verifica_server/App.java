package verifica_server;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        Server server = new Server();
        server.avvia();

        Biglietto prova1 = new Biglietto(1,"alaEst-1");
        Biglietto prova2 = new Biglietto(2,"alaOvest-1");
        Biglietto prova3 = new Biglietto(3,"alaNord-1");
        Biglietto prova4 = new Biglietto(4,"alaSud-1");

        ArrayList <Biglietto> bigliettiServer = new ArrayList<>();
        
        bigliettiServer.add(prova1);
        bigliettiServer.add(prova2);
        bigliettiServer.add(prova3);
        bigliettiServer.add(prova4);

        Messaggio listaServer = new Messaggio(bigliettiServer);

        XmlMapper xmlMapper = new XmlMapper();
        String messaggio =  xmlMapper.writeValueAsString(listaServer);
        
    }
}
