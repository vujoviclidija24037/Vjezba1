package java5;

import java.util.ArrayList;

public class FilmTest {

    // Metoda pronalazi najduzi film
    public static Film pronadjiNajduziFilm(ArrayList<Film> lista) {

        if (lista.isEmpty()) {
            return null;
        }

        Film najduziFilm = lista.get(0);

        for (Film f : lista) {

            if (f.getTrajanjeMin() > najduziFilm.getTrajanjeMin()) {
                najduziFilm = f;
            }
        }

        return najduziFilm;
    }

    // Metoda pronalazi filmove odredjenog zanra
    public static ArrayList<Film> filmoviPoZanru(ArrayList<Film> lista, String zanr) {

        ArrayList<Film> rezultat = new ArrayList<>();

        for (Film f : lista) {

            if (f.getZanr().equalsIgnoreCase(zanr)) {
                rezultat.add(f);
            }
        }

        return rezultat;
    }

    // Metoda racuna prosjecnu ocjenu filmova
    public static double prosjecnaOcjena(ArrayList<Film> lista) {

        if (lista.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Film f : lista) {
            suma += f.getOcjena();
        }

        return suma / lista.size();
    }

    public static void main(String[] args) {

        // Kreiranje ArrayList liste
        ArrayList<Film> filmovi = new ArrayList<>();

        // Dodavanje filmova
        filmovi.add(new Film("Titanic", "Drama", 8, 195));
        filmovi.add(new Film("Avatar", "Naucna fantastika", 7, 162));
        filmovi.add(new Film("The Notebook", "Romansa", 7, 123));
        filmovi.add(new Film("Interstellar", "Naucna fantastika", 8, 169));
        filmovi.add(new Film("Gladiator", "Akcija", 8, 155));

        // Ispis svih filmova
        System.out.println("SVI FILMOVI:");

        for (Film f : filmovi) {
            System.out.println(f);
        }

        // Pronalazenje najduzeg filma
        Film najduzi = pronadjiNajduziFilm(filmovi);

        System.out.println("\nNAJDUZI FILM:");

        if (najduzi != null) {
            System.out.println(najduzi);
        }

        // Pronalazenje filmova po zanru
        System.out.println("\nFILMOVI NAUCNE FANTASTIKE:");

        ArrayList<Film> rezultat = filmoviPoZanru(filmovi, "Naucna fantastika");

        for (Film f : rezultat) {
            System.out.println(f);
        }

        // Racunanje prosjecne ocjene
        double prosjek = prosjecnaOcjena(filmovi);

        System.out.println("\nPROSJECNA OCJENA FILMOVA: " + prosjek);
    }
}