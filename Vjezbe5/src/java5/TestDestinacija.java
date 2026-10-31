package java5;


import java.util.ArrayList;

public class TestDestinacija {

    public static void main(String[] args) {

        ArrayList<Destinacija> destinacije = new ArrayList<>();

        destinacije.add(new Destinacija("Rim", "Italija", 9, 800, 150));
        destinacije.add(new Destinacija("Pariz", "Francuska", 9, 1200, 300));
        destinacije.add(new Destinacija("Beč", "Austrija", 8, 600, 200));
        destinacije.add(new Destinacija("Atina", "Grčka", 7, 900, 100));
        destinacije.add(new Destinacija("Madrid", "Španija", 9, 2500, 400));

        System.out.println("Destinacije koje ispunjavaju uslove:");
        pronadjiDestinacije(destinacije);

        System.out.println("\nNajposjecenija destinacija:");
        System.out.println(najposjecenija(destinacije));
    }

    public static void pronadjiDestinacije(ArrayList<Destinacija> lista) {

        for (Destinacija d : lista) {

            if (d.getOcjena() > 8 && d.getUdaljenost() < 1000) {
                System.out.println(d);
            }
        }
    }

    public static Destinacija najposjecenija(ArrayList<Destinacija> lista) {

        if (lista.isEmpty()) {
            return null;
        }

        Destinacija najveca = lista.get(0);

        for (Destinacija d : lista) {

            if (d.getBrojPosjetioca() > najveca.getBrojPosjetioca()) {
                najveca = d;
            }
        }

        return najveca;
    }
}