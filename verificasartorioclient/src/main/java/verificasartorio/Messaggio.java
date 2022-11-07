package verificasartorio;

import java.util.ArrayList;

public class Messaggio 
{
    public ArrayList <Biglietto> biglietti;


    public Messaggio() {
    }

    public Messaggio(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }

    public ArrayList<Biglietto> getBiglietti() {
        return this.biglietti;
    }

    public void setBiglietti(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }

    public Messaggio biglietti(ArrayList<Biglietto> biglietti) {
        setBiglietti(biglietti);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " biglietti='" + getBiglietti() + "'" +
            "}";
    }

}
