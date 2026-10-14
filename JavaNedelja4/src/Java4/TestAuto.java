package Java4;

import java.util.ArrayList;

public class TestAuto {

	public static void main(String[] args) {

		Auto a1 = new Auto("Golf", 1998, 66, true, 1.9, false);
		Auto a2 = new Auto("Audi A4", 2005, 96, false, 2.0, false);
		Auto a3 = new Auto("Fiat 126", 1980, 17, true, 0.6, true); // staro, ne moze biti registrovano
		Auto a4 = new Auto("BMW 320", 2015, 140, true, 2.0, true);
		Auto a5 = new Auto("Opel Astra", 2012, 74, false, 1.6, false);

		ArrayList<Auto> auta = new ArrayList<Auto>();
		auta.add(a1);
		auta.add(a2);
		auta.add(a3);
		auta.add(a4);
		auta.add(a5);

		System.out.println("Svi automobili:");
		for (int i = 0; i < auta.size(); i++) {
			System.out.println(auta.get(i));
		}

		System.out.println();
		System.out.println("Broj prodatih auta: " + Auto.getBrojProdatih());

		ArrayList<Auto> zaRegistraciju = Auto.autaZaRegistraciju(auta);

		System.out.println();
		System.out.println("Auta koja se mogu registrovati a nisu registrovana:");
		for (int i = 0; i < zaRegistraciju.size(); i++) {
			System.out.println(zaRegistraciju.get(i));
		}

		double iznos = Auto.iznosRegistracije(zaRegistraciju);
		System.out.println();
		System.out.println("Ukupan iznos registracije za ta auta: " + iznos);
	}

}