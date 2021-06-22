package prozorZaPrikaz;

import istorijaBorbe.IstorijaBorbe;
import net.miginfocom.swing.MigLayout;
import oruzja.Oruzja;
import ucitavanje.Ucitavanje;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Igrica extends JFrame {

    private Ucitavanje ucitavanje;
    private JButton pokreni = new JButton("POKRENI IGRICU");
    private JLabel izaberiHeroja = new JLabel("Koji si heroj?");
    private JComboBox<String> izbor;
    private JLabel izaberiCudoviste = new JLabel("Koje si cudoviste?");
    private JComboBox<String> izbor2;
    private JLabel izaberiOruzje = new JLabel("Oruzje");
    private JComboBox<String> tizaberiOruzje;
    private JLabel napadac = new JLabel("Napadac");
    private JTextField tnapadac = new JTextField(20);
    private JLabel healt = new JLabel("Health");
    private JTextField thealth = new JTextField(20);
    private JLabel odbrana = new JLabel("Odbrana");
    private JTextField todbrana = new JTextField(20);
    private JLabel healt2 = new JLabel("Health");
    private JTextField thealth2 = new JTextField(20);
    private JLabel oruzje = new JLabel("Oruzje");
    private JComboBox<Oruzja> oruzjaJComboBox = new JComboBox<>(Oruzja.values());
    private JLabel pobednik = new JLabel("Pobednik");
    private JTextField tpobednik = new JTextField(20);

    private JButton istorijaBorbe = new JButton("Pogledaj istoriju borbe");


    private JButton napadani = new JButton("Napadni");
    private JButton braniSe = new JButton("Brani se");

    private int carolijaCarobnjaka = 20; // skida 20 healtha
    private int macMacevalac = 10; // skida 10 healtha
    private int kopljeMacevalac = 15; // skida 15 healtha
    private int zmajPaukUdara = 5; // skida 5 healtha
    private int zmajBljujeVatru = 20; // skida 20 healtha
    private int paukUjeda = 8; // skida 8 healtha

    public Igrica(Ucitavanje ucitavanje) {
        this.ucitavanje = ucitavanje;
        setTitle("Borba izmedju cudovista i heroja");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        initGUI();
        initActions();
        pack();
        setLocationRelativeTo(null);
    }

    private void initGUI(){
        MigLayout layout = new MigLayout("wrap 2");
        setLayout(layout);
        add(pokreni,BorderLayout.NORTH);
        String[] mogucnostiZaBiranje = new String[]{"Carobnjak","Macevalac"};
        izbor = new JComboBox(mogucnostiZaBiranje);
        add(izaberiHeroja);
        add(izbor);
        String[] mogucnostiZaBiranje2 = new String[]{"Pauk","Zmaj"};
        izbor2 = new JComboBox(mogucnostiZaBiranje2);
        add(oruzje);
        add(oruzjaJComboBox);
        add(izaberiCudoviste);
        add(izbor2);
        add(izaberiOruzje);
        String[] mogucnostiOruzja = new String[]{"Udari","Specijalna Moc"};
        tizaberiOruzje = new JComboBox<>(mogucnostiOruzja);
        add(tizaberiOruzje);
        add(napadac);
        add(tnapadac);
        tnapadac.setEditable(false);
        add(healt);
        add(thealth);
        thealth.setEditable(false);
        add(odbrana);
        add(todbrana);
        todbrana.setEditable(false);
        add(healt2);
        add(thealth2);
        thealth2.setEditable(false);
        add(pobednik);
        add(tpobednik);
        add(new JLabel());
        add(napadani,"split 2");
        add(braniSe);
        add(new JLabel());
        add(istorijaBorbe,"split 2");
        tpobednik.setEditable(false);
    }
    private void initActions(){
        pokreni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tpobednik.setText("");

                String oruzje = oruzjaJComboBox.getSelectedItem().toString();
                String izborHeroja = izbor.getSelectedItem().toString();
                String izborCudovista = izbor2.getSelectedItem().toString();

                int random = ucitavanje.randomBroj(0,100);

                if(izborHeroja.equals("Carobnjak")){
                    if(oruzje.equalsIgnoreCase("Carolija")){
                        popunjavanjePolja(izborHeroja, izborCudovista, random);
                    }else{
                        JOptionPane.showMessageDialog(null,"Carobnjak od oruzja moze da ima samo carolije","Obavestenje",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    if(oruzje.equalsIgnoreCase("Carolija")){
                        JOptionPane.showMessageDialog(null,"Macevalac ne moze da ima caroliju od oruzja","Obavestenje",JOptionPane.WARNING_MESSAGE);
                    }else{
                        popunjavanjePolja(izborHeroja, izborCudovista, random);
                    }
                }
            }
        });
        istorijaBorbe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tnapadac.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Morate pokrenuti igricu!","Obavestenje",JOptionPane.WARNING_MESSAGE);
                }else{
                    // TODO
                    IstorijaBorbe istorijaBorbe = new IstorijaBorbe();
                    istorijaBorbe.setVisible(true);
                }
            }
        });
        napadani.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tnapadac.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Morate pokrenuti igricu!","Obavestenje",JOptionPane.WARNING_MESSAGE);
                }else{

                    if(tpobednik.getText().equals("")) {
                        braniSeNapadaj(todbrana, thealth2, tnapadac);

                    }else{
                        JOptionPane.showMessageDialog(null,"Imamo pobednika, ne mozete vise napadati!", "Obavestenje",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        braniSe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tnapadac.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Morate pokrenuti igricu!","Obavestenje",JOptionPane.WARNING_MESSAGE);
                }else{
                    if(tpobednik.getText().equals("")) {
                        braniSeNapadaj(tnapadac, thealth, todbrana);

                    }else{
                        JOptionPane.showMessageDialog(null,"Imamo pobednika, ne mozete se vise braniti!", "Obavestenje",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
    }

    private void braniSeNapadaj(JTextField tnapadac, JTextField thealth, JTextField todbrana) {
        JOptionPane.showMessageDialog(null, "Uspesno ste napali: " + tnapadac.getText());

        String healthNapadaString = thealth.getText();
        int healthNapada = Integer.parseInt(healthNapadaString);

        int rezultatOdbrane = 0;


        if (todbrana.getText().equalsIgnoreCase("carobnjak")) {
            rezultatOdbrane = healthNapada - carolijaCarobnjaka;
            thealth.setText(String.valueOf(rezultatOdbrane));
            System.out.println("Carobnjak je napao " + tnapadac.getText() + " sa " + oruzjaJComboBox.getSelectedItem().toString());
            System.out.println("Sada " + tnapadac.getText() + " ima " + rezultatOdbrane + " health-a");
        } else if (todbrana.getText().equalsIgnoreCase("macevalac")) {
            if (oruzjaJComboBox.getSelectedItem().toString().equalsIgnoreCase("koplje")) {
                rezultatOdbrane = healthNapada - kopljeMacevalac;
            } else {
                rezultatOdbrane = healthNapada - macMacevalac;
            }
            thealth.setText(String.valueOf(rezultatOdbrane));
            System.out.println("Macevalac je napao " + tnapadac.getText() + " sa " + oruzjaJComboBox.getSelectedItem().toString());
            System.out.println("Sada " + tnapadac.getText() + " ima " + rezultatOdbrane + " health-a");
        } else if(todbrana.getText().equalsIgnoreCase("zmaj")){
            if(tizaberiOruzje.getSelectedItem().toString().equalsIgnoreCase("udari")){
                rezultatOdbrane = healthNapada - zmajPaukUdara;
            }else{
                rezultatOdbrane = healthNapada - zmajBljujeVatru;
            }
            thealth.setText(String.valueOf(rezultatOdbrane));
            System.out.println("Zmaj je napao: " + tnapadac.getText() + " sa " + tizaberiOruzje.getSelectedItem().toString());
            System.out.println("Sada " + tnapadac.getText() + " ima " + rezultatOdbrane + " health-a");
        } else if(todbrana.getText().equalsIgnoreCase("pauk")){
            if(tizaberiOruzje.getSelectedItem().toString().equalsIgnoreCase("udari")){
                rezultatOdbrane = healthNapada - zmajPaukUdara;
            }else{
                rezultatOdbrane = healthNapada - paukUjeda;
            }
            thealth.setText(String.valueOf(rezultatOdbrane));
            System.out.println("Pauk je napao: " + tnapadac.getText() + " sa " + tizaberiOruzje.getSelectedItem().toString());
            System.out.println("Sada " + tnapadac.getText() + " ima " + rezultatOdbrane + " health-a");
        }

        if (rezultatOdbrane <= 0) {
            tpobednik.setText(todbrana.getText());
            if(tpobednik.getText().equalsIgnoreCase("carobnjak") || tpobednik.getText().equalsIgnoreCase("macevalac")){
                System.out.println("Heroj je pobedio u duelu sa cudovistem");
            }else{
                System.out.println("Cudoviste je pobedilo u duelu sa herojem");
            }
        }
    }

    private void popunjavanjePolja(String izborHeroja, String izborCudovista, int random) {
        JOptionPane.showMessageDialog(null,"Uspesno ste pokrenuli igricu!","Obavestenje",JOptionPane.INFORMATION_MESSAGE);
        if(random<50){
            tnapadac.setText(izborHeroja);
            if(izborHeroja.equals("Carobnjak")) {
                thealth.setText("150");
            }else{
                thealth.setText("100");
            }
            todbrana.setText(izborCudovista);
            thealth2.setText("100");
        }else{
            tnapadac.setText(izborCudovista);
            thealth.setText("100");
            if(izborHeroja.equals("Carobnjak")){
                thealth2.setText("150");
            }else{
                thealth2.setText("100");
            }
            todbrana.setText(izborHeroja);
        }
        System.out.println("Napadac: " + tnapadac.getText() + " ," + "Health: " + thealth.getText());
        System.out.println("Odbrana: " + todbrana.getText() + " ," + "Health: " + thealth2.getText());
    }
}
