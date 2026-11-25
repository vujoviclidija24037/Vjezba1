package gui10;
//ocekivati ovakav zadatak na zavrsnom
//PROCI OPET

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Zadatak3 extends JFrame {

    private JTextField poljePojam;
    private JTextField poljeDefinicija;
    private JTextField poljePretraga;
    private JButton dugmeDodaj;
    private JButton dugmePronadji;
    private JLabel labelaRezultat;
    private JRadioButton rbCrnogorski;
    private JRadioButton rbEngleski;
    private JRadioButton rbSpanski;
    private JCheckBox cbVelikaMala;

    public Zadatak3() {
        super("Rječnik pojmova");

        setSize(600, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 1));

        JPanel red1 = new JPanel(new FlowLayout());
        red1.add(new JLabel("Pojam:"));
        poljePojam = new JTextField(10);
        red1.add(poljePojam);
        red1.add(new JLabel("Definicija:"));
        poljeDefinicija = new JTextField(20);
        red1.add(poljeDefinicija);
        dugmeDodaj = new JButton("Dodaj");
        red1.add(dugmeDodaj);

        JPanel red2 = new JPanel(new FlowLayout());
        red2.add(new JLabel("Jezik:"));
        rbCrnogorski = new JRadioButton("Crnogorski", true);
        rbEngleski = new JRadioButton("Engleski");
        rbSpanski = new JRadioButton("Španski");

        ButtonGroup grupa = new ButtonGroup();
        grupa.add(rbCrnogorski);
        grupa.add(rbEngleski);
        grupa.add(rbSpanski);

        red2.add(rbCrnogorski);
        red2.add(rbEngleski);
        red2.add(rbSpanski);

        cbVelikaMala = new JCheckBox("Ignoriši velika i mala slova", true);
        red2.add(cbVelikaMala);

        JPanel red3 = new JPanel(new FlowLayout());
        red3.add(new JLabel("Traženi pojam:"));
        poljePretraga = new JTextField(15);
        red3.add(poljePretraga);
        dugmePronadji = new JButton("Pronađi");
        red3.add(dugmePronadji);

        JPanel red4 = new JPanel(new FlowLayout());
        labelaRezultat = new JLabel("Unesite pojam i kliknite Pronađi.");
        red4.add(labelaRezultat);

        add(red1);
        add(red2);
        add(red3);
        add(red4);

        ObradjivacDogadjaja obradjivac = new ObradjivacDogadjaja();
        dugmeDodaj.addActionListener(obradjivac);
        dugmePronadji.addActionListener(obradjivac);
    }

    private String izabraniJezik() {
        if (rbEngleski.isSelected()) {
            return "Engleski";
        } else if (rbSpanski.isSelected()) {
            return "Španski";
        } else {
            return "Crnogorski";
        }
    }

    private void dodaj() {
        String pojam = poljePojam.getText().trim();
        String definicija = poljeDefinicija.getText().trim();

        if (pojam.isEmpty() || definicija.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Unesite pojam i definiciju.");
            return;
        }

        try {
            PrintWriter pisac = new PrintWriter(new FileWriter("pojmovi.txt", true));
            pisac.println(izabraniJezik() + ";" + pojam + ";" + definicija);
            pisac.close();
            labelaRezultat.setText("Dodato: " + pojam);
            poljePojam.setText("");
            poljeDefinicija.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Greška pri upisu u fajl.");
        }
    }

    private void pronadji() {
        String trazeno = poljePretraga.getText().trim();
        String jezik = izabraniJezik();

        if (trazeno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Unesite traženi pojam.");
            return;
        }

        try {
            Scanner citac = new Scanner(new File("pojmovi.txt"));
            while (citac.hasNextLine()) {
                String linija = citac.nextLine();
                String[] dijelovi = linija.split(";");

                if (dijelovi.length == 3 && dijelovi[0].equals(jezik)) {
                    boolean pronadjen;
                    if (cbVelikaMala.isSelected()) {
                        pronadjen = dijelovi[1].equalsIgnoreCase(trazeno);
                    } else {
                        pronadjen = dijelovi[1].equals(trazeno);
                    }

                    if (pronadjen) {
                        labelaRezultat.setText(dijelovi[1] + ": " + dijelovi[2]);
                        citac.close();
                        return;
                    }
                }
            }
            citac.close();
            labelaRezultat.setText("Pojam \"" + trazeno + "\" nije pronađen.");
        } catch (FileNotFoundException ex) {
            labelaRezultat.setText("Rječnik je prazan.");
        }
    }

    private class ObradjivacDogadjaja implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == dugmeDodaj) {
                dodaj();
            }
            if (e.getSource() == dugmePronadji) {
                pronadji();
            }
        }
    }

    public static void main(String[] args) {
        
        Zadatak3 aplikacija = new Zadatak3();
        aplikacija.setVisible(true);
    }
}