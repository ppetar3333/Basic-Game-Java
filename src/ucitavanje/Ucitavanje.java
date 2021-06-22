package ucitavanje;

import java.io.*;
import java.util.ArrayList;

public class Ucitavanje {

    private ArrayList<KlasaZaFajl> klasaZaFajlArrayList;

    public Ucitavanje() {
        this.klasaZaFajlArrayList = new ArrayList<>();
    }

    public ArrayList<KlasaZaFajl> getKlasaZaFajlArrayList() {
        return klasaZaFajlArrayList;
    }

    public void ucitajPodatke(String imeFajla){
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("src/fajlovi/" + imeFajla)));
            String line;
            while ((line = br.readLine()) != null) {
                String[] podaci = line.trim().split(",");
                String napadacNapada = podaci[0];
                String zrtvaNapada = podaci[1];
                String oruzjePomocuKojegSeNapada = podaci[2];
                String herojKupljenjeOruznja = podaci[3];
                String pokupljenoOruzje = podaci[4];
                String pobednik = podaci[5];
                String gubitnik = podaci[6];
                KlasaZaFajl klasaZaFajl = new KlasaZaFajl(napadacNapada,zrtvaNapada,oruzjePomocuKojegSeNapada,herojKupljenjeOruznja,pokupljenoOruzje,pobednik,gubitnik);
                klasaZaFajlArrayList.add(klasaZaFajl);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Greska prilikom citanja fajla");
        }
    }

    public void snimiPodatke(String imeFajla){
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter(new File("src/fajlovi/" + imeFajla)));
            for (KlasaZaFajl klasaZaFajl : klasaZaFajlArrayList){
                br.write(klasaZaFajl.pripremiZaSnimanje());
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Greska prilikom snimanja fajla");
        }
    }

    public int randomBroj(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
