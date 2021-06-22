package cudovista;

public abstract class Cudoviste {

    protected String ime;
    protected String udarac;

    public Cudoviste(String ime, String udarac) {
        this.ime = ime;
        this.udarac = udarac;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getUdarac() {
        return udarac;
    }

    public void setUdarac(String udarac) {
        this.udarac = udarac;
    }

    @Override
    public String toString() {
        return "Cudoviste{" +
                "ime='" + ime + '\'' +
                ", udarac='" + udarac + '\'' +
                '}';
    }
}
