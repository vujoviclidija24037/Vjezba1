package java7;

//dovrsi ovo!

import java.util.ArrayList;
import java.util.Random;

public class Dostava {

    public static void main(String args[]) {
        ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();
        vozila.add(new Biciklo("A0", 10.0));
        vozila.add(new Biciklo("A1", 12.5));
        vozila.add(new Motor("B0", 15.0));
        vozila.add(new Motor("B1", 17.5));
        vozila.add(new Automobil("C0", 25.0));
        vozila.add(new Automobil("C1", 30.5));
        double udaljenost = 10.0;
        for (Vozilo v : vozila) {
        	udaljenost+= new Random().nextDouble();

            v.info();
            System.out.print("Vrijeme dostave: " + Math.round( v.izracunajVrijemeDostave(udaljenost)));
            if (v instanceof Economican e) { //nije praksa,kovertovali smo vozilo i dobili v kao instancu
                System.out.println("Vozilo je ekonomicno, a potrosnja je: " + e.potrosnjaPoKm());
            } else {
            	System.out.println("Vozilo je automobil");
            }
        }
    }
}