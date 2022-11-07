package verifica_server;

public class Biglietto 
{
    public int id;
    public String nBiglietto;


    public Biglietto() {
    }

    public Biglietto(int id, String nBiglietto) {
        this.id = id;
        this.nBiglietto = nBiglietto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNBiglietto() {
        return this.nBiglietto;
    }

    public void setNBiglietto(String nBiglietto) {
        this.nBiglietto = nBiglietto;
    }

    public Biglietto id(int id) {
        setId(id);
        return this;
    }

    public Biglietto nBiglietto(String nBiglietto) {
        setNBiglietto(nBiglietto);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nBiglietto='" + getNBiglietto() + "'" +
            "}";
    }

}
