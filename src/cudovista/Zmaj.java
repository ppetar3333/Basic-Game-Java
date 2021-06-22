package cudovista;

public class Zmaj extends Cudoviste{

    private String bljujeVatru;

    public Zmaj(String ime, String udarac, String bljujeVatru) {
        super(ime, udarac);
        this.bljujeVatru = bljujeVatru;
    }

    public String getBljujeVatru() {
        return bljujeVatru;
    }

    public void setBljujeVatru(String bljujeVatru) {
        this.bljujeVatru = bljujeVatru;
    }

    @Override
    public String toString() {
        return "Zmaj{" +
                "ime='" + ime + '\'' +
                ", udarac='" + udarac + '\'' +
                ", bljujeVatru='" + bljujeVatru + '\'' +
                "} " + super.toString();
    }
}
