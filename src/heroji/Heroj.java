package heroji;

import oruzja.Oruzja;

public abstract class Heroj {

    protected String ime;
    protected int health;
    protected Oruzja oruzje;

    public Heroj(String ime, int health, Oruzja oruzje) {
        this.ime = ime;
        this.health = health;
        this.oruzje = null;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Oruzja getOruzje() {
        return oruzje;
    }

    public void setOruzje(Oruzja oruzje) {
        this.oruzje = oruzje;
    }

    @Override
    public String toString() {
        return "Heroj{" +
                "ime='" + ime + '\'' +
                ", health=" + health +
                ", oruzje=" + oruzje +
                '}';
    }
}
