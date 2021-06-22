package heroji;

import oruzja.Oruzja;

public class Carobnjak extends Heroj{


    public Carobnjak(String ime, int health, Oruzja oruzje) {
        super(ime, health, oruzje);
    }

    @Override
    public String toString() {
        return "Carobnjak{" +
                "ime='" + ime + '\'' +
                ", health=" + health +
                ", oruzje=" + oruzje +
                "} " + super.toString();
    }
}
