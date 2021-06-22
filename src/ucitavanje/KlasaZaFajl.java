package ucitavanje;

public class KlasaZaFajl {

    private String napadacNapada;
    private String zrtvaNapada;
    private String oruzjePomocuKojegSeNapada;
    private String herojKupljenjeOruznja;
    private String pokupljenoOruzje;
    private String pobednik;
    private String gubitnik;

    public KlasaZaFajl(String napadacNapada, String zrtvaNapada, String oruzjePomocuKojegSeNapada, String herojKupljenjeOruznja, String pokupljenoOruzje, String pobednik, String gubitnik) {
        this.napadacNapada = napadacNapada;
        this.zrtvaNapada = zrtvaNapada;
        this.oruzjePomocuKojegSeNapada = oruzjePomocuKojegSeNapada;
        this.herojKupljenjeOruznja = herojKupljenjeOruznja;
        this.pokupljenoOruzje = pokupljenoOruzje;
        this.pobednik = pobednik;
        this.gubitnik = gubitnik;
    }

    public String getNapadacNapada() {
        return napadacNapada;
    }

    public void setNapadacNapada(String napadacNapada) {
        this.napadacNapada = napadacNapada;
    }

    public String getZrtvaNapada() {
        return zrtvaNapada;
    }

    public void setZrtvaNapada(String zrtvaNapada) {
        this.zrtvaNapada = zrtvaNapada;
    }

    public String getOruzjePomocuKojegSeNapada() {
        return oruzjePomocuKojegSeNapada;
    }

    public void setOruzjePomocuKojegSeNapada(String oruzjePomocuKojegSeNapada) {
        this.oruzjePomocuKojegSeNapada = oruzjePomocuKojegSeNapada;
    }

    public String getHerojKupljenjeOruznja() {
        return herojKupljenjeOruznja;
    }

    public void setHerojKupljenjeOruznja(String herojKupljenjeOruznja) {
        this.herojKupljenjeOruznja = herojKupljenjeOruznja;
    }

    public String getPokupljenoOruzje() {
        return pokupljenoOruzje;
    }

    public void setPokupljenoOruzje(String pokupljenoOruzje) {
        this.pokupljenoOruzje = pokupljenoOruzje;
    }

    public String getPobednik() {
        return pobednik;
    }

    public void setPobednik(String pobednik) {
        this.pobednik = pobednik;
    }

    public String getGubitnik() {
        return gubitnik;
    }

    public void setGubitnik(String gubitnik) {
        this.gubitnik = gubitnik;
    }

    @Override
    public String toString() {
        return "KlasaZaFajl{" +
                "napadacNapada='" + napadacNapada + '\'' +
                ", zrtvaNapada='" + zrtvaNapada + '\'' +
                ", oruzjePomocuKojegSeNapada='" + oruzjePomocuKojegSeNapada + '\'' +
                ", herojKupljenjeOruznja='" + herojKupljenjeOruznja + '\'' +
                ", pokupljenoOruzje='" + pokupljenoOruzje + '\'' +
                ", pobednik='" + pobednik + '\'' +
                ", gubitnik='" + gubitnik + '\'' +
                '}';
    }

    public String pripremiZaSnimanje(){
        return napadacNapada + "," + zrtvaNapada + "," + oruzjePomocuKojegSeNapada + "," + herojKupljenjeOruznja + "," + pokupljenoOruzje + "," + pobednik + "," + gubitnik + "\n";
    }
}
