package java6;


public class Konobar extends Zaposleni {

    private double prekovremeniSati;

    public Konobar(int id, String ime, String prezime,
                   double plataPoSatu, double ukupanBrojSati,
                   double prekovremeniSati) {

        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);

        this.prekovremeniSati = prekovremeniSati;
    }

    @Override
    public double izracunajPlatu() {

        double redovniRad =
                getUkupanBrojSati() * getPlataPoSatu();

        double prekovremeniRad =
                prekovremeniSati * getPlataPoSatu() * 1.20;

        return 4 * (redovniRad + prekovremeniRad);
    }
}

