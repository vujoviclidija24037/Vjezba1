package java5;

import java.util.ArrayList;

public class TestAuto {

    // Pronalazi auta koja mogu da se registruju, a nijesu registrovana
    public static ArrayList<Auto> neregistrovanaAuta(ArrayList<Auto> lista) {

        ArrayList<Auto> rezultat = new ArrayList<>();

        for (Auto a : lista) {

            if (a.mozeDaSeRegistruje() && !a.isRegistrovan()) {
                rezultat.add(a);
            }
        }

        return rezultat;
    }

    // Racuna ukupnu cijenu registracije svih auta koja se mogu registrovati
    public static double ukupnaRegistracija(ArrayList<Auto> lista) {

        double suma = 0;

        for (Auto a : lista) {

            if (a.mozeDaSeRegistruje()) {
                suma += a.cijenaRegistracije();
            }
        }

        return suma;
    }

    public static void main(String[] args) {

        ArrayList<Auto> auta = new ArrayList<>();

        // Kreiranje 5 objekata
        auta.add(new Auto("BMW", 2015, 150, true, 2000, true));
        auta.add(new Auto("Audi", 2008, 140, false, 1900, false));
        auta.add(new Auto("Golf", 1998, 90, true, 1600, false));
        auta.add(new Auto("Mercedes", 2020, 180, false, 2200, true));
        auta.add(new Auto("Opel", 1980, 70, true, 1400, false));

        // Ispis svih auta
        System.out.println("SVI AUTOMOBILI:");

        for (Auto a : auta) {
            System.out.println(a);
        }

        // Ispis neregistrovanih auta koja mogu da se registruju
        System.out.println("\nAUTA KOJA MOGU DA SE REGISTRUJU, A NIJESU REGISTROVANA:");

        ArrayList<Auto> rezultat = neregistrovanaAuta(auta);

        for (Auto a : rezultat) {
            System.out.println(a);
        }

        // Ukupna cijena registracije
        System.out.println("\nUKUPNA CIJENA REGISTRACIJE:");

        System.out.println(ukupnaRegistracija(auta));

        // Broj prodatih auta
        System.out.println("\nBROJ PRODATIH AUTA:");

        System.out.println(Auto.getBrojProdatih());
    }
}