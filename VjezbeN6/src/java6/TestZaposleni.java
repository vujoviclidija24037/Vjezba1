package java6;


import java.util.ArrayList;

public class TestZaposleni {

    public static void main(String[] args) {

        ArrayList<Zaposleni> zaposleni = new ArrayList<>();

        zaposleni.add(new Konobar(
                1, "Marko", "Markovic", 5, 40, 5));

        zaposleni.add(new Kuvar(
                2, "Jovan", "Jovanovic", 6, 40));

        zaposleni.add(new Menadzer(
                3, "Petar", "Petrovic", 8, 40, 300));

        

        for (Zaposleni z : zaposleni) {

            z.prikaziInformacije();

            System.out.println("------------------");
        }
    }
}

