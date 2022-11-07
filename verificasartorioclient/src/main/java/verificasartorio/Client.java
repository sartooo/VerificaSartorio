package verificasartorio;

import java.io.*;
import java.net.*;
import java.util.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

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

    public void send() throws IOException 
    {

        ArrayList <Biglietto> biglietti = new ArrayList<>();

        Messaggio lista = new Messaggio(biglietti);

        XmlMapper xmlMapper = new XmlMapper();
        String messaggio =  xmlMapper.writeValueAsString(lista);

        out.writeBytes(messaggio+"\n");

    }
}
