package java5;

public class Auto {

    private String markaAuta;
    private int godisteAuta;
    private double snagaMotora;
    private boolean prodato;
    private int kubikazaMotora;
    private boolean registrovan;

    
    private static int brojProdatih = 0;

    
    public Auto(String markaAuta, int godisteAuta, double snagaMotora,
                boolean prodato, int kubikazaMotora, boolean registrovan) {

        this.markaAuta = markaAuta;
        this.godisteAuta = godisteAuta;
        this.snagaMotora = snagaMotora;
        this.prodato = prodato;
        this.kubikazaMotora = kubikazaMotora;

        
        if (godisteAuta < 1985) {
            this.registrovan = false;
        } else {
            this.registrovan = registrovan;
        }

        if (prodato) {
            brojProdatih++;
        }
    }

    

    public String getMarkaAuta() {
        return markaAuta;
    }

    public void setMarkaAuta(String markaAuta) {
        this.markaAuta = markaAuta;
    }

    public int getGodisteAuta() {
        return godisteAuta;
    }

    public void setGodisteAuta(int godisteAuta) {
        this.godisteAuta = godisteAuta;

        if (godisteAuta < 1985) {
            this.registrovan = false;
        }
    }

    public double getSnagaMotora() {
        return snagaMotora;
    }

    public void setSnagaMotora(double snagaMotora) {
        this.snagaMotora = snagaMotora;
    }

    public boolean isProdato() {
        return prodato;
    }

    public void setProdato(boolean prodato) {
        if (!this.prodato && prodato) {
            brojProdatih++;
        } else if (this.prodato && !prodato) {
            brojProdatih--;
        }

        this.prodato = prodato;
    }

    public int getKubikazaMotora() {
        return kubikazaMotora;
    }

    public void setKubikazaMotora(int kubikazaMotora) {
        this.kubikazaMotora = kubikazaMotora;
    }

    public boolean isRegistrovan() {
        return registrovan;
    }

    public void setRegistrovan(boolean registrovan) {
        if (godisteAuta < 1985) {
            this.registrovan = false;
        } else {
            this.registrovan = registrovan;
        }
    }

    
    public static int getBrojProdatih() {
        return brojProdatih;
    }

    
    public boolean mozeDaSeRegistruje() {
        return godisteAuta >= 1985;
    }

    
    public double koeficijentGodista() {

        if (godisteAuta >= 1985 && godisteAuta <= 2000) {
            return 3.0;
        } else if (godisteAuta >= 2001 && godisteAuta <= 2010) {
            return 2.0;
        } else if (godisteAuta >= 2011) {
            return 1.5;
        }

        return 0;
    }

    
    public double cijenaRegistracije() {

        if (!mozeDaSeRegistruje()) {
            return 0;
        }

        return koeficijentGodista() * kubikazaMotora * snagaMotora;
    }

    
    @Override
    public String toString() {
        return "Marka: " + markaAuta +
                ", godiste: " + godisteAuta +
                ", snaga: " + snagaMotora +
                ", prodato: " + prodato +
                ", kubikaza: " + kubikazaMotora +
                ", registrovan: " + registrovan;
    }
}