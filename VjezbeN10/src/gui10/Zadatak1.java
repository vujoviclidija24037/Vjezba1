package gui10;

//treci zadatak moze da bude slican za zavrsi

import javax.swing.JOptionPane;

public class Zadatak1 {

    public static void main(String[] args) {

        //prozori za unos
        String ime = JOptionPane.showInputDialog(null, "Unesite ime:");
        String prezime = JOptionPane.showInputDialog("Unesite prezime:");
        String godiste = JOptionPane.showInputDialog("Unesite godiste:");

        //konverzija godistaa iz stringa u int
        int godisteInt = Integer.parseInt(godiste);

        String format = String.format("Pregled Podataka:\n ime: %s \n prezime: %s \n godiste: %d "
                + "\n\n Da li su uneseni podaci tacni?", ime, prezime, godisteInt);

        int odgovor = JOptionPane.showConfirmDialog(
                null, format, "Pregled i potvrda",
                JOptionPane.YES_NO_OPTION
        );

        // System.out.println(odgovor);
        if (odgovor == JOptionPane.YES_OPTION) {
            String email = String.format("%s.%s%d@kompanija.me", ime, prezime, godisteInt);
            JOptionPane.showMessageDialog(null, "Vas email je: " + email);
        } else {
            JOptionPane.showMessageDialog(null, "Otkazano.");
        }
    }

//String email=String.format("%s.%s%d@kompanija.me",ime,prezime,godisteInt); //%s vrijednost varijable ime
//s jer je string ime,druga prezime,%d se odnosi na broj odnosno godiste korisnika
//mogli smo i drugi zapis 
        
//System.out.println(email);   

//JOptionPane.showMessageDialog(null,"Vas email je:"+email);
//parking i cijena,u fajlu se cuvaloi tablice i sve..vrijeme ulaska,pretraga na osnovu tablica-zadatak,json fajl ili text format za fajl 
//ili sami da izmislimo,parsiranje sadrzaja izvadjanje objekta iz niza koji imamo

        
        

	}


