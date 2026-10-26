package java;



import java.util.InputMismatchException;

public class Rezervacija extends Soba {
    private int brojDanaIzdavanja;
    private double iznosPopusta;   
 
   
 
    public Rezervacija(int brojSobe, int kvadratura, int brojKreveta,
                       boolean miniBarDaNe, boolean telefonDaNe, boolean tvDaNe,
                       int brojDanaIzdavanja, double iznosPopusta) {
        super(brojSobe, kvadratura, brojKreveta, miniBarDaNe, telefonDaNe, tvDaNe);
        setBrojDanaIzdavanja(brojDanaIzdavanja);
        setIznosPopusta(iznosPopusta);
    }
 
    
    public int getBrojDanaIzdavanja() { return brojDanaIzdavanja; }
    public double getIznosPopusta() { return iznosPopusta; }
 
   
    public void setBrojDanaIzdavanja(int brojDanaIzdavanja) {
        if (brojDanaIzdavanja > 0)
            this.brojDanaIzdavanja = brojDanaIzdavanja;
        else
            throw new InputMismatchException("Greška");
    }
 
    public void setIznosPopusta(double iznosPopusta) {
        if (iznosPopusta >= 0 && iznosPopusta <= 100)
            this.iznosPopusta = iznosPopusta;
        else
            throw new InputMismatchException("Greška");
    }
 
    
    public double cijenaIznajmljivanja() {
        double cijena = this.izracunajCijenuPoDanu() * this.brojDanaIzdavanja;
        cijena = cijena - cijena * this.iznosPopusta / 100;
        return cijena;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Rezervacija [brojDanaIzdavanja=" + brojDanaIzdavanja
                + ", iznosPopusta=" + iznosPopusta + "]";
    }
}
 