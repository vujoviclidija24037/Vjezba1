package Java33;

public class BankovniRacun {
    private String imeVlasnika;
    private double stanje;

    
    public BankovniRacun(String imeVlasnika, double stanje) {
        this.imeVlasnika = imeVlasnika;
        setStanje(stanje);   
    }

    
    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public double getStanje() {
        return stanje;
    }

    
    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

   
    public void setStanje(double stanje) {
        if (stanje < 0) {
            System.out.println("Stanje ne može biti negativno.");
        } else {
            this.stanje = stanje;
        }
    }

    //povecanja stanja
    public void uplati(double iznos) {
        if (iznos <= 0) {
            System.out.println("Iznos uplate mora biti veći od 0.");
        } else {
            stanje += iznos;
        }
    }

   //smanjenje samo ako ima dovoljno sredstava
    public void isplati(double iznos) {
        if (iznos <= 0) {
            System.out.println("Iznos isplate mora biti veći od 0.");
        } else if (iznos > stanje) {
            System.out.println("Nema dovoljno sredstava na računu.");
        } else {
            stanje -= iznos;
        }
    }

    
    public void ispisi() {
        System.out.println("Vlasnik: " + imeVlasnika + ", stanje: " + stanje + " EUR");
    }
}
   