package verificasartorio;

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

        Client client = new Client();
        client.connect();
        client.send();

        Biglietto prova1 = new Biglietto(1,"alaEst-1");
        Biglietto prova2 = new Biglietto(2,"alaOvest-1");
        Biglietto prova3 = new Biglietto(3,"alaNord-1");
        Biglietto prova4 = new Biglietto(4,"alaSud-1");

        ArrayList <Biglietto> biglietti = new ArrayList<>();
        biglietti.add(prova1);
        biglietti.add(prova2);
        biglietti.add(prova3);
        biglietti.add(prova4);

        Messaggio lista = new Messaggio(biglietti);

        XmlMapper xmlMapper = new XmlMapper();
        File file = new File("simple_bean.xml");

        xmlMapper.writeValue(file, lista);
    }
}
