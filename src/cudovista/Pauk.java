package cudovista;

public class Pauk extends Cudoviste{

    private String ujeda;

    public Pauk(String ime, String udarac, String ujeda) {
        super(ime, udarac);
        this.ujeda = ujeda;
    }

    public String getUjeda() {
        return ujeda;
    }

    public void setUjeda(String ujeda) {
        this.ujeda = ujeda;
    }

    @Override
    public String toString() {
        return "Pauk{" +
                "ime='" + ime + '\'' +
                ", udarac='" + udarac + '\'' +
                ", ujeda='" + ujeda + '\'' +
                "} " + super.toString();
    }
}
