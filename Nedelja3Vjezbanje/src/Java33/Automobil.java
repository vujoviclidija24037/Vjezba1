package Java33;

public class Automobil {
    private String marka;
    private String model;
    private int godiste;
    private int brzina;

    private static final int MAX_BRZINA = 200;

    
    public Automobil(String marka, String model, int godiste, int brzina) {
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
        setBrzina(brzina);   
    }

    
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getBrzina() {
        return brzina;
    }

    
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    
    public void setBrzina(int brzina) {
        if (brzina < 0 || brzina > MAX_BRZINA) {
            System.out.println("Brzina mora biti između 0 i " + MAX_BRZINA + ".");
        } else {
            this.brzina = brzina;
        }
    }

    public void ubrzaj(int vrijednost) {
        if (brzina + vrijednost > MAX_BRZINA) {
            brzina = MAX_BRZINA;
            System.out.println("Dostignuta maksimalna brzina od " + MAX_BRZINA + " km/h.");
        } else {
            brzina += vrijednost;
        }
    }
    // c. Usporavanje, najmanje do 0
    public void uspori(int vrijednost) {
        if (brzina - vrijednost < 0) {
            brzina = 0;
            System.out.println("Automobil je stao.");
        } else {
            brzina -= vrijednost;
        }
    }

    
    public void ispisi() {
        System.out.println("Marka: " + marka + ", model: " + model
                + ", godište: " + godiste + ", brzina: " + brzina + " km/h");
    }

}