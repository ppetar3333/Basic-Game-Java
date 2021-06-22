package heroji;

import oruzja.Oruzja;

public class Macevalac extends Heroj{

    public Macevalac(String ime, int health, Oruzja oruzje) {
        super(ime, health, oruzje);
    }

    @Override
    public String toString() {
        return "Macevalac{" +
                "ime='" + ime + '\'' +
                ", health=" + health +
                ", oruzje=" + oruzje +
                "} " + super.toString();
    }
}
