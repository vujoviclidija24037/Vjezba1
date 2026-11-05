package java6;


public abstract class Zaposleni {

    private int id;
    private String ime;
    private String prezime;
    private double plataPoSatu;
    private double ukupanBrojSati;

    public Zaposleni(int id, String ime, String prezime,
                     double plataPoSatu, double ukupanBrojSati) {

        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.plataPoSatu = plataPoSatu;
        this.ukupanBrojSati = ukupanBrojSati;
    }

    public double getPlataPoSatu() {
        return plataPoSatu;
    }

    public double getUkupanBrojSati() {
        return ukupanBrojSati;
    }

    public abstract double izracunajPlatu();

    public void prikaziInformacije() {
        System.out.println("ID: " + id);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Plata po satu: " + plataPoSatu);
        System.out.println("Ukupan broj sati: " + ukupanBrojSati);
        System.out.println("Mesecna plata: " + izracunajPlatu());
    }
}

