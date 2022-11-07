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

        ArrayList <Biglietto> biglietti = new ArrayList<>();

        Messaggio lista = new Messaggio(biglietti);

        XmlMapper xmlMapper = new XmlMapper();
        String messaggio =  xmlMapper.writeValueAsString(lista);
    }
}
