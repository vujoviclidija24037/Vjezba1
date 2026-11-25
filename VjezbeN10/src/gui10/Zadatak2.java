package gui10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zadatak2 extends JFrame {

    private JTextField poljeEUR;
    private JTextField poljeUSD;
    private JTextField poljeGBP;

    private double EUR_USD = 1.17;
    private double EUR_GBP = 0.87;
    private double USD_GBP = 0.74;

    public Zadatak2() {
        super("Konvertor valuta");

        ucitajKurseve();

        setSize(250, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(new JLabel("EUR"));
        poljeEUR = new JTextField(15);
        add(poljeEUR);

        add(new JLabel("USD"));
        poljeUSD = new JTextField(15);
        add(poljeUSD);

        add(new JLabel("GBP"));
        poljeGBP = new JTextField(15);
        add(poljeGBP);

        ObradjivacDogadjaja obradjivac = new ObradjivacDogadjaja();
        poljeEUR.addActionListener(obradjivac);
        poljeUSD.addActionListener(obradjivac);
        poljeGBP.addActionListener(obradjivac);
    }

    private void ucitajKurseve() {
        try {
            byte[] bajtovi = Files.readAllBytes(Paths.get("./src/rates.json"));
            String sadrzaj = new String(bajtovi, "UTF-8");

            sadrzaj = sadrzaj.replace("{", "").replace("}", "").replace("\"", "");

            String[] parovi = sadrzaj.split(",");
            for (String par : parovi) {
                String[] dijelovi = par.split(":");
                String kljuc = dijelovi[0].trim();
                double vrijednost = Double.parseDouble(dijelovi[1].trim());

                if (kljuc.equals("EUR_USD")) {
                    EUR_USD = vrijednost;
                } else if (kljuc.equals("EUR_GBP")) {
                    EUR_GBP = vrijednost;
                } else if (kljuc.equals("USD_GBP")) {
                    USD_GBP = vrijednost;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Nije moguće učitati rates.json.\nKoristim podrazumijevane kurseve.",
                    "Upozorenje", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class ObradjivacDogadjaja implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == poljeEUR) {
                    double eur = Double.parseDouble(poljeEUR.getText());
                    poljeUSD.setText(String.format(Locale.US, "%.2f", eur * EUR_USD));
                    poljeGBP.setText(String.format(Locale.US, "%.2f", eur * EUR_GBP));
                }
                if (e.getSource() == poljeUSD) {
                    double usd = Double.parseDouble(poljeUSD.getText());
                    poljeEUR.setText(String.format(Locale.US, "%.2f", usd / EUR_USD));
                    poljeGBP.setText(String.format(Locale.US, "%.2f", usd * USD_GBP));
                }
                if (e.getSource() == poljeGBP) {
                    double gbp = Double.parseDouble(poljeGBP.getText());
                    poljeEUR.setText(String.format(Locale.US, "%.2f", gbp / EUR_GBP));
                    poljeUSD.setText(String.format(Locale.US, "%.2f", gbp / USD_GBP));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Molimo unesite ispravan broj.",
                        "Greška pri unosu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        Zadatak2 forma = new Zadatak2();
        forma.setVisible(true);
    }
}